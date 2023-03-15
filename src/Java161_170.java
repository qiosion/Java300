import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java161_170 {
    private static Integer[] append(Integer[] arr, int element) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);

        return list.toArray(new Integer[0]);
    }
    public static void main(String[] args) {
        // 161
        System.out.println(">>> 0~99 출력");
        int[] arr161 = new int[100];
        for (int i = 0; i < arr161.length; i++ ){
            arr161[i] = i;
            System.out.println(arr161[i]);
        }

        // 162 2002~2050 월드컵 개최연도 출력
        System.out.println(">>> 월드컵 개최연도");
        int size = 49; // (2050-2002+1)
        int[] arr162 = new int[size];
        Integer[] arr162_cup = new Integer[]{};
        for (int i = 0; i < size; i++ ) {
            arr162[i] = i+2002; // 2002~2050까지 넣음
//            System.out.println("arr162[" + i + "] : " + arr162[i]);
//            System.out.println(i + " % 4 = " + (i%4));
            if ( (i % 4) == 0 ) {
                arr162_cup = append(arr162_cup, arr162[i]);
//                arr162[i] 를 새로운 배열에 넣음...
//                System.out.println(arr162_cup);
            }
            else { continue; }
        }
        // List<> 출력할 때 Arrays.toStirng()을 써줘야함 !
        System.out.println(Arrays.toString(arr162_cup));

        // 163 3의 배수 출력
        System.out.println(">>> 3의 배수");
        for (int i = 1; i < 31; i++) {
            if( i % 3 == 0) {
                System.out.println(i);
            }
        }

        // 164 99 -> 0
        System.out.println(">>> 99 -> 0");
        for (int i = 99; i>= 0; i-- ){
            System.out.println(i);
        }

        // 165
        System.out.println(">>> 실수 증가");
        for (float f = 0.0f; f <= 1.0f; f+=0.1) {
            float f165 = f;
            System.out.printf("%.1f\n",f165);
        }

        // 167 구구단 3단 홀수번째 출력
        System.out.println(">>> 3단");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println("3 * " + i + " = " + 3 * i);
            }
        }

        // 169 1~10 중에서 홀수 더하기
        int sum168 = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                sum168 += i;
            }
        }
        System.out.println("합 : " + sum168);
    }
}
