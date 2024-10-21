package Atividade01;

public class Pedido {
    private int numero;
    private String descricao;


    public Pedido(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    public int getId() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "\n Dados do Pedido: " +
                "\n Número do Pedido: " + numero +
                "\n Descrição: " + descricao;
    }
}