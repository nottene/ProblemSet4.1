import java.util.Scanner;

public class consoleCarnival {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("WELCOME TO THE CONSOLE CARNIVAL!");
            System.out.println("--------------------------------");
            System.out.println("Shall we play a game?\n");
            System.out.println("1. FLip a coin");
            System.out.println("2. Rock, Paper, Scissors");
            System.out.println("3. Magic 8 Ball");
            System.out.println("4. Dice Roller");
            System.out.println("5. Quit");
            System.out.print("What game would you like to play: ");
            int choose = input.nextInt();
            if (choose == 1) {
                coinFlip();
            } else if (choose == 2) {
                rps();
            } else if (choose == 3) {
                m8b();
            } else if (choose == 4) {
                diceRoller();
            } else {
                System.out.println("Goodbye, mere mortal!!! Bahahaha!!!");
                break;
            }
        }
    }

    public static int randomInt(int n) {
        return (int)(Math.random()*n) + 1;
    }
    public static void coinFlip() {
        Scanner input = new Scanner(System.in);
        int win = 0;
        int lose = 0;
        String again = "yes";
        while(again.equals("yes")) {
            int gamble = randomInt(2);
            String ans = "";
            System.out.print("Call heads or tails: ");
            String flip = input.next();
            if (gamble == 1) {
                ans = "heads";
            } else {
                ans = "tails";
            }

            if (flip.equals(ans)) {
                System.out.print("Ok, I'm flipping the coin! I got: " + ans + ". You called it!");
                win++;
            } else {
                System.out.print("Ok, I'm flipping the coin! I got: " + ans + ". F in the chat!");
                lose++;
            }
            System.out.print(" Play again? ");
            again = input.next();
        }
        System.out.println("You had " +win+ " wins and " +lose+ " losses.");
    }

    public static void rps() {
        Scanner input = new Scanner(System.in);
        int win = 0;
        int lose = 0;
        int tie = 0;
        String again = "yes";
        while(again.equals("yes")) {
            int random = randomInt(3);
            String an = "";
            int w = 0;
            System.out.print("Human, let's battle an epic game of rock, paper, scissors! Your choice: ");
            String r = input.next();
            if (random == 1) {
                an = "rock";
            } else if (random == 2) {
                an = "paper";
            } else {
                an = "scissors";
            }

            if (r.equals("rock")) {
                w = 1;
            }
            if (r.equals("paper")) {
                w = 2;
            }
            if (r.equals("scissors")) {
                w = 3;
            }

            if (w == 2 && random == 1 || w == 3 && random == 2 || w == 1 && random == 3) {
                System.out.print("Ok, I chose " + an + "! NOOO, I took a fat L!!!");
                win++;
            } else if (random == 2 && w == 1 || random == 3 && w == 2 || random == 1 && w == 3) {
                System.out.print("Ok, I chose " + an + "! Haha, you are no match for me, mere mortal!!!");
                lose++;
            } else if (random == 1 && w == 1 || random == 2 && w == 2 || random == 3 && w == 3) {
                System.out.print("Ok, I chose " + an + "! BRUH, how can I not beat a mere mortal!!!");
                tie++;
            }
            System.out.print(" Play again? ");
            again = input.next();
        }
        System.out.println("You had " +win+ " wins, " +tie+ " ties, and " +lose+ " losses.");
    }

    public static void m8b() {
        Scanner input = new Scanner(System.in);
        String again = "yes";
        while(again.equals("yes")) {
            System.out.println("Mere mortal, I can see into the FUTURE! Ask me a yes/no question: ");
            String s = input.nextLine();
            int ball = randomInt(20);
            if (ball == 1) System.out.print("It is certain.");
            if (ball == 2) System.out.print("It is decidedly so.");
            if (ball == 3) System.out.print("Without a doubt.");
            if (ball == 4) System.out.print("Yes, definitely.");
            if (ball == 5) System.out.print("You may rely on it.");
            if (ball == 6) System.out.print("As I see it, yes.");
            if (ball == 7) System.out.print("Most likely.");
            if (ball == 8) System.out.print("Outlook good.");
            if (ball == 9) System.out.print("Yes.");
            if (ball == 10) System.out.print("Signs point to yes.");
            if (ball == 11) System.out.print("Reply hazy, try again.");
            if (ball == 12) System.out.print("Ask again later.");
            if (ball == 13) System.out.print("Better not tell you now.");
            if (ball == 14) System.out.print("Cannot predict now.");
            if (ball == 15) System.out.print("Concentrate and ask again.");
            if (ball == 16) System.out.print("Don't count on it.");
            if (ball == 17) System.out.print("My reply is no.");
            if (ball == 18) System.out.print("My sources say no.");
            if (ball == 19) System.out.print("Outlook not so good.");
            if (ball == 20) System.out.print("Very doubtful.");
            System.out.print(" Do you have another question? ");
            again = input.nextLine();
        }
    }

    public static void diceRoller() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Describe your dice roll: ");
            String str = input.next();
            if (str.equals("done")) {
                break;
            }
            String str1 = str.substring(0, str.indexOf("d"));
            int n = Integer.parseInt(str1);

            String str2 = str.substring(str.indexOf("d") + 1);
            int s = Integer.parseInt(str2);

            System.out.print("Your roll: ");

            int sum = 0;

            for (int i = 0; i < n; i++) {
                int output = randomInt(s);
                sum += output;
                System.out.print(output + ", ");
            }
            System.out.println("Total = " + sum);

        }
    }
}
