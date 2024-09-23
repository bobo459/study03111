package Java0920Thread;
class SMIFileRunnable implements Runnable{
    @Override
    public void run(){
        String [] strArray ={"하나","둘","셋","넷","다섯"};
        for (int i = 0; i < strArray.length; i++) {
            //Thread.sleep(10);
            System.out.println("(자막번호)"+strArray[i]);
            try {
                Thread.sleep(200);  //sleep 을 써서 텀을 맞춰서 순서를 맞추는 것에 근접할수 있지만 고정되는 것은 아님, 확률이 높아질뿐
            }catch (InterruptedException e){}
        }
    }
}
class  VideoFileRunnable implements Runnable{
    @Override
    public void  run(){
        int[] intArray ={1,2,3,4,5};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("(비디오프레임)"+intArray[i]);
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){}
        }
    }
}
public class ThreadRunnable {
    public static void main(String[] args) {
        //자막 쓰레드 실행
        Runnable smiFileRunnable = new SMIFileRunnable();
        Thread thread1 = new Thread(smiFileRunnable);
        thread1.start();
        //비디오 쓰레드 실행
        Runnable videoFileRunnable = new VideoFileRunnable();
        Thread thread2 = new Thread(videoFileRunnable);
        thread2.start();
    }
}
