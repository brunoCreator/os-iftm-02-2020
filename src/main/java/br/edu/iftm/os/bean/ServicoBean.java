package br.edu.iftm.os.bean;

import br.edu.iftm.os.logic.ClienteLogic;
import br.edu.iftm.os.logic.ServicoLogic;
import br.edu.iftm.os.model.Cliente;
import br.edu.iftm.os.model.Servico;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;


@Named
@SessionScoped
@Getter @Setter
public class ServicoBean extends CrudBean<Servico, ServicoLogic> {

    @Inject
    private ServicoLogic logic;
    
    public ServicoBean() {
        super(Servico.class);
    }
        
    @Override
    public ServicoLogic getLogic() {
        return this.logic;
    }
}
