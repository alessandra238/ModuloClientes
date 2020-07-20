package pe.com.everis.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ClienteEmpresa")
public class ClienteEmpresa {

	@Id
	private String idEmpresa;
	
	private String nomEmpresa;
	private String telEmpresa;
	private String correoEmpresa;
	private String dirEmpresa;
	private String nomRepLegal;
	private String apeRepLegal;
	private String dniRepLegal;
	private String telRepLegar;
	private String correoRepLegal;
	
	public ClienteEmpresa() {
		
	}

	public ClienteEmpresa(String idEmpresa, String nomEmpresa, String telEmpresa, String correoEmpresa,
			String dirEmpresa, String nomRepLegal, String apeRepLegal, String dniRepLegal, String telRepLegar,
			String correoRepLegal) {
		super();
		this.idEmpresa = idEmpresa;
		this.nomEmpresa = nomEmpresa;
		this.telEmpresa = telEmpresa;
		this.correoEmpresa = correoEmpresa;
		this.dirEmpresa = dirEmpresa;
		this.nomRepLegal = nomRepLegal;
		this.apeRepLegal = apeRepLegal;
		this.dniRepLegal = dniRepLegal;
		this.telRepLegar = telRepLegar;
		this.correoRepLegal = correoRepLegal;
	}

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNomEmpresa() {
		return nomEmpresa;
	}

	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}

	public String getTelEmpresa() {
		return telEmpresa;
	}

	public void setTelEmpresa(String telEmpresa) {
		this.telEmpresa = telEmpresa;
	}

	public String getCorreoEmpresa() {
		return correoEmpresa;
	}

	public void setCorreoEmpresa(String correoEmpresa) {
		this.correoEmpresa = correoEmpresa;
	}

	public String getDirEmpresa() {
		return dirEmpresa;
	}

	public void setDirEmpresa(String dirEmpresa) {
		this.dirEmpresa = dirEmpresa;
	}

	public String getNomRepLegal() {
		return nomRepLegal;
	}

	public void setNomRepLegal(String nomRepLegal) {
		this.nomRepLegal = nomRepLegal;
	}

	public String getApeRepLegal() {
		return apeRepLegal;
	}

	public void setApeRepLegal(String apeRepLegal) {
		this.apeRepLegal = apeRepLegal;
	}

	public String getDniRepLegal() {
		return dniRepLegal;
	}

	public void setDniRepLegal(String dniRepLegal) {
		this.dniRepLegal = dniRepLegal;
	}

	public String getTelRepLegar() {
		return telRepLegar;
	}

	public void setTelRepLegar(String telRepLegar) {
		this.telRepLegar = telRepLegar;
	}

	public String getCorreoRepLegal() {
		return correoRepLegal;
	}

	public void setCorreoRepLegal(String correoRepLegal) {
		this.correoRepLegal = correoRepLegal;
	}
	
	
}
