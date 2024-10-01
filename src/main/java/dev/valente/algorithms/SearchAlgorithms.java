package dev.valente.algorithms;

public class SearchAlgorithms {
    private int[] teste = {30, 12, 50, 29, 39, 255, 10, 55, 70};

    public void bubbleSort(){

        int pos;
        int temp;
        int it;


        for(it = 0; it < teste.length - 1; it++){
            for(pos = 0; pos < teste.length - 1 - it; pos++){
                if(teste[pos] > teste[pos+1]){
                    temp         = teste[pos];
                    teste[pos]   = teste[pos+1];
                    teste[pos+1] = temp;
                }
            }
        }
        view();
    }

    public void view(){
        for(int i = 0; i < teste.length - 1; i++){
            System.out.print(teste[i] + " ");
        }
    }
}
