package Atividade02;

public class Livro {
    int id;
    String titulo;
    String autor;

    public Livro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\n Dados do Livro: " +
                "\n id: " + id +
                "\n Título: " + titulo+
                "\n Autor: " + autor;
    }
}
