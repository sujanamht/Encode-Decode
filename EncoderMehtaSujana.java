public class EncoderMehtaSujana {

    public String encodeMessage(String message, int offset) {
        StringBuilder encodedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) (((c - base + offset) % 26 + 26) % 26 + base);
            }

            encodedMessage.append(c);
        }
        return encodedMessage.toString();
    }

}
