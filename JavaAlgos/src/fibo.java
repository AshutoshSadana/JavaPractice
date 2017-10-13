
public class fibo {
int num =5;
	
	 int fib(int n)
	    {
	        if(n==1)
	        return 0;
	        else if(n==2)
	        return 1;
	        else
	        return(fib(n-1)+fib(n-2));
	    }

public static void main(String[] args) {

	fibo obj = new fibo();
	for(int i = 1;i<=obj.num;i++)
	    {
	        System.out.println("\n the series is"+obj.fib(i)+"\n");
	    }
}
	   

}
