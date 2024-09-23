package Java0920Thread;

class MyDataSync {
    int data = 3;
    public synchronized void plusDataSync(){
        int myDataSync = data;
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){}
        data = myDataSync +1;
    }
}
class PlusThreadSync implements Runnable{
    MyDataSync myData;

    public PlusThreadSync(MyDataSync myDataSync) {
        this.myData = myDataSync;
    }

    @Override
    public void run(){
        myData.plusDataSync();
        System.out.println("실행결과 : " + myData);
    }
}
public class ThreadWithSync {
    public static void main(String[] args) {
        MyDataSync myData = new MyDataSync();
        //첫번째 쓰레드
        Runnable plusThread = new PlusThread(myData);
        Thread thread1 = new Thread(plusThread);
        thread1.start();
        //1초 슬립
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        //두번째 쓰레드
        Runnable plusThread2 = new PlusThread(myData);
        Thread thread2 = new Thread(plusThread2);
        thread2.start();
    }
}
