package br.com.kvminformatica.reservas.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String nomeDaSala;
	private String andar;
	
	public Sala() {}
	
	public Sala(String nomeDaSala, String andar) {
		this.nomeDaSala = nomeDaSala;
		this.andar = andar;
	}
	
	public Sala(String id, String nomeDaSala, String andar) {
		this.id = id;
		this.nomeDaSala = nomeDaSala;
		this.andar = andar;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeDaSala() {
		return nomeDaSala;
	}
	public void setNomeDaSala(String nomeDaSala) {
		this.nomeDaSala = nomeDaSala;
	}
	public String getAndar() {
		return andar;
	}
	public void setAndar(String andar) {
		this.andar = andar;
	}
	
	@Override
	public String toString() {
		return "Sala [id=" + id + ", nomeDaSala=" + nomeDaSala + ", andar=" + andar + "]";
	}
}
