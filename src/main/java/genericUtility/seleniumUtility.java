package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * THis is a utility method which has functionality from selenium library
 */
public class seleniumUtility {
/**
 * This is generic method to maximize the browser
 * @param driver
 */
public void maximizewindow(WebDriver driver) {
	driver.manage().window().maximize();
}
/**
 * THis is a generic method to access the webapplication in the browser
 * @param driver
 * @param url
 */
public void accessApplication(WebDriver driver,String url) {
	driver.get(url);
}
/**
 * THis is a generic method to provide implicit wait
 * @param driver
 * @param maxTime
 */
public void implicitWait(WebDriver driver,int maxTime) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
}
///////////////////***********************MOUSE ACTION********************////////////////////////
/**
 * THis is a generic method to perform mouse hoovering action
 * @param driver
 * @param element
 */
public void mousehoveringAction(WebDriver driver,WebElement element) {
Actions act=new Actions(driver);
act.moveToElement(element).perform();
}
/**
 * THis is a generic method to perform right click action
 * @param driver
 * @param element
 */
public void rightclickaction(WebDriver driver,WebElement element) {
Actions act=new Actions(driver);
act.contextClick(element).perform();
}
//////////***********Alert popup*******//////////////
/**
 * This is a generic method to acccept the alert popup
 * @param driver
 */
public void acceptAlert(WebDriver driver) {
	driver.switchTo().alert().accept();
}
/**
 * This is a generic method to dissmiss the alert popup
 * @param driver
 */
public void dissmissAlert(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}
//////////**********************frames*************************//////////////////
/**
 * THis is a generic method to switch frame using index
 * @param driver
 * @param frameindex
 */
public void switchtoframeusingindex(WebDriver driver,int frameindex) {
	driver.switchTo().frame(frameindex);
}
/**
 * THis is a generic method to switch frame using idorname
 * @param driver
 * @param nameorid
 */
public void switchtoframeusingidorname(WebDriver driver,String nameorid) {
	driver.switchTo().frame(nameorid);
}
/**THis is a generic method to switch frame using frame element
 * 
 * @param driver
 * @param element
 */
public void switchtoframeusingelement(WebDriver driver,WebElement frameelement) {
	driver.switchTo().frame(frameelement);
}
/////////////////////**********************screenshots************************////////////////////
/**
 * This is a generic method to capture the screenshot of the webpage
 * @param driver
 * @param screenshotname
 * @return
 * @throws IOException
 */
public String takewebpagescreenshot(WebDriver driver,String screenshotname) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshot/"+screenshotname+".png");
	Files.copy(src, dest);
//	used for listeners
	return dest.getAbsolutePath(); 
	
	
	
}
///////////////////****************************dropdwon**********************8//////////////////
public void dropdownbyvalue(WebElement Element,String valueattribute ) {
	Select s=new Select(Element);
	s.selectByValue(valueattribute);
}
}
