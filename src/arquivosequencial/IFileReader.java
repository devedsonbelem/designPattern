package arquivosequencial;

import java.util.List;
import java.util.Optional;

import patternproxy.Users;
 
public interface IFileReader {
	 
	 public void openFileReader() throws Exception;
	 
	 public void closeFileReader() throws Exception;
	 
	 public List<Users> fileReaderTxt() throws Exception ;
	 
	 public Boolean searchUsersActive(Users users);
	 
	 public Optional<Users> searchFindByEmailAndFindBySenha(Users users) ;
	 
	 public Optional<String> searchFindByEmail(Users users) ;
	 
	 public Boolean searchPermissao(Users users) ;
}
