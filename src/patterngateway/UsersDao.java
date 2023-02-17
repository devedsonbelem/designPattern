package patterngateway;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

 

	public class UsersDao {

	    private final MongoClient mongoClient;
	    private final MongoDatabase database;
	    private final MongoCollection<Document> colecaoUsuarios;
	    Users users = new Users();
	    public UsersDao() {
	        mongoClient = MongoClients.create("mongodb://localhost:27017");
	        database = mongoClient.getDatabase("bdgateway");
	        colecaoUsuarios = database.getCollection("users");
	        users.setCodigo(UUID.randomUUID().toString());
	    }

	    public void inserirUsuario(Users usuario) {
	        Document docUsuario = new Document("codigo", users.getCodigo())
	                            .append("nome", usuario.getNome())
	                            .append("email", usuario.getEmail())
	                            .append("password", usuario.getPassword());
	        colecaoUsuarios.insertOne(docUsuario);
	    }
	    

	    public void atualizarUsuario(Users usuario) {
	        Document filtro = new Document("codigo", usuario.getCodigo());
	        Document docUsuario = new Document("$set", new Document("nome", usuario.getNome())
	                                                  .append("email", usuario.getEmail())
	                                                  .append("password", usuario.getPassword()));
	        colecaoUsuarios.updateOne(filtro, docUsuario);
	    }

	    public void removerUsuario(String codigo) {
	        Document filtro = new Document("codigo", codigo);
	        colecaoUsuarios.deleteOne(filtro);
	    }

	    public Users obterUsuario(String codigo) {
	        Document filtro = new Document("codigo", codigo);
	        Document docUsuario = colecaoUsuarios.find(filtro).first();
	        if (docUsuario != null) {
	            return new Users(docUsuario.getString("codigo"),
	                                docUsuario.getString("nome"),
	                                docUsuario.getString("email"),
	                                docUsuario.getString("password"));
	        } else {
	            return null;
	        }
	    }

	    public List<Users> obterTodosUsuarios() {
	        List<Users> usuarios = new ArrayList<>();
	        for (Document docUsuario : colecaoUsuarios.find()) {
	            usuarios.add(new Users(docUsuario.getString("codigo"),
	                                      docUsuario.getString("nome"),
	                                      docUsuario.getString("email"),
	                                      docUsuario.getString("password")));
	        }
	        return usuarios;
	    }

	    
	    public void fecharConexao() {
	        mongoClient.close();
	    }
 
}
