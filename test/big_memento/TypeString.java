/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package big_memento;

import java.util.List;


/**
 *
 * @author maxime
 */
public class TypeString implements MementoableCommand {

	private final Display display;
	private final String stringToType;
	
	public TypeString(Display display, String stringToType) {
		this.display = display;
		this.stringToType = stringToType;
	}

	@Override public void execute() {
		display.append(stringToType);
	}


	@Override public Memento takeSnapshot() {
		final List<String> snapshot =  display.getState();//snapshot is a defensive copy
		return () -> display.setState(snapshot);
	}
	
	@Override public String toString() {
		return String.format("%s{stringToType:%s}", TypeString.class.getSimpleName(), stringToType);
	}  
	
}