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
public interface Conversation<C extends Command> {

	void exec(C cmd);

	void undo();

	void redo();

}