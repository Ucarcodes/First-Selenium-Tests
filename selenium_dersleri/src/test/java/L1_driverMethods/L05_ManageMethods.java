package L1_driverMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L05_ManageMethods {

    public static void main(String[] args) throws InterruptedException{
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Hepsiburada sitesine gidelim.
        driver.get("https://hepsiburada.com");

        //Sayfa başlığının hepsiburada olduğunu test edelim.
        String actualTitle = driver.getTitle();
        String expectedTitle = "Hepsiburada";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("test başarılı.");
        }
        else{
            System.out.println("test başarısız.");
        }

        //Facebook sayfasına gidelim.
        driver.get("https://facebook.com");

        //Sayfa Url'inin "facebook" içerdiğini test edelim.

        if(driver.getCurrentUrl().contains("facebook")){
            System.out.println("test başarılı.");
        }
        else{
            System.out.println("test başarısız.");
        }

        //Hepsiburada sayfasına geri dönelim.
        driver.navigate().back();

        //Geri döndüğümüzü test edelim.
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Hepsiburada sitesine dönüldü.");
        }
        else{
            System.out.println("test başarısız.");
        }

        driver.close();

    }

}
