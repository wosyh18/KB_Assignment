package ch5.basic.p5;

public class ButtonExample {
    public static void main(String[] args) {

        Button button = new Button();

        //로컬 클래스 : 버튼 클릭 이벤트 처리할 클래스
        class OkListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("OK");
            }
        }

        button.setClickListener(new OkListener());

        button.click();
    }
}
