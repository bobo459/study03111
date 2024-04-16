package StudyGroup.Java0415;
/*

 0   2   10
 1   4   9
 2   6   8
 3   8   7
 4   10  6
 5   12  5
 6   14  4
 7   16  3
 8   18  2
 9   20  1
10   22  0

 */


public class HW02 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;

        int True =0;
        for (int l = 0; l < 22; l++) {
            for (i = 0; i <= 10; i++) {
                i= i+i;
            }
            for (j = 0; j <= 22; j++) {
                if (j % 2 == 0) {
                }
            }
            for (k = 10; k >= 0; k--) {
            }
            System.out.println(i + ", " + j + ", " + k);
        }
/*

        for (i = 0; i <= 22; i++) {
            if (i<=10){
                System.out.println(i);
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (j = 0; j <= 22; j++) {
            if (j % 2 == 0) {
            }
        }
        for (k = 10; k >= 0; k--) {
        }
       // System.out.println(i + ", " + j + ", " + k);

*/



    }
}




