package ch6;

public class p2 {
    public static void printLength(String data) throws NullPointerException {
        int result = data.length();
        System.out.println("문자수:" + result);
    }

    public static void main(String[] args) {
        try{
            System.out.println("[프로그램 시작]\n");
            printLength("ThisIsJava");
            printLength(null);
            System.out.println("[프로그램 종료]");
        } catch (NullPointerException e) {
            System.out.println("오류가 발생 : " + e.getMessage());
            e.printStackTrace();
        }

    }
}
