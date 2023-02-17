package patterngateway;

public class CreditCard {

	private String idCartao;
	private String numero;
	private String holderName;
	private String expirationDate;
	private String cvv;
	private Double valorCompra;

	 

	public CreditCard(String idCartao, String numero, String holderName, String expirationDate, String cvv,
			Double valorCompra) {
		super();
		this.idCartao = idCartao;
		this.numero = numero;
		this.holderName = holderName;
		this.expirationDate = expirationDate;
		this.cvv = cvv;
		this.valorCompra = valorCompra;
	}

	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CreditCard [idCartao=" + idCartao + ", numero=" + numero + ", holderName=" + holderName
				+ ", expirationDate=" + expirationDate + ", cvv=" + cvv + ", valorCompra=" + valorCompra + "]";
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public String getIdCartao() {
		return idCartao;
	}

	public void setIdCartao(String idCartao) {
		this.idCartao = idCartao;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
