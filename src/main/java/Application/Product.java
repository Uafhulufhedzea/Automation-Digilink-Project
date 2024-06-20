package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Product {

    WebDriver driver;

    public Product(WebDriver driver) {

        this.driver = driver;
    }
    //method for adding first item to cart
    public void Product01(){

        //adding item to cart
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    }
    public void Product2(){

        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }

}
