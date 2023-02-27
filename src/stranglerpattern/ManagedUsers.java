package stranglerpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ManagedUsers {

	public List<Optional<Users>> lista = new ArrayList<Optional<Users>>();

	

	public ManagedUsers() {
	  init();
    }
	
	
	public void init() {
		try {
			Users[] users = new Users[3];
			users[0] = new Users("edson", "edsonbelem@gmail.com", "123456").validate();
			users[1] = new Users("belem", "belem@gmail.com", "123456").validate();
			users[2] = new Users("lu", "lu@gmail.com", "123456").validate();
			lista.add(Optional.of(users[0]));
			lista.add(Optional.of(users[1]));
			lista.add(Optional.of(users[2]));
		} catch (Exception ex) {
			throw new IllegalArgumentException("Acesso Illegal ao Objeto");
		}
	}

	
	public void stream() {
		try {
			Users[] users = new Users[3];
			users[0] = new Users("edson", "edsonbelem@gmail.com", "123456").validate();
			users[1] = new Users("belem", "belem@gmail.com", "123456").validate();
			users[2] = new Users("lu", "lu@gmail.com", "123456").validate();
			Stream<Users> streans = Stream.of(users[0], users[1], users[2]);

			Stream.Builder<Users> streams = Stream.builder();
			streams.accept(users[0]);
			streams.accept(users[1]);
			streams.accept(users[2]);
			Stream<Users> streans1 = streams.build();

		} catch (Exception ex) {
			System.out.println("Error Invalido : " + ex.getMessage());
		}
	}

	public void add(Users users) throws Exception {
		Optional<Users> obj = Optional.of(users);
		if (obj.isPresent()) {
			lista.add(obj);
		} else {
			throw new Exception("Objeto Vazio");
		}

	}

	public List<Users> listagem() {
		return lista.stream().filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
	}

	public Users findByEmailByPassword(String email, String password) throws Exception{
		return this.listagem().stream().filter(x -> x.getEmail().equals(email) & x.getPassword().equals(password))
				.findAny().orElseThrow(() -> new IllegalArgumentException("Nao Encontrado Usuario"));
	}

	public static void main(String[] args) {
		try {
			ManagedUsers managed = new ManagedUsers();

			System.out.println(managed.listagem());

			Users u = managed.findByEmailByPassword("lu@gmail.com", "123456");

			System.out.println(u);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
