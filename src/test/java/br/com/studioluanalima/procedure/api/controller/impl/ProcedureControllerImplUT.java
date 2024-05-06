package br.com.studioluanalima.procedure.api.controller.impl;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProcedureControllerImpl.class)
class ProcedureControllerImplUT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @SneakyThrows
    void shouldReturnStatusOK_whenRequestSuccessful() {
        this.mockMvc.perform(get("/api/v1/procedures"))
                .andExpect(status().isOk());
    }
}
