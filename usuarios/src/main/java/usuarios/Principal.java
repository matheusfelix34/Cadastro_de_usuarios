package usuarios;

import usuarios.model.Usuario;

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
 * 
 * 
 * T
 * */
public class Principal {
	
	
public static void main(String[] args) {

	
	Usuario usuario1 = new Usuario("Joao","joao@email.com","123456","ADMINISTRADOR");

	usuario1.save();
	
	
	
	Usuario usuario2 = new Usuario("Saulo","saulo@email.com","1234");

	usuario2.save();
	
}



}
