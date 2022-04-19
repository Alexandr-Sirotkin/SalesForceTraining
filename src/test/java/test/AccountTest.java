package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import model.Account;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pages.NewAccountPage;

public class AccountTest {

  @Test
  public void createAccountTest() {
    User user = new User();
    Account account = new Account("AQA Account 1", "www.onliner.by", "Apparel");
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-popup-blocking");
    WebDriver driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();

    driver.get(user.getURL());
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user.getLOGIN());
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(user.getPASSWORD());
    driver.findElement(By.xpath("//input[@id='Login']")).click();

    NewAccountPage newAccountPage = new NewAccountPage(driver);
    newAccountPage.openPage()
                  .create(account);
  }
}
