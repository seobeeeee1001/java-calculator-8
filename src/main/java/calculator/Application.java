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
        int sum = 0;
        for(String number : numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println("결과 : " + sum);
    }
}
