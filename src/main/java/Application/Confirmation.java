package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Confirmation {

    WebDriver driver;

    public Confirmation(WebDriver driver) {

        this.driver = driver;
    }
    public void confirm() {
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    }
}
