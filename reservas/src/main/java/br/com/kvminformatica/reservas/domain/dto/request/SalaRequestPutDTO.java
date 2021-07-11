package br.com.kvminformatica.reservas.domain.dto.request;

import javax.validation.constraints.NotEmpty;

public class SalaRequestPutDTO {

	private String id;
	@NotEmpty
	private String nomeDaSala;
	
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
}
