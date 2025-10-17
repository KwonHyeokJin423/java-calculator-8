package calculator;

public class StringSplitter {

    private static final String DEFAULT_DELIMITER = "[,:]";


    public static String[] split(String input) {

        if (input.startsWith("//")) {
            int indexOfEnd = input.indexOf("\n");
            String customDelimiter = input.substring(2, indexOfEnd);
            String inputNumber = input.substring(indexOfEnd + 1);
            return inputNumber.split(customDelimiter);
        }

        return input.split(DEFAULT_DELIMITER);
    }
}
