package patterngateway;

 
 
import org.bson.Document;

import com.mongodb.ClientSessionOptions;
import com.mongodb.client.ClientSession;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
 
  
public class GatewayDao {
    private final MongoClient mongoClient;
    private final MongoDatabase database;
    private final MongoCollection<Document> colecaoUsuarios;
    private final MongoCollection<Document> colecaoLojas;
    private final MongoCollection<Document> colecaoEnderecos;
    private final MongoCollection<Document> colecaoCartoes;
    
    Cliente cliente = new Cliente();
    
    public GatewayDao(String codigo) {
        mongoClient = MongoClients.create("mongodb://localhost:27017");
        database = mongoClient.getDatabase("mydbGateway");
        colecaoUsuarios = database.getCollection("clientes");
        colecaoLojas = database.getCollection("lojas");
        colecaoEnderecos = database.getCollection("enderecos");
        colecaoCartoes = database.getCollection("creditcards");
        cliente.setCodigo(codigo);
    }
 
       public ClientSession getSession(ClientSessionOptions options) {
    	  return mongoClient.startSession(options);
    	}

    
    public void inserirGateway(Cliente cliente, Loja loja, Address address,   CreditCard cartao ) {
   
      
    	try {
     
    		 
           
            	 
    	Document docUsuario = new Document("codigo", cliente.getCodigo())
                            .append("nome", cliente.getName())
                            .append("email", cliente.getEmail())
                            .append("password", cliente.getPhone());
    
        colecaoUsuarios.insertOne(docUsuario);
             
        
        Document docLoja = new Document("idLoja", cliente.getCodigo() )
        		 .append("nomeloja", loja.getNomeLoja())
        		 .append("enderecoloja", loja.getEnderecoLoja())
        		 .append("produtos", loja.getProduct());
        colecaoLojas.insertOne(docLoja);
     
        Document docAddress = new Document("idAddress", cliente.getCodigo() )
       		 .append("street", address.getStreet())
       		 .append("number", address.getNumber())
       		 .append("city", address.getCity())
             .append("zipcode", address.getZipCode());
        
             
        colecaoEnderecos.insertOne(docAddress);
        
       Document docCreditCards = new Document("idCartao", cliente.getCodigo())
    		                        .append("numero", cartao.getNumero())
    		                        .append("holdername", cartao.getHolderName())
    		                        .append("expirationDate", cartao.getExpirationDate())
    		                        .append("cvv", cartao.getCvv())
    		                        .append("valorCompra", cartao.getValorCompra());
        colecaoCartoes.insertOne(docCreditCards);
    	 
    	}catch(Exception ex) {
    		ex.printStackTrace();
    	}
    }
}
