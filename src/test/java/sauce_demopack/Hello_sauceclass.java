
package sauce_demopack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

 
public class Hello_sauceclass {
	
	
	void login() throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement usernamebox = driver.findElement(By.name("user-name"));
		Thread.sleep(5000);
		usernamebox.sendKeys("standard_user"); 
		
		WebElement passwordbox = driver.findElement(By.id("password"));
		Thread.sleep(5000);
		passwordbox.sendKeys("secret_sauce"); 
		
		WebElement loginbox =driver.findElement(By.name("login-button"));
		Thread.sleep(3000);
		
		loginbox.click(); 
		

		WebElement addtocart= driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		Thread.sleep(3000);
        addtocart.click();
        WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
        Thread.sleep(6000);
        cartIcon.click();
        
        WebElement checkoutbtn= driver.findElement(By.name("checkout"));
        Thread.sleep(3000);
        checkoutbtn.click();
        
        WebElement firstnamebox = driver.findElement(By.id("first-name"));
		Thread.sleep(2000);
		firstnamebox.sendKeys("usha"); 
		
		 WebElement lastnamebox = driver.findElement(By.id("last-name"));
			Thread.sleep(2000);
			lastnamebox.sendKeys("arun"); 
			
			 WebElement postcodebox = driver.findElement(By.id("postal-code"));
				Thread.sleep(2000);
				postcodebox.sendKeys("96117"); 
				
				WebElement continuebtn = driver.findElement(By.id("continue"));
		        Thread.sleep(3000);
		        continuebtn.click();
		        
		        WebElement finishbtn = driver.findElement(By.id("finish"));
		        Thread.sleep(3000);
	            finishbtn.click();
	            
       WebElement backhomebtn = driver.findElement(By.id("back-to-products"));
       Thread.sleep(2000);
       backhomebtn.click();
       
      

       WebElement menubtn1 = driver.findElement(By.id("react-burger-menu-btn"));
       Thread.sleep(3000);
       menubtn1.click(); 
       
       WebElement logoutLink = driver.findElement(By.id("logout_sidebar_link"));
       Thread.sleep(3000);
       logoutLink.click();
			
	}
	
	public static void main(String[] args) throws InterruptedException  {
		Hello_sauceclass obj=new Hello_sauceclass();
		obj.login();
		

	}

}