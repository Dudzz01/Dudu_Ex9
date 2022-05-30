
public class Item {
private String nome;
private double valor_compra;
private String data_validade;
private String nome_forcenedor;
private String endereco_fornecedor;
private String telefone_fornecedor;
private String cnpj_fornecedor;

public void setNomeItem(String nome) {
	this.nome = nome;
}

public String getNomeItem() {
	return nome;
}

public void setVendaItem(double vlr_compra) {
	this.valor_compra = vlr_compra*1.3;
	
}

public double getValorVenda() {
	return valor_compra;
}

public void setInfoFornecedor(String nome_forn, String endereco_forn, String telefone_forn, String cnpj_forn) {
	        this.nome_forcenedor = nome_forn;
	        this.endereco_fornecedor = endereco_forn;
	        this.telefone_fornecedor = telefone_forn;
	        this.cnpj_fornecedor = cnpj_forn;
}

public String getInfoNomeFornecedor() {
	
	   return this.nome_forcenedor;
}

public String getInfoEndeFornecedor() {
	
	   return this.endereco_fornecedor;
}
public String getInfoTeleFornecedor() {
	
	  return this.telefone_fornecedor;
}
public String getInfoCnpjFornecedor() {
	
	   return this.cnpj_fornecedor;
}

public void setValidade(String validade) {
	this.data_validade = validade;
	
}

public String getValidade() {
	return data_validade;
}
}
