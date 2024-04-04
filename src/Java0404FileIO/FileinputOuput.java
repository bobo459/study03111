package Java0404FileIO;

import javax.tools.FileObject;
import java.io.*;
import java.io.FileInputStream;
import java.nio.charset.Charset;

public class FileinputOuput {
    public static void main(String[] args) throws IOException {
        File file = new File(Java0404FileIO.CURRENT + "fileio.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        //쓰기
        OutputStream os = new FileOutputStream(file);

        byte[] arrayByte = "안녕하세요.".getBytes(Charset.forName("UTF-8"));
        os.write(arrayByte);
        os.flush();
        os.close();
 /*       //쓰기
        OutputStream os = new FileOutputStream(file);
   //     byte[] arrayByte = "Hello world. Let's study spring framework.".getBytes();
        os.write(arrayByte);
        os.flush();
        os.close();
        //읽기
        InputStream is = new FileInputStream(file);
        int data;
        byte[] buffer = new byte[1000];
        while ((data=is.read(buffer))!=-1){   //(data=is.read(buffer) : 버퍼 크기 만큼 읽겠다. 읽은 글자수를 리턴하겠다.
            String
            System.out.println(buffer);
        }
        is.close();

        //읽기
        InputStream is = new FileInputStream(file);
        int data=0;
        byte[] buffer = new byte[1000];
        while (data!= -1){   //(data=is.read(buffer) : 버퍼 크기 만큼 읽겠다. 읽은 글자수를 리턴하겠다.
            data = is.read(buffer);
        }
        String str =  new String(buffer,Charset.forName("UTF-8"));
      //  String str =  new String(buffer);
        System.out.println(str);
        is.close();*/

 /*       //읽기
        InputStream is = new FileInputStream(file);
        int data = 0;
        byte[] buffer = new byte[1000];
        String str = " ";
        while (data != -1) {
            data = is.read(buffer);
            if (data >= 0) {
                str = str + new String(buffer, 0, data, Charset.forName("UTF-8"));
            }
        }
        System.out.println(str);
        is.close();
*/
        //읽기
        InputStream is = new FileInputStream(file);  //조건문이 필요없다. 조건문에서 읽고 있어서
        int data = 0;
        byte[] buffer = new byte[1000];
        String str = " ";
        while ((data = is.read(buffer)) != -1) {
                str = str + new String(buffer, 0, data, Charset.forName("UTF-8"));
            }
        System.out.println(str);
        is.close();
        }

    }



