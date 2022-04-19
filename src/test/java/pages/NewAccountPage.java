package pages;

import static util.StringConstant.accountLabel;

import elements.DropDown;
import elements.InputField;
import model.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage {

  public NewAccountPage(WebDriver driver) {
    super(driver);
  }

  public static final String SAVE_BUTTON_XPATH = "//button[@title = 'Сохранить']";

  public NewAccountPage openPage() {
    driver.get("https://tms5.lightning.force.com/lightning/o/Account/new");
    return this;
  }

  public void create(Account account) {
    new InputField(driver, accountLabel).writeText(account.getAccountName());
    new InputField(driver, "Веб-узел").writeText(account.getWebSite());
    new DropDown(driver, "Отрасль").selectOption(account.getIndustry());
    clickSave();
  }

  public void clickSave() {
    driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
  }
}
