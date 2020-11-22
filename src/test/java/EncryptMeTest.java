import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncryptMeTest {
    @Test
    public void encodeMethod_keyOutOfBoundError_String() {
        EncryptMe testEncrypt = new EncryptMe();
        String resultExpected = "key must be between 1 to 25";
        assertEquals(resultExpected,testEncrypt.encodeMethod("here",27));

    }
}
