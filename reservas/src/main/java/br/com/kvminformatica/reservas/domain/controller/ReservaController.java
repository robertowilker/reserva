package br.com.kvminformatica.reservas.domain.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kvminformatica.reservas.domain.dto.request.ReservaRequestPostDTO;
import br.com.kvminformatica.reservas.domain.dto.response.ReservaResponseDTO;
import br.com.kvminformatica.reservas.domain.service.ReservaService;

@RequestMapping("/reserva")
@RestController
public class ReservaController {

	@Autowired
	private ReservaService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<ReservaResponseDTO> getId(@PathVariable("id") String id){
		return new ResponseEntity<>(service.getReservaById(id), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<ReservaResponseDTO>> list(){
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<ReservaResponseDTO> save(@RequestBody @Valid ReservaRequestPostDTO request){
		return new ResponseEntity<>(service.post(request), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		service.delete(id);
	}
}
