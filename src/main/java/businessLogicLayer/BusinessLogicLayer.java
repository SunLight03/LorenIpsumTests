package businessLogicLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.ResultPage;
import pages.HomePage;
import pages.RadioButton;


public class BusinessLogicLayer {
    WebDriver driver;

    public BusinessLogicLayer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseRulang() {
        HomePage homePage = new HomePage(driver);
        homePage.pressRuLangButton();
    }

    public String getTextInFirstParagraph() {
        HomePage homePage = new HomePage(driver);
        return homePage.textOfFirstParagraph();
    }

    public void uncheckStartWithLorenIpsum() {
        HomePage homePage = new HomePage(driver);
        homePage.uncheckStartWithLorenIpsum();
    }

    public void pressGenerateLorenIpsumButton() {
        HomePage homePage = new HomePage(driver);
        homePage.pressGenerateLorenIpsumButton();
    }

    public void setAmount(int amount){
        HomePage homePage = new HomePage(driver);
        homePage.setAmount(amount);
    }

    public String getText() {
        ResultPage resultPage = new ResultPage(driver);
        return resultPage.getGeneratedText();
    }

    public int getNumberOfLorem(){
        ResultPage resultPage = new ResultPage(driver);
        return resultPage.getCountOfLorem();
    }

    public void pressRadioButton(String value){
        RadioButton radioButton = new RadioButton(driver);
        radioButton.setValue(value);
    }

    public int getAmount(String value){
        int amount=0;
        ResultPage resultPage = new ResultPage(driver);
        switch (value.toLowerCase()){
            case("words"):
                amount = resultPage.getAmountOfWords(resultPage.getGeneratedText());
                break;
            case ("bytes"):
                amount =   resultPage.getAmountOfBytes(resultPage.getGeneratedText());
                break;
        }
        return amount;
    }
}
