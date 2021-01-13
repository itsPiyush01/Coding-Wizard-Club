/*
 Q2 
 Write an efficient program that takes two strings as arguments and
 removes the characters from the first string, which are present in the second string

Example-1:
Input:
First String:"India is great"
Second String:“in"
Output: "da s great"

Example-2:
Input:
First String:"You do your work"
Second String: “you”
Output:“dr wrk”
 */


 public class Q2 {
     public static void main(String[] args) {
      
        String str1="India is great";
        String str2="in";
          
        replaceCharFromString(str1, str2);

        str1="You do your work";
        str2="you";
        replaceCharFromString(str1, str2);
    
    }
     public static void   replaceCharFromString(String str1,String str2) {

        for(int i=0;i<str2.length() && str1.length()!=0 ;i++)
        {
            str1=str1.replaceAll("(?i)"+str2.charAt(i), "");//case-insensitive mode ON    
      
        }
        System.out.println(str1);        


    }
 }