package multithreading;

public class Main {
    public static void main(String[] args) {
        CharacterThread characterThread = new CharacterThread();
        NumberRunnable numberRunnable = new NumberRunnable();
        Thread numberThread = new Thread(numberRunnable);

//        numberThread.setDaemon(true);
        characterThread.start();
        numberThread.start();

    }
}
