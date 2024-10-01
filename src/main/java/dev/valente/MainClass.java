package dev.valente;

import dev.valente.algorithms.search.SearchAlgorithms;
import dev.valente.algorithms.sort.SortAlgorithms;

public class MainClass {
    public static void main(String[] args) {

        int[] teste = {23, 32, 42, 53, 130, 35 , 15};

        SortAlgorithms sortAlgorithms = new SortAlgorithms();
        sortAlgorithms.bubbleSort(teste);

        SearchAlgorithms searchAlgorithms = new SearchAlgorithms();
        System.out.println(searchAlgorithms.binarySearch(teste, 42));

    }
}
