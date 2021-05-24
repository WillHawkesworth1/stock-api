package com.william.stockApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;


public class API {
	
	private static HttpURLConnection connection;
	
	/*public static void API(String[] args) {
		getCosts();

	}*/
	
	
	
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
	
	public static String[][] getCosts() {
		BufferedReader reader;
		String line;
		String[][] costData = null;
		StringBuffer responseContent = new StringBuffer();
		
		try {
			URL url = new URL("https://europe-west2-gwentgrailsstockapi.cloudfunctions.net/ggstock-get-costs-mongo");
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
			
			
			costData = parseCostData(responseContent.toString());
			
			for (int i = 0; i < costData.length; i++) { //this equals to the row in our matrix.
		         for (int j = 0; j < costData[i].length; j++) { //this equals to the column in each row.
		            System.out.print(costData[i][j] + " ");
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
		
		
		return costData;
	
	}
		
	public static String[][] getShoe() {
		BufferedReader reader;
		String line;
		String[][] stockData = null;
		StringBuffer responseContent = new StringBuffer();
		
		try {
			URL url = new URL("https://europe-west2-gwentgrailsstockapi.cloudfunctions.net/ggstock-get-shoes-mongo");
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
			
			
			stockData = parseShoeData(responseContent.toString());
			
			for (int i = 0; i < stockData.length; i++) { //this equals to the row in our matrix.
		         for (int j = 0; j < stockData[i].length; j++) { //this equals to the column in each row.
		            System.out.print(stockData[i][j] + " ");
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
		
		
		return stockData;
	
	}

	public static String[][] getSold() {
		BufferedReader reader;
		String line;
		String[][] soldData = null;
		StringBuffer responseContent = new StringBuffer();
		
		try {
			URL url = new URL("https://europe-west2-gwentgrailsstockapi.cloudfunctions.net/ggstock-get-sold-mongo");
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
			
			
			soldData = parseSoldData(responseContent.toString());
			
			for (int i = 0; i < soldData.length; i++) { //this equals to the row in our matrix.
		         for (int j = 0; j < soldData[i].length; j++) { //this equals to the column in each row.
		            System.out.print(soldData[i][j] + " ");
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
		
		
		return soldData;
	
	}

	public static String[][] getInvestment() {
		BufferedReader reader;
		String line;
		String[][] investData = null;
		StringBuffer responseContent = new StringBuffer();
		
		try {
			URL url = new URL("https://europe-west2-gwentgrailsstockapi.cloudfunctions.net/ggstock-get-investments-mongo");
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
			
			
			investData = parseInvestData(responseContent.toString());
			
			for (int i = 0; i < investData.length; i++) { //this equals to the row in our matrix.
		         for (int j = 0; j < investData[i].length; j++) { //this equals to the column in each row.
		            System.out.print(investData[i][j] + " ");
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
		
		
		return investData;
	
	}
	
	public static String[][] parseUserData(String responseBody) {
		JSONArray userData = new JSONArray(responseBody);
		String[][] usersList = new String[userData.length()][2];
		
		for (int i = 0; i < userData.length(); i++) {
			
			JSONObject store = userData.getJSONObject(i);
			usersList[i][0] = String.valueOf(store.getInt("ID"));
			usersList[i][1] = store.getString("Username");
			
		}
		return usersList;
		
	}
	
	public static String[][] parseCostData(String responseBody) {
		JSONArray costData = new JSONArray(responseBody);
		String[][] costsList = new String[costData.length()][5];
		
		for (int i = 0; i < costData.length(); i++) {
			
			JSONObject store = costData.getJSONObject(i);
			costsList[i][0] = String.valueOf(store.getInt("ID"));
			costsList[i][1] = store.getString("Name");
			costsList[i][2] = store.getString("Category");
			costsList[i][3] = store.getString("Price");
			costsList[i][4] = store.getString("Date");
			
		}
		return costsList;
		
	}
	
	public static String[][] parseShoeData(String responseBody) {
		JSONArray stockData = new JSONArray(responseBody);
		String[][] stockList = new String[stockData.length()][9];
		
		for (int i = 0; i < stockData.length(); i++) {
			
			JSONObject store = stockData.getJSONObject(i);
			stockList[i][0] = String.valueOf(store.getInt("ID"));
			stockList[i][1] = store.getString("Name");
			stockList[i][2] = store.getString("Brand");
			stockList[i][3] = store.getString("Size");
			stockList[i][4] = store.getString("Colour");
			stockList[i][5] = store.getString("Price");
			stockList[i][6] = store.getString("Sale");
			stockList[i][7] = store.getString("Condition");
			stockList[i][8] = store.getString("DateBought");
			
		}
		return stockList;
		
	}

	public static String[][] parseSoldData(String responseBody) {
		JSONArray soldData = new JSONArray(responseBody);
		String[][] soldList = new String[soldData.length()][11];
		
		for (int i = 0; i < soldData.length(); i++) {
			
			JSONObject store = soldData.getJSONObject(i);
			soldList[i][0] = String.valueOf(store.getInt("ID"));
			soldList[i][1] = store.getString("Name");
			soldList[i][2] = store.getString("Brand");
			soldList[i][3] = store.getString("Size");
			soldList[i][4] = store.getString("Colour");
			soldList[i][5] = store.getString("Price");
			soldList[i][6] = store.getString("Sale");
			soldList[i][7] = store.getString("Sold");
			soldList[i][8] = store.getString("Condition");
			soldList[i][9] = store.getString("DateBought");
			soldList[i][10] = store.getString("DateSell");
			
		}
		return soldList;
		
	}
	
	public static String[][] parseInvestData(String responseBody) {
		JSONArray investData = new JSONArray(responseBody);
		String[][] investList = new String[investData.length()][10];
		
		for (int i = 0; i < investData.length(); i++) {
			
			JSONObject store = investData.getJSONObject(i);
			investList[i][0] = String.valueOf(store.getInt("ID"));
			investList[i][1] = store.getString("Name");
			investList[i][2] = store.getString("Brand");
			investList[i][3] = store.getString("Size");
			investList[i][4] = store.getString("Colour");
			investList[i][5] = store.getString("Price");
			investList[i][6] = store.getString("Sale");
			investList[i][7] = store.getString("Condition");
			investList[i][8] = store.getString("DateBought");
			investList[i][9] = store.getString("DateSell");
			
		}
		return investList;
		
	}
	
	public static void deleteUser(String id) {
		URL url;
		try {
			url = new URL ("https://europe-west2-gwentgrailsstockapi.cloudfunctions.net/ggstock-delete-user-mongo");
		
			connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
			connection.setDoOutput(true);
			
			String jsonInputString = "{\"userid\":\"" + id + "\"}";
			System.out.print(jsonInputString);
		
			try(OutputStream os = connection.getOutputStream()) {
			    byte[] input = jsonInputString.getBytes("utf-8");
			    os.write(input, 0, input.length);			
			}
		
			try(BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				System.out.println(response.toString());
			} 
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
	}
	
	public static void deleteCost(String id) {
		URL url;
		try {
			url = new URL ("https://europe-west2-gwentgrailsstockapi.cloudfunctions.net/ggstock-delete-cost-mongo");
		
			connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
			connection.setDoOutput(true);
			
			String jsonInputString = "{\"costid\":\"" + id + "\"}";
			System.out.print(jsonInputString);
		
			try(OutputStream os = connection.getOutputStream()) {
			    byte[] input = jsonInputString.getBytes("utf-8");
			    os.write(input, 0, input.length);			
			}
		
			try(BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				System.out.println(response.toString());
			} 
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
	}
	
	public static void deleteInvestment(String id) {
		URL url;
		try {
			url = new URL ("https://europe-west2-gwentgrailsstockapi.cloudfunctions.net/ggstock-delete-investments-mongo");
		
			connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
			connection.setDoOutput(true);
			
			String jsonInputString = "{\"investid\":\"" + id + "\"}";
			System.out.print(jsonInputString);
		
			try(OutputStream os = connection.getOutputStream()) {
			    byte[] input = jsonInputString.getBytes("utf-8");
			    os.write(input, 0, input.length);			
			}
		
			try(BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				System.out.println(response.toString());
			} 
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
	}	

	public static void deleteShoe(String id) {
		URL url;
		try {
			url = new URL ("https://europe-west2-gwentgrailsstockapi.cloudfunctions.net/ggstock-delete-shoe-mongo");
		
			connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
			connection.setDoOutput(true);
			
			String jsonInputString = "{\"shoeid\":\"" + id + "\"}";
			System.out.print(jsonInputString);
		
			try(OutputStream os = connection.getOutputStream()) {
			    byte[] input = jsonInputString.getBytes("utf-8");
			    os.write(input, 0, input.length);			
			}
		
			try(BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				System.out.println(response.toString());
			} 
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
	}

	public static void deleteSold(String id) {
		URL url;
		try {
			url = new URL ("https://europe-west2-gwentgrailsstockapi.cloudfunctions.net/ggstock-delete-sold-mongo");
		
			connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
			connection.setDoOutput(true);
			
			String jsonInputString = "{\"soldid\":\"" + id + "\"}";
			System.out.print(jsonInputString);
		
			try(OutputStream os = connection.getOutputStream()) {
			    byte[] input = jsonInputString.getBytes("utf-8");
			    os.write(input, 0, input.length);			
			}
		
			try(BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				System.out.println(response.toString());
			} 
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
	}

	public static void deleteStock(String id) {
		URL url;
		try {
			url = new URL ("https://europe-west2-gwentgrailsstockapi.cloudfunctions.net/ggstock-delete-stock-mongo");
		
			connection = (HttpURLConnection)url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json; utf-8");
			connection.setDoOutput(true);
			
			String jsonInputString = "{\"stockid\":\"" + id + "\"}";
			System.out.print(jsonInputString);
		
			try(OutputStream os = connection.getOutputStream()) {
			    byte[] input = jsonInputString.getBytes("utf-8");
			    os.write(input, 0, input.length);			
			}
		
			try(BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
				StringBuilder response = new StringBuilder();
				String responseLine = null;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				System.out.println(response.toString());
			} 
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
	}
}


