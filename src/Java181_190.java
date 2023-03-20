import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Java181_190 {
    public static void main(String[] args) {
        // 181~4 파이썬 딕셔너리 => 자바 해시맵
        System.out.println(">>> 해시맵");
        int[] start181 = new int[]{100, 200, 300};
        int[] end181 = new int[]{80, 210, 330};
        String s181 = Arrays.toString(start181);
        String e181 = Arrays.toString(end181);
        Map<String, String> hash181 = new HashMap<>();
        hash181.put("시가", s181);
        hash181.put("종가", e181);
        System.out.println(hash181);

        // 185
        System.out.println(">>> 이차원 배열 출력");
        int[][] arr185 = {{101, 102}, {201, 202}, {301, 302}};
        for (int i = 0; i < arr185.length; i++ ){
            for (int j = 0; j < arr185[i].length; j++ ) {
                System.out.println(arr185[i][j] + " 호");
            }
        }
        // 186
        System.out.println(">>> 이차원 배열 역 출력");
        int[][] arr186 = {{101, 102}, {201, 202}, {301, 302}};
        for (int i = arr186.length-1; i >= 0; i-- ){
            for (int j = 0; j < arr186[i].length; j++ ) {
                System.out.println(arr186[i][j] + " 호");
            }
            System.out.println("--------------");
        }
        // 187
        System.out.println(">>> 이차원 배열 완전 역 출력");
        int[][] arr187 = {{101, 102}, {201, 202}, {301, 302}};
        for (int i = arr187.length-1; i >= 0; i-- ){
            for (int j = arr187[i].length-1; j >= 0 ; j-- ) {
                System.out.println(arr187[i][j] + " 호");
            }
        }
    }
}
