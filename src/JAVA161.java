public class JAVA161 {
    public static void main(String[] args) {
//        // 161
//        int[] arr161 = new int[100];
//        for (int i = 0; i < arr161.length; i++ ){
//            arr161[i] = i;
//            System.out.println(arr161[i]);
//        }
        // 162 2002~2050 월드컵 개최연도 출력
        int size = 49; // (2050-2002+1)? 이 계산이 맞나
        int[] arr162 = new int[size];
        int[] arr162_w = new int[]{};
        for (int i = 0; i < size; i++ ) {
            arr162[i] = i+2002; // 2002~2050까지 넣음
//            System.out.println("arr162[" + i + "] : " + arr162[i]);
//            System.out.println(i + " % 4 = " + (i%4));
            if ( (i % 4) == 0 ) {
//                arr162[i] 얘네를... 새로운 배열에 어떻게 넣지..
//                arr162_w[i] = arr162[i];
//                System.out.println(arr162_w);
            }
        }


    }
}
