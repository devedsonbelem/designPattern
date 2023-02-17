package arquivosequencial;

import patternproxy.Users;

public interface IFileWrite {

	 public void FileWriteTxt(Users users) throws Exception;
	 
	 public void openFileWrite() throws Exception;
	 
	 public void closeFileWrite() throws Exception;
}
