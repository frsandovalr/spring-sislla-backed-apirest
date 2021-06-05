package ejercito.mil.pe.sislla.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ejercito.mil.pe.sislla.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);
	
	@Query ("select u from Usuario u where u.apellidosNombres =?1")
	public Usuario findByapellidosNombres(String apellidosNombres);

}
