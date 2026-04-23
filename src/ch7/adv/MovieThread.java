package ch7.adv;

public class MovieThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){

            }
        }
    }
}
