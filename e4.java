import java.util.Random;
public class e4
{
    public static void main(String args[])
    {
        String[] c = {"Heads","Tails"};
        int countHeads = 0;
        int countTails = 0;
        Random r = new Random();

      
	System.out.println("Tossing a coin...");
        for(int i = 1; i < 4; i++)
            {
                String coin = c[r.nextInt(2)];
                if(r.nextInt(2) == 0)countHeads++;
                else if(r.nextInt(2) == 1)countTails++;
                System.out.println("Round"+i+":"+coin);
            }
        System.out.println("Heads:"+countHeads+",Tails:"+countTails);
    }
}


