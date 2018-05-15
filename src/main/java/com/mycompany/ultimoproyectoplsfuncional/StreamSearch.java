package com.mycompany.ultimoproyectoplsfuncional;

import static org.toilelibre.libe.curl.Curl.curl;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class StreamSearch {

	private Connection connection;
	
	public StreamSearch(Connection connection) {
		this.connection = connection;
	}
	
	//Get All streams information from a JsonArray
	public ArrayList<Stream> getStreams(ArrayList<JSONArray> data){
		ArrayList<Stream> streams = new ArrayList<Stream>();
		for(int i = 0; i < data.size(); i++) {
			JSONArray array = data.get(i);
			if(array != null) {
				for (int j = 0; j < array.length(); j++) {
					JSONObject streamJS = array.getJSONObject(j);
					Stream stream = new Stream(streamJS.getLong("id"), streamJS.getInt("viewer_count"), streamJS.getString("language"));
					streams.add(stream);
				}
			}
		}
		return streams;
	}
	//Get a maximum of 2900 streams of a specified game
	public ArrayList<Stream> byGameId (int id) {
		
		String searchIdUrl = "-H 'Client-ID: " + this.connection.getClientID() + "' -X GET 'https://api.twitch.tv/helix/streams?game_id=" + id + "&first=100";
		String cursor = "'"; // First Search cursor
		ArrayList<JSONArray> streamsData = new ArrayList<JSONArray>(); //Streams Json Data list
		try {
			HttpResponse response = null; 
			while(cursor != null) {
				response = curl(searchIdUrl + cursor); // Connection to Twitch api Throw cURL
				try {
					JSONObject json = new JSONObject(EntityUtils.toString(response.getEntity())); //Convert the response to a Json object
					JSONArray data = json.getJSONArray("data"); //Get Data object from Json file
					if(data != null) {
						streamsData.add(data); //Add json array data to the list
						try {
							cursor = "&after=" + json.getJSONObject("pagination").getString("cursor") + "'"; //Get the cursor to next page if it exist
						}
						catch(Exception e) {
							//e.printStackTrace();
							System.out.println("Cursor not found");
							cursor = null;
						}
					}
					else {
						cursor = null;
					}
				
				} catch (ParseException e) {
					//e.printStackTrace();
					System.out.println("Error transforming HTTP Response");
					cursor =  null;
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("Error transforming HTTP Response");
					cursor = null;
				}
			}
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Error sending cURL request (Stream Search)");
			cursor = null;
		}
		return this.getStreams(streamsData); //Return an Streams Arraylist from the current JsonArray Arraylist
	}
}
