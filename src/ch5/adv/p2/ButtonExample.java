package ch5.adv.p2;

public class ButtonExample {
    public static void main(String[] args) {
        Button button = new Button();

        //익명객체로 구현
        button.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button clicked");
            }
        });
        button.click();
    }
}
