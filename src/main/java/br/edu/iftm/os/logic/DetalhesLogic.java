package br.edu.iftm.os.logic;

import br.edu.iftm.os.model.Detalhes;
import br.edu.iftm.os.repository.DetalhesRepository;
import br.edu.iftm.os.util.Transacao;
import br.edu.iftm.os.util.exception.ErroNegocioException;
import br.edu.iftm.os.util.exception.ErroSistemaException;
import java.util.List;
import javax.inject.Inject;



public class DetalhesLogic implements CrudLogic<Detalhes>{

    @Inject
    private DetalhesRepository repository;
    
    @Override
    @Transacao
    public Detalhes salvar(Detalhes entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.salvar(entidade);
    }

    @Override
    @Transacao
    public void deletar(Detalhes entidade) throws ErroNegocioException, ErroSistemaException {
        this.repository.remover(entidade.getId());
    }

    @Override
    public Detalhes buscarPorId(Detalhes entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.buscarPorId(entidade.getId());
    }

    @Override
    public List<Detalhes> buscar(Detalhes entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.listar();
    }
    
}
