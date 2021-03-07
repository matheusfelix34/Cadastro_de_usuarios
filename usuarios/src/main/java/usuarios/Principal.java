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
	System.out.println("TRY");
	
	Usuario usuario1 = new Usuario();
	usuario1.setEmail("joao@email.com");
	usuario1.setNome("Joao");
	usuario1.setSenha("123456");
	usuario1.setPerfil("ADMINISTRADOR");
	
	Usuario.addUsuario(usuario1);
	
	
	Usuario usuario2 = new Usuario();
	usuario1.setEmail("saulo@email.com");
	usuario1.setNome("Saulo");
	usuario1.setSenha("1234");
	usuario1.setPerfil("USUARIO");
	
	Usuario.addUsuario(usuario2);
	Usuario.imprimir();
}



}
