package Java0404FileIO;

import javax.tools.FileObject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream {
    public static void main(String[] args) throws IOException {
        //파일데이터 입력
        //1.파일 대상 설정
        File inFime = new File(Java0404FileIO.CURRENT +"/file1.txt");

        if (!inFime.exists()){
            inFime.createNewFile();
        }
        //2.대상에 연력되는 stream 생성
        InputStream is =  new java.io.FileInputStream(inFime);

        //3.데이터 읽기
        int data;
        while ((data=is.read())!= -1){  //-1을 수행하기전에 () 먼저 수행하자
            System.out.println("읽은 데이터 : "+(char)data + " 남은 바이트 : " + is.available()); //is.available()남아 있는 바이트수를 읽어준다.
        }
        //4. stream 종료
        is.close();  //반드시 종료창이 있어야한다.
    }//775p
}
