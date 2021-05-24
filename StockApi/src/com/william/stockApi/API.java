package com.william.stockApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;


public class API {
	
	private static HttpURLConnection connection;
	
	/*public static void API(String[] args) {
		new API().constructor();

	}
	
	public void constructor() {
		getUsers();
	} */
	
	
	public static String[][] getUsers() {
		BufferedReader reader;
		String line;
		String[][] userData = null;
		StringBuffer responseContent = new StringBuffer();
		
		try {
			URL url = new URL("https://europe-west2-gwentgrailsstockapi.cloudfunctions.net/ggstock-get-users-mongo");
			connection = (HttpURLConnection) url.openConnection();
			
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			
			int status = connection.getResponseCode();
			if (status > 299) {
				System.out.println("Unsuccessful connection");
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			} else {
				System.out.println("Successful connection");
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			}
			
			
			userData = parseUserData(responseContent.toString());
			
			for (int i = 0; i < userData.length; i++) { //this equals to the row in our matrix.
		         for (int j = 0; j < userData[i].length; j++) { //this equals to the column in each row.
		            System.out.print(userData[i][j] + " ");
		         }
		         System.out.println(); //change line on console as row comes to end in the matrix.
		      }
			
		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
		
		
		return userData;
	
	}
		
	
	
	public static String[][] parseUserData(String responseBody) {
		JSONArray userData = new JSONArray(responseBody);
		String[][] usersList = new String[userData.length()][3];
		
		for (int i = 0; i < userData.length(); i++) {
			
			JSONObject t = userData.getJSONObject(i);
			usersList[i][0] = String.valueOf(t.getInt("ID"));
			usersList[i][1] = t.getString("Username");
			usersList[i][2] = t.getString("Password");
			
		}
		return usersList;
		
	}
}


