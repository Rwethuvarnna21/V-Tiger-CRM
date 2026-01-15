package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.seleniumUtility;

public class facebbokbrokenlink {

	@Test
	public void checkBrokenLink() throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		seleniumUtility sutil=new seleniumUtility();
		Thread.sleep(1000);
		sutil.maximizewindow(driver);
		sutil.accessApplication(driver, "https://www.facebook.com/");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		for(WebElement link:alllinks) {
			@Nullable
			String href = link.getAttribute("href");
			URL url=new URL(href);
			HttpURLConnection h=(HttpURLConnection)url.openConnection();
			h.connect();
			int status = h.getResponseCode();
			if(status>=400) {
				System.out.println("thebrokenlink:"+link.getText());
			}
		}
	}
	
	
		

	

}
