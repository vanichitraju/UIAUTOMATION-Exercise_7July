package SampleUI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class UInavigation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vanichitraju\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://automationintesting.online/#/admin");
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,1000)");
        //driver.quit();
        WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
        Username.sendKeys("admin");
        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("password");
        WebElement Login = driver.findElement(By.id("doLogin"));
        Login.click();
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        driver.findElement(By.id("roomName")).sendKeys("102");
        driver.findElement(By.id("roomPrice")).sendKeys("200");
        driver.findElement(By.id("wifiCheckbox")).click();
        driver.findElement(By.id("createRoom")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("roomName")).sendKeys("103");
        driver.findElement(By.id("roomPrice")).sendKeys("250");
        driver.findElement(By.id("tvCheckbox")).click();
        driver.findElement(By.id("refreshCheckbox")).click();
        driver.findElement(By.id("createRoom")).click();
//Validate the Room Number validation
        Thread.sleep(5000);
        driver.findElement(By.id("roomName")).sendKeys("106");
        driver.findElement(By.id("tvCheckbox")).click();
        driver.findElement(By.id("roomPrice")).sendKeys("300");
        driver.findElement(By.id("createRoom")).click();
        boolean status = driver.findElement(By.xpath("//input[@type='checkbox']")).isEnabled();

        if(status){
            System.out.println("Checkbox is checked");
        } else {
            System.out.println("Checkbox is unchecked");
        }
    }
}
