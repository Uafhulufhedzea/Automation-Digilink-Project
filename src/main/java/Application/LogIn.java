package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {
    WebDriver driver;


    public LogIn(WebDriver driver) {

        this.driver = driver;
    }
   public void login() {
        //logging in with valid user credentials
       driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
       driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
       driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
   }

    public void username() {
        //logging in with valid user credentials
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }
   public void logout() throws InterruptedException {
       //clicking on the menu
       driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
       Thread.sleep(2000);//error exceptional handling
       //logging out
       driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
   }
    }
