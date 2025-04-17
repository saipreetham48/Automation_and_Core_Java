package collectionsDemo;

import java.util.*;

public class QueueDemo {
	/*	
	 * Queue is a interface in java which follows FIFO(first in first out) principle.
	 * PriorityQueue is the pure implementation of queue.Based on priority we are taking out.
	 * priorityqueue internally creates array with size 11
	 * insertion in tail and deletion in head
	 * we have head at 0 index and tail at last index
	 * highest priority elemnt will point to HEAD and remaing elements in random order.
	 * Highest priority:Lowest integer has the highest priority.
	 * ArrayDeque is the implementation of both deque and queue
	 * arraydeque internall implements arrays and default size is 17
	 * we can insert and deletion both in head and tail
	 * 
	 * Both linkedlist and arraydeque are double ended queues also we can use them as single linked queue  as well
	*/
	public static void main(String[] args) {
		//Priorityqueue
		//Queue<Integer> pq =new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq =new PriorityQueue<Integer>();
		//add,offer--both are used for adding elements in queue
		pq.add(45);
		pq.add(7);
		pq.offer(8);
		pq.add(4);
		pq.offer(3);
		//System.out.println(pq);
		
		//peek-for retrieval.we can retrieve only head element(highest priority element)
		//System.out.println(pq.peek());//returns head but not removed
		
		//poll,remove-to remove the element present in head.but if we have empty queue then poll will return null and remove returns exception
		//System.out.println(pq.poll());//poll returns head and remove head element
		
		//System.out.println(pq.contains(8));
		
		//dont use for each while using priorityqueue because we wont get the elements in priority order
		
//		while (!pq.isEmpty()) {
//			System.out.println(pq.poll());
//			
//		}
		
		//pq.clear();
		//if we want to give highest priority to the highest element then
		//PriorityQueue<Integer> pq1 =new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		//Arraydeque
		//Deque<String> ad=new ArrayDeque<String>();

		//Queque<String> ad=new ArrayDeque<String>();

		ArrayDeque<String> ad=new ArrayDeque<String>();//follows insertion order
		ad.add("Sai");
		ad.add("sujith");
		ad.offer("simha");
		ad.offerFirst("hh");
		ad.offerLast("sd");
		ad.addFirst("bd");
		ad.addLast("gf");
		System.out.println(ad);//bd,hh,sai,sujith,simha,sd,gf
		//System.out.println(ad.peek());//bd
		//System.out.println(ad.peekFirst());//bd
		//System.out.println(ad.peekLast());//gf
		
//		System.out.println(ad.poll());//bd
//		System.out.println(ad);//hh,sai,sujith,simha,sd,gf
//		System.out.println(ad.pollFirst());//hh
//		System.out.println(ad);//sai,sujith,simha,sd,gf
//		System.out.println(ad.pollLast());//gf
//		System.out.println(ad);//sai,sujith,simha,sd
		
		//ad.clear();
		LinkedList<Integer> ll=new LinkedList<Integer>();//double ended queue
		//same methods in linkedlist and also array deque
	}

}
