package multithreading;

public class NumberRunnable implements Runnable{

    @Override
    public void run() {
        for(int num = 1; num <= 100; num++){
            if(CharacterThread.exit){
                break;
            }else {
                System.out.println(num);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
