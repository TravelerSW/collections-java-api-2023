package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas{
  private List<Pessoa>pessoaList;

  public OrdenacaoPessoas(){
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade(){
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
    ordenacaoPessoas.adicionarPessoa("Kevin", 21, 1.75);
    ordenacaoPessoas.adicionarPessoa("Ana", 22, 1.54);
    ordenacaoPessoas.adicionarPessoa("Eliane", 65, 1.58);

    System.out.println(ordenacaoPessoas.ordenarPorIdade());

  }
}