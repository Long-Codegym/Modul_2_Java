package DAY_3;

public class BT_GTN_in_array_day_3 {
    public static void main(String[] args) {
        int[][] array = {{1,3},{23,4},{9,21}};
        int index = 0;
        int min = array[0][0];
        for (int i=0; i< array.length; i++ ){
            for (int j = 0; j <array[i].length; j++){
                if (array[i][j] < min){
                    min = array[i][j];
                }
//                else {
//                    System.out.println(" số nhỏ nhất là:" + array[i][j]);
//                    break;
//                }
            }
        }
        System.out.println(" số nhỏ nhất trong mảng là: " + min);
    }
}
