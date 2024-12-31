package L4_Junit;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class L03_Test {

    WebDriver driver;

    //Her metoddan önce çalışacak.
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    
    }

    //Her metoddan sonra çalışacak.
    @After 
    public void tearDown(){
        driver.close();

    }

    @Test
    public void test01(){
        driver.get("https://www.hepsiburada.com");
    }

    @Test
    public void test02(){
        driver.get("https://www.n11.com");
    }

    @Test
    public void test03(){
        driver.get("https://www.trendyol.com");
    }
}
