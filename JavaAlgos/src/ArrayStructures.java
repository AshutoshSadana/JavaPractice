

public class ArrayStructures {
	
	private int[] theArray = new int[50];
	private int arraySize = 10;
	public void generateRandomArray(){
		for (int i = 0; i < arraySize; i++) {
			theArray[i]=(int)(Math.random()*10)+10; //IMP random no. generation.(1-19 no.s)
		}
	}
	public void printArray(){
		System.out.println("----------");
		for (int i = 0; i < arraySize; i++) 
		 {
			System.out.print("| "+ i + " | ");
			System.out.println(theArray[i] + " |");
			System.out.println("----------");
		}
	}
	
	public int getValueAtIndex(int index){
		if(index<arraySize) return theArray[index];
		
		return 0;
	}
	// Returns true or false if a value is in the Array
	
		public boolean doesArrayContainThisValue(int searchValue){
			
			boolean valueInArray = false;
			
			for(int i = 0; i < arraySize; i++){
				
				if(theArray[i] == searchValue){
					
					valueInArray = true;
					
				}
				
			}
			
			return valueInArray;
			
		}
		
		
		// Delete Array row for the index and move elements up
		
		public void deleteIndex(int index){
			
			if(index < arraySize){
				
				// Overwrite the value for the supplied index
				// and then keep overwriting every index that follows
				// until you get to the last index in the array
				
				for(int i = index; i < (arraySize - 1); i++){
					
					theArray[i] = theArray[i+1];
			
				}
				
				arraySize--;
				
			}
			
		}
		
		public void insertValue(int value){
			
			if(arraySize < 50){
				
				theArray[arraySize] = value;
				
				arraySize++;
				
			}
			
		}
		// Linear Search : Every index must be looked at
		
		public String linearSearchForValue(int value){
			
			boolean valueInArray = false;
			
			String indexsWithValue = "";
				
			System.out.print("The Value was Found in the Following Indexes: ");
			
			for(int i = 0; i < arraySize; i++){
				
				if(theArray[i] == value) {
					valueInArray = true;
					
					System.out.print(i + " ");
					
					indexsWithValue+= i + " ";
				}
				
			}
			
			if(!valueInArray){
				indexsWithValue = "None";
				
				System.out.print(indexsWithValue);
			}
				
			System.out.println();
			
			return indexsWithValue;
				
		}
		//Bubble Sort
		public void bubbleSort()
		{
			for(int i=arraySize-1;i>1;i--)
			{
				for(int j=0;j<i;j++)
				{
					// The inner loop starts at the beginning of 
					// the array and compares each value next to each 
					// other. If the value is greater then they are 
					// swapped
					
					if(theArray[j]>theArray[j+1])
					{
						swapValues(j,j+1);
						System.out.println("\nBubble Sort : ");
						printArray();
					}
				}
			}
		}
		
		//swap function
		public void swapValues(int indexOne, int indexTwo){
			
			int temp = theArray[indexOne];
			theArray[indexOne] = theArray[indexTwo];
			theArray[indexTwo] = temp;
			
		}
		
		//Selection Sort
		public void selectionSort()
		{
			int x,y,min;
			for(x=0;x<arraySize;x++)
			{
				min=x;
				
				for(y=x;y<arraySize;y++)
				{
					if(theArray[min]>theArray[y])
					{
						min = y;
					}
				}
				swapValues(x,min);
				System.out.println("Selection sort :");
				printArray();
				
			}
			
		}
		// The Insertion Sort is normally the best of 
		// the elementary sorts. Unlike the other sorts that
		// had a group sorted at any given time, groups are
		// only partially sorted here.
		
		//CONTAINS NO SWAPPING!!
		public void insertionSort()
		{
			int i,j,toInsert;
			for(i=1;i<arraySize;i++)// Imp to note i=1
			{
				j=i; // creating the partition for sorted and unsorted array's. 
				
				toInsert=theArray[i]; // Intialising the value to be inserted. 
				while(j>0 && (theArray[j-1]>toInsert))
				{
					// this is to shift elements so that we can insert the 
					// value at its correct place.
					theArray[j]=theArray[j-1];
					j--;
				}
				theArray[j]=toInsert;//insertion at correct place after shifting.
				
				System.out.println("the Insertion sort :");
				printArray();
				
			}
		}
		
		
		// Binary Search 
		// The Binary Search is quicker than the linear search
		// because all the values are sorted. Because everything
		// is sorted once you get to a number larger than what
		// you are looking for you can stop the search. Also
		// you be able to start searching from the middle 
		// which speeds the search. It also works best when 
		// there are no duplicates
		public String binarySearch(int value){
			int lowIndex=0;
			int highIndex= arraySize-1;
			boolean valueInArray = false;
			String indexsWithValue = "";
			System.out.print("The Value was Found at: ");
			while(lowIndex<=highIndex)
			{
				int midIndex = (lowIndex + highIndex)/2;
				if(theArray[midIndex]==value)
				{
					System.out.println();
					indexsWithValue += midIndex;
					valueInArray=true;
					System.out.print(indexsWithValue);
					break;
				}
				if(theArray[midIndex]<value){
					lowIndex = midIndex+1;
				}
				else if(theArray[midIndex]>value)
				{
					highIndex=midIndex-1;
				}
			}
			if(lowIndex >highIndex && valueInArray==false)
			{
				System.out.println("value not found");
			}
			return indexsWithValue;
			
		}
		
	public static void main(String[] args) {
		
		ArrayStructures newArray = new ArrayStructures();
		
		newArray.generateRandomArray();
		
		//newArray.printArray();
		
		//System.out.println(newArray.getValueAtIndex(3));
		
		//System.out.println(newArray.doesArrayContainThisValue(18));
		
		//newArray.deleteIndex(4);
		
		//newArray.printArray();
		
		//newArray.insertValue(55);
		
		//newArray.printArray();
		
		//newArray.linearSearchForValue(17);
		
		//newArray.bubbleSort();
		
		//newArray.selectionSort();
		
		newArray.insertionSort();
		
		newArray.binarySearch(55);

	}
	
	
}
