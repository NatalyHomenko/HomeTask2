import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = initChromeDriver();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");

        WebElement pass = driver.findElement(By.id("passwd"));
        pass.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement button = driver.findElement(By.className("ladda-label"));
        button.click();

        Thread.sleep(200);
        WebElement dashb =  driver.findElement(By.id("tab-AdminDashboard"));
        dashb.click();

        Thread.sleep(200);
        driver.navigate().refresh();

        Thread.sleep(200);
        WebElement zakaz =  driver.findElement(By.linkText("Заказы"));
        zakaz.click();

        Thread.sleep(500);
        driver.navigate().refresh();

        Thread.sleep(200);
        WebElement katalog =  driver.findElement(By.linkText("Каталог"));
        katalog.click();
        Thread.sleep(500);
        driver.navigate().refresh();

        Thread.sleep(200);
        WebElement klients =  driver.findElement(By.linkText("Клиенты"));
        klients.click();
        Thread.sleep(500);
        driver.navigate().refresh();

        Thread.sleep(200);
        WebElement help =  driver.findElement(By.linkText("Служба поддержки"));
        help.click();
        Thread.sleep(500);
        driver.navigate().refresh();

        Thread.sleep(200);
        WebElement statistic =  driver.findElement(By.linkText("Статистика"));
        statistic.click();
        Thread.sleep(500);
        driver.navigate().refresh();

        Thread.sleep(200);
        WebElement modules =  driver.findElement(By.linkText("Modules"));
        modules.click();
        Thread.sleep(500);
        driver.navigate().refresh();

    }
    public static WebDriver initChromeDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
        return new ChromeDriver();
    }
}
