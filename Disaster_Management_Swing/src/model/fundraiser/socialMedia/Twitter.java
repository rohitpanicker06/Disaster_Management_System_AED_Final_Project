/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.fundraiser.socialMedia;


import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

/**
 *
 * @author rohitpanicker
 */


public class Twitter {
    
    static String consumerKeyStr = "rtMYzP8qEg2QsBpDat9yNDjii";
	static String consumerSecretStr = "wERgfCeHy4bpOHrtrCjDgmLe3HLbZSABaOmz4R3r8kQkiFdnkN";
	static String accessTokenStr = "1587902707729195008-sTbIMiukJkv9auQ8NuMkAXvgvT1qgQ";
	static String accessTokenSecretStr = "CYiep7SOuzW9MiVUq7mYGiuqlt2wtaO1Y22nuwV4CDrLu";

    
    public static void main(String[] args) {

		try {
			twitter4j.Twitter twitter  =  new TwitterFactory().getInstance();

			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
			AccessToken accessToken = new AccessToken(accessTokenStr,
					accessTokenSecretStr);

			twitter.setOAuthAccessToken(accessToken);

			twitter.updateStatus("Test Tweet using Twitter4J");

			System.out.println("Successfully updated the status in Twitter.");
		} catch (TwitterException te) {
			te.printStackTrace();
		}
	}
}
