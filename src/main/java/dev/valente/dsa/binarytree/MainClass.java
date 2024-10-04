package dev.valente.dsa.binarytree;

public class MainClass {
    public static void main(String[] args) {

        Tree tree = new Tree(new Elemento(10));

        tree.inserirElemento(new Elemento(5));
        tree.inserirElemento(new Elemento(1));
        tree.inserirElemento(new Elemento(8));
        tree.inserirElemento(new Elemento(15));
        tree.inserirElemento(new Elemento(12));
        tree.inserirElemento(new Elemento(18));

        System.out.println("O elemento 5 "+ (tree.busca(5)?" existe" : " não existe"));
        System.out.println("O elemento 15 "+ (tree.busca(15)?" existe" : " não existe"));
        System.out.println("O elemento 20 "+ (tree.busca(20)?" existe" : " não existe"));
        System.out.println("O elemento 30 "+ (tree.busca(30)?" existe" : " não existe"));
        System.out.println("O elemento 18 "+ (tree.busca(18)?" existe" : " não existe"));


    }
}
