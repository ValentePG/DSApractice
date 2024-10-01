package dev.valente.algorithms.sort;

public class SortAlgorithms {

    public void bubbleSort(int[] teste){

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
        view(teste);
    }

    public void view(int[] teste){
        for(int i = 0; i < teste.length; i++){
            System.out.print(teste[i] + " ");
        }
        System.out.println("");
    }
}
