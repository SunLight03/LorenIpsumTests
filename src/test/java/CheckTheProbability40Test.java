import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CheckTheProbability40Test extends BaseTest{
    @Test
    public void checkTheProbability40(){
        getBLL().pressGenerateLorenIpsumButton();
        assertTrue(getBLL().getNumberOfLorem() > 2);
    }
}
