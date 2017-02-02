/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package big_memento;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 *
 * @author maxime
 */
/**
 * @param <C> Type of executed commands
 * @param <S> Type of stored state (commands or mementos) 
 */
public abstract class AbstractConversation<C extends Command, S> implements Conversation<C> {

	protected final Stack<S> undos, redos;
	
	public AbstractConversation() {
		this.undos = new Stack<S>();
		this.redos = new Stack<S>();
	}

	@Override public String toString() {
		return String.format(
				"%s{undos:%s, redos:%s}", 
				getClass().getSimpleName(), 
				undos, 
				redos
		);
	}
        
        public class Stack<T> {
 
        //Delegate to avoid exposing too many Deque methods
        private final Deque<T> stack = new LinkedList<>();

        /**
         * @return null if stack is empty
         */
        public T pop() {
            return stack.pollLast(); //Not using pop since it throws NoSuchElementException if the deque is empty
        }

        public void push(T cmd) {
            stack.addLast(cmd);
        }

        public void clear() {
            stack.clear();
        }

        public void forEachFifo(Consumer<? super T> action) {
            stack.stream().forEachOrdered(action);
        }
    }
        
}