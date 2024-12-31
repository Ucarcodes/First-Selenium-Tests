package L2_WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L01_Locators {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sitesine gidelim.
        driver.get("https://amazon.com");

        //By name ile arama kutusunu locate edelim ve "bisiklet" araması yapalım.
        WebElement searchBox = driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys("bisiklet", Keys.ENTER);

        //By id ile arama kutusunu locate edelim ve "telefon" araması yapalım.
        //WebElement searchBox2 = driver.findElement(By.id("twotabsearchtextbox"));
        //searchBox2.sendKeys("telefon");
        //searchBox2.submit();

        //Sayfayı kapatalım.
        driver.close();

    }
}
