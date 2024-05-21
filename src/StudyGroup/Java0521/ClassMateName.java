package StudyGroup.Java0521;

import java.util.Scanner;

public class ClassMateName {

    public String[] className(String[] classMateName) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < classMateName.length; i++) {
            String mateName = sc.next();
            classMateName[i] = mateName;
        }
        return classMateName;
    }


}



