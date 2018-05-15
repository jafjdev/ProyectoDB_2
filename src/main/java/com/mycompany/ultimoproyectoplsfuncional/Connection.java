package com.mycompany.ultimoproyectoplsfuncional;

import static org.toilelibre.libe.curl.Curl.curl;

public class Connection {

	private String clientID = null;
	private String OAuth = null;
	
	public Connection(String clientID, String OAuth) {
		this.clientID = clientID;
		this.OAuth = OAuth;
	}

	public String getClientID() {
		return clientID;
	}

	public String getOAuth() {
		return OAuth;
	}
	
	public void start() {
		String conectionUrl = "-H 'Authorization: OAuth " + this.OAuth + "' https://id.twitch.tv/oauth2/validate";
		try {
			curl(conectionUrl);
			System.out.println("Connection Stableshed");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Connection Error");
		}
	}
}
