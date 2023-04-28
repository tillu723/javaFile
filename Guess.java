import java.util.*;

public class Guess {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int mynumber= (int)(Math.random()*100);
        int usernumber=0;
    do{
        System.out.println("guess my number((1-100)");
         usernumber=sc.nextInt();
        if(usernumber==mynumber){
            System.out.println("great........correct number");
            break;}
            else if(usernumber>mynumber){
                System.out.println("number is too large");

            }
            else{
                System.out.println("number is too small");
        }
        }while(usernumber>=0);
        System.out.println("my number was");
        System.out.println(mynumber);
    }
    }
   
    

