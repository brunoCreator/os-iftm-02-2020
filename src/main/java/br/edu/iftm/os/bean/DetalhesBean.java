/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iftm.os.bean;

import br.edu.iftm.os.logic.DetalhesLogic;
import br.edu.iftm.os.model.Detalhes;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
@Getter @Setter
public class DetalhesBean extends CrudBean<Detalhes, DetalhesLogic>{

    @Inject
    private DetalhesLogic logic;
    
    @Override
    public void novo() {
        super.novo();
    }
    
    @Override
    public void editar(Detalhes entidade) {
        super.editar(entidade);
    }
    
    public DetalhesBean() {
        super(Detalhes.class);
    }

    @Override
    public DetalhesLogic getLogic() {
        return this.logic;
    }
    
}
