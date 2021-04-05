import java.time.LocalDate;
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //object that scans for user input 
        //        ^warning right there (if someone could figure out why its giving me a warning right there, if someone can make a pull request to fix it that'd be nice)
        System.out.println("What is your username?"); //input for username

        String username = scanner.nextLine();
        System.out.println("Welcome!" + username); //output for username

        System.out.println("What is your age?"); //input for age
        int age = scanner.nextInt();

        int year = LocalDate.now().minusYears(age).getYear(); //output for age
        System.out.println("You were born in:" + year);

        if (age < 18) {                                            //age verification if statement
            System.out.println("AGE VERIFICATION FAILED!"); 
        } else {
            System.out.println("AGE VERIFICATION SUCCESFUL!");
        }

    


    
    }
    
}
