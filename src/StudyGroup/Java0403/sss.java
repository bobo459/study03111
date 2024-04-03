package StudyGroup.Java0403;

import java.util.Arrays;

public class sss {
    public static void main(String[] args) {
        int [] ArrayBirthDay = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(ArrayBirthDay));


        for(int i=0;i< ArrayBirthDay.length;i++){
            ArrayBirthDay[i] = ArrayBirthDay[i]*10;
        }
        System.out.println(Arrays.toString(ArrayBirthDay));

        for(int i=0;i< ArrayBirthDay.length;i++){
            ArrayBirthDay[i] = ArrayBirthDay[i]+5;
        }
        System.out.println(Arrays.toString(ArrayBirthDay));

        for(int i=0;i< ArrayBirthDay.length;i++){
            ArrayBirthDay[i] = 99;
        }
        System.out.println(Arrays.toString(ArrayBirthDay));
    }
}
