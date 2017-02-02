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
public class Underline_Invoker {
    
    private Command command;
    public void setCommand(Command command){
      this.command = command;
    }
    public void pressButton(){
      command.execute();
    }
    
}
