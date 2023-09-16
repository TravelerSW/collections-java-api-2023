package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    //atributos
    private long codigo;

    private String nome;

    private double preco;

    private int quantidade;

    public produto(long codigo, String nome, double preco, int quantidade){
        this.codigo = codigo;

        this.nome = nome;

        this.preco = preco;

        this.quantidade = quantidade;
    }

    public long getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }


    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode(){
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString(){
        return "Produto{código: " + codigo + ", nome: " + nome + ", preco: " + preco + ", quantidade: " + quantidade + "}";
    }

    @Override
    public int compareTo(Produto o) {
        // TODO Auto-generated method stub
        return 0;
    }

}   
class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        // TODO Auto-generated method stub
        return Double.Compare(p1.getPreco(), p2.getPreco());
    }

}                                                                                                                
