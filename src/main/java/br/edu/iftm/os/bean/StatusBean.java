/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iftm.os.bean;

import br.edu.iftm.os.logic.StatusLogic;
import br.edu.iftm.os.model.Status;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@SessionScoped
@Getter @Setter
public class StatusBean extends CrudBean<Status, StatusLogic>{

    @Inject
    private StatusLogic logic;
    
    public StatusBean() {
        super(Status.class);
    }
    
    @Override
    public StatusLogic getLogic() {
        return this.logic;
    }
  
}
