import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java171_180 {
    public static void main(String[] args) {
        // 173
        System.out.println(">>> 인덱스 역순 + 데이터 순차 출력");
        int[] arr173 = new int[]{32100, 32150, 32000, 32500};
        for (int i = 0; i < arr173.length; i++) {
            // 인덱스는 3->0 인데, 데이터는 0->3 순서로 출력돼야 함
            // 따라서 > 마지막 인덱스(전체 길이 -1) - i < 값을 사용한다
//            System.out.println((arr173.length-1)-i + " " + arr173[i]);
            System.out.printf("%d  %d\n", (arr173.length-1)-i, arr173[i]);
        }

        // 176
        System.out.println(">>> 리스트를 3x3 형태로 출력");
        String[] arr176 = new String[]{"가", "나", "다", "라", "마"};
        for (int i = 0; i < arr176.length-2; i++) {
            System.out.println(arr176[i] + " " + arr176[i+1] + " " + arr176[i+2]);
        }

        // 177
        System.out.println(">>> 리스트 역순 3x2 출력");
        String[] arr177 = new String[]{"가", "나", "다", "라"};
        for (int i = 0; i < arr176.length-2; i++) {
            System.out.println(arr177[3-i] + " " + arr177[2-i]);
        }

        // 178
        System.out.println(">>> 자신과 우측 값의 차분값 출력");
        int[] arr178 = new int[]{100, 200, 400, 800};
//        arr178[2]-arr178[1]
        for (int i = 0; i < arr178.length-1; i++) {
            System.out.println(arr178[i+1] - arr178[i]);
        }

        // 179
        System.out.println(">>> 종가의 3일 이동 평균");
        int[] arr179 = new int[]{100, 200, 400, 800, 1000, 1300};
        float avg;
        for (int i = 0; i < arr179.length-2; i++) {
            avg = (arr179[i] + arr179[i+1] + arr179[i+2])/3.0f;
            System.out.printf("%.10f\n", avg);
        }

        // 180 배열에 요소 추가
        System.out.println(">>> 5일간의 변동폭");
        // 변동폭 = 고가 - 저가
        int[] low_prices = new int[]{100, 200, 400, 800, 1000};
        int[] high_prices = new int[]{150, 300, 430, 880, 1000};
        int size = low_prices.length;
        int gap;
//        System.out.println(size);
        Integer[] arr180 = new Integer[size]; // 배열 형태 int가 아니라 Integer
        List<Integer> list = new ArrayList<>(Arrays.asList(arr180));
        for (int i = 0; i < size; i++) {
            gap = high_prices[i] - low_prices[i];
            list.add(gap);
        }
        // 왜 리스트에서 null 값이 뜨지?..
        // 그리고 왜 제거할때 그냥 null 이 아니라 ""도 추가해줘야하는거야?
        list.removeAll(Arrays.asList("", null));
        arr180 = list.toArray(arr180);
        System.out.println(Arrays.toString(arr180));
    }
}
