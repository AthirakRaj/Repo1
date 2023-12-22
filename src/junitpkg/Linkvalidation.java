package junitpkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Test;

public class Linkvalidation {
    @Test
	public void test() throws IOException 
	{
		URL u=new URL("https://www.facebook.com");
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("response code is 200");
		}
		else
		{
			System.out.println("response code is not  200");
		}

}
}