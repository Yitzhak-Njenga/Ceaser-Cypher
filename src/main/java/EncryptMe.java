public class EncryptMe {
    private static String text = "";
    private static int shiftKey;
    private static String cipherText = "";
    private static String errorMessage = "";


    public String encodeMethod(String text, int shiftKey) {
        this.text = text;

        if (shiftKey > 26 || shiftKey < 0) {
            return errorMessage = "key must be between 1 to 25";
        }else{
            int length = text.length();
            for (int i = 0; i < length; i++) {
                char ch = text.charAt(i);
                if (Character.isLetter(ch)) {
                    if (Character.isUpperCase(ch)) {
                        char c = (char) (ch + shiftKey);
                        if (c > 'Z') {
                            cipherText += (char) (ch - (26 - shiftKey));
                        } else {
                            cipherText += c;
                        }
                    } else if (Character.isLowerCase(ch)) {
                        char c = (char) (ch + shiftKey);
                        if (c > 'z') {
                            cipherText += (char) (ch - (26 - shiftKey));
                        } else {
                            cipherText += c;
                        }
                    }
                } else {
                    cipherText += ch;

                }
            }

        }

        return cipherText;
    }

    public int getShiftKey() {
        return shiftKey;
    }

    public String getText() {
        return text;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }



}