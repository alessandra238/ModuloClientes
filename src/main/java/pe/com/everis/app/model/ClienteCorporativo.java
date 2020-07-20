package pe.com.everis.app.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ClienteCorporativo")
public class ClienteCorporativo {

	@Id
	private String idCorporativo;
	
	private String nomCorporativo;
	private String telCorporativo;
	private String correoCorporativo;
	private String dirCorporativo;
	private List<RepresentantesCorporativo> repCorporativo;
	
	public ClienteCorporativo() {
		
	}

	
	
	public ClienteCorporativo(String idCorporativo, String nomCorporativo, String telCorporativo,
			String correoCorporativo, String dirCorporativo, List<RepresentantesCorporativo> repCorporativo) {
		super();
		this.idCorporativo = idCorporativo;
		this.nomCorporativo = nomCorporativo;
		this.telCorporativo = telCorporativo;
		this.correoCorporativo = correoCorporativo;
		this.dirCorporativo = dirCorporativo;
		this.repCorporativo = repCorporativo;
	}



	public String getIdCorporativo() {
		return idCorporativo;
	}

	public void setIdCorporativo(String idCorporativo) {
		this.idCorporativo = idCorporativo;
	}

	public String getNomCorporativo() {
		return nomCorporativo;
	}

	public void setNomCorporativo(String nomCorporativo) {
		this.nomCorporativo = nomCorporativo;
	}

	public String getTelCorporativo() {
		return telCorporativo;
	}

	public void setTelCorporativo(String telCorporativo) {
		this.telCorporativo = telCorporativo;
	}

	public String getCorreoCorporativo() {
		return correoCorporativo;
	}

	public void setCorreoCorporativo(String correoCorporativo) {
		this.correoCorporativo = correoCorporativo;
	}

	public String getDirCorporativo() {
		return dirCorporativo;
	}

	public void setDirCorporativo(String dirCorporativo) {
		this.dirCorporativo = dirCorporativo;
	}

	public List<RepresentantesCorporativo> getRepCorporativo() {
		return repCorporativo;
	}

	public void setRepCorporativo(List<RepresentantesCorporativo> repCorporativo) {
		this.repCorporativo = repCorporativo;
	}
	
	
}
