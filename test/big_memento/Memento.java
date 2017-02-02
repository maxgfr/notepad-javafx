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
/**
* Implementations must be immutable (the memento must capture a snapshot)
*/
@FunctionalInterface
public interface Memento {
	void restore();
}
