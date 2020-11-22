public class DecryptMe {

    private static String encryptedText = "";
    private static String text = "";
    private static int shiftKey;
    private static String decryptedText = "";
    private static String errorMessage = "";



    public  String decodeMethod(String encryptedText, int shiftKey) {
        this.encryptedText = encryptedText;
        if (shiftKey < 1 || shiftKey > 26) {
            return errorMessage = "key must be between 1 to 25";
        }else{


            int length = encryptedText.length();
            for (int i = 0; i < length; i++) {
                char ch = encryptedText.charAt(i);
                if (Character.isLetter(ch)) {
                    if (Character.isUpperCase(ch)) {
                        char c = (char) (ch - shiftKey);
                        if (c < 'A') {
                            decryptedText += (char) (ch + (26 - shiftKey));
                        } else {
                            decryptedText += c;
                        }
                    } else if (Character.isLowerCase(ch)) {
                        char c = (char) (ch - shiftKey);
                        if (c < 'a') {
                            decryptedText += (char) (ch + (26 - shiftKey));
                        } else {
                            decryptedText += c;
                        }
                    }
                } else {
                    decryptedText += ch;

                }
            }
        }
        return  decryptedText;

    }
}
