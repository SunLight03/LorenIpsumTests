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

    public void openHomePage(String url) {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage(url);
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

    public double getAverageOfTenGenerations() {
        HomePage homePage = new HomePage(driver);
        double all = 0;
        for (int i = 0; i < 10; i++) {
            homePage.pressGenerateLorenIpsumButton();
            ResultPage resultPage = new ResultPage(driver);
            all = resultPage.getCountOfLorem();
        }
        return all % 10.0;
    }

    public void setAmount(String amount) {
        HomePage homePage = new HomePage(driver);
        homePage.setAmount(amount);
    }

    public String getText() {
        ResultPage resultPage = new ResultPage(driver);
        return resultPage.getGeneratedText();
    }

//    public int getNumberOfLorem() {
//        ResultPage resultPage = new ResultPage(driver);
//        return resultPage.getCountOfLorem();
//    }

    public void pressRadioButton(String value) {
        RadioButton radioButton = new RadioButton(driver);
        radioButton.setValue(value);
    }

    public void moveToGenerateLorenIpsumButton(){
        HomePage homePage = new HomePage(driver);
        homePage.moveToGenerateLorenIpsumButton();
    }

    public int getAmountOfWords() {
        ResultPage resultPage = new ResultPage(driver);
        return resultPage.getAmountOfWords(resultPage.getGeneratedText());

    }

    public int getAmountOfBytes() {
        ResultPage resultPage = new ResultPage(driver);
        return resultPage.getAmountOfBytes(resultPage.getGeneratedText());

    }
}
