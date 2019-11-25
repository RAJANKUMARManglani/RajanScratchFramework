package com.Dsci.ReadPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public  String ReadElementObjectRepo(String object) throws IOException{
		
		System.out.println(object);
		// create object of Properties class.
		Properties prop=new Properties(); 
		
		//System.getProperty("user.dir");
		
		//Create object of FileInputStream and give property file location as fileInputStream parameter (which property file is to be read)
		//String path = System.getProperty("user.dir");
		//System.out.println(path); 
		
		
		try {
			FileInputStream ip= new FileInputStream("com.Dsci.insurancedomain//Resources//Object.properties");
			// Load the file
			prop.load(ip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
       return prop.getProperty(object);
	}

}
