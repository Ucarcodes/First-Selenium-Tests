package L4_Junit;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L06_Assertion {

        WebDriver driver;

    //Her metoddan önce çalışacak.
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
    
    }

    @After
    public void tearDown()throws InterruptedException{
        Thread.sleep(2000);
        driver.close();

    }

    @Test
    public void test01(){
        //Sayfa başlığının "YouTube olduğunu test edelim."
        String actualTitle = driver.getTitle();
        String expectedTitle = "YouTube";

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void test02(){
        //Search Box'ın erişilebilir olduğunuz test edelim.
        WebElement searchBox = driver.findElement(By.cssSelector("input[id='search']"));
        Assert.assertTrue(searchBox.isEnabled());
    }

    @Test
    public void test03(){
        //Sayfa başlığının "youtube" olmadığını doğrulayalım.

        Assert.assertFalse(driver.getTitle().contains("youtube"));
        Assert.assertNotEquals("youtube", driver.getTitle());
    }

}
