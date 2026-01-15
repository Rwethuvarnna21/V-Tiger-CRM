package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.propertiesUtility;

public class FetchingDataFRomPropertiesFile {

	public static void main(String[] args) throws IOException {
//		FileInputStream fis=new FileInputStream("/home/rwethu/Data.properties");
//		Properties prop=new Properties();
//		prop.load(fis);
//		String URL=prop.getProperty("url");
//		System.out.println(URL);
//		WebDriver driver=new ChromeDriver();
//		driver.get(URL);
//		String UN=prop.getProperty("username");
//		String Pass=prop.getProperty("password");
//		 String prod=prop.getProperty("product");
//		System.out.println(UN);
//		System.out.println(Pass);
//		driver.findElement(By.name("q")).sendKeys(prod,Keys.ENTER);
		
      propertiesUtility  putil=new propertiesUtility();
      String UN = putil.getDataFromPropertiesFile("username");
      System.out.println(UN);
      String pass = putil.getDataFromPropertiesFile("password");
      System.out.println(pass);
      String URL = putil.getDataFromPropertiesFile("url");
      System.out.println(URL);
      
	}

}
