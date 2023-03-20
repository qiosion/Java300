import java.util.*;

public class Java121_130 {
    public static void main(String[] args) {
//        // 121
//        System.out.println(">>> 대소문자 변경출력");
//        Scanner scan121 = new Scanner(System.in);
//        char input121 = scan121.next().charAt(0);
//        char output121;
//        System.out.println();
//        if (Character.isUpperCase(input121)) {
//            System.out.println("기존값 : " + input121);
//            output121 = Character.toLowerCase(input121);
//            System.out.println("변환 출력값 : " + output121);
//        }
//        if (Character.isLowerCase(input121)) {
//            System.out.println("기존값 : " + input121);
//            output121 = Character.toUpperCase(input121);
//            System.out.println("변환 출력값 : " + output121);
//        }
//
//        // 122
//        Scanner scan122 = new Scanner(System.in);
//        int score122 = scan122.nextInt();
//        String grade = "";
//        if (score122 >= 81 & score122 <= 100) {
//            grade = "A";
//        } else if (score122 >= 61) {
//            grade = "B";
//        } else if (score122 >= 41) {
//            grade = "C";
//        } else if (score122 >= 21) {
//            grade = "D";
//        } else {
//            grade = "F";
//        }
//        System.out.printf("학점은 %s 입니다.\n", grade);
//
//        // 123
//        System.out.println(">>> 환율계산");
//        Map<String, Float> map123 = new HashMap<>();
//        map123.put("달러", 1167f);
//        map123.put("엔", 1.096f);
//        map123.put("유로", 1268f);
//        map123.put("위안", 171f);
//        System.out.println(map123);
//        Scanner scan123 = new Scanner(System.in);
//        String input123 = scan123.nextLine();
//        String[] arr123 = input123.split(" ");
//        System.out.println(arr123[0] + " , " + arr123[1]);
//        float num = Float.parseFloat(arr123[0]);
//        String currency = arr123[1];
//        System.out.printf("num은 %f, 환율은 %s", num, currency);

//        // 124
//        System.out.println(">>> 입력값 세개 중 가장 큰 숫자");
//        Scanner scan1 = new Scanner(System.in);
//        Scanner scan2 = new Scanner(System.in);
//        Scanner scan3 = new Scanner(System.in);
//        int num1 = scan1.nextInt();
//        int num2 = scan2.nextInt();
//        int num3 = scan3.nextInt();
//
//        if (num1 >= num2 & num1 >= num3) {
//            System.out.printf("최대값은 %d", num1);
//        } else if (num2 >= num1 & num2 >= num3) {
//            System.out.printf("최대값은 %d", num2);
//        } else {
//            System.out.printf("최대값은 %d", num3);
//        }

//        // 125
//        System.out.println(">>> 통신사 구분");
//        Scanner scan125 = new Scanner(System.in);
//        String input125 = scan125.nextLine();
//        String[] phnum = input125.split("-");
////        System.out.println(Arrays.toString(phnum));
//        String num125 = phnum[0];
//        System.out.println("num125는 " + num125);
//        if (num125.equals("011")) {
//            System.out.println("SKT");
//        } else if (num125.equals("016")) {
//            System.out.println("KT");
//        } else if (num125.equals("019")) {
//            System.out.println("LGU");
//        } else {
//            System.out.println("알수없음");
//        }

//        // 126
//        System.out.println(">>> 지역구 판별");
//        Scanner scan126 = new Scanner(System.in);
//        String input126 = scan126.nextLine().substring(0,3);
//        System.out.println("입력값 3자리 : " + input126);
//        String[] gangbuk = {"010", "011", "012"};
//        String[] dobong = {"013", "014", "015"};
//
//        for (int i = 0; i < gangbuk.length; i++) {
//            if (input126.equals(gangbuk[i])) {
//                System.out.println("강북구");
//                break;
//            } else if (input126.equals(dobong[i])) {
//                System.out.println("도봉구");
//                break;
//            } else {
//                System.out.println("노원구");
//            }
//
//        }
//        // 127
//        System.out.println(">>> 주민등록 성별 구분");
//        Scanner scan127 = new Scanner(System.in);
//        String input127 = scan127.nextLine();
//        String idNum127 = input127.split("-")[1];
//        String gender = idNum127.substring(0,1);
//        if (gender.equals("2") | gender.equals("4")) {
//            System.out.println("WOMAN");
//        } else if (gender.equals("1") | gender.equals("3")){
//            System.out.println("Man");
//        } else {
//            System.out.println("잘못된 입력값");
//        }
//
//        // 128
//        System.out.println(">>> 주민등록 지역 구분");
//        Scanner scan128 = new Scanner(System.in);
//        String input128 = scan128.nextLine();
//        String idNum128 = input128.split("-")[1];
//        int area = Integer.parseInt(idNum128.substring(1,3));
//        if (area >= 0 & area <= 8) {
//            System.out.println("서울");
//        } else {
//            System.out.println("서울 아님");
//        }

        // 129 주민번호 유효성 체크
        System.out.println(">>> 주민번호 유효성 체크");
        Scanner scan129 = new Scanner(System.in);
        String input129 = scan129.nextLine();
        // split으로 하이픈-을 제거한 뒤 다시 합쳐준다
        String[] ip129 = input129.split("-");
        input129 = String.join("", ip129);

        // 문자열 --> char 배열
        char[] char129 = input129.toCharArray();

        // char배열 길이 크기의 String 배열 생성
        String[] str129 = new String[char129.length];

        // for문으로 char 배열의 각 요소를 String배열에 저장
        for (int i = 0; i < char129.length; i++) {
            str129[i] = Character.toString(char129[i]);
        }

        // int로 바꿔서 배열에 담기
        int[] int129 = new int[str129.length];
        for (int i = 0; i < str129.length; i++) {
            int129[i] = Integer.parseInt(str129[i]);
        }

        // 유효성 검사
        int sum = 0;
        int rest = 0;

        sum = (int129[0]*2) + (int129[1]*3) + (int129[2]*4) +
                (int129[3]*5) + (int129[4]*6) + (int129[5]*7) +
                (int129[6]*8) + (int129[7]*9) + (int129[8]*2) +
                (int129[9]*3) + (int129[10]*4) + (int129[11]*5);
        System.out.println("sum : " + sum);
        rest = 11 - (sum % 11);
        if (rest == int129[11]) {
            System.out.println("유효한 주민등록번호");
        } else {
            System.out.println("유효하지 않은 주민번호");
        }
    }
}
