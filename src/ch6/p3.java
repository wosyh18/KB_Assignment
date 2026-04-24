package ch6;

public class p3 {
    public static void main(String[] args) {
        try {
            String[] array = {"100", "1oo"};

            for (int i = 0; i <= array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("오류 발생 : " + e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스 초과 : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
