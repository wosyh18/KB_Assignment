package ch7.basic;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override //작업 스레드 생성
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try { Thread.sleep(500);} catch (Exception e){}
                }
            }
        });
        thread.start(); //스레드 실행

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}
