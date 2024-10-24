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



        System.out.println(" ");
        tree.percursoPreOrdem(tree);

        System.out.println(" ");
        tree.percursoInOrdem(tree);


        System.out.println(" ");
        tree.percursoPosOrdem(tree);
    }
}
