package io.fiap.hackathon.pessoas.driven.domain.mapper;

import io.fiap.hackathon.pessoas.driven.domain.Pessoa;
import io.fiap.hackathon.pessoas.driver.controller.dto.PessoaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {DocumentoMapper.class})
public interface PessoaMapper extends BaseMapper<PessoaDTO, Pessoa> {
}
