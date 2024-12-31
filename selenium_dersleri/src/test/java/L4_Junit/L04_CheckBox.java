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

public class L04_CheckBox {


    WebDriver driver;

    //Her metoddan önce çalışacak.
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void checkBox() throws InterruptedException{
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type= 'checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type= 'checkbox'])[2]"));

        if(!checkBox1.isSelected()){
            checkBox1.click();
        }

        if(!checkBox2.isSelected()){
            checkBox2.click();
        }

        Thread.sleep(3000);

    }
}
