package ch1;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while ( i <= 100){
            sum += i;
            i++;
        }
        System.out.printf("1~100합:%d", sum);
    }
}
