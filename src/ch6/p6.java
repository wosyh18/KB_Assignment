package ch6;

public class p6 {
    public static void main(String[] args) {
        try{
            findClass();
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
