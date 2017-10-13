
public class Stacks {
	 static final int arraySize = 5;
	 int arr[] = new int[arraySize];
	 int top = -1;

	 public void push(int pushedElement) {
	  if (top < arraySize - 1) {
	   top++;
	   arr[top] = pushedElement;
	   System.out.println("Element " + pushedElement
	     + " is pushed to Stack !");
	   printElements();
	  } else {
	   System.out.println("Stack Overflow !");
	  }
	 }

	 public void pop() {
	  if (top >= 0) {
	   top--;
	   System.out.println("Pop operation done !");
	  } else {
	   System.out.println("Stack Underflow !");
	  }
	 }

	 public void printElements() {
	  if (top >= 0) {
	   System.out.println("Elements in stack :");
	   for (int i = 0; i <= top; i++) {
	    System.out.println(arr[i]);
	   }
	  }
	 }

	 public static void main(String[] args) {
	  Stacks stk = new Stacks();

	  stk.pop();
	  stk.push(23);
	  stk.push(2);
	  stk.push(73);
	  stk.push(21);
	  stk.pop();
	  stk.printElements();
	 
	 }
}

