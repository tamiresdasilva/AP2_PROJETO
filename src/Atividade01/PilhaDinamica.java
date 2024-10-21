package Atividade01;

public class PilhaDinamica<T> {
    No<T> topo; //Saber quem é o topo
    int tamanho; //saber quantos elementos eu tenho

    //Inicializamos a nossa Pilha com o nosso constructor
    PilhaDinamica(){
        tamanho = 0;
        topo = null;
    }

    public boolean vazia(){
        return topo == null;
    }

    public void empilhar(T elemento){
        No<T> novoNo = new No<T>(elemento);
        novoNo.elemento = elemento;
        novoNo.proximo = topo;
        topo = novoNo;
        tamanho++;
    }

    public T desempilhar(){
        if (vazia()){
            System.out.println("Nenhum pedido cancelado no momento.");
            return null;
        }
        T elemento = topo.elemento;
        topo = topo.proximo;
        tamanho--;
        System.out.println("Pedido desempilhado: " + elemento);
        return elemento;
    }

    public void imprimirPilha(){
        if (vazia()){
            System.out.println("Nenhum pedido cancelado no momento.");
            return;
        }
        No<T> atual = topo;
        while (atual != null){
            System.out.println(atual.elemento);
            atual = atual.proximo;
        }
    }
}
