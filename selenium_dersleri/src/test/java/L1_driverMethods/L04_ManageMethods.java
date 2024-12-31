package L1_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L04_ManageMethods {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Hepsiburada sayfasına gidelim.
        driver.get("https://hepsiburada.com");

        //Sayfanın konumunu ve boyutlarını yazdıralım.
        System.out.println("Sayfanın konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları: " + driver.manage().window().getSize());

        //Sayfayı simge durumuna getirelim.
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayı maximize yapalım.
        driver.manage().window().maximize();

        //Sayfanın konumunu ve boyutlarını maximize durumdayken yazdıralım.
        System.out.println("Sayfanın konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları: " + driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı fullscreen yapalım.
        driver.manage().window().fullscreen();

        //Sayfanın konumunu ve boyutlarını fullscreen durumdayken yazdıralım.
        System.out.println("Sayfanın konumu: " + driver.manage().window().getPosition());
        System.out.println("Sayfanın boyutları: " + driver.manage().window().getSize());
        Thread.sleep(3000);

        //Sayfayı kapatalım.
        driver.close();


        

        
    }
}
