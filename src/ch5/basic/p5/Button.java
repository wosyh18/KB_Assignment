package ch5.basic.p5;

public class Button {

    //중첩 인터페이스-ClickLisentner은 오로지 button을 위해 존재
    public static interface ClickListener{
          void onClick();
    }

    //필드
    private ClickListener listener;

    //메소드
     public void setClickListener(ClickListener listener){
         this.listener = listener;
     }

     public void click(){
         listener.onClick();
     }

}
