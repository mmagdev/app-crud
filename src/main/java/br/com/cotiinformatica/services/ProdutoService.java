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
}
