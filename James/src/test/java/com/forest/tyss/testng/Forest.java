package com.forest.tyss.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Forest {
	
public static void lion() {
	System.out.println("Lion is the King Of the Forest");
}
@AfterClass
public static void tiger() {
	System.out.println("Tiger is the King Of the Forest");
}
@BeforeClass
public static void buffalo() {
	System.out.println("Buffalo is the King Of the Forest");
}
@BeforeMethod
public static void peacock() {
	System.out.println("Peacock is the King of the Forest");
}
@Test
public static void rhino() {
	System.out.println("Rhino is the King of the Forest");
}
@AfterMethod
public static void giraffe() {
	System.out.println("Giraffe is the king of the Forest ");
}
}