package L4_Junit;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L05_RadioButton {

    WebDriver driver;

    //Her metoddan önce çalışacak.
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");
    
    }

    @After
    public void tearDown() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void radioButton(){
        //Create an account butonuna tıklayalım.

        WebElement createAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        createAccount.click();

        WebElement male = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));

        if(!male.isSelected()){
            male.click();
        }
    }
}
