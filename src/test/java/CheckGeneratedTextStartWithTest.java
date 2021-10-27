import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class CheckGeneratedTextStartWithTest extends BaseTest {
    @Test
    public void CheckGeneratedTextStartWith(){
        getBLL().pressGenerateLorenIpsumButton();
        assertTrue(getBLL().getText().startsWith("Lorem ipsum dolor sit amet, consectetur adipiscing elit"));
    }

}
