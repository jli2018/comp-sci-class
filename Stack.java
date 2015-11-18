
//FILO - first in last out, like a stack of paper
public interface Stack<E>
{
	//overides Linked list if a linked list is initialized as a stack - limits to just the methods below 

	public void push( E itme );
	//both return head
	public E pop();
	public E peek();
	public boolean isEmpty();
	
}
