package canarydetect;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver vk=new ChromeDriver();
		vk.get("https://www.canarydetect.com/contact");
		vk.manage().window().maximize();
		vk.findElement(By.xpath("//body/div[@id='siteWrapper']/main[@id='page']/article[@id='sections']/section[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[1]/label[1]/input[1]")).sendKeys("Vishnu");
		vk.findElement(By.xpath("//body/div[@id='siteWrapper']/main[@id='page']/article[@id='sections']/section[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/fieldset[1]/div[2]/label[1]/input[1]")).sendKeys("Koratala");
		vk.findElement(By.xpath("//body[1]/div[1]/main[1]/article[1]/section[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("vkoratala@gmail.com");
		vk.findElement(By.xpath("//body[1]/div[1]/main[1]/article[1]/section[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("Test");
		vk.findElement(By.xpath("//body[1]/div[1]/main[1]/article[1]/section[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/textarea[1]")).sendKeys("test");
		JavascriptExecutor js = (JavascriptExecutor) vk;
		js.executeScript("window.scrollBy(697,745)", "");
		Thread.sleep(3500);
		vk.findElement(By.xpath("//input[@name='radio-4dd8c673-4231-4b90-9595-2aa03f5d7330-field'][@value='Yes']")).click();
		vk.findElement(By.xpath("//body[1]/div[1]/main[1]/article[1]/section[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).submit();
		Thread.sleep(3500);
		vk.close();		
		
	}
}
