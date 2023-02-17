package patterngateway;

import java.util.List;

public class Loja {

	
	 private String idLoja;
	 private String nomeLoja;
	 private String enderecoLoja;
	 
	 
	 
	 public Loja(String idLoja, String nomeLoja, String enderecoLoja, List<Product> product) {
		super();
		this.idLoja = idLoja;
		this.nomeLoja = nomeLoja;
		this.enderecoLoja = enderecoLoja;
		this.product = product;
	}
	 
	 public Loja() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Loja [idLoja=" + idLoja + ", nomeLoja=" + nomeLoja + ", enderecoLoja=" + enderecoLoja + ", product="
				+ product + "]";
	}


	private List<Product> product;
	public String getIdLoja() {
		return idLoja;
	}
	public void setIdLoja(String idLoja) {
		this.idLoja = idLoja;
	}
	public String getNomeLoja() {
		return nomeLoja;
	}
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	public String getEnderecoLoja() {
		return enderecoLoja;
	}
	public void setEnderecoLoja(String enderecoLoja) {
		this.enderecoLoja = enderecoLoja;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	 
	 
}
