import java.util.Arrays;
import java.util.Scanner;

public class asx {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int k;
		System.out.println("Enter size of array");
		k=s.nextInt();
		int[] b=new int[k];
		System.out.println("Enter elements");
		for(int i=0;i<k;i++)
		{
			b[i]=s.nextInt();
		}
         Arrays.sort(b);
         String Num="";
 		for(int i=b.length-1;i>=0;i--)
         {
 			Num +=String.valueOf(b[i]);
         }
 		int res=Integer.parseInt(Num);
 		System.out.println("Largest number obtained from concatination of array elements is : "+res);
	}

}
