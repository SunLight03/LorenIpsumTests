package stepsDefenitions;

import businessLogicLayer.BusinessLogicLayer;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.*;

public class MyStepdefs {
    WebDriver driver;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }
    public BusinessLogicLayer getBLL() {
        return new BusinessLogicLayer(getDriver());
    }

    @Given("User opens {string} page")
    public void openPage(String url) {
        getBLL().openHomePage(url);
    }

    @When("User generate Loren Ipsum text")
    public void userGenerateLorenIpsumText() {
        getBLL().moveToGenerateLorenIpsumButton();
        getBLL().pressGenerateLorenIpsumButton();
    }

    @Then("User checks that generated text starts with the {string}")
    public void userChecksThatGeneratedTextStartsWithTheKeyword(String keyword) {
        assertTrue(getBLL().getText().startsWith(keyword));
    }



    @And("User switch to Russian language")
    public void userSwitchToRussianLanguage() {
        getBLL().chooseRulang();

    }

    @Then("User checks that text of the first  element, which is the first paragraph, contains the {string}")
    public void userChecksThatTheFirstParagraphContainsTheKeyword(String keyword) {
        assertTrue( getBLL().getTextInFirstParagraph().contains(keyword));
    }


    @And("Uncheck start with Lorem Ipsum checkbox")
    public void uncheckStartWithLoremIpsumCheckbox() {
        getBLL().uncheckStartWithLorenIpsum();
    }

    @Then("User checks that generated text result no longer starts with {string}")
    public void userChecksThatGeneratedTextResultNoLongerStartsWithKeyword(String keyword) {
        assertFalse(getBLL().getText().startsWith(keyword));
    }

    @And("User click on {string}")
    public void userClickOnType(String value) {
        getBLL().pressRadioButton(value);
    }

    @And("Input the {string}")
    public void inputTheNumber(String number) {
        getBLL().setAmount(number);
    }

    @Then("User checks that result in words matches the {string}")
    public void userChecksThatResultMatchesTheExpectedNumber(String expectedNumber) {
        assertEquals(Integer.parseInt(expectedNumber), getBLL().getAmountOfWords());
    }


    @Then("User checks that result in bytes matches the {string}")
    public void userChecksThatResultInBytesMatchesTheExpectedNumber(String expectedNumber) {
        assertEquals(Integer.parseInt(expectedNumber), getBLL().getAmountOfBytes());
    }


    @Then("User run the generation ten times and check that the average number of paragraphs containing the word “lorem” more then two")
    public void userRunTheGenerationTenTimesAndCheckThatTheAverageNumberOfParagraphsContainingTheWordLoremMoreThenTwo() {
        assertTrue(getBLL().getAverageOfTenGenerations() >= 2);
    }
}

