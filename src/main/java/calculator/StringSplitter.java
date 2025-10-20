package calculator;

public class StringSplitter {

    private static final String DEFAULT_DELIMITER = "[,:]";
    
    public static String[] split(String input) {
        if (input.startsWith("//")) {
            int indexOfEnd = input.indexOf("\n");
            if (indexOfEnd == -1) {
                throw new IllegalArgumentException("잘못된 커스텀 구분자 형식입니다.");
            }
            String customDelimiter = input.substring(2, indexOfEnd);
            String inputNumber = input.substring(indexOfEnd + 1);
            return inputNumber.split(customDelimiter);
        }

        return input.split(DEFAULT_DELIMITER);
    }
}
