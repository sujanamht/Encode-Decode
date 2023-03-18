public class DecoderMehtaSujana {

    public String decodeMessage(String sentence, int offset) {
        StringBuilder decodedMessage = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) (((c - base - offset + 26) % 26) + base);
            }

            decodedMessage.append(c);
        }

        return decodedMessage.toString();
    }

}