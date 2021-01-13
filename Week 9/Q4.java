/*
Q4. write a program where each column represents
same number according to given example:
Example-1:
Input: 5
Output:
   1
  212
 32123
  212
   1

Example-2:
Input: 7
Output:
     1
    212
   32123
  4321234
   32123
    212
     1

*/



public class Q4 
{
	public static void main(String[] args) 
	{
        
        patternDisplay(5);//TEST CASE 1
        System.out.println("--------------");
        patternDisplay(7);//TEST CASE 2

    
    }
    public static void patternDisplay(int num)
    {
        int space =num/2, digit=1; 
        for (int i=1;i<=num;i++) 
        { 
          for (int j=1;j<=space;j++) 
                System.out.print(" "); 
               int count=digit/2+1; 
            for (int k=1;k<=digit;k++) 
            { 
                System.out.print(count); 
                if(k<=digit/2) 
                    count--; 
                else
                    count++; 
            } 
            System.out.println(); 
            if (i<=num/2) 
            { 
                space = space-1; 
                digit=digit + 2; 
            } 
           else 
           { 
                space = space + 1; 
                digit=digit-2; 
            }
        }
    }
}
