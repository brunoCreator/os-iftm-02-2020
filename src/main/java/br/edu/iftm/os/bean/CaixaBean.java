/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iftm.os.bean;

import br.edu.iftm.os.logic.CaixaLogic;
import br.edu.iftm.os.model.Caixa;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
@Getter @Setter
public class CaixaBean extends CrudBean<Caixa, CaixaLogic>{

    @Inject
    private CaixaLogic logic;
    
    @Override
    public void novo() {
        super.novo();
    }
    
    @Override
    public void editar(Caixa entidade) {
        super.editar(entidade);
    }
    
    public CaixaBean() {
        super(Caixa.class);
    }

    @Override
    public CaixaLogic getLogic() {
        return this.logic;
    }
    
}
