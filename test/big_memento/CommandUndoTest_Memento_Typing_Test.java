/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package big_memento;

/**
 *
 * @author maxime
 */
public class CommandUndoTest_Memento_Typing_Test extends CommandUndoTest_Typing<MementoableCommand> {

	@Override protected Conversation<MementoableCommand> newConversation() {
		return new MementoConversation();
	}

	@Override protected MementoableCommand typeString(String stringToType) {
		return new TypeString(display, stringToType);
	}

}
