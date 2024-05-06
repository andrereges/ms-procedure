package br.com.studioluanalima.procedure.api.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record ProcedureResponse(
        String id,
        String name,
        String description,
        String slug,
        List<String> benefits,
        List<String> restrictions,
        @JsonProperty("url_images")
        List<UrlImageResponse> urlImages,
        List<CategoryResponse> categories
) {
}
