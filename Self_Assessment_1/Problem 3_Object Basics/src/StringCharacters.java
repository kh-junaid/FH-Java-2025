public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        int spaces = 0, vowels = 0, letters = 0;

        // Loop through each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                letters++; // Count letters
                ch = Character.toLowerCase(ch); // Make lowercase for vowel check
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++; // Count vowels
                }
            } else if (ch == ' ') {
                spaces++; // Count spaces
            }
        }

        System.out.println("The text contained vowels: " + vowels + "\n" +
                "Consonants: " + (letters - vowels) + "\n" +
                "Spaces: " + spaces);
    }
}
