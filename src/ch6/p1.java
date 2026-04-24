package ch6;

public class p1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자수:" + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }

    //data가 null을 가리키게 되므로 nullPointException 발생함
}
