package br.com.cotiinformatica.services;

import br.com.cotiinformatica.entities.Produto;
import br.com.cotiinformatica.repositories.ProdutoRepository;

import java.util.Scanner;

public class ProdutoService {

    public void cadastrarProduto() {

        try {

            System.out.println("\nCADASTRO DE PRODUTOS\n");

            var produto = new Produto();
            var scanner = new Scanner(System.in);

            System.out.println("Informe o nome do produto: ");
            produto.setNome(scanner.nextLine());

            System.out.println("Informe o preço: ");
            produto.setPreco(Double.parseDouble(scanner.nextLine()));

            System.out.println("Informe a quantidade: ");
            produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

            var produtoRepository = new ProdutoRepository();
            produtoRepository.inserir(produto);

        }
        catch(Exception e) {
            System.out.println("\nERRO: " + e.getMessage());
        }
    }

    public void atualizarProduto() {
        try{

            System.out.println("\nAtualização de Produtos\n");

            var produto = new Produto();
            var scanner = new Scanner(System.in);

            System.out.println("Informe o ID do produto: ");
            produto.setId(Integer.parseInt(scanner.nextLine()));

            System.out.println("Informe o nome do produto: ");
            produto.setNome(scanner.nextLine());

            System.out.println("Informe o preço do produto: ");
            produto.setPreco(Double.parseDouble(scanner.nextLine()));

            System.out.println("Informe a quantidade do produto: ");
            produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

            var produtoRepository = new ProdutoRepository();

            if(produtoRepository.atualizar(produto)) {
                System.out.println("Produto atualizado com sucesso!");

            }
            else {
                System.out.println("Nenhum produto encontrado. Tente novamente.");

            }
        }
        catch(Exception e) {
            System.out.println("\nERRO:" + e.getMessage());

        }
    }

    public void excluirProduto() {

        try {
            System.out.println("\nExclusão de Produtos\n");

            var scanner = new Scanner(System.in);

            System.out.println("Informe o ID do produto: ");
            var id = Integer.parseInt(scanner.nextLine());

            var produtoRepository = new ProdutoRepository();
            if (produtoRepository.excluir(id)) {
                System.out.println("Produto excluído com sucesso!");

            }
            else {
                System.out.println("Nenhum produto encontrado. Tente novamente.");

            }
        }
        catch(Exception e) {
            System.out.println("\nERRO: " + e.getMessage());
        }
    }

    public void consultarProdutos() {

        try {

            System.out.println("\nConsulta de Produtos");

            var produtoRepository = new ProdutoRepository();
            var lista = produtoRepository.consultar();

            for(var produto : lista) {
                System.out.println("Id...........: " + produto.getId());
                System.out.println("Nome.........: " + produto.getNome());
                System.out.println("Preço........: " + produto.getPreco());
                System.out.println("Quantidade...: " + produto.getQuantidade());
                System.out.println("......");
            }

        }
        catch(Exception e) {
            System.out.println("\nERRO: " + e.getMessage());
        }
    }
}

























