/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package original_pattern_test;

import original_pattern.Command;
import original_pattern.Underline_Invoker;
import original_pattern.Underline_OFF_ConcretCommand;
import original_pattern.Underline_ON_ConcretCommand;
import original_pattern.Underline_Receiver;

/**
 *
 * @author maxime
 */
public class Command_Test {
    public static void main(String[] args) {
        //commande : 
        Underline_Invoker control = new Underline_Invoker();
        Underline_Receiver light = new Underline_Receiver();
        Command lightsOn = new Underline_ON_ConcretCommand(light);
        Command lightsOff = new Underline_OFF_ConcretCommand(light);
        
        //switch on
        control.setCommand(lightsOn);
        control.pressButton();
        
        //switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}
