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
    
    static String consumerKeyStr = "uOk3VPz2MfmN18FDcbKegzvTr";
	static String consumerSecretStr = "tlRkfidPteyQPh5qVKMtyd10h4hpViC9Nf1GRz8tRn61xkY82E";
	static String accessTokenStr = "1583522101733904384-N87zLJOVGnHqQfORqmuF5naR2i0uOe";
	static String accessTokenSecretStr = "ctHEw04fm9jOfHSXcVbP9Gz6KBGPkruov6B9S3AcJSlrN";

    
    public static void main(String[] args) {

		try {
			twitter4j.Twitter twitter  =  new TwitterFactory().getInstance();

			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
			AccessToken accessToken = new AccessToken(accessTokenStr,
					accessTokenSecretStr);

			twitter.setOAuthAccessToken(accessToken);

			twitter.updateStatus("Post using Twitter4J Again");

			System.out.println("Successfully updated the status in Twitter.");
		} catch (TwitterException te) {
			te.printStackTrace();
		}
	}
}
