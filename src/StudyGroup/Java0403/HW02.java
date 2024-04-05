package StudyGroup.Java0403;


import java.util.Arrays;

//ArrayBirthDay 라는 배열 하나로
//1.   1,2,3,4,5,6,7,8,9,10
//2.   10,20,30,40,50,60,70,80,90,100
//3.   15,25,35,45,55,65,75,85,95,105
//4.   99,99,99,99,99,99,99,99,99,99
//를 출력하시오.
public class HW02 {
    public static void main(String[] args) {

        int[] ArrayBirthDay = new int[10];

        for (int i = 0;i<ArrayBirthDay.length;i++){
            ArrayBirthDay[i] = i+1;
        }System.out.println(Arrays.toString(ArrayBirthDay));

        for (int j = 0;j<ArrayBirthDay.length;j++){
            ArrayBirthDay[j] = ArrayBirthDay[j]*10;
        }System.out.println(Arrays.toString(ArrayBirthDay));  //

        for (int k = 0;k<ArrayBirthDay.length;k++){
            ArrayBirthDay[k] = ArrayBirthDay[k]+5;
        }System.out.println(Arrays.toString(ArrayBirthDay));

        for (int l = 0;l<ArrayBirthDay.length;l++){
            ArrayBirthDay[l] = 99;
        }System.out.println(Arrays.toString(ArrayBirthDay));

/*

        for (int j = 1;j<ArrayBirthDay.length;j++){
            ArrayBirthDay[j] =j*10;
            System.out.print(ArrayBirthDay[j]+", ");  //ArrayBirthDay[i] : 배열의 인덱스를 나타낸다
        }System.out.println(Arrays.toString(ArrayBirthDay));

        int ArrayBirth2[] =new int[]{15,25,35,45,55,65,75,85,95,105};
        for (int k = 0;k<ArrayBirth2.length;k++){
            ArrayBirthDay[k] = ArrayBirth2[k];
            System.out.print(ArrayBirth2[k]+", ");
        }System.out.println();

        for (int l = 0;l<ArrayBirthDay.length;l++){
            ArrayBirthDay[l] =99;
            System.out.print(ArrayBirthDay[l]+", ");
        }

*/

    }
}