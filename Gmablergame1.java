public class Gmablergame1
{
    public void main (String[] args) {
        int stake = 100;
        int goal = Integer.parseInt(args[1]);
        int trails = 100;

        int bets = 0;
        int wins = 0;

        for (int t = 0; t < 100; t++) {
            int cash = stake;
            int star = 0;

            while (cash > 0 && cash < goal) {
                bets++;

                if (Math.random() < 0.5) {
                    cash++;

                    while (star <= cash) {
                        star++;
                        System.out.print("*");
                    }

                } else {
                    cash--;
                    while (star <= cash) {
                        star--;
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
            if (cash == goal)
                wins++;
        }
        System.out.println(wins);
    }
}
