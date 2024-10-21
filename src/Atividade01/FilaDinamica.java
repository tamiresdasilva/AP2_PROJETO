package Atividade01;

public class FilaDinamica<T> {
    No<T> inicio;
    No<T> fim;
    private int tamanho;

    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean vazia(){
        return tamanho == 0;
    }

    public boolean enfileirar(T elemento){
        No<T> novoNo = new No<T>(elemento);

        if (vazia()){
            inicio = novoNo;
            fim = novoNo;
        }else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
        tamanho++;
        return true;
    }

    public T desenfileirar(){
        if (inicio == null){
            System.out.println("Não há nenhum pedido pendente no momento.");
            return null;
        }
        T elemento = inicio.elemento;
        inicio = inicio.proximo;
        if (inicio == null){
            fim = null;
        }
        tamanho--;
        return elemento;
    }

    public void imprimirFila() {
        if (inicio == null) {
            System.out.println("Não há nenhum pedido pendente no momento.");
            return;
        }
        No<T> atual = inicio;
        while (atual != null) {
            System.out.println(atual.elemento);
            atual = atual.proximo;
        }
    }
}
