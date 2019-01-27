import java.util.concurrent.TimeUnit;

public class Main{

  public static void main(String[] args){
    System.out.println("Start of main thread");
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();

    try{
      t1.join();
      t2.join();
    }
    catch(InterruptedException e){

    }
    System.out.println("End of main thread");
  }

}

class MyThread extends Thread{
  private static int count = 0;
  private int id;
  public void run(){

    for(int i = 0; i < 10; i++){
      System.out.println(id + " --- TICK TICK " + i);
      try{
          TimeUnit.MILLISECONDS.sleep(200);
      }
      catch(InterruptedException e){

      }


    }
  }

  public MyThread(){
    id = count++;
    this.start();

  }

}
