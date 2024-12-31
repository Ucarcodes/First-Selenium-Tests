package L3_xPath_CSS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L04_css {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        1) css = tagName[attribute name = 'value']; --> En yaygın kullanım
        input[type = 'text']

        2) css="tagName#idValue" veya sadece css = "#idValue" --> Yalnızca id value ile çalışır.
        input#gh-ac                   #gh-ac

        3) css= "tagName.classValue" veya sadece css=".classValue" --> Yalnızca class value ile çalışır.
        label.gh-ar-hdn                   .gh-ar-hdn

        CSS index numarasına göre değer getiremez.


         */

         // https://www.ebay.com/ sayfasına gidin.
         driver.get("https://www.ebay.com/");

         //Arama çubuğuna iphone yazdıralım.
         WebElement searchBox = driver.findElement(By.cssSelector("input[type= 'text']"));
         searchBox.sendKeys("iphone", Keys.ENTER);
    }
}
