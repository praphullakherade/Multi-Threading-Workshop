package multithreading;

public class CharacterThread extends Thread {
    public static boolean exit = false;
    @Override
    public void run(){
        char ch;
        for(ch ='a'; ch <='z'; ch++){
            System.out.println(ch);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        exit = true;
    }
}
