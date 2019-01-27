import java.util.concurrent.TimeUnit;

public class ThirdWay{

  public static void main(String[] args){
    System.out.println("Start of main thread");

    ThirdTask t1 = new ThirdTask();
    Thread th1 = new Thread(t1);
    th1.start();

    ThirdTask t2 = new ThirdTask();
    Thread th2 = new Thread(t2);
    th2.start();

    try{
      th1.join();
      th2.join();
    }
    catch(InterruptedException e){

    }
    System.out.println("End of main thread");
  }

}

class ThirdTask implements Runnable{
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

  public ThirdTask(){
    id = count++;

  }

}
