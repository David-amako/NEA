/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neaproject;

/**
 *
 * @author tempa
 */
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;



public class JavaHttpClientSEND {
    
    
    
    public static int ClientS(String a, String b){
        int responseCode = 0;
        try {
            URL url = new URL("http://2.221.46.254:1323/"+ a);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");

            // Construct JSON data to send
            String jsonData = b;

            // Send data
            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonData.getBytes("UTF-8");
                os.write(input, 0, input.length);
            }

            responseCode = connection.getResponseCode();
            System.out.println("HTTP Response Code: " + responseCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseCode;
    }
}
//"{\"Firstname\":\"John\",\"Surname\":\"Doe\",\"Email\":\"johndoe@example.com\",\"Password\":\"password\",\"Address\":\"123 Main St\",\"Phone\":\"123-456-7890\"}";