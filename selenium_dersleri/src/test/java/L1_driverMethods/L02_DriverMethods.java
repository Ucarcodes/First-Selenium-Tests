package L1_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L02_DriverMethods {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    String amazonUrl = "https://www.amazon.com.tr/";

    //Amazon sayfasına gidelim.
    driver.get(amazonUrl);

    //Sayfa title yazdıralım.
    String amazonCurrentTitle = driver.getTitle();
    System.out.println("Amazon Site başlığı: " + amazonCurrentTitle);

    //Sayfa başlığının "Amazon" içerdiğini test edelim.
    System.out.println(driver.getTitle().contains("Amazon"));

    //Sayfa adresini (Url) yazdıralım.
    String amazonCurrentUrl = driver.getCurrentUrl();
    System.out.println("Amazon Url: " + amazonCurrentUrl);

    //Sayfa Url'inin "amazon" içerdiğini test edelim.
    System.out.println(driver.getCurrentUrl().contains("amazon"));

    //Sayfa handle değerini yazdıralım.
    String amazonWindowHandle = driver.getWindowHandle();
    System.out.println("Handle değeri:" + amazonWindowHandle);

    //Sayfa HTML Kodlarında "Gateway" kelimesinin geçtiğini test edelim.
    if(driver.getPageSource().contains("Gateways")){
        System.out.println("passed");
    }
    else{
        System.out.println("failed");
    }

    //Sayfayı kapatalım.
    driver.close();
    }
}
