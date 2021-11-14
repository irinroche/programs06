import java.util.Scanner;
public class Banking
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int userChoice;
        boolean quit = false;
        do
        {
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.print("Your choice, 0 to quit: ");
            userChoice = in.nextInt();
            switch (userChoice)
            {
                case 1:

                    // deposit money

                    break;

                case 2:

                    // withdraw money

                    break;

                case 3:

                    // check balance

                    break;

                case 0:

                    quit = true;

                    break;

                default:

                    System.out.println("Wrong choice.");

                    break;

            }

            System.out.println();

        } while (!quit);

        System.out.println("Bye!");

    }

}
