package com.defensoria.crudconceitoassistido.service;

import com.defensoria.crudconceitoassistido.dto.AssistidoDTO;
import com.defensoria.crudconceitoassistido.mapper.AssistidoMapper;
import com.defensoria.crudconceitoassistido.model.Assistido;
import com.defensoria.crudconceitoassistido.repository.AssistidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssistidoService {

    private AssistidoRepository assistidoRepository;

    @Autowired
    public AssistidoService(AssistidoRepository assistidoRepository ){
        this.assistidoRepository = assistidoRepository;
    }


    public List<Assistido> listaTodosAssistidos(){
        return this.assistidoRepository.findAll();
    }

    public Assistido criaOuAtualizaAssistido(Assistido assistido){
        //assistido.getEndereco().setAssistido(assistido);
        return this.assistidoRepository.save(assistido);
    }

    public void excluirAssistido(Long id){
        this.assistidoRepository.deleteById(id);
    }

}
