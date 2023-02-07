public class GmablerGame
{
    public static void main(String[] args) {
        int stake = 100;
        int goal = Integer.parseInt(args[1]);
        int trails = 100;

        int bets = 0;
        int wins = 0;

        int cash = 0;
        for (int t = 0; t < 100; t++) {
            cash = stake;
            int star = 0;

            while (cash > 0 && cash < goal) {
                bets++;
                while (star <= cash)
                {
                    star--;
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        if (cash == goal)
            wins++;
    }
        System.out.println("wins");
 }
}
