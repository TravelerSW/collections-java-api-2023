package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros{
  private List<Livro>livroList;

  public CatalogoLivros(){
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor){
    List<Livro> livrosPorAutor = new ArrayList<>();
    if(!livroList.isEmpty()){
      for(Livro l : livroList){
        if(l.getAutor().equalsIgnoreCase(autor)){
          livrosPorAutor.add(l);
        }
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if(!livroList.isEmpty()){
      for(Livro l: livroList){
        if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
          livrosPorIntervaloAnos.add(l);
        }
      }
    }
    return livrosPorIntervaloAnos;
  }
  
  public Livro pesquisarPorTitulo(String titulo){
    Livro livroPorTitulo = null;
    if(!livroList.isEmpty()){
      for(Livro l: livroList){
        if(l.getTitulo().equalsIgnoreCase(titulo)){
          livroPorTitulo = l;
          break;
        }
      }
    }
    return livroPorTitulo;
  }

  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    catalogoLivros.adicionarLivro("Dopamina", "dopa", 2021);
    catalogoLivros.adicionarLivro("Dopamina", "sero", 2022);
    catalogoLivros.adicionarLivro("noradrenalina", "oci", 2023);
    catalogoLivros.adicionarLivro("Ocitocina", "oci", 2024);
    catalogoLivros.adicionarLivro("melatonina", "mela", 2025);

    System.out.println(catalogoLivros.pesquisarPorTitulo("Dopamina"));

  }
}