package DAY_3;

public class Tim_GTN_in_array_dung_Method_day_3 {
    public static void main(String[] args) {
        int[] array = {4,7,8,9,11,2,5};
        int index = minValue(array);
        System.out.println(" số nhỏ nhất là: " + array[index] + " tại vị trí: " + (index + 1) );
    }
    public  static  int minValue(int[] array){
        int index = 0;
        for ( int i = 1; i < array.length; i++){
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }
}
