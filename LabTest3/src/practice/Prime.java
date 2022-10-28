package practice;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int f=1;
           int i,j;
           for(i=101;i<=199;i+=2)//for loop
           {
        	   f=1;
        	   for(j=3;j<i;j++)
        	   {
        		   if(i%j==0)
        		   {
        			   f=0;
        			   break;
        		   }
        	   }
        	   if(f==1)
        	   {
        		   System.out.println(i);//print prime number
        		   f=1;
        	   }
           }
	}

}
