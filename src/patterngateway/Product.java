package patterngateway;

public class Product {

	private String idProduct;
	private String name;
	private Double price;
	private Integer quantidade;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Product(String idProduct, String name, Double price, Integer quantidade) {
		super();
		this.idProduct = idProduct;
		this.name = name;
		this.price = price;
		this.quantidade = quantidade;
	}




	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", name=" + name + ", price=" + price + ", quantidade=" + quantidade
				+ "]";
	}




	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
