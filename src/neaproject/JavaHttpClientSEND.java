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
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:1323/useraccounts1");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");

            // Construct JSON data to send
            String jsonData = "{\"Firstname\":\"John\",\"Surname\":\"Doe\",\"Email\":\"johndoe@example.com\",\"Password\":\"password\",\"Registration_date\":\"2023-10-31\",\"Address\":\"123 Main St\",\"Phone\":\"123-456-7890\"}";

            // Send data
            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonData.getBytes("UTF-8");
                os.write(input, 0, input.length);
            }

            int responseCode = connection.getResponseCode();
            System.out.println("HTTP Response Code: " + responseCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}