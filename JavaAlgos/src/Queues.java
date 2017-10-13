
public class Queues {
	 private static final int arraySize = 3;
	 int arr[] = new int[arraySize];
	 int size = 0;
	 int top = -1;
	 int rear = 0;

	 public void push(int pushedElement) {
	  if (top < arraySize - 1) {
	   top++;
	   arr[top] = pushedElement;
	   System.out.println("Element " + pushedElement
	     + " is pushed to Queue !");
	   display();
	  } else {
	   System.out.println("Overflow !");
	  }

	 }

	 public void pop() {
	  if (top >= rear) {
	   rear++;
	   System.out.println("Pop operation done !");
	   display();
	  } else {
	   System.out.println("Underflow !");
	  }
	 }

	 public void display() {
	  if (top >= rear) {
	   System.out.println("Elements in Queue : ");
	   for (int i = rear; i <= top; i++) {
	    System.out.println(arr[i]);
	   }
	  }
	 }

	 public static void main(String[] args) {
	  Queues que = new Queues();
	  que.pop();
	  que.push(23);
	  que.push(2);
	  que.push(73);
	  que.push(21);
	  que.pop();
	  que.pop();
	  que.pop();
	  que.pop();
	 }
}
