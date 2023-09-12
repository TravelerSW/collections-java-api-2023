package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados{
  private Set<Convidado> convidadoSet;

  public ConjuntoConvidados(){
    this.convidadoSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite){
    convidadoSet.add(new Convidado(nome, codigoConvite));
  }
  public void removerConvidadoPorCodigoConvite(int codigoConvite){
    Convidado convidadoParaRemover = null;
    for(Convidado c: convidadoSet){
      if(c.getCodigoConvite() == codigoConvite){
        convidadoParaRemover = c;
        break;
      }
    }
    convidadoSet.remove(convidadoParaRemover);
  }

  public int contarConvidados(){
    return convidadoSet.size();
  }

  public void exibirConvidados(){
    System.out.println(convidadoSet);
  }

  public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    

    conjuntoConvidados.adicionarConvidado("Kevin", 123);
    conjuntoConvidados.adicionarConvidado("Ana", 121);
    conjuntoConvidados.adicionarConvidado("Kevin", 124);
    System.out.println("Existem : " +conjuntoConvidados.contarConvidados() + " convidados");

    conjuntoConvidados.removerConvidadoPorCodigoConvite(123);
    System.out.println("Existem : " +conjuntoConvidados.contarConvidados() + " convidados");

    conjuntoConvidados.exibirConvidados();
  }
}