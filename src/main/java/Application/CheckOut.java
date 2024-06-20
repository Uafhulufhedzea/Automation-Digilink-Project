package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {
 WebDriver driver;

public CheckOut(WebDriver driver) {
    this.driver = driver;
}
   public void Checkout(){

       driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Uafhulufhedzea");
       driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Rambuda");
       driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("2001");

   }
}