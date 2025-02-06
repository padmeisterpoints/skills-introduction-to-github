/* my older brother helped me out with this one!*/

import java.util.Scanner;

public class gradecalc {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     double lab120 = .4;
     double test = .5;
     double participation = .1;

        System.out.println("Enter the grade for assignments");
        double lab120Final = scanner.nextDouble();

        System.out.println("Enter the grade for tests");
        double testFinal = scanner.nextDouble();

        System.out.println("Enter the grade for participation");
        double participationFinal = scanner.nextDouble();

            double courseGrade = (lab120Final * lab120) +
                                    (testFinal * test) +
                                        (participationFinal * participation);


            System.out.printf("Your course grade is" + " " + courseGrade);

            scanner.close();






    }
}



