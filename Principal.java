package Atividade01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int escolha;

        FilaDinamica<Pedido> pedidosPendentes = new FilaDinamica<Pedido>();
        PilhaDinamica<Pedido> pedidosCancelados = new PilhaDinamica<Pedido>();


        while (true){
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1 - Adicionar novo pedido");
            System.out.println("2 - Atender pedido");
            System.out.println("3 - Cancelar pedido");
            System.out.println("4 - Restaurar pedido");
            System.out.println("5 - Imprimir todos os pedidos pendentes");
            System.out.println("6 - Imprimir todos os pedidos cancelados");
            System.out.println("0 - Sair do sistema");
            escolha = scan.nextInt();

            if (escolha != 0){
                switch (escolha){
                    case 1:
                        System.out.println("Digite o número do pedido: ");
                        int numero = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Digite a descrição do pedido: ");
                        String descricao = scan.nextLine();
                        pedidosPendentes.enfileirar(new Pedido(numero, descricao));
                        pedidosPendentes.imprimirFila();
                        break;
                    case 2:
                        Pedido pedidoAtendido = pedidosPendentes.desenfileirar();
                        if (pedidoAtendido != null){
                            System.out.println("Pedido atendido: " + pedidoAtendido);
                        }
                        break;
                    case 3:
                        Pedido pedidoCancelado = pedidosPendentes.desenfileirar();
                        if (pedidoCancelado != null){
                            pedidosCancelados.empilhar(pedidoCancelado);
                            System.out.println("Pedido cancelado: " + pedidoCancelado);
                        }
                        break;
                    case 4:
                        Pedido pedidoRestaurado = pedidosCancelados.desempilhar();
                        if (pedidoRestaurado != null){
                            pedidosPendentes.enfileirar(pedidoRestaurado);
                            System.out.println("Pedido restaurado: " + pedidoRestaurado);
                        }
                        break;
                    case 5:
                        System.out.println("Pedidos pendentes: ");
                        pedidosPendentes.imprimirFila();
                        break;
                    case 6:
                        System.out.println("Pedidos cancelados: ");
                        pedidosCancelados.imprimirPilha();
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                        break;
                }
            }else{
                System.out.println("Você escolheu a opção 0, saindo do sistema...");
            }

        }

    }
}
