package dev.valente.algorithms.reverternumero;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(ReverseNumber.reverterNumero(1523));
    }

    public static int reverterNumero(int x){
        int reversed = 0;

        while(x != 0){

            reversed = reversed * 10 + (x % 10);
            x /= 10;
        }
        return reversed;
    }
}
