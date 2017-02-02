/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package big_memento;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

/**
 *
 * @author maxime
 */
public abstract class BaseCommandTest {

	protected Display display;
	
	//--------setup/teardown VVVVVVVVV
	@Before public void setup() {
		display = new Display();
		assertEquals("", display.displayed());//sanity check
	}
	
	@After public void teardown() {
		
	}
	//--------setup/teardown ^^^^^^^^^
	
}
