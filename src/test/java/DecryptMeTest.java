import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecryptMeTest {
    @Test
    public void decodeMethod_testLetterDecryption_String() {
        DecryptMe testDecrypt = new DecryptMe();
        String resultExpected = "H";
        assertEquals(resultExpected,testDecrypt.decodeMethod("I",1));
    }

}
