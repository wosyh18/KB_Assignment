package ch5.adv.p2;

public class Button {
    //static이므로 button객체 생성 없이도 구현체 생성 가능
    public static interface ClickListener {

        void onClick();
    }

    private ClickListener listener;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        listener.onClick();
    }
}
