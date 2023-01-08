import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
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
//        String inputString4 = in.nextLine();
//        System.out.println(returnRemoveduplication(inputString4));

        // 회문 문자열
//        String inputString5 = in.nextLine();
//        System.out.println(returnPalindrome(inputString5));

//        String inputString6 = in.nextLine();
//        System.out.println(returnPalindrome(inputString6));

        // 숫자만 추출
//        String inputString7 = in.nextLine();
//        System.out.println(returnExtractNum(inputString7));

        // 가장 짧은 문자거리
//        String inputString8 = in.next();
//        char input = in.next().charAt(0);
//        for(int x : returnDistance(inputString8, input)){
//            System.out.print(x+" ");
//        }

        // 문자열 압축
//        String inputString9 = in.next();
//        System.out.println(returnCompression(inputString9));
//
//        // 큰 수 출력하기
//        int inputNum = in.nextInt();
//        System.out.println(returnBiggerNum(inputNum));

        //2023/01/07
        // 백준 설탕 나누기
//        int num = in.nextInt();
//        System.out.print(solution(num));

        // 백준 셀프 넘버
        /*boolean[] check = new boolean[10001];	// 1부터 10000이므로

        for (int i = 1; i < 10001; i++){
            int n = returnSelfNum(i);

            if(n < 10001){	// 10000 이 넘는 수는 필요가 없음
                check[n] = true;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {
                System.out.println(i);
            }
        }*/

        // 백준 한수
//        int num = in.nextInt();
//        System.out.println(returnHanSoo(num));

        // 백준 그룹 단어 체커
//        int count = 0;
//        int num = in.nextInt();
//        for (int i = 0; i < num; i++) {
//            if (check()) {
//                count++;
//            }
//        }
//        System.out.println(count);

        // 2023/01/08
        // 백준 ATM
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(returnATM(arr));
    }

    private static int returnATM(int[] arr) {
        int prev = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += prev + arr[i];
            prev += arr[i];
        }
        return sum;
    }


    private static int returnHanSoo(int num) {
        int sum = 0;
        if (num <= 99) {
            sum = num;
        } else {
            sum = 99;

            for(int i = 100; i <= num; i++){
                int hun = i / 100; // 백의 자릿수
                int ten = (i / 10) % 10; // 십의 자릿수
                int one = i % 10;

                if((hun - ten) == (ten - one)){
                    sum++;
                }
            }
        }
        return sum;
    }

    private static int returnSelfNum(int num) {
        // ex) 1234 -> 1234 + 4 + 3 + 2 + 1 = 1244
        int sum = num;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    private static int returnSugar(int num) {
        int num5 = 0;
        // ex) 18kg -> 3kg, 5kg로 나눠서 최소한의 봉지 수 -> 5kg 3개, 3kg 1개
        if (num == 4 || num == 7) {
            return -1;
        } else if (num % 5 == 0){
            num5 = num / 5;
        } else if (num % 5 == 1 || num % 5 == 3) {
            num5 = (num/5) + 1;
        } else if (num % 5 == 2 || num % 5 == 4) {
            num5 = (num/5) + 2;
        }
        return num5;
    }

    private static StringBuilder returnBiggerNum(int inputNum) {
        return null;
    }

    private static StringBuilder returnCompression(String inputString9) {
        StringBuilder builder = new StringBuilder();
        inputString9 = inputString9+" ";
        int count = 1;
        for (int i = 0; i < inputString9.length() - 1; i++) {
            if (inputString9.charAt(i) == inputString9.charAt(i+1)) count++;
            else {
                builder.append(inputString9.charAt(i));
                if (count > 1) builder.append(count);
                count = 1;
            }
        }
        return builder;
    }

    private static int[] returnDistance(String inputString8, char input) {
        int[] result = new int[inputString8.length()];
        int count = 1000;
        for (int i = 0; i < inputString8.length(); i++) {
            if (inputString8.charAt(i) == input) {
                count = 0;
                result[i] = count;
            } else {
                count++;
                result[i] = count;
            }
        }
        count = 1000;
        for (int i = inputString8.length() - 1; i >= 0; i--) {
            if (inputString8.charAt(i) == input) count = 0;
            else {
                count++;
                result[i] = Math.min(result[i], count);
            }
        }
        return result;
    }

    private static int returnExtractNum(String inputString7) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < inputString7.length(); i++) {
            if (Character.isDigit(inputString7.charAt(i))) {
                builder.append(inputString7.charAt(i));
            }
        }
        return Integer.parseInt(builder.toString());
    }

    private static String returnPalindrome(String inputString5) {
        String newString = inputString5.toUpperCase().replaceAll("[^A-Z]", "");
        StringBuilder builder = new StringBuilder(newString);
        return builder.toString().equals(builder.reverse().toString()) ? "YES" : "NO";

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
            if (!Character.isAlphabetic(chars[first])) first++;
            else if (!Character.isAlphabetic(chars[last])) last--;
            else {
                char tmp = chars[first];
                chars[first] = chars[last];
                chars[last] = tmp;
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