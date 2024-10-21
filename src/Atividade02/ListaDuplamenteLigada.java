package Atividade02;

public class ListaDuplamenteLigada<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public ListaDuplamenteLigada() {
        this.inicio = null;
        this.fim = null;
    }

    public void adicionarInicio(T dado){
        No<T> novoNo = new No<>(dado);
        if (inicio == null){
            inicio = novoNo;
            fim = novoNo;
        }
        else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
        tamanho++;
    }

    public void adicionarFinal(T dado){
        No<T> novoNo = new No<>(dado);
        if (inicio == null){
            inicio = novoNo;
            fim = novoNo;
        }
        else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
        tamanho++;
    }

    public T removerPrimeiro(){
        if (inicio == null){
            return null;
        }
        T dado = inicio.dado;
        inicio = inicio.proximo;
        if (inicio != null){
            inicio.anterior = null;
        } else{
            fim = null;
        }
        tamanho--;
        return dado;
    }

    public T removerUltimo(){
        if (fim == null){
            return null;
        }
        T dado = fim.dado;
        fim = fim.anterior;
        if (fim != null){
            fim.proximo = null;
        }else{
            fim = null;
        }
        tamanho--;
        return dado;
    }

    public T buscar(int id) {
        No<T> noAtual = inicio;
        while (noAtual != null) {
            Livro livro = (Livro) noAtual.dado;
            if (livro.id == id) {
                return (T) livro;
            }
            noAtual = noAtual.proximo;
        }
        System.out.println("O ID " + id + " é inválido.");
        return null;
    }

    public void imprimirNaOrdemOriginal(){
        No<T> atual = inicio;
        while (atual != null){
            System.out.println(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirNaOrdemReversa(){
        No<T> atual = fim;
        while (atual != null){
            System.out.println(atual.dado + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ListaDuplamenteLigada: " +
                "\nComeço: " + inicio +
                "\nFim: " + fim;
    }

}

