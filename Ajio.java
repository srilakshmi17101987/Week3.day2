package HWSW;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title=driver.getTitle();
		 System.out.println(title);
		 //driver.close();
		 Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[@class='ic-close-quickview']")).click();
		//Thread.sleep(4000);
		WebElement search=driver.findElement(By.xpath("//input[@role='combobox' and @name='searchVal']"));
		search.sendKeys("bags",Keys.DOWN);
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(4000);
		String str=driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(str);
	     List<WebElement> brands=driver.findElementsByXPath("//div[@class='brand']");
		WebElement setofbags;
		
		
	    Set<String>  brandset=new LinkedHashSet<String>();
	    for(int i=0;i<brands.size();i++)
	    {
	    	setofbags=brands.get(i);
	         String str1=setofbags.getText();
	         brandset.add(str1);
	    }
	    System.out.println("The bransd names are****************");
	    for (String string : brandset) {
			System.out.println(string);
		}
		
	}

}
