package com.defensoria.crudconceitoassistido.mapper;

import com.defensoria.crudconceitoassistido.dto.AssistidoDTO;
import com.defensoria.crudconceitoassistido.model.Assistido;
import com.defensoria.crudconceitoassistido.model.Contato;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AssistidoMapper {

    public Assistido mapToModel(AssistidoDTO dto){
        if(Objects.isNull(dto)){
            return null;
        }
        Assistido assistido = new Assistido();
        assistido.setCpfCnpj(dto.getCpfCnpj());
        assistido.setNome(dto.getNome());
       // assistido.setContatos();
        return assistido;
    }

    private Contato mapToContato(){
        return null;
    }
}
