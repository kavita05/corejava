/* Write a Java program which would randomly generate a Housie Ticket. 
Here are the rules of generating the ticket:
a. There are 3 rows and 9 columns in the ticket. Columns from 1.. 9 has values from 1 to 90. 
In the first column the values of the number are from 1..10, second column 11..20 and so on.
b. Each column has max 2 cells filled in.
c. The numbers cannot be repeated in a column.
d. Each row has max 5 cells filled in, hence only 15 cells in all.
Each matrix represents one single ticket..*/



package SessionTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class HousieTicket18 {

	 static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    static int l,n1,n2,n3;
	    static int[] a,b;
	    public static void main(String[] args) throws IOException {
	    	input();
	        init();
	        random();
		}

		/*
		 * public static void main()throws IOException { input(); init(); random(); }
		 */
	    static void input()throws IOException
	    {
	        System.out.print("Enter the lower limit of lot numbers : ");
	        n1=Integer.parseInt(br.readLine());
	        System.out.print("\nEnter the upper limit of lot numbers : ");
	        n2=Integer.parseInt(br.readLine());
	        System.out.print("\nEnter no. of tickets : ");
	        n3=Integer.parseInt(br.readLine());
	        for(int i=0;;i++)
	        {
	            System.out.print("\nEnter the no. of lucky numbers in a ticket : ");
	            l=Integer.parseInt(br.readLine());
	            if(l>=((n2-n1)+1))
	            System.out.print("\nError (No. of lucky number cannot be more than limit)\n");
	            else
	            break;
	        }
	        a=new int[(n2-n1)+1];
	    }
	    static void init()
	    {
	        int i,c1=0;
	        for(i=n1;i<=n2;i++)
	        {
	            a[c1]=i;
	            c1++;
	        }
	    }
	    static void random()
	    {
	        Random r=new Random();
	        int i,j,k,c,c1=0;
	        for(i=1;i<=n3;i++)
	        {
	            b=new int[l];
	            for(j=0;j<l;j++)
	            {
	                c=r.nextInt(a.length);
	                if(a[c]!=-1)
	                {
	                    b[j]=a[c];
	                    a[c]=-1;
	                }
	                else
	                j--;
	            }
	            init();
	            System.out.print("\n\nTicket no. "+i+" : \n\n");
	            c1=0;
	            for(k=0;k<l;k++)
	            {
	                System.out.print(b[k]+"  ");
	                c1++;
	                if(c1==10)
	                {
	                    System.out.print("\n");
	                    c1=0;
	                }
	            }
	        }
	    }
	}