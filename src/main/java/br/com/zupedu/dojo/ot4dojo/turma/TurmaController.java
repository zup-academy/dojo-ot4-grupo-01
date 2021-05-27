package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/turmas")
@Transactional
public class TurmaController {

	@PersistenceContext
	private EntityManager manager;

	@PostMapping
    public ResponseEntity<TurmaResponse> criaTurma(@RequestBody @Valid TurmaRequest request,
									   UriComponentsBuilder builder) {

		Turma turma = request.toModel();
		manager.persist(turma);
		URI uri = builder.path("/turmas/{id}").build(turma.getId());
		return ResponseEntity.created(uri).body(new TurmaResponse(turma));
    }

}
