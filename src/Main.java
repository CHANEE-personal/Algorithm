import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 문자열 찾기
        String inputString = in.nextLine().toUpperCase();
        char inputChar = in.next().toUpperCase().charAt(0);
        System.out.println(returnResult(inputString, inputChar));

        // 대소문자 변환
        String inputString1 = in.nextLine();
        System.out.println(returnConversion(inputString1));
    }

    private static StringBuilder returnConversion(String inputString) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            builder.append(Character.isUpperCase(inputString.charAt(i)) ?
                    Character.toLowerCase(inputString.charAt(i)) :
                    Character.toUpperCase(inputString.charAt(i)));
        }
        return builder;
    }

    private static int returnResult(String inputString, char inputChar) {
        int answer = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputChar) {
                answer++;
            }
        }
        return answer;
    }
}