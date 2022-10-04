package com.actitime.tyss.datadriverntesting;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertyFile_02test {
	@Test
public static void ReadDataFromPropertyFile() throws Throwable {
	FileInputStream fis = new FileInputStream("./src/test/resource/comondata.properties.rtf");
	Properties cd = new Properties();
	cd.load(fis);
	String actitimeUrl = cd.getProperty("url");
	System.out.println("actitimeUrl = " + actitimeUrl);
	String actitimeUsername = cd.getProperty("username");
	System.out.println("actitimeUsername = " + actitimeUsername);
	String actitimePassWord = cd.getProperty("passowrd");
	System.out.println("actitimePassWord =  " + actitimePassWord );
	
	
}
}