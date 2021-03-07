package usuarios.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private static List <Usuario> usuarios= new ArrayList<Usuario>();
	
	private String nome;
	private String email;
	private String senha;
	private String perfil;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
	
	//obs, nesse metodo ocorre o seguinte
	//por ele ser estatico, ele vai pertencer a classe
	// e não aos objetos, ou seja, sempre que adicionarmos
	//um objeto a lista, ele não vai se perder ao se criar
	//um novo objeto. A impressao em seguida, é para demosntrar
	//que os objetos estão sendo salvos.
	public static void addUsuario(Usuario usuario) {
		usuarios.add(usuario);
		
		/*for (Usuario user : usuarios) {
			System.out.println(user);
			System.out.println();
		}*/
		
	}
	
	
	public static void imprimir() {
		
		
		for (Usuario user : usuarios) {
			System.out.println(user.nome);
			//System.out.println();
		}
		
	}
	
	
	
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", senha=" + senha + ", perfil=" + perfil + "]";
	}
	
	
	

}
