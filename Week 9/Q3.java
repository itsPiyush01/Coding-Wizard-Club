/*
Q3) Write an efficient program that takes integer as
input and convert a given integer into an equivalent
Roman numeral. (Check it in integer range 0 to 1000.)

Example-1:
Input: 5
Output: “V”

Example-2:
Input: 15
Output: “XV”

Example-3:
Input: 153
Output: “CLIII”


*/
public class Q3 {
    public static void main(String[] args) {
        System.out.println(intToRoman(5));    //"TEST CASE 1"
        System.out.println(intToRoman(15));   //"TEST CASE 2"
        System.out.println(intToRoman(153));  //  "TEST CASE 3"
 
    }
    public static String intToRoman(int num)
    {
        String[] thousands= {"","M","MM","MMM"};
        String[] hundreds={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens={"","X","XX","XL","L","LX","LXX","LXXX","XC"};
        String[] units={"","I","II","III","IV","V","VI","VII","VIII","IX"};

        return thousands[num/1000]+hundreds[(num%1000)/100]+tens[(num%100)/10]+units[num%10];
    }
}
