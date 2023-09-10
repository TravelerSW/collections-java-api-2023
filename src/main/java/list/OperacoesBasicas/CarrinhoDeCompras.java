package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras{
  private List<Item>itemList;

  public CarrinhoDeCompras(){
    this.itemList = new ArrayList<>();
  }
  
  public void adicionarItem(String nome, double preco, int quantidade){
    Item item = new Item(nome, preco, quantidade);
    itemList.add(item);
  }

  public void removerItem(String nome){
    List<Item>itensParaRemover = new ArrayList<>();
    for(Item i: itensParaRemover){
      if(i.getNome().equalsIgnoreCase(nome)){
        itensParaRemover.add(i);
      }
    }
    itemList.removeAll(itensParaRemover);
  }

  public double calcularValorTotal(){
    double valorTotal = 0d;
    if(!itemList.isEmpty()){
      for(Item item : itemList){
        double valorItem = item.getPreco() * item.getQuantidade();
        valorTotal += valorItem;
      }
    }
    return valorTotal;
  }
  public void exibirItens(){
    if(!itemList.isEmpty()){
      System.out.println(this.itemList);
    }
    else{
      System.out.println("A lista está vazia.");
    }
    
  }
  
  

  public static void main(String[] args) {
    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    carrinhoDeCompras.adicionarItem("frango", 22.00d, 2);
    carrinhoDeCompras.adicionarItem("Feiajo", 12d, 2);
    carrinhoDeCompras.adicionarItem("Agua", 7d, 3);

    carrinhoDeCompras.calcularValorTotal();
    
    carrinhoDeCompras.exibirItens();
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    
  }
}