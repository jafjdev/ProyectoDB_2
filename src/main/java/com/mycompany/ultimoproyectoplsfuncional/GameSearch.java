package com.mycompany.ultimoproyectoplsfuncional;



import static org.toilelibre.libe.curl.Curl.curl;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class GameSearch {
	
	private Connection connection;
	private Integer imgSize = 500;
	
	public GameSearch(Connection connection) {
		this.connection = connection;
	}
	
	public void setImgSize(int size) {
		this.imgSize = size;
	}
	
	public Game byID (int id) {
		String searchIdUrl = "-H 'Client-ID: " + this.connection.getClientID() + "' -X GET 'https://api.twitch.tv/helix/games?id=" + id + "'";
		try {
			HttpResponse response = curl(searchIdUrl);
			try {
				JSONObject json = new JSONObject(EntityUtils.toString(response.getEntity()));
				JSONArray data = json.getJSONArray("data");
				if(data != null) {
		    	    JSONObject dataObject = data.getJSONObject(0);
		    	    String imgUrl = dataObject.getString("box_art_url").replace("{width}", this.imgSize.toString()).replace("{height}", this.imgSize.toString());
		    	    Game game = new Game(dataObject.getInt("id"), dataObject.getString("name"), imgUrl);
		    	    return game;
		    	}
				else {
					return null;
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Game byName (String name) {
		String searchNameUrl = "-H 'Client-ID: " + this.connection.getClientID() + "' -X GET 'https://api.twitch.tv/helix/games?name=" + name + "'";
		try {
			HttpResponse response = curl(searchNameUrl);
			try {
				JSONObject json = new JSONObject(EntityUtils.toString(response.getEntity()));
				JSONArray data = json.getJSONArray("data");
				if(data != null) {
		    	    JSONObject dataObject = data.getJSONObject(0);
		    	    String imgUrl = dataObject.getString("box_art_url").replace("{width}", this.imgSize.toString()).replace("{height}", this.imgSize.toString());
		    	    Game game = new Game(dataObject.getInt("id"), dataObject.getString("name"), imgUrl);
		    	    return game;
		    	}
				else {
					System.out.println("Error, Juego no encontrado");
					return null;
				}
			} catch (ParseException e) {
				//e.printStackTrace();
				System.out.println("Error al buscar juego");
				return null;
			} catch (IOException e) {
				// e.printStackTrace();
				System.out.println("Error al ubicar juego");
				return null;
			}
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Error sendind cURL request (Game Search)");
			return null;
		}
	}
	
	public ArrayList<Game> byQuery (String name) {
		String searchNameUrl = "-H 'Accept: application/vnd.twitchtv.v5+json' -H 'Client-ID: " + this.connection.getClientID() + "' -X GET 'https://api.twitch.tv/kraken/search/games?query=" + name + "'";
		ArrayList<Game> games = new ArrayList<Game>();
		try {
			HttpResponse response = curl(searchNameUrl);
			try {
				JSONObject json = new JSONObject(EntityUtils.toString(response.getEntity()));
				JSONArray data = json.getJSONArray("games");
				if(data != null) {
					for (int j = 0; j < data.length(); j++) {
			    	    JSONObject dataObject = data.getJSONObject(j);
			    	    String imgUrl = dataObject.getJSONObject("box").getString("template").replace("{width}", this.imgSize.toString()).replace("{height}", this.imgSize.toString());
			    	    Game game = new Game(dataObject.getInt("_id"), dataObject.getString("name"), imgUrl);
			    	    games.add(game);
					}
		    	}
				else {
					System.out.println("Error, Juego no encontrado");
					return null;
				}
			} catch (ParseException e) {
				//e.printStackTrace();
				System.out.println("Error al buscar juego");
				return null;
			} catch (IOException e) {
				// e.printStackTrace();
				System.out.println("Error al ubicar juego");
				return null;
			}
			return games;
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println("Error sendind cURL request (Game Search)");
			return null;
		}
	}

}
