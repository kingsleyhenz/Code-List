package basic;
    
public class TwoDArrayDemo {
public static void main(String[] args) {
    int[][] a = new int[][]{
            {1, 6, 2},
            {13, 2, 5},
            {4, 1, 8}
    };
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; i++) {
            sum += a[i][j];
        }
        System.out.println(sum);
        sum=0;
    }
}
  }











//    int[][] b = new int[][]{
//            {7,20,10},
//            {4,19,80},
//            {52,33,21}
//    };
////    for (int i = 0; i < a.length ; i++){
////        StringBuilder temp_sum = new StringBuilder("{");
////        for (int j = 0; j < a[i].length; j++){
////            int sum = a[i][j] + b[i][j];
////            String deep_arr = "" ;
////            deep_arr =  j != 0 ? ","+sum : String.valueOf(sum);
////            temp_sum.append(deep_arr);
////        }
////        temp_sum.append("}");
////        System.out.println(temp_sum);
////    }

