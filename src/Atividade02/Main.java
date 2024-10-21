package Atividade02;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int escolha;

        ListaDuplamenteLigada<Livro> livros = new ListaDuplamenteLigada<>();

        while (true){
            System.out.println("Menu de Gerenciamento: ");
            System.out.println("1 - Adicionar novo livro no começo");
            System.out.println("2 - Adicionar novo livro no final");
            System.out.println("3 - Remover primeiro livro");
            System.out.println("4 - Remover o último livro");
            System.out.println("5 - Buscar livro por ID");
            System.out.println("6 - Imprimir livros na ordem original");
            System.out.println("7 - Imprimir livros na ordem reversa");
            System.out.println("0 - Sair do sistema");
            System.out.println("Digite a opção desejada com base no número: ");
            escolha = scan.nextInt();


            if (escolha != 0) {
                switch (escolha) {
                    case 1:
                        System.out.println("Insira as informações do livro: ");
                        System.out.println("Digite o número de ID: ");
                        int id = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Digite o título: ");
                        String titulo = scan.nextLine();
                        System.out.println("Digite o autor(a): ");
                        String autor = scan.nextLine();

                        Livro livro = new Livro(id, titulo, autor);
                        livros.adicionarInicio(livro);
                        System.out.println(livro);
                        break;
                    case 2:
                        System.out.println("Insira as informações do livro: ");
                        System.out.println("Digite o número de ID: ");
                        int idFim = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Digite o título: ");
                        String tituloFim = scan.nextLine();
                        System.out.println("Digite o autor(a): ");
                        String autorFim = scan.nextLine();

                        Livro livroFim = new Livro(idFim, tituloFim, autorFim);
                        livros.adicionarFinal(livroFim);
                        System.out.println(livroFim);
                        break;
                    case 3:
                        Livro removidoInicio = livros.removerPrimeiro();
                        if (removidoInicio != null) {
                            System.out.println("Livro removido: " + removidoInicio);
                        } else {
                            System.out.println("A lista está vazia.");
                        }
                        break;
                    case 4:
                        Livro removidoFim = livros.removerUltimo();
                        if (removidoFim != null) {
                            System.out.println("Livro removido: " + removidoFim);
                        } else {
                            System.out.println("A lista está vazia.");
                        }
                        break;
                    case 5:
                        System.out.println("Digite o ID do livro a ser buscado: ");
                        int idBuscar = scan.nextInt();
                        Livro encontrado = livros.buscar(idBuscar);
                        if (encontrado != null){
                            System.out.println("Livro encontrado: " + encontrado.toString());
                        }else {
                            System.out.println("Livro não foi encontrado.");
                            continue;
                        }
                        break;
                    case 6:
                        livros.imprimirNaOrdemOriginal();
                        break;
                    case 7:
                        livros.imprimirNaOrdemReversa();
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente!\n");
                        break;
                }
            }else {
                System.out.println("Você escolheu a opção 0, saindo do sistema...");
                break;
            }

        }

    }

}