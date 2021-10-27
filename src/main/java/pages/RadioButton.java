package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButton extends BasePage {

    @FindBy(xpath = "//input[@id='words']")
    private WebElement wordsSelect;

    @FindBy(xpath = "//input[@id='bytes']")
    private WebElement bytesSelect;

    @FindBy(xpath = "//input[@id='paras']")
    private WebElement parasSelect;

    @FindBy(xpath = "//input[@id='lists']")
    private WebElement listsSelect;

    public RadioButton(WebDriver driver) {
        super(driver);
    }

    public void setValue(String value){
        switch (value.toLowerCase()) {
            case ("words") -> wordsSelect.click();
            case ("bytes") -> bytesSelect.click();
            case ("paragraphs") -> parasSelect.click();
            case ("lists") -> listsSelect.click();
        }

    }

}
