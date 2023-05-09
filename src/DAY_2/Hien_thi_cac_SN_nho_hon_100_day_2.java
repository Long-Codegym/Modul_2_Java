public class Hien_thi_cac_SN_nho_hon_100_day_2 {
    public static void main(String[] args) {
        for (int j = 2; j <= 100; j++) {
            int i = 2;
            boolean kT = true;
            while (j > i) {
                if (j % i == 0) {
                    kT = false;
                    break;
                }
                i++;
            }
            if (kT) {
                System.out.println(j + " là số nguyên tố");
            }
        }
    }
}
