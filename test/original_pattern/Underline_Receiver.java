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
public class Underline_Receiver {
    private boolean on;
    
    public void switchOn(){
      on = true;
        System.out.println("model.Underline_Receiver.switchOn() MDR");
    }
    public void switchOff(){
      on = false;
              System.out.println("model.Underline_Receiver.switchOff() LOL");
    }
}
