package dev.valente.dsa.binarytree;

public class MainClass {
    public static void main(String[] args) {

        Tree tree = new Tree(new Elemento(20));
        tree.inserirElemento(new Elemento(10));
        tree.inserirElemento(new Elemento(5));
        tree.inserirElemento(new Elemento(2));
        tree.inserirElemento(new Elemento(8));
        tree.inserirElemento(new Elemento(15));
        tree.inserirElemento(new Elemento(12));
        tree.inserirElemento(new Elemento(18));
        tree.inserirElemento(new Elemento(30));
        tree.inserirElemento(new Elemento(25));
        tree.inserirElemento(new Elemento(22));
        tree.inserirElemento(new Elemento(28));
        tree.inserirElemento(new Elemento(35));
        tree.inserirElemento(new Elemento(32));
        tree.inserirElemento(new Elemento(38));



        Elemento elemento = new Elemento(38);

        tree.percursoInOrdem(tree);
        System.out.println("");

        System.out.println("Nova arvore....");
        tree = tree.removerElemento(elemento);

        tree.percursoInOrdem(tree);
        System.out.println("");

        elemento.setVal(35);

        tree = tree.removerElemento(elemento);
        System.out.println("Nova arvore...");
        tree.percursoInOrdem(tree);
        System.out.println("");


        elemento.setVal(20);

        tree = tree.removerElemento(elemento);
        System.out.println("Nova arvore...");
        tree.percursoInOrdem(tree);
        System.out.println("");

    }
}
