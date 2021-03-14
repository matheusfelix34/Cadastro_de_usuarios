package usuarios.persistencia;

import java.util.ArrayList;
import java.util.List;

import usuarios.model.Usuario;

public class UsuarioDAO {
	
	private   List <Usuario> usuarios= new ArrayList<Usuario>();
	
	public  void save(Usuario usuario) {
		usuarios.add(usuario);
		
	}
	
	public List<Usuario> Lista(){
		
		return usuarios;
	}
	

}
