import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CheckTheProbability40Test extends BaseTest {
    @Test
    public void checkTheProbability40() {
        double all = 0;
        for (int i = 0; i < 10; i++) {
            getBLL().pressGenerateLorenIpsumButton();
            all = getBLL().getNumberOfLorem();
        }
        assertTrue(all % 10.0 >= 2);
    }
}
