package StudyGroup.Java0402Array;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
1.
*/
public class Java240402Study {
    public static void main(String[] args) {
        int [] ArrayJinGyeonBirthday = {1,9,9,5,0,1,1,7};
        System.out.println(Arrays.toString(ArrayJinGyeonBirthday));

        int [] ArrayFor = new int[4] ;
        for (int i =0 ; i<ArrayFor.length; i++){
            ArrayFor[i]=i;
        }System.out.println(Arrays.toString(ArrayFor));
        System.out.println();

//        ArrayJinGyeonBirthday[0] = 2;
//        ArrayJinGyeonBirthday[1] = 0;
//        ArrayJinGyeonBirthday[2] = 2;
//        ArrayJinGyeonBirthday[3] = 4;
//        ArrayJinGyeonBirthday[4] = 0;
//        ArrayJinGyeonBirthday[5] = 4;
//        ArrayJinGyeonBirthday[6] = 0;
//        ArrayJinGyeonBirthday[7] = 2;
//        System.out.println(Arrays.toString(ArrayJinGyeonBirthday));

        int[]today = {2,0,2,4,0,4,0,2};
        for (int j=0;j< today.length;j++){
            ArrayJinGyeonBirthday[j]=today[j];
        }
        System.out.println("바뀐값은 : "+Arrays.toString(ArrayJinGyeonBirthday));
    }
}
