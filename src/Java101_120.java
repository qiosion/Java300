import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java101_120 {
    public static void main(String[] args) {
//        // 104
//        int x = 4;
//        System.out.println(x > 1 && x < 5);
//
//        // 105
//        System.out.println((3 == 3) & (4 != 3));
//
//        // 108
//        if ( 4 < 3 ) {
//            System.out.println("Hello World");
//        } else {
//            System.out.println("Hi, there");
//        }
//
//        // 110
//        if (true) {
//            if (false) {
//                System.out.println("true + false");
//            } else {
//                System.out.println("true + else: true");
//            }
//        } else {
//            System.out.println("else: false");
//        }
//        System.out.println("out of IF-statement");
//
//        // 111
//        System.out.println(">>> 글자 입력받기");
//        Scanner scan111 = new Scanner(System.in);
//        String input111 = scan111.nextLine();
//        for (int i = 0; i < 2; i++) {
//            System.out.println(input111);
//        }
//
//        // 112
//        System.out.println(">>> 숫자 입력받기");
//        Scanner scan112 = new Scanner(System.in);
//        int input112 = scan112.nextInt();
//        System.out.println(10 + input112);
//
//        // 114
//        System.out.println(">>> 숫자 입력 + 비교");
//        Scanner scan114 = new Scanner(System.in);
//        int input114 = scan114.nextInt();
//        int plus20 = input114 + 20;
//        if (plus20 <= 255) System.out.println(plus20);
//        else System.out.println(255);
//
//        // 116
//        System.out.println(">>> 정각 판별");
//        Scanner scan116 = new Scanner(System.in);
//        String input116 = scan116.nextLine();
//        // System.out.println(input116.getClass().getName());
//        String min = input116.substring(input116.length()-2, input116.length());
////        System.out.println("몇분: " + min);
//        if (min.equals("00")) {
//            System.out.println("정각");
//        } else {
//            System.out.println("정각 X");
//        }
//
//        // 117
//        System.out.println(">>> 조건문 반대 !");
//        String[] arr117 = new String[]{"사과", "딸기", "바나나", "오렌지"};
//        Scanner scan117 = new Scanner(System.in);
//        String ex117 = scan117.nextLine();
//        for (int i = 0; i < arr117.length; i++) {
//            if (ex117.equals(arr117[i])) {
//                System.out.println("좋아함");
//            } else if (! ex117.equals(arr117[i])) {
//                System.out.println("그닥...");
//                break;
//            }
//        }

        // 119
        System.out.println(">>> 해시맵");
        Map<String, String> hash119 = new HashMap<>();
        hash119.put("봄", "딸기");
        hash119.put("여름", "블루베리");
        hash119.put("가을", "사과");
        hash119.put("겨울", "귤");
        Scanner scan119 = new Scanner(System.in);
        String input119 = scan119.nextLine();
        System.out.println("스캐너 테스트 : " + input119.getClass().getName());
        // 키 값 : 변수.keySet()
        // 입력값 : 변수.values()
        String key = String.valueOf(hash119.keySet());//.toString();
        System.out.println("key : " + key);
            if (key.equals(input119)) {
                System.out.println("좋아하는 계절");
            } else if (!key.equals(input119)) {
                System.out.println("딱히..");
                System.out.println("테스트 : " + hash119.keySet().toString().getClass().getName());
            }
        

    }
}
