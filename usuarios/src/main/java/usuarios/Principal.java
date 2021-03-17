package usuarios;

import usuarios.model.Usuario;
import usuarios.persistencia.UsuarioDAO;

/*
 * Cadastro de usuarios  para um sitema.
 * Um usuario vai possuir nome, email e uma senha.
 * A senha deve ser cripitografada.
 * O sistema deve possuir autentificação que deve
 * ser feita por email e senha.
 * 
 * Model View Controller
 * 
 * 
 * Apenas o admim pode ver a lista de usuarios
 * 
 * 
 * Cadastro de usuarios MVC		
 * 
 * 
 * 
 * */
public class Principal {
	
	
public static void main(String[] args) {

	System.out.println("Usuarios Cadastrados");
	
	UsuarioDAO dao = new UsuarioDAO();
	
	Usuario usuario1 = new Usuario("Joao","joao@email.com","123456","ADMINISTRADOR");

	dao.save(usuario1);
	System.out.println("Adcionei Joao ");
	
for (Usuario user : dao.lista()) {
		user.setNome("joao1");
		System.out.println(user);
		

	}
	
	
	Usuario usuario2 = new Usuario("Saulo","saulo@email.com","1234");

	dao.save(usuario2);
	
	System.out.println("Adcionei Saulo ");
	
	for (Usuario user : dao.lista()) {
		
		System.out.println(user);
		

	}
	
}



}
