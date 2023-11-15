/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neaproject;

/**
 *
 * @author tempa
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class JavaHttpClientUPDATE  {

    public static int ClientU(String a, String b){
        // Replace with your actual API endpoint
        String apiUrl = "http://2.221.46.254:1323/"+a;

        // Replace with your actual JSON payload
        String jsonPayload = b;

        // Send the POST request
        sendPostRequest(apiUrl, jsonPayload);
        return 345;
    }

    private static void sendPostRequest(String apiUrl, String jsonPayload) {
        try {
            // Create a URL object
            URL url = new URL(apiUrl);

            // Open a connection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to POST
            connection.setRequestMethod("POST");

            // Enable input and output streams
            connection.setDoOutput(true);

            // Set the request headers
            connection.setRequestProperty("Content-Type", "application/json");

            // Write the JSON payload to the output stream
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonPayload.getBytes("UTF-8");
                os.write(input, 0, input.length);
            }

            // Get the response code
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            

          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
    

    


