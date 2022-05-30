import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {
  ArrayList<Item> itens = new ArrayList<Item>();
  private Item i_1 = new Item();
  private Item i_2 = new Item();
  private Item i_3 = new Item();
  private Item i_4 = new Item();
  private Item i_5 = new Item();
  private Scanner ler = new Scanner(System.in);
  private int quant_itens;
  private int quant_de_mesmo_itens;
  private double valor_total_gasto = 0;
  
  
  public void setItensLista() {
	  itens.add(i_1);
	  itens.add(i_2);
	  itens.add(i_3);
	  itens.add(i_4);
	  itens.add(i_5);  
  }
  
  public void setInfoItens() {
	  
	  setItensLista();
	  
	  for(Item i: itens) 
	  {
		  quant_itens++; // quantidade de itens
		  System.out.println("Coloque a validade do item "+quant_itens);
		  i.setValidade(ler.nextLine()); // Setando validade
		  
		  if("Validade no prazo".equals(i.getValidade()))
		  { 
		  System.out.println("Coloque o nome do item");
		  i.setNomeItem(ler.nextLine());
		  System.out.println("Coloque o valor do item");
		  i.setVendaItem(ler.nextFloat());
		  valor_total_gasto += i.getValorVenda();
		  System.out.println("Coloque o nome do fornecedor, endereco, telefone e cnpj respectivamente.");
		  
		  while(ler.hasNextLine() == true) {
		     String cnpj = ler.nextLine();
		     i.setInfoFornecedor(ler.nextLine(),ler.nextLine(),ler.nextLine(),cnpj );
		     if(cnpj != ler.nextLine())
		     {
		    	 break;
		     }
		  }
		  
		  
		  }
		  else if("Validade fora do prazo".equals(i.getValidade()))
		  {
			  System.out.println(i.getValidade()+", logo esse item será removido do carrinho");
			  
		  }
		  else
		  {
			  System.out.println("Validade incoerente, item sendo removido do carrinho");
			  
		  }
		  
	  }
	  
	 
	 
  }
  
  public String getInfoItens() {
	  
	  for(Item i: itens)
	  {
		  System.out.println(i.getNomeItem()+i.getValorVenda());
	  }
	  return "O valor total da compra dos "+Integer.toString(quant_itens)+" itens listados foi: "+Double.toString(valor_total_gasto);
  }
  
 
 
}
