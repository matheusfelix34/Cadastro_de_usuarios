package usuarios.persistencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import usuarios.model.Usuario;

public class UsuarioDAO {
	
	//private   List <Usuario> usuarios= new ArrayList<Usuario>();
	private   Map<String,Usuario> usuarios= new HashMap<String,Usuario>();

	//vamos usar o email como id no hashmap
	
	public  void save(Usuario usuario) {
		usuarios.put(usuario.getEmail(),usuario);
		
	}
	
	public List<Usuario> lista(){
		//um dos motivos para usar o metodo de retorno e 
		///não uma saida direta no console, é devito a ideia de 
		//reuso, pois por exemplo: web poderia ser por uma saida de console?
		//não, por isso usamos essa saida que pode ser usada em mais de um meio
		
		//no caso abaixo
		return new ArrayList(usuarios.values());
	}
	

}
