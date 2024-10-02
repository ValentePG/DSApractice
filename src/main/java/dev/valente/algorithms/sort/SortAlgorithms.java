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

    public void selectionSort(int[] teste){
//        O processo se inicia na primeira posição, varre a lista, identifica qual é o menor valor atual do array,
//        após isto checa se o menor valor atual é menor que o valor da posição inicial, caso seja, ocorre o swap,
//        e assim em diante
    }

    public void insertionSort(int[] teste){
//        Basicamente o processo começa na segunda posição da lista e
//        vai checando se os números a esquerda são menores e fazendo o swap
    }


    public void view(int[] teste){
        for(int i = 0; i < teste.length; i++){
            System.out.print(teste[i] + " ");
        }
        System.out.println("");
    }
}
