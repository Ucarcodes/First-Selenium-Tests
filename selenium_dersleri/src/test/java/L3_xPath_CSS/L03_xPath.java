package L3_xPath_CSS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class L03_xPath {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //input[@type= 'text']      //tagName[@attributeName='attributeDegeri']
        // (//input[@type= 'text'])[3] --> Sonuçlardan 3. indextekini bul demektir.
        //*[@type= 'text']
        //[@*= 'text']
        //input[@type]
        //input

        //metin ile arama //a[text()='Saved']
        //*[text()='Saved'] --> Yaygın kullanım
        //*[.='Saved']

        //Belirli bir metin içeren bir öğreyi bulmak için,
        //*[contains(text(), 'Pre-Loved Luxury')] --> Metnin tamamı yazılmak zorunda.

        // https://ebay.com/ sayfasına gidelim.
        driver.get("https://ebay.com/");

        // Arama çubuğuna iPhone yazdıralım.

        WebElement searchBox = driver.findElement(By.xpath("//input[@type= 'text']"));
        searchBox.sendKeys("iphone", Keys.ENTER);
    }
}
