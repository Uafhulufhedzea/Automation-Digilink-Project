package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
    WebDriver driver;

    public Cart(WebDriver driver) {
        this.driver = driver;
    }
    public void openCart() {

        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }
}
