/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.hospital;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
 
/**
 *
 * @author rohitpanicker
 */
public class OTPtest {
    
    public static String sendSms() {
		try {
			// Construct data
			String apiKey = "apikey=" + "NzAzNDc5NDI3NTYyNmM2ZTU3NGM1NjQ5NzYzMzRlNjU=";
			String message = "&message=" + "This is your message";
			String sender = "&sender=" + "Jims Autos";
			String numbers = "&numbers=" + "+18573135242";
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			
			return stringBuffer.toString();
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}
	}
    
    public static void main(String[] args) {
        String sendSms = sendSms();System.out.println(sendSms);
    }
    
}
