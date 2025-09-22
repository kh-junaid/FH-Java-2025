public class Problem4 {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        text = text.toLowerCase(); // converting the String to Lower_case  
        int index = 0;
        String temp;
        String[] wordsArray = new String[45];
        String word = "";

        // Building the wordsArray
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i); // c is a character from the string text at the index i.
            if (c >= 'a' && c <= 'z') { // Checking whether c is a letter.
                word += c;
            } else {
                if (word.equals("")) {
                    continue;
                }
                wordsArray[index] = word;
                word = "";
                index++;
            }
        }

        // Sorting the words lexicographically
        int size = index;  // Only sort up to the index where the words are stored
        for (int j = 0; j < size - 1; j++) {
            for (int k = 0; k < size - 1 - j; k++) {
                String firstStr = wordsArray[k];
                String secondStr = wordsArray[k + 1];

                // Ensure that neither string is null
                if (firstStr != null && secondStr != null) {
                    if (firstStr.compareTo(secondStr) > 0) {
                        temp = wordsArray[k];
                        wordsArray[k] = wordsArray[k + 1];
                        wordsArray[k + 1] = temp;
                    }
                }
            }
        }

        // Print the sorted words
        for (int a = 0; a < size; a++) {
            System.out.println(wordsArray[a]);
        }
    }
}
