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
public class BeforeAfter {

	final Memento before, after;
	
	/**
	 * @param before must be immutable
	 * @param after  must be immutable
	 */
	public BeforeAfter(Memento before, Memento after) {
		this.before = before;
		this.after = after;
	}

	@Override public String toString() {
		return String.format("%s{before:%s, after:%s}", BeforeAfter.class.getSimpleName(), before, after);
	}
}
