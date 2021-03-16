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
		//um dos motivos para usar o metodo de retorno e 
		///não uma saida direta no console, é devito a ideia de 
		//reuso, pois por exemplo: web poderia ser por uma saida de console?
		//não, por isso usamos essa saida que pode ser usada em mais de um meio
		return usuarios;
	}
	

}
