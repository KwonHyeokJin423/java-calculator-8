package calculator;

public class StringCalculator {

    public static int calculate(String input) {

        if (input == null || input.isBlank()) {
            return 0;
        }

        String[] numbers = StringSplitter.split(input);
        int sum = 0;

        for (String n : numbers){
            int number = parsePositiveNumber(n);
            sum += number;
        }

        return sum;
    }

    private static int parsePositiveNumber(String input) {
        try {
            int number = Integer.parseInt(input);
            if (number < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다: " + number);
            }
            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다: " + input);
        }
    }
}
