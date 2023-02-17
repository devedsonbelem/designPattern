package arquivosequencial;

import java.io.FileWriter;

import patternproxy.Users;

public class MyFileWrite implements IFileWrite {

	private FileWriter writer;

	@Override
	public void openFileWrite() throws Exception {
		this.writer = new FileWriter("/home/edson/arquivos/arquivo.txt",true);
	}

	@Override
	public void FileWriteTxt(Users users) throws Exception {
		 this.writer.write(users.getCodigo()+";" + users.getNome() + ";" + users.getEmail()+";"+ users.getSenha()+"\n");
         this.writer.flush();
	}

	@Override
	public void closeFileWrite() throws Exception {
		 this.writer.close();

	}

}
