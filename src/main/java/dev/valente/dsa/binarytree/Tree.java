package dev.valente.dsa.binarytree;

public class Tree {
    private Elemento elemento;
    private Tree esq;
    private Tree dir;

    public Tree(Elemento elemento) {
        this.elemento = elemento;
    }

    public void inserirElemento(Elemento novo){
        if(isEmpty()){
            this.elemento = novo;
        }
        else {
            Tree novaArvore = new Tree(novo);
            if(novo.getElemento() > this.elemento.getElemento()){
                if(this.dir == null){ // folha?
                    this.setDir(novaArvore);
                } else {
                    this.dir.inserirElemento(novo);
                }

            } else if(novo.getElemento() < this.elemento.getElemento()){
                if(this.esq == null){
                    this.setEsq(novaArvore);

                } else {
                    this.esq.inserirElemento(novo);
                }

            }
        }
    }

    public void percursoPreOrdem(Tree tree){ // fiz solo
        if(!isEmpty()){
            System.out.print(tree.getElemento().getElemento() + " ");
            if(tree.esq != null){
                percursoPreOrdem(tree.esq);
            }
            if(tree.dir != null){
                percursoPreOrdem(tree.dir);
            }
        }
    }

    public void percursoPosOrdem(Tree tree){

    }

    public void percursoInOrdem(Tree tree){
        if(!isEmpty()){
            if(tree.esq != null){
                percursoInOrdem(tree.esq);
            }

            System.out.print(tree.getElemento().getElemento() + " ");
            if(tree.dir != null){
                percursoInOrdem(tree.dir);
            }
        }
    }

    public boolean busca(int valor){
        if(isEmpty()){
            return false;
        }
        if (this.elemento.getElemento() == valor){
            return true;
        }else {
            if(valor > this.elemento.getElemento()) {
                if(this.dir == null){
                    return false;
                }
                else {
                    return this.dir.busca(valor); // repassa a responsabilidade para a sub árvore direita
                }
            }
            else if(valor < this.elemento.getElemento()){
                if(this.esq == null){
                    return false;
                }
                else {
                    return this.esq.busca(valor);
                }
            }
        }
        return false;

    }

    public boolean isEmpty(){
        return (this.elemento == null);
    }


    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public Tree getEsq() {
        return esq;
    }

    public void setEsq(Tree esq) {
        this.esq = esq;
    }

    public Tree getDir() {
        return dir;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "elemento=" + elemento +
                ", esq=" + esq +
                ", dir=" + dir +
                '}';
    }

    public void setDir(Tree dir) {
        this.dir = dir;
    }
}
