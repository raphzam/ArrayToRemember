import java.util.Scanner;

public class ArrayToRemember {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        String [] presidents = {"Johnson", "Nixon", "Ford", "Carter", "Reagan", "Bush", "Clinton", "Bush", "Obama", "Trump"};

        String [] presidents = new String [10];

        for (int i = 0; i < presidents.length; i++) {
            System.out.printf("Enter a president %d: \n", i+1);
            presidents[i] = input.nextLine();
        }

        System.out.println("View presidents? Enter \"history\" to view.");
        String userAnswer = input.nextLine();
        if (userAnswer.equalsIgnoreCase("history")){
            for (int i = presidents.length - 1; i >= 0; i--) {
                System.out.println(presidents[i]);
            }
        }




    }
}
