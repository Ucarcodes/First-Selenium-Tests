package L5_ddMenu;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L01_dDownMenu {
            WebDriver driver;

    //Her metoddan önce çalışacak.
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/dropdown");
    
    }
    @After
    public void tearDown()throws InterruptedException{
        Thread.sleep(2000);
        driver.close();

    }

    @Test
    public void SelectByIndexTest() throws InterruptedException{
    
        
        //Dropdown locate alalım.
        WebElement dropDown = driver.findElement(By.cssSelector("select[id='dropdown']"));

        //Select objesi oluşturalım.
        Select selectObj = new Select(dropDown);

        //Select objesi ile Indexe göre arama (Index 0'dan başlar.)

        selectObj.selectByIndex(1);
        Thread.sleep(3000);
        selectObj.selectByIndex(2);
    }

    @Test
    public void SelectByValueTest() throws InterruptedException{
        Thread.sleep(3000);
        WebElement dropDown = driver.findElement(By.cssSelector("select[id='dropdown']"));

        //Select objesi ile Value değerine göre arama
        Select select = new Select(dropDown);
        select.selectByValue("1");

    }

    @Test
    public void SelectByVisibleTextTest() throws InterruptedException{

        Thread.sleep(3000);
        WebElement dropDown = driver.findElement(By.cssSelector("select[id='dropdown']"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Option 1");
        Thread.sleep(3000);
        select.selectByVisibleText("Option 2");

        
    }

    @Test
    public void PrintAllTest(){
    WebElement dropDown = driver.findElement(By.cssSelector("select[id='dropdown']"));
    Select select = new Select(dropDown);

    //Tüm değerleri yazdıralım.
    List<WebElement> allOptions = select.getOptions();
    System.out.println("Listedeki eleman sayısı: " + allOptions.size());

    for(WebElement eachOption: allOptions){
        System.out.println(eachOption.getText());
    }



    }

    
}
