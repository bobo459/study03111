package Java0404FileIO;

import javax.tools.FileObject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputsStream1 {
    public static void main(String[] args) throws IOException {

        //파일데이터 출력
        //1.파일 대상 설정
        File outFile = new File(Java0404FileIO.CURRENT + "file2.txt");
        if (!outFile.exists()){
            outFile.createNewFile();
        }
        //2. 대상에 연ㄹ결되는 stream 생성
        OutputStream os = new FileOutputStream(outFile);
        //3. 데이터 쓰기( 1 바이트씩 쓰기 )-안좋은방식,  버퍼에 모아둔것 써진게 아닌상태
        os.write('j');
        os.write('A');
        os.write('V');
        os.write('A');
        os.write('\r');  //캐리지 리턴(carriage return) : 캐리지 의미는 수동타자기에 먹지를 이동시킨것. 타자를 쳤을때 먹지가 살짝내려와서 글씨가 종이에 입력되게 오른쪽으로 미러줌. 한줄이 다쳐지면 앞쪽으로 다시 돌아옴
        os.write('\n');  //라인 피드(line feed) : 라인을 제공한다. 캐리지 리턴이 끝나면 엔터효과가 난다. 밑줄로 이동 '개행'


        os.flush(); //버퍼에 담겨있는 데이터를 파일에 쓰는 메서드  // 변기물 내리기, 위에 버퍼에 모아둔것을 flush를 해서 stream을 통해 내보내는것.
        //4. stream 종료
        os.close();

        //여러 바이트를 한꺼번에 쓰는 예제
        //두번째 파라미터(boolean append)는 기존 파일에 있던 데이터를 삭제하고 쓸지
        //뒤에 이어서 쓸지 결정하는 것(true = 이어쓰기)
        OutputStream os2 =  new FileOutputStream(outFile, true);  // true 면 있는 자료안에 이어서 작성하고 false 하면 초기화하고 내가 적는 값을넣겠다.
        //getBytes() 문자열을 바이트 배열로 변경시켜주는 메서드
        byte[] byteArray = "Spring and Database".getBytes();
        //write()는 매개변수에 바이트배열 형태로 넣어주면 배열에 담긴 데이터르르 모두 쓴다.
        os2.write(byteArray);
        os2.write('\r');
        os2.write('\n');
        os.flush();
        os.close();

        OutputStream os3 =  new FileOutputStream(outFile, true);
        byte[] byteArray2 = "Spring and Databasedddd\r\n".getBytes();
        os2.write(byteArray2);
        os.flush();
        os.close();

    }
}
