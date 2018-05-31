package linkedlist;

/*
 *
 * check palindrome
 * 
 */
public class Problem13 
{
	static int length (LinkList l)
	{
		 if(l==null)
			 return 0;
		 int count=0;
		 LinkList l1=l;
		 while(l1!=null)
		 {
			 l1=l1.getNext();
			 count++;
		 }
		 return count;
	}
	public static void main(String[] args) 
	{
			
		LinkList l=new LinkList(1);
		l.setNext(new LinkList(2));
		l.getNext().setNext(new LinkList(3));
		l.getNext().getNext().setNext(new LinkList(2));
		l.getNext().getNext().getNext().setNext(new LinkList(1));
		l.getNext().getNext().getNext().getNext().setNext(new LinkList(6));
		System.out.println("Length of the linklist = "+length(l));
	}
}
