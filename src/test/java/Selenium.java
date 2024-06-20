import Application.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class Selenium {

    public static ChromeOptions options;
    public static WebDriver driver;

    @BeforeTest
    void setup(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    @Test
    void teststeps() throws InterruptedException {

        //login with valid credentials
        LogIn LG = new LogIn(driver);
        LG.login();

        //adding item to cart
            Product p = new Product(driver);
            p.Product01();

        //logging out
        LogIn LG2 = new LogIn(driver);
        LG2.logout();

        //logging in again
        LogIn Again = new LogIn(driver);
        Again.login();

        //adding a second item to cart
        Product p2 = new Product(driver);
        p2.Product2();

        //going to your cart
         Cart c = new Cart(driver);
         c.openCart();

        //checking out
        CheckOut c2 = new CheckOut(driver);
        c2.Checkout();

        //confirmation
        Confirmation o1 = new Confirmation(driver);
        o1.confirm();

    }
}
