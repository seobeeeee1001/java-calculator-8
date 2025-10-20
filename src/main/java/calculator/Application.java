package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        if(input == null || input.isEmpty()) {
            System.out.println("0");
            return;
        }
        String delimeter = "[,:]";
        if(input.startsWith("//")) {
            int newLineIndex = input.indexOf("\\n");
            delimeter = input.substring(2, newLineIndex);
            input = input.substring(newLineIndex + 2);
        }
        String[] numbers = input.split(delimeter);
        for(String number : numbers) {
            try {
                int value = Integer.parseInt(number);
                if(value < 0) {
                    throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다.");
            }
        }
        int sum = 0;
        for(String number : numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println("결과 : " + sum);
    }
}
