package br.com.cotiinformatica;

import br.com.cotiinformatica.services.ProdutoService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        System.out.println("\nLista de Opções: \n");

        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Atualizar Produto");
        System.out.println("4 - Excluir Produto");

        var service = new ProdutoService();
        var scanner = new Scanner(System.in);

        System.out.println("Informe a opção desejada: ");
        var opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {

            case 1:
                service.cadastrarProduto();
                break;

            case 2:

            default:
                System.out.println("\nOpção inválida! ");
                break;

        }

        System.out.println("\nDeseja fazer outra operação? (S/N)");
        var continuar = scanner.nextLine();

        if (continuar.equalsIgnoreCase("S")) {
            main(); //Recursividade
        }
        else {
            System.out.println("\nPrograma encerrado.");
        }
    }
}















