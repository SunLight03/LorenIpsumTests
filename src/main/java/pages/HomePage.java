package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='Languages']/a[contains(@href,'ru')]")
    private WebElement ruLangButton;

    @FindBy(xpath = "//div[@id='Panes']/div[1]/p[text()]")
    private WebElement firstParagraph;

    @FindBy(xpath = "//input[@id='amount']")
    private WebElement amountOfWords;

    @FindBy(id = "generate")
    private WebElement generateLorenIpsumButton;

    @FindBy(xpath = "//input[@id='start']")
    private WebElement startWithLorenIpsumCheckBox;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void pressRuLangButton() {
        ruLangButton.click();
    }

    public String textOfFirstParagraph() {
        waitVisibilityOfElement(300, firstParagraph);
        return firstParagraph.getText();
    }

    public void setAmount(String amount) {
        amountOfWords.sendKeys(Keys.BACK_SPACE);
        amountOfWords.sendKeys(amount);
    }

    public void pressGenerateLorenIpsumButton() {
        generateLorenIpsumButton.click();
    }

    public void moveToGenerateLorenIpsumButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(generateLorenIpsumButton);
        actions.perform();
    }

    public void uncheckStartWithLorenIpsum() {
        startWithLorenIpsumCheckBox.click();
    }
}
