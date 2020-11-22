public class EncryptMe {
    private static String text = "";
    private static int shiftKey;
    private static String cipherText = "";
    private static String errorMessage = "";


    public  String encodeMethod(String text, int shiftKey) {
        this.text = text;

        if (shiftKey > 26 || shiftKey < 0) {
            return errorMessage = "key must be between 1 to 25";
        }
    }