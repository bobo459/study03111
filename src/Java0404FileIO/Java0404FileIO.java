package Java0404FileIO;

import javax.tools.FileObject;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

//폴더를 만들고 거기에 파일을 만들때 사용
public class Java0404FileIO {

    public static final String CURRENT =
            "C:\\Users\\DW\\IdeaProjects\\study03111\\temp";
    public static void main(String[] args) {
        String currentPath = System.getProperty("user.dir");  //현재 작업하는 폴더 경로
        System.out.println(currentPath);

        //폴더를 만들기 위해서 File을 만들어야함
/*        File temDir = new File("C:\\Users\\DW\\IdeaProjects\\study03111");   - 2개 다 작동된다.*/
        //절대경로
        File temDir = new File("C:/Users/DW/IdeaProjects/study03111/temp");
        if (temDir.exists()){
            System.out.println("폴더가 이미 존재합니다.");
        }else {
            System.out.println("폴더를 생성합니다.");
            temDir.mkdir();  //make directory
        }
        File newFile = new File(CURRENT + "/newFile.txt");
        if (!newFile.exists()){
            try {
                newFile.createNewFile();
            } catch (IOException e){
                System.out.println("IOException 예외");
            }
        }else {
            System.out.println("이미 파일이 존재합니다.");
        }

        //File ㄱ개체가 가르키는 대상(폴더 또는 파일)의 절대 경로 확인
        System.out.println("절대경로 위치"+newFile.getAbsoluteFile());
        //soutv

    }
}
