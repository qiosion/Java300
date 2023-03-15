public class Java131 {
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



    }
    // 155 대소문자 여부 판별
    // char 타입 : Character.isUpperCase()/isLowerCase()
    // String 타입 : 문자열 -> char -> 배열요소 순회
    public static String java155(String str){
        String[] arr155 = new String[]{"A", "b", "c", "D"};
        char[] arr155_c = new char[]{};
        System.out.println(arr155_c);
        for (int i = 0; i < arr155.length; i++) {
            arr155_c = arr155[i].toCharArray();
            for (int j = 0; j < arr155_c.length; j++) {
                if (!Character.isUpperCase(arr155_c[j])) {
                    return "false";
                }
            }
            return "true";
        }
    return "";
    }
}
