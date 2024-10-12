package dev.valente.dsa.binarytree;

public class Tree {
    private Elemento elemento;
    private Tree esq;
    private Tree dir;

    public Tree(Elemento elemento) {
        this.elemento = elemento;
    }

    public Tree(){

    }

    public void inserirElemento(Elemento novo){
        if(isEmpty()){
            this.elemento = novo;
        }
        else {
            Tree novaArvore = new Tree(novo);
            if(novo.getVal() > this.elemento.getVal()){
                if(this.dir == null){ // folha?
                    this.setDir(novaArvore);
                } else {
                    this.dir.inserirElemento(novo);
                }

            } else if(novo.getVal() < this.elemento.getVal()){
                if(this.esq == null){
                    this.setEsq(novaArvore);

                } else {
                    this.esq.inserirElemento(novo);
                }

            }
        }
    }


    public Tree removerElemento(Elemento removido){

        if(this.elemento.getVal() == removido.getVal()){

            if(this.dir == null && this.esq == null){
                return null;
            }
            else {
                // filho do lado esquerdo
                if(this.esq != null && this.dir == null){
                    return this.esq;
                }
                // filho do lado direito
                else if(this.dir != null && this.esq == null){
                    return this.dir;
                }
                // filho dos 2 lados
                else{
                    // maior dentre os menores
                    Tree aux = this.esq;
                    while (aux.dir != null){
                        aux = aux.dir;
                    }
                    // troco os elementos da árvore
                    this.elemento = aux.getElemento();
                    aux.setElemento(removido);

                    this.esq = esq.removerElemento(removido);
                }

            }

        } else if(this.elemento.getVal() > removido.getVal()){

            this.esq = this.esq.removerElemento(removido);

        } else if(elemento.getVal() < removido.getVal()){

            this.dir = this.dir.removerElemento(removido);

        }
        return this;

    }

    public void percursoPreOrdem(Tree tree){ // fiz solo
        if(!isEmpty()){
            System.out.print(tree.getElemento().getVal() + " ");
            if(tree.esq != null){
                percursoPreOrdem(tree.esq);
            }
            if(tree.dir != null){
                percursoPreOrdem(tree.dir);
            }
        }
    }

    public Tree inverterArvore(Tree tree){ //Nice!


        if(tree.esq != null && tree.dir != null){
            Tree tree1 = tree.dir;
            tree.dir = tree.esq;
            tree.esq = tree1;
            inverterArvore(tree.dir);
            inverterArvore(tree.esq);
        }


        return tree;
    }

    public void percursoPosOrdem(Tree tree){
        if(!isEmpty()){
            if(tree.dir != null){
                percursoPosOrdem(tree.dir);
            }
            if(tree.esq != null){
                percursoPosOrdem(tree.esq);
            }
            System.out.print(tree.getElemento().getVal() + " ");
        }
    }

    public void percursoInOrdem(Tree tree){
        if(!isEmpty()){
            if(tree.esq != null){
                percursoInOrdem(tree.esq);
            }

            System.out.print(tree.getElemento().getVal() + " ");
            if(tree.dir != null){
                percursoInOrdem(tree.dir);
            }
        }
    }

    public boolean busca(int valor){
        if(isEmpty()){
            return false;
        }
        if (this.elemento.getVal() == valor){
            return true;
        }else {
            if(valor > this.elemento.getVal()) {
                if(this.dir == null){
                    return false;
                }
                else {
                    return this.dir.busca(valor); // repassa a responsabilidade para a sub árvore direita
                }
            }
            else if(valor < this.elemento.getVal()){
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
