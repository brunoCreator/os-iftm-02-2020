package br.edu.iftm.os.logic;

import br.edu.iftm.os.model.OS;
import br.edu.iftm.os.repository.OSRepository;
import br.edu.iftm.os.util.Transacao;
import br.edu.iftm.os.util.exception.ErroNegocioException;
import br.edu.iftm.os.util.exception.ErroSistemaException;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;


public class OSLogic implements CrudLogic<OS>{

    @Inject
    private OSRepository repository;
    
    @Override
    @Transacao
    public OS salvar(OS entidade) throws ErroNegocioException, ErroSistemaException {
        if(entidade.getDataAbertura() == null) {
            entidade.setDataAbertura(new Date());
        }
        return this.repository.salvar(entidade);
    }

    @Override
    @Transacao
    public void deletar(OS entidade) throws ErroNegocioException, ErroSistemaException {
        this.repository.remover(entidade.getId());
    }

    @Override
    public OS buscarPorId(OS entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.buscarPorId(entidade.getId());
    }

    @Override
    public List<OS> buscar(OS entidade) throws ErroNegocioException, ErroSistemaException {
        return this.repository.listar();
    }
    
}
