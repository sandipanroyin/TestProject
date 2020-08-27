package learnSelenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String url="https://www."+getURL()+".com";
		System.out.println(url);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(url);
		String title=driver.getTitle();
		System.out.println("The title of the website :"+title);
		driver.quit();
		
		
	}



																										
public static String getURL()
{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a URL: ");
	String str= sc.nextLine();
	return str;
	
	
}
}