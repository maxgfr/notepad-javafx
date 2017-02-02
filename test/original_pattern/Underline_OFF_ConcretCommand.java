/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package original_pattern;


/**
 *
 * @author maxime
 */
public class Underline_OFF_ConcretCommand implements Command {
    
    Underline_Receiver under;

    public Underline_OFF_ConcretCommand (Underline_Receiver light){
      this.under = light;
    }
    public void execute(){
      under.switchOff();
    }
}

