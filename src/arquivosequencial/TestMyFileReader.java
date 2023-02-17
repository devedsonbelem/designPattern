package arquivosequencial;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import patternproxy.Users;

public class TestMyFileReader {

	private static Users users = new Users(10, "edson belem", "profedsonbelem@gmail.com", "senha@1",1);
	
	private static MyFileReader read;
	private static List<Users> listaUsers;
	private static Optional<Users> resposta;
	private static List<String> emails;

	@BeforeAll
	public static void init() {
		try {
			read = new MyFileReader();
			read.openFileReader();
			listaUsers = read.fileReaderTxt();
			System.out.println(listaUsers);
           
		} catch (Exception ex) {
			throw new IllegalArgumentException("Error Encontrado");
		}
	}

	@Order(1)
	@DisplayName("Teste se a Lista está sendo Preenchida pelo Arquivo Txt")
	@Test
	public void test1_FindListaIsNotEmpty() {
		assertTrue(listaUsers.size() >= 0);
	}

	@Order(2)
	@DisplayName("Teste se O login com email e Senha  está sendo realizado")
	@Test
	public void test2_FindByMethodLoginExists() {
		try {
			resposta = read.searchFindByEmailAndFindBySenha(users);
			assertTrue(resposta.isPresent());
		} catch (Exception ex) {
			fail("Error method Login Inexistente ...");
		}

	}

	@Order(3)
	@DisplayName("Teste Se esta lendo o Arquivo Txt")
	@Test
	public void test3_readFileTxtIsSuccess() {
		try {
			 List<Users> resp =read.fileReaderTxt();
			assertTrue(resp.size()>0);
		} catch (Exception ex) {
			fail("Error method Login Inexistente ...");
		}

	}
	
	 @Order(4)
	 @DisplayName("Teste se a rotina  está Verificando se o email Existe")
	 @ParameterizedTest(name = "Email {0}")
     @ValueSource(strings ={"profedsonbelem@gmail.com", "luciana@gmail.com"})
     void test5_readListFindEmail(String email) {
		String emails = listaUsers.stream().filter(f-> f.getEmail().equals(email) ).map(x->x.getEmail()).
				   findAny().orElse(null);
		 assertTrue(emails !=null);
	 }
	  
	 
	 
	  @AfterAll
	    static void tearDownAll() {
		  try {
			  read.closeFileReader();
            }catch(Exception ex) {
			 System.out.println("Falha ao Fechar o Arquivo de Leitura");  
		  }
	    }
}
