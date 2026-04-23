package ch2.basic.p4;

public class Computer {
    int sum;

    public int sum(int a, int b, int c){
        return a + b + c;
    }
    public int sum (int [] values){
        int sum = 0;
         for ( int a :  values){
             sum += a;
         }
         return sum;
    }

    public int sum(int i, int i1, int i2, int i3, int i4) {
        return i + i1 + i2 + i3 + i4;
    }
}
