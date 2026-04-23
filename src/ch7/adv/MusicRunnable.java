package ch7.adv;

public class MusicRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                // 0.5초(500ms) 간격으로 일시 정지
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // 예외 발생 시 처리 로직 (필요시 작성)
            }
        }
    }
}
