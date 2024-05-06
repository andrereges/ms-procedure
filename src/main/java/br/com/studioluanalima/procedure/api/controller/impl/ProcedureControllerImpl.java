package br.com.studioluanalima.procedure.api.controller.impl;

import br.com.studioluanalima.procedure.api.controller.ProcedureController;
import br.com.studioluanalima.procedure.api.controller.response.CategoryResponse;
import br.com.studioluanalima.procedure.api.controller.response.ProcedureResponse;
import br.com.studioluanalima.procedure.api.controller.response.UrlImageResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"api/v1/procedures"})
@RequiredArgsConstructor
@Slf4j
public class ProcedureControllerImpl implements ProcedureController {

    @Override
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProcedureResponse>> getAll() {
        log.info("ProcedureControllerImpl::getAll");

        return ResponseEntity.ok(getData());
    }

    private List<ProcedureResponse> getData() {
        return List.of(
                new ProcedureResponse(
                        "f8c3de3d-1fea-4d7c-a8b0-29f63c4c3698",
                        "Extensão de Cílios",
                        """
                                Extensão de cílios está em alta no mercado da beleza, trabalhamos com as\s
                                técnicas: Fio a Fio, Volume Brasileiro, Volume Egípcio, Volume Luxo e
                                Volume Kim Kardashian. O procedimento é feito no tempo de 2 horas, o processo é\s
                                indolor e não interfere no crescimento dos cílios naturais.
                            """,
                        "extensao-cilios",
                        List.of(
                                "Eleva a autoestima",
                                "Praticidade",
                                "Acordar sempre pronta"
                        ),
                        List.of(
                                "Pessoas alérgicas a produtos químicos ou maquiagem",
                                "Distúrbio da tireóide",
                                "Pessoas que tem ou teve glaucoma"
                        ),
                        List.of(
                                new UrlImageResponse("image/procedure/studio-luana-lima-cilios-600x400.jpeg")
                        ),
                        List.of(
                                new CategoryResponse(
                                        "f8c3de3d-1fea-4d7c-a8b0-29f63c4c3490",
                                        "Cílios"
                                )
                        )
                )
        );
    }
}
