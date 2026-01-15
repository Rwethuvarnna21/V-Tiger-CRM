package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * this is an utility class which deals with properties file
 * @author class
 * @version 25-12-11
 */
public class propertiesUtility {
/*
 * *	this ia a generic method to fetch data from properties
 * @param key
	@return
	@throws ioexception
 */
	
public String getDataFromPropertiesFile(String key)throws IOException {
FileInputStream fis=new FileInputStream("/home/rwethu/Data.properties");
Properties prop=new Properties();
prop.load(fis);
String value=prop.getProperty(key);
return value;
}

/**
 * 
 * @param key
 * @return
 * @throws IOException
 */
public String getDataFromPropertiesFiles(String key)throws IOException {
FileInputStream fis=new FileInputStream(Ipathutility.propertiesPath);
Properties prop=new Properties();
prop.load(fis);
String value=prop.getProperty(key);
return value;
}
}
