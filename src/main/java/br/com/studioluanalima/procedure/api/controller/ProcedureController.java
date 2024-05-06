package br.com.studioluanalima.procedure.api.controller;

import br.com.studioluanalima.procedure.api.controller.response.ProcedureResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Tag(name = "Procedure")
public interface ProcedureController {

    @Operation(summary = "Lista todos procedimentos")
    ResponseEntity<List<ProcedureResponse>> getAll();

}
