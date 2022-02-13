package com.utili;

import java.io.FileInputStream;
import java.util.Properties;

public class Baseconfig {
	
	public static String getValue(String value) throws Exception
	{
		String path = "./Config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		Properties pro = new Properties();
		pro.load(fis);
		//old Java: object = anything ->New Java: var = anything 
		//Object data = pro.get(value);
		
		return pro.get(value).toString();
	}

}
