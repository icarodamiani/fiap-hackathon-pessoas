package io.fiap.hackathon.pessoas.driven.domain.mapper;

import io.fiap.hackathon.pessoas.driven.domain.Documento;
import io.fiap.hackathon.pessoas.driver.controller.dto.DocumentoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentoMapper extends BaseMapper<DocumentoDTO, Documento> {
}
