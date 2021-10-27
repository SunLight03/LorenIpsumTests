
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class CheckFirstParagraphTest extends BaseTest {
    public static String wordInFirstParagraph = "рыба";

    @Test
    public void checkOnRussian() {
        getBLL().chooseRulang();
        assertTrue(getBLL().getTextInFirstParagraph().contains(wordInFirstParagraph));
    }
}
