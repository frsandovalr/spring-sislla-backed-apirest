package ejercito.mil.pe.sislla.apirest.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
@Entity
@Table(name="ssisleca_usuarios")
public class Usuario  implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIOS_ID")
	@SequenceGenerator(name = "SEQ_USUARIOS_ID", allocationSize = 1, sequenceName = "SEQ_USUARIOS_ID")
	@Column(name = "NID_USUARIO")
	private Long id;
	
	@Column(name = "VUSUARIO_CODIGO", unique = true, length = 30)
	private String username;
	
	@Column(name = "VUSUARIO_APENOM", length = 80)
	private String apellidosNombres;
	
	@Column(name = "VUSUARIO_CLAVE", length = 60)
	private String password;
	
	private Boolean enabled;
	
	@ManyToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable (name="ssisleca_usuarios_roles", joinColumns = @JoinColumn(name="NID_USUARIO"), 
	    inverseJoinColumns = @JoinColumn(name="NID_ROLE"),
	    uniqueConstraints = {@UniqueConstraint(columnNames = {"NID_USUARIO","NID_ROLE"})})
	private List<Role> roles;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getApellidosNombres() {
		return apellidosNombres;
	}

	public void setApellidosNombres(String apellidosNombres) {
		this.apellidosNombres = apellidosNombres;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}






	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		
}
