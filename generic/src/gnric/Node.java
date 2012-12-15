package gnric;

public class Node<E> implements IMonoLink<E> {

	private E data;
	private IMonoLink<E> next;
	Node(E data,IMonoLink<E> next)
	{
		data = data;
		next = next;
	}
	
	
	public void setData(E data)
	{
		this.data = data;
	}
	
	public E getData()
	{
		return data;
	}
	
	public void setNext(IMonoLink<E> next)
	{
		this.next  = next;
	}
	
	public IMonoLink<E> getNext()
	{
		return next;
	}
	

	public static void main(String[] args)
	{
		IMonoLink<String> node  = new  Node<String>("Bye",null);
		System.out.println("next " + node.getNext());
	}
}
