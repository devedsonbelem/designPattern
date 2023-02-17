package arquivosequencial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import patternproxy.Users;

public class MyFileReader  implements IFileReader{

	 private FileReader reader;
	 private BufferedReader bufferedReader;
	 private List <Users> lista;
	 private  Optional<Users> respPesquisa;
	 private  Optional<String> respEmail;
	 
	 public MyFileReader() {
		  if (this.lista!=null) {
		  this.lista.clear();
	  }else {
		  this.lista = new ArrayList<Users>();
	  }
     }


	@Override
	public void openFileReader() throws Exception {
		 this.reader= new FileReader("/home/edson/arquivos/users.txt");
		 this.bufferedReader = new BufferedReader(this.reader);
	}

	@Override
	public void closeFileReader() throws Exception {
        this.bufferedReader.close();
		this.reader.close();
	}

	@Override
	public List<Users> fileReaderTxt() throws Exception {
		
		String linha="";
		while ((linha = this.bufferedReader.readLine())!=null) {
		 String separa[] = linha.split(";");
		 Users users = new Users (new Integer(separa[0]),separa[1],separa[2],separa[3], new Integer(separa[4]));
		 this.lista.add(users);
		}
		return lista;
	}
	
	@Override
	public Boolean searchUsersActive(Users users)  {
	        if (lista.size()>=0) {
	       Integer ativo = lista.stream().filter(f-> f.getEmail().equals(users.getEmail())).map(y->y.getAtivo()).
	       		    	 findAny().orElseThrow(()-> new IllegalArgumentException("Dados Nao Validados !"));
	      
             if (ativo==1) {	         
	          return true;
             }
	        } 
		return false;
	}

	
	@Override
	public Optional<Users> searchFindByEmailAndFindBySenha(Users users)  {
	        if (lista.size()>=0) {
	       Users respUsers = lista.stream().filter(f-> f.getEmail().equals(users.getEmail()) &
	    		           f.getSenha().equals(users.getSenha() )).findAny().
	       		    	     orElseThrow(()-> new IllegalArgumentException(" Login Invalido !"));
	      
	         this.respPesquisa = Optional.of(respUsers);
	         return this.respPesquisa;
	        }else {
	        	throw new IllegalArgumentException("Nao Encontrado o Usuario na Lista");
	        }
		
	}
	
	
	

	@Override
	public Optional<String> searchFindByEmail(Users users)  {
		String emails = lista.stream().filter(f-> f.getEmail().equals(users.getEmail()) ).map(x->x.getEmail()).
				   findAny().orElse(null);
		  this.respEmail = Optional.of(emails);
		return respEmail;
	}


	@Override
	public Boolean searchPermissao(Users users)  {
        if (lista.size()>=0) {
	  Users respUsers = lista.stream().filter(f-> f.getCodigo().equals(users.getCodigo())).findAny().
		         orElseThrow(()-> new IllegalArgumentException("Codigo Nao Encontrado o Usuario !"));
		      
		       if (respUsers.getAtivo()==1) { 
		         return true;
		        }
			
		}
		return false;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		try {
			
			MyFileReader read = new MyFileReader();
			  read.openFileReader();
			  List<Users> resp = read.fileReaderTxt();
			  System.out.println(resp);
			  
			//  Users userSearch = new Users(1000);
			  
		 //   	Optional<Users> resposta =  read.searchCodeUsersExist(userSearch);
			  
			//    if (resposta.isPresent()) {
			//    	System.out.println("Dados Encontrado : " + resposta.get());
		//	    	
		//	    }else {
			//    	System.out.println("Usuario nao Encontrado");
			//    }
			    
			    
			 Optional<Users> respostaLogin = read.searchFindByEmailAndFindBySenha(new Users("luciana@gmail.com","senha@2"));
			 
			   if (respostaLogin.isPresent()) {
			    	System.out.println("Login Realizado :" +respostaLogin.get());
			    	
			    }else {
			    	System.out.println("Usuario nao Encontrado");
			    }
			 
			    
			  read.closeFileReader();
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
		
	}


}
