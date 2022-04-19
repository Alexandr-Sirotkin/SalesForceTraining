package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

  WebDriver driver;
  String label;

  public DropDown(WebDriver driver, String label) {
    this.driver = driver;
    this.label = label;
  }

  private static final String DROP_DOWN_XPATH = "//*[contains(text(),'%s')]/ancestor::div[contains(@class,'uiInput')]//a";
  private static final String SELECT_OPTION_XPATH = "//*[@class='select-options']/descendant::a[contains(text(),'%s')]";

  public void selectOption(String option) {
    new WebDriverWait(driver, 15).until(ExpectedConditions
        .visibilityOf(driver.findElement(By.xpath(String.format(DROP_DOWN_XPATH, label))))).click();
    driver.findElement(By.xpath(String.format(SELECT_OPTION_XPATH, option))).click();
  }
}
