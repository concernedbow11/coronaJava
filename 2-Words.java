import java.util.Scanner;

public class Main{
    public static void main(String args[])
    {
        String text;
        int countWords=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string: ");
        text=sc.nextLine();
        int len=text.length()-1;
        for(int i=0; i<len; i++)
        {
            if(text.charAt(i)==' ')
                countWords++;
        }
        sc.close();
        System.out.println("Total number of words in string are: "+ (countWords+1));                     
    }
}