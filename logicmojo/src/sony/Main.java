package sony;

public class Main {
    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder compressedString = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);
            if (nextChar == currentChar) {
                count++;
            } else {
                compressedString.append(count).append(currentChar);
                currentChar = nextChar;
                count = 1;
            }
        }

        // Append the count and character of the last group
        compressedString.append(count).append(currentChar);

        return compressedString.toString();
    }

    public static void main(String[] args) {
        String input = "AAAAABBCCAA";
        String compressedOutput = compressString(input);
        System.out.println(compressedOutput);  // Output: 5A2B2C2A
    }
}