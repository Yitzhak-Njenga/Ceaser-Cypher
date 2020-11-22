public class DecryptMe {
    private static String text = "";
    private static int shiftKey;
    private static String cipherText = "";
    private static String errorMessage = "";



    public  String decodeMethod(String encryptedText, int shiftKey) {
        this.encryptedText = encryptedText;
        if (shiftKey < 1 || shiftKey > 26) {
            return errorMessage = "key must be between 1 to 25";
        }
}
