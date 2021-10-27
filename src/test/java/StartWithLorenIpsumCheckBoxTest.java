import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;

public class StartWithLorenIpsumCheckBoxTest extends BaseTest{

    @Test
    public void verifyCheckBox(){
        getBLL().uncheckStartWithLorenIpsum();
        getBLL().pressGenerateLorenIpsumButton();
        assertFalse(getBLL().getText().startsWith("Loren Ipsum"));
    }
}
