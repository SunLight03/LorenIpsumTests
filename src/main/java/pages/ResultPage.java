package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ResultPage extends BasePage {
    @FindBy(xpath = "//div[@id='lipsum']")
    private WebElement generatedText;

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    private String genText;

    public String getGeneratedText() {
        waitVisibilityOfElement(300, generatedText);
        return generatedText.getText();
    }

    public int getCountOfLorem() {
        int allcounts = 0;
        for (int i = 0; i <10; i++){
            waitVisibilityOfElement(300, generatedText);
            genText = generatedText.getText();
            String[] genTextArr = genText.split("\n");
            int count = 0;
            for (int j = 0; j < genTextArr.length; j++) {
                if (genTextArr[j].toLowerCase().contains("lorem")) {
                    count++;
                }
            }
            allcounts += count;
        }
        return allcounts/10;
    }

    public int getAmountOfWords(String genText) {
        int count = 0;

        if (genText.length() != 0) {
            count++;
            for (int i = 0; i < genText.length(); i++) {
                if (genText.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    public int getAmountOfBytes(String genText) {
        return genText.length();
    }


}
