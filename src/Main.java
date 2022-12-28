import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 문자열 찾기
//        String inputString = in.nextLine().toUpperCase();
//        char inputChar = in.next().toUpperCase().charAt(0);
//        System.out.println(returnResult(inputString, inputChar));

        // 대소문자 변환
//        String inputString1 = in.nextLine();
//        System.out.println(returnConversion(inputString1));

        // 문장에서 가장 긴 단어
//        String inputString2 = in.nextLine();
//        System.out.println(returnLongString(inputString2));

        // 단어 뒤집기
//        int num = in.nextInt();
//        for (int i = 0; i < num; i++) {
//            System.out.println(returnRevertString(in.next()));
//        }

        // 특정 문자 뒤집기
//        String inputString3 = in.nextLine();
//        System.out.println(returnRevertAlpha(inputString3));

        // 중복 문자 제거
        String inputString4 = in.nextLine();
        System.out.println(returnRemoveduplication(inputString4));
    }

    private static StringBuilder returnRemoveduplication(String inputString4) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < inputString4.length(); i++) {
            if (inputString4.indexOf(inputString4.charAt(i)) == i) {
                builder.append(inputString4.charAt(i));
            }
        }
        return builder;
    }

    private static char[] returnRevertAlpha(String inputString3) {
        int first = 0;
        int last = inputString3.length() - 1;
        char[] chars = inputString3.toCharArray();

        while (first < last) {
            if(!Character.isAlphabetic(chars[first])) first++;
            else if(!Character.isAlphabetic(chars[last])) last--;
            else{
                char tmp=chars[first];
                chars[first]=chars[last];
                chars[last]=tmp;
                first++;
                last--;
            }
        }
        return chars;
    }

    private static StringBuffer returnRevertString(String inputString3) {
        StringBuffer buffer = new StringBuffer(inputString3);
        return buffer.reverse();
    }

    private static StringBuilder returnLongString(String inputString2) {
        String[] s = inputString2.split(" ");
        StringBuilder builder = new StringBuilder();
        int max = 0;
        for (String s1 : s) {
            if (s1.length() > max) {
                builder.setLength(0);
                builder.append(s1);
                max = s1.length();
            }
        }
        return builder;
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