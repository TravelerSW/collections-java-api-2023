package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos
    private Set<Produto>produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod,nome,preco,quantidade));
    }

    public Set<Produto>exibirProdutosPorNome(){
        Set<Produto>produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto>exibirProdutosPorPreco(){
        Set<Produto>produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;


    }

    public static void main(String[] args) {
        System.out.println("Teste");
    }

    // Exibindo todos os produtos no cadastro
    

}
