import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CheckCorrectSizeTest extends BaseTest {
    int number0 = 0;
    int number2 = 2;
    int number3 = 3;
    int number5 = 5;
    int number10 = 10;
    int number20 = 20;
    int negativeNumber = -1;
    String bytes = "Bytes";
    String words = "Words";
    @Test
    public void checkTen(){
        getBLL().setAmount(number10);
        getBLL().pressRadioButton(words);
        getBLL().pressGenerateLorenIpsumButton();
        assertEquals(number10, getBLL().getAmount(words));
    }
    @Test
    public void checkNegativeNumber(){
        getBLL().setAmount(negativeNumber);
        getBLL().pressRadioButton(words);
        getBLL().pressGenerateLorenIpsumButton();
        assertEquals(number5, getBLL().getAmount(words));
    }
    @Test
    public void checkFive(){
        getBLL().setAmount(number5);
        getBLL().pressRadioButton(words);
        getBLL().pressGenerateLorenIpsumButton();
        assertEquals(number5, getBLL().getAmount(words));
    }

    @Test
    public void checkZero(){
        getBLL().setAmount(number0);
        getBLL().pressRadioButton(words);
        getBLL().pressGenerateLorenIpsumButton();
        assertEquals(number5, getBLL().getAmount(words));
    }

    @Test
    public void checkTwenty() {
        getBLL().setAmount(number20);
        getBLL().pressRadioButton(words);
        getBLL().pressGenerateLorenIpsumButton();
        assertEquals(number20, getBLL().getAmount(words));
    }

    @Test
    public void checkByteTwenty(){
        getBLL().setAmount(number20);
        getBLL().pressRadioButton(bytes);
        getBLL().pressGenerateLorenIpsumButton();
        assertEquals(number20, getBLL().getAmount(bytes));
    }
    
    @Test
    public void checkByteNegativeNumber(){
        getBLL().setAmount(negativeNumber);
        getBLL().pressRadioButton(bytes);
        getBLL().pressGenerateLorenIpsumButton();
        assertEquals(number5, getBLL().getAmount(bytes));
    }

    @Test
    public void checkByteTwo(){
        getBLL().setAmount(number2);
        getBLL().pressRadioButton(bytes);
        getBLL().pressGenerateLorenIpsumButton();
        assertEquals(number3, getBLL().getAmount(bytes));
    }
    @Test
    public void checkByteThree(){
        getBLL().setAmount(number3);
        getBLL().pressRadioButton(bytes);
        getBLL().pressGenerateLorenIpsumButton();
        assertEquals(number3, getBLL().getAmount(bytes));
    }
    @Test
    public void checkByteZero(){
        getBLL().setAmount(number0);
        getBLL().pressRadioButton(bytes);
        getBLL().pressGenerateLorenIpsumButton();
        assertEquals(number5, getBLL().getAmount(bytes));
    }

    @Test
    public void checkByteFive(){
        getBLL().setAmount(number5);
        getBLL().pressRadioButton(bytes);
        getBLL().pressGenerateLorenIpsumButton();
        assertEquals(number5, getBLL().getAmount(bytes));
    }
}
