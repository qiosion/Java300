import javax.swing.*;
import java.util.Arrays;

public class Java131_160 {
    public static void main(String[] args) {
        // 131 ~
        String[] fruits = new String[3];
        fruits[0] = "사과";
        fruits[1] = "귤";
        fruits[2] = "수박";

        // 직관적인 for문 : 인덱스로 접근
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        // String 배열 fruits에 들어있는 특정한 i에 대해 출력
        for(String i : fruits){
            System.out.println(i);
        }

        // 137
        int num = 10;
        for(int i = 0; i < 3; i++){
            System.out.println(num * (i+1));
        }

        // 141
        int[] arr141 = new int[3];
        int num141 = 10;
        for (int i = 0; i < 3; i++){
            arr141[i] = num141 + ((i+1) * 100);
            System.out.println(arr141[i]);
        }

        // 143 String 배열 요소의 길이
        String[] arr143 = new String[3];
        arr143[0] = "sk하이닉스";
        arr143[1] = "삼성전자";
        arr143[2] = "lg전자";
        for (int i = 0; i < 3; i++){
            System.out.println(arr143[i] + "의 길이는 " + arr143[i].length());
        }

        // 145 String 배열의 첫 글자 .charAt(0)
        String[] arr145 = new String[]{"dog", "cat", "parrot"};
        for(int i = 0; i < 3; i++){
            System.out.println(arr145[i] + "의 첫 글자는 " + arr145[i].charAt(0));
        }

        // 149 짝수일때만 출력
        String[] arr149 = new String[]{"가","나","다","라"};
        for(int i = 0; i < arr149.length; i++){
            if ( i%2 == 0){ // i가 짝수라면
                System.out.println(arr149[i]);
            }
        }

        // 150 배열 거꾸로 돌려서 출력하기
//        int i 를 배열의 길이 -1, 즉 length-1
//        조건식은 i 값이 0보다 크거나 같을때로
//        한바퀴 돌 때 마다 i가 1씩 깎이게
        String[] arr150 = new String[]{"가","나","다","라"};
        for(int i = arr150.length-1; i>=0; i-- ){
            System.out.println(arr150[i]);
        }

        // 151 리스트의 음수 출력
        int[] arr151 = new int[]{3, -20, -3, 44};
        for (int i = 0; i < arr151.length; i++) {
            if (arr151[i] < 0) {
                System.out.println(arr151[i]);
            }
        }

        // 153 두가지 조건
        int[] arr153 = new int[]{13, 21, 12, 14, 30, 18};
        for (int i = 0; i < arr153.length; i++) {
            if (arr153[i] < 20 & arr153[i]%3 == 0) {
                System.out.println(arr153[i]);
            }
        }

        // 154 세글자 이상의 문자 출력
        String[] arr154 = new String[]{"I", "study", "python", "language", "!"};
        for (int i = 0; i < arr154.length; i++) {
            if (arr154[i].length() >= 3) {
                System.out.println(arr154[i]);
            }
        }

        // 155 대문자 확인 -> 문자 char 만 가능 ? ㅇㅇ
        char[] arr155 = new char[]{'A', 'b', 'c', 'D'};

        for (int i = 0; i < arr155.length; i++) {
            if (Character.isUpperCase(arr155[i])) { // char 에만 있는 메서드
                System.out.println(arr155[i] + "는 대문자");
            }
        }
        // 155 대문자 아스키코드로 판단
        char[] arr155_a = new char[]{'A', 'b', 'c', 'D'};

        for (int i = 0; i < arr155_a.length; i++) {
            if (arr155[i] >= 65 && arr155[i] <= 90) {
                // 대문자 : 65~90
                // 소문자 : 97~122
                System.out.println("아스키 대문자" + arr155[i]);
            }
        }

        // 157 첫글자 대문자 변경 출력
        String[] arr157 = new String[]{"dog", "cat", "parrot"};
        for (int i = 0; i < arr157.length; i++) {
            // 1. 첫 글자 / 나머지 글자 나눈다 -> substring() 사용
            String first = arr157[i].substring(0,1); // 0이상 1미만
            String rest = arr157[i].substring(1); // 1이상~끝까지
            // 2. 첫글자는 대문자, 나머지는 소문자로 변환
            first = first.toUpperCase();
            rest = rest.toLowerCase();
            // 3. 이어붙이기
            String rs = first + rest;
            System.out.println(rs);
    // 참고 : 문자열의 첫 글자는 charAt을 통해 char 형태로 가져올 수 있다
    // arr156[i].charAt(0);
        }

        // 158 확장자 제거 + 파일 이름만 출력
        String[] arr158 = new String[]{"hello.py", "ex01.py", "intro.hwp"};
        String arr158_str;
        for (int i = 0; i < arr158.length; i++) {
            arr158_str = arr158[i].substring(0, arr158[i].lastIndexOf("."));
            // substring(시작위치, 끝위치)
            // indexOf / lastIndexOf : 특정 문자 위치 찾기
            System.out.println(arr158_str);
        }

        // 159 확장자가 .h인 파일 이름 출력
        String[] arr159 = new String[]{"배열.py", "java_159번.h", "for문.h", "substring사용.java"};
        String extension; // 확장자
        for (int i = 0; i < arr159.length; i++) {
            extension = arr159[i].substring(arr159[i].lastIndexOf(".")); // .뒤의 값들
//            System.out.println("확장자 : " + extension);
            if (extension.equals(".h") || extension.equals(".java")) { // 문자열 비교
                // == 는 object가 동일한지를 비교함
                System.out.println("값 : " + arr159[i]);
            }
        }

    }
}
