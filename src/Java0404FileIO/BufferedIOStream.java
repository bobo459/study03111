package Java0404FileIO;

import javax.tools.FileObject;
import java.io.*;
import java.io.FileInputStream;

public class BufferedIOStream {   //사진을 복사하는 법
    public static void main(String[] args) throws IOException {
        File orgFile = new File(Java0404FileIO.CURRENT+"/mycat_origin.jpg");
        File copyFile = new File(Java0404FileIO.CURRENT+"/mycat_copyFile.jpg");

        InputStream is = new FileInputStream(orgFile);
        OutputStream os = new FileOutputStream(copyFile);
        //기존으이 방법은 1바이트씩 쓰고 읽기 때문에 속도가 느림
        //1 바이트마다 read/write 하지 않고 버퍼에 모았다가 한번에 하면 빠르게 속도를 높일 수 있다.
        //BufferedInputStream 과 BufferedOutStream 을 같이 사용함
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);


        int data;
        //BufferedStream 을 사용하려면 is, os 대신에 bis, bos 를 사용한다.(속도가 더 빨라진다.약 30배 정도 차이)
        while ((data = bis.read()) != -1){
            bos.write(data);
        }
        is.close();
        os.flush();
        os.close();
    }
}
