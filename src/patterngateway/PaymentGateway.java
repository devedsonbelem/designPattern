package patterngateway;

public interface PaymentGateway {
	 public boolean registerPayment(Cliente cliente, CreditCard  creditCard, Address  address, Loja loja);
}
