

public class Hien_thi_cac_loai_hinh_day_2 {
    public static void main(String[] args) {
        System.out.println(" hình chữ nhật");
        for (int i = 0; i <3; i++){
            for (int j = 0 ; j <=4 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("hình tam giác");
        for (int k = 1 ; k <=5 ; k ++){
            for (int a = 0 ; a < k ; a++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("tam giác ngược");
        for ( int s = 5 ; s>=1 ; s-- ){
            for (int d = s ; d >= 1; d-- ){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
