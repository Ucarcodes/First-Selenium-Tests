package L1_driverMethods;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L01_DriverMethods {

    public static void main(String[]args){

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    String amazonUrl = "https://www.amazon.com.tr/";
    String hepsiBuradaUrl = "https://www.hepsiburada.com";

    //Amazon sayfasına git.
    driver.get(amazonUrl);
        
    //Sayfa başlığı console'a yazdır.
    String amazonActualTitle = driver.getTitle();
    System.out.println("Amazon sayfa başlığı: " + amazonActualTitle);

    //Sayfa Url'ini konsola yazdır.
    String amazonActualUrl = driver.getCurrentUrl();
    System.out.println("Amazon Url'i: " + amazonActualUrl);

    //Hepsiburada sayfasına git.
    driver.get(hepsiBuradaUrl);

    //Sayfa başlığı console'a yazdır.
    String hepsiBuradaActualTitle = driver.getTitle();
    System.out.println("Hepsiburada sayfa başlığı: " + hepsiBuradaActualTitle);

    //Sayfa Url'ini konsola yazdır.

    String hepsiBuradaActualUrl = driver.getCurrentUrl();
    System.out.println("Hepsiburada sayfa Url'i: " + hepsiBuradaActualUrl);

    }

    

}
