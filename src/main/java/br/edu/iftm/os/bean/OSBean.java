package br.edu.iftm.os.bean;

import br.edu.iftm.os.logic.ClienteLogic;
import br.edu.iftm.os.logic.OSLogic;
import br.edu.iftm.os.logic.UsuarioLogic;
import br.edu.iftm.os.model.Cliente;
import br.edu.iftm.os.model.OS;
import br.edu.iftm.os.model.Usuario;
import br.edu.iftm.os.util.exception.ErroNegocioException;
import br.edu.iftm.os.util.exception.ErroSistemaException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
@Getter @Setter
public class OSBean extends CrudBean<OS, OSLogic>{

    @Inject
    private OSLogic logic;
    
    @Inject
    private ClienteLogic clienteLogic;
    
    public OSBean() {
        super(OS.class);
    }
    
    @Override
    public void novo() {
        super.novo();
    }

    @Override
    public void editar(OS entidade) {
        super.editar(entidade);
    }
    
    @Override
    public OSLogic getLogic() {
        return this.logic;
    }
    
    public List<Cliente> getClientes() throws ErroNegocioException {
        try {
            return clienteLogic.buscar(null);
        } catch (ErroSistemaException ex) {
            addMensagemErro(ex.getMessage());
            return new ArrayList<>();
        }
    }
    
}
