import java.util.Scanner;
public class Main{
    static void checkPw(String pw){
        boolean flag=true;
        int count=0;
        if(pw.length()<10)
            flag=false;
        for(char x : pw.toCharArray()){
            if(Character.isAlphabetic(x)==false && Character.isDigit(x)==false){
                flag=false;
                break;
            }
            if(Character.isDigit(x)==true)
                count+=1;
        }
        if(count<2){
                flag=false;
        }
    if(flag==false){
        System.out.println("Invalid Password");
        }
    else
        System.out.println("Valid Password");
    }
    
    public static void main(String [] args){
        System.out.println("Enter password: ");
        Scanner sc = new Scanner(System.in);
        String pw=sc.nextLine();
        checkPw(pw);
        sc.close();
    }
}