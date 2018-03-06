import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = initChromeDriver();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");

        WebElement pass = driver.findElement(By.id("passwd"));
        pass.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement button = driver.findElement(By.className("ladda-label"));
        button.click();

        Thread.sleep(2000);
        WebElement user = driver.findElement(By.className("employee_avatar_small"));
        user.click();

        Thread.sleep(2000);
        WebElement out = driver.findElement(By.id("header_logout"));
        out.click();

    }
    public static WebDriver initChromeDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        return new ChromeDriver();
    }
}
