package com.migrate.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class MigratePro {
public static void main(String args[])
{
	String line;
    try 
    { 
        URL url = new URL( "http://localhost:8085/MavenProject?migrate" ); 
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream())); 
        line = in.readLine(); 
        System.out.println( line ); 
        in.close(); 
    }
    catch (Exception e)
    { 
        e.printStackTrace(); 
    } 
}
}
