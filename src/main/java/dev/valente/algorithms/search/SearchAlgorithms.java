package dev.valente.algorithms.search;

import dev.valente.algorithms.sort.SortAlgorithms;

public class SearchAlgorithms {


    public int binarySearch(int[] teste, int val){


        int inicio, fim, meio;
        inicio = 0;
        fim = teste.length-1;

        while(inicio <= fim){
            meio = (inicio + fim)/2;
            if(val == teste[meio]){
                return meio;
            } else {
                if(val > teste[meio]){
                    inicio = meio + 1;
                }
                else {
                    fim = meio - 1;
                }
            }
        }


        return -1;

    }

}
