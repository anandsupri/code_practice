package universe;

import java.util.*;


public class Demo {

	
		
		public static void main(String[] args) throws Exception {
			//duplicate();
			 //swapping();
			 //stringReverse();
			 //palindrome();
			//fibonacci();
			//data_foreach();
			//Print_pyrmid();
			Dummy_function();
			
			

	}
		
		private static void Dummy_function() {
			int a=3,b=4,c;
			c=a+b+ a++ + b++ + ++a + ++b;
			System.out.println(c);
			
		}

		private static void Print_pyrmid() {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the number...");
			int number=scanner.nextInt();
			int j,i;
			for(i=0;i<number;i++)
			{
				for(j=0;j<number;j++);
				{
					
				}
					
			}
			
		}

		private static void data_foreach() {
			List<Integer> list=Arrays.asList(4,3,5,6,7,1);
			System.out.println("Streams");
			//list.forEach(i-> doubleit(i));
			list.forEach(Demo::doubleit);
			
		}

		private static void doubleit(Integer i) {
			System.out.println(i*2);
		}

		private static void fibonacci() {
			int a=0,b=1,c=1;
			System.out.println("fibanacci series");
			for(int i=1;i<10;i++)
			{
				a=b;
				b=c;
				c=a+b;
				System.out.print(c+" ");
				
			}
			
		}

		private static void palindrome() {
			StringBuilder str=new StringBuilder("1234321");
			if(str.toString().equals(str.reverse().toString()))
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("Not a palindrome");
			}
		}

		private static void stringReverse() {
			StringBuilder str=new StringBuilder("String Reverse");
			System.out.println(" Reverse String "+str.reverse());
			}

		private static void duplicate() {
			int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3}; 
			
	        System.out.println("Duplicate elements in given array: ");  
	        //Searches for duplicate element  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] != arr[j])  
	                	{  
	                	System.out.println(arr[i]);
	                	System.exit(0);
	                	}    
	            }  
	            
	        }  
			
		}

		public static void swapping()
		{
			int i=12,j=10;
			i+=j;
			j=i-j;
			i-=j;
			System.out.println(i+" swapped values "+j);
		}

}
