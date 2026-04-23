package ch2.adv;

import java.util.Scanner;

public class Input {
    private static Scanner sc;

    static{
        sc = new Scanner(System.in);
    }

    public static String read(String title){
        System.out.print(title);
        return sc.nextLine();
    }

    public static String read (String title, String defaultValue){
        System.out.printf("%s(%s): ", title, defaultValue);
        if (sc == null) {
            return defaultValue;
        }
        else{
            return sc.nextLine();
        }
    }

    public static int readInt (String title){
        System.out.print(title);
        return Integer.parseInt(sc.nextLine());
    }

    public static boolean confirm (String title, boolean defaultValue){
        String hint = defaultValue ? "[Y/n]" : "[y/N]";
        System.out.printf("%s (%s): ", title, hint);
        String input = sc.nextLine().trim().toString();
        if (input.isEmpty()){
            return defaultValue;
        }
        return input.equals("y") || input.equals("yes");
    }

    public static boolean confirm(String title){
        return confirm(title, true);
    }


    public static void main(String[] args) {
        String str = sc.nextLine();
    }
}
