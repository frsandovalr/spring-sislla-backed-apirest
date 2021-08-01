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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;



@Entity
@Table(name="ssisleca_usuarios")
public class Usuario  extends BaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIOS_ID")
	@SequenceGenerator(name = "SEQ_USUARIOS_ID", allocationSize = 1, sequenceName = "SEQ_USUARIOS_ID")
	@Column(name = "NID_USUARIO")
	private Long id;
	
	@Column(name = "VUSUARIO_CODIGO", unique = true, length = 30, nullable = false)
	private String username;
	
	@Column(name = "VUSUARIO_CLAVE", length = 60)
	private String password;
	
	private Boolean enabled;
	

	@Column(name = "IDMILITAR", nullable = false)
	private Long cip;
	
	@Column(name = "VUSUARIO_DNI", length = 8)
	private String dni;
	
	@Column(name = "VUSUARIO_GRADO", length = 10)
	private String grado;
	
	@Column(name = "VUSUARIO_ARMA", length = 20)
	private String arma;
	
	@Column(name = "VUSUARIO_APENOM", length = 80)
	private String apellidosNombres;

	@Column(name = "VUSUARIO_CARGO", length = 90)
	private String cargo;
	
	
	@Column(name = "VUSUARIO_FOTO", length = 90)
	private String foto;
	
	
	
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name="vusuario_nucleo")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Nucleo nucleo;
	
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name="vusuario_actividad")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Brigada brigada;
	
	
	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name="vusuario_unidad")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Dependencia dependencia;
	
	
	@ManyToMany (fetch =FetchType.EAGER, cascade = CascadeType.MERGE)
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


	public Long getCip() {
		return cip;
	}

	public void setCip(Long cip) {
		this.cip = cip;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public String getApellidosNombres() {
		return apellidosNombres;
	}

	public void setApellidosNombres(String apellidosNombres) {
		this.apellidosNombres = apellidosNombres;
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}





	public Nucleo getNucleo() {
		return nucleo;
	}

	public void setNucleo(Nucleo nucleo) {
		this.nucleo = nucleo;
	}


	public Brigada getBrigada() {
		return brigada;
	}

	public void setBrigada(Brigada brigada) {
		this.brigada = brigada;
	}


	public Dependencia getDependencia() {
		return dependencia;
	}

	public void setDependencia(Dependencia dependencia) {
		this.dependencia = dependencia;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		
}
