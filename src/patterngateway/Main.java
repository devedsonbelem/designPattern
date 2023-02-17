package patterngateway;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
  public static	List<Users> users = new ArrayList<Users>();
 static {
	  users.add(new Users("10","jose","jose@gmail.com","password@1"));
	  users.add(new Users("11","belem","belem@gmail.com","password@2"));
 }
  

	public static void main(String[] args) {

		 UserGateway userGateway = new UserGatewayImpl();
	     Users user = userGateway.authenticate("belem@gmail.com", "password@2");
	     

	      if (user != null) {
	  

	 
	      Cliente client = new Cliente("123","Edson Belem", "belem@teste.com", "(21) 99999-9999");
	      CreditCard creditCard = new CreditCard("123","1234 5678 9012 3456", "EDSON B EXEMPLO", "12/25", "123", 400.);
	      Address address = new Address("123","Rua A", "123", "Rio de Janeiro", "RJ", "01234-567");
	      List<Product> products = new ArrayList<Product>();
	      Product product1 = new Product("123", "camisa polo", 200., 1);
	      Product product2 = new Product("123", "calca jean", 200., 1);
	      products.add(product1);
	      products.add(product2);
	      Loja loja = new Loja ("123","loja um", "Rua A, Recreio dos Bandeirantes, Rio de Janeiro, RJ", products );
	      
	     PaymentGateway paymentGateway = new PaymentGatewayImpl();
	     
            paymentGateway.registerPayment(client, creditCard, address, loja);
            
             System.out.println();
	      }else {
	    	  System.out.println("Nao Gravado !!!");
	      }
	      
}
}