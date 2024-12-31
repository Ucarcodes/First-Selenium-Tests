package L1_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L03_NavigateMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Youtube ana sayfasına gidelim.
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(3000);

        //Amazon ana sayfasına gidelim.
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);

        //Tekrar Youtube sayfasına dönelim.
        driver.navigate().back();
        Thread.sleep(3000);

        //Tekrar Amazon sayfasına gidelim.
        driver.navigate().forward();
        Thread.sleep(3000);

        //Sayfayı yenileyelim.
        driver.navigate().refresh();
        Thread.sleep(1000);

        //Sayfayı kapatılım / Tüm sayfaları kapatalım.
        driver.quit();




    }
}
