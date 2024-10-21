package calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String input = "";  // 빈 문자열 입력
        System.out.println(sum(input));  // 결과 출력
    }

    public static int sum(String input) {
        if (input.isEmpty()) {
            return 0;  // 빈 문자열이면 0 반환
        }
        return 0;  // 기본 반환 값

    }
}
public static int sum(String input) {
    if (input.isEmpty()) {
        return 0;  // 빈 문자열이면 0 반환
    }

    if (input.startsWith("//")) {
        String customDelimiter = String.valueOf(input.charAt(2));  // 커스텀 구분자 추출
        input = input.substring(4);  // "//[구분자]\n" 형식이므로 구분자와 개행 문자 제거
        String[] numbers = input.split(customDelimiter);  // 커스텀 구분자로 숫자 분리
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);  // 각 숫자를 더함
        }
        return sum;  // 합 반환
    }

    String[] numbers = input.split("[,:]");  // 기본 구분자로 숫자 분리
    int sum = 0;
    for (String number : numbers) {
        sum += Integer.parseInt(number);  // 각 숫자를 더함
    }
    return sum;  // 합 반환
}