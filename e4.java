import java.util.Random;
import java.util.Scanner;
public class e4
{
    public static void main(String args[])
    {
        String[] c = {"Heads","Tails"};
        int countHeads = 0;
        int countTails = 0;
        Random r = new Random();
	
	System.out.println("Who are you?");
	Scanner scan = new Scanner(System.in);
	String name = scan.next();
	System.out.println("Hello,"+name+"!");
   
	System.out.println("Tossing a coin...");
        for(int i = 1; i < 4; i++)
            {
                String coin = c[r.nextInt(2)];
                if(r.nextInt(2) == 0)countHeads++;
                else countTails++;
                System.out.println("Round"+i+":"+coin);
            }
        System.out.println("Heads:"+countHeads+",Tails:"+countTails);
	if(countHeads > countTails)System.out.println(name+" won!");
	else System.out.println(name+" lost");
    }
}


