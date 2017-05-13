package com.example.satyam.myapplication.Model2;

/**
 * Created by satyam on 9/7/16.
 */
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
public class Connector2 {
    public static Object connect(String jsonURL)
    {
        try
        {
            URL url=new URL(jsonURL);
            HttpURLConnection con= (HttpURLConnection) url.openConnection();
            //CON PROPS
            con.setRequestMethod("GET");
            con.setConnectTimeout(15000);
            con.setReadTimeout(15000);
            con.setDoInput(true);
            return con;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "Error "+e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error "+e.getMessage();
        }
    }
}