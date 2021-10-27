package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='Languages']/a[contains(@href,'ru')]")
    private WebElement ruLangButton;

    @FindBy(xpath = "//div[@id='Panes']/div[1]/p[text()]")
    private WebElement firstParagraph;

    @FindBy(xpath = "//input[@id='amount']")
    private WebElement amountOfWords;

    @FindBy(xpath = "//input[@value='Generate Lorem Ipsum']")
    private WebElement generateLorenIpsumButton;

    @FindBy(xpath = "//input[@id='start']")
    private WebElement startWithLorenIpsumCheckBox;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void pressRuLangButton() {
        ruLangButton.click();
    }

    public String textOfFirstParagraph() {
        return firstParagraph.getText();
    }

    public void setAmount(int Amount) {
        amountOfWords.sendKeys(Keys.BACK_SPACE);
        amountOfWords.sendKeys(String.valueOf(Amount));

    }

    public void pressGenerateLorenIpsumButton() {
        generateLorenIpsumButton.click();
    }

    public void uncheckStartWithLorenIpsum(){
        startWithLorenIpsumCheckBox.click();
    }
}
