
//FIFO - first in first out, like a lunch line
public interface Queue<E>
{
	
	public void offer( E item);
	public E poll();
	public E peek();
	public boolean isEmpty();

}
