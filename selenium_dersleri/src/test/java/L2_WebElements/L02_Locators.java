package L2_WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L02_Locators {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // "https://www.heroku.com/home" Url'ine gidelim.

        driver.get("https://www.heroku.com/home");

        //Programlama dillerini className ile alalım.
        WebElement languages = driver.findElement(By.className("lang-list"));
        System.out.println(languages.getText());

        //Sitedeki linkleri tagName ile listeye atalım.
        //WebElement links = driver.findElement(By.tagName("a"));

        //Log in butonuna linkText veya partialLinkText ile tıklayalım.
        WebElement logInButton = driver.findElement(By.linkText("Log in"));
        logInButton.click();
        //linkText'te metnin tamamı verilirken, partial'da bir kısmı verilmesi yeterlidir.


    }
}
