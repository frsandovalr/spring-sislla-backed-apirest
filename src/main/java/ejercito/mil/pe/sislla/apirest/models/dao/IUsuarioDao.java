package ejercito.mil.pe.sislla.apirest.models.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import ejercito.mil.pe.sislla.apirest.models.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);
	
	public Optional<Usuario> findById(Long id);
	
	
	
}
