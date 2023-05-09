package DAY_3;

public class Tim_PTL_in_array_2_chieu_day_3 {
    public static void main(String[] args) {
       int[][] array = {{444,333},{23,2},{9,21}};
       int max = array[0][0];
       for (int i=0; i< array.length; i++ ){
           for (int j = 0; j <array[i].length; j++){
               if (array[i][j] > max){
                   max = array[i][j];
               }
           }
       }
        System.out.println(" số lớn nhất trong mảng là: " + max);
    }
}
