package ch7.adv;

public class ThreadExample {
    public static void main(String[] args) {
        Runnable musicRunnable = new MusicRunnable();

        Thread musicThread = new Thread(musicRunnable);

        musicThread.start();
    }
}
