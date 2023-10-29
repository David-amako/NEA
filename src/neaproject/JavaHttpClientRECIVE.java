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
import java.net.HttpURLConnection;
import java.net.URL;

public class JavaHttpClientRECIVE {
    
    
    
    
    public static String ClientR(){
        String Data = null;
        try {
            URL url = new URL("http://localhost:1323/useraccounts"); 
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            //System.out.println("HTTP Response Code: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                System.out.println(response.toString());
                Data = (response.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return Data;
    }

    public static void main(String[] args) {
   
    }
}

