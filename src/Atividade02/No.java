package Atividade02;

public class No<T> {
    T dado;
    Livro livro;
    No<T> anterior;
    No<T> proximo;

    public No(T dado){
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }
}
