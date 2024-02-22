
import java.util.Arrays;
import java.util.Scanner;
public class StarterProfile {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //for firstName

        System.out.println("Enter your Firstname: ");
        String firstName = input.nextLine();

        //for lastName

        System.out.println("Enter your lastName: ");
        String lastName = input.nextLine();

        //for birthYear
        System.out.println("Enter your birthYear: ");
        int birthYear = input.nextInt();

        //for birthMonth

        System.out.println("Enter your birthMonth: ");
        int birthMonth = input.nextInt();

        //for birthDay
        System.out.println("Enter your birthDay: ");
        int birthDay = input.nextInt();

        //for height

        System.out.println("Whats your Height: ");
        double height = input.nextDouble();

        //for weight

        System.out.println("Whats your weight");
        double weight = input.nextDouble();

        HealthProfile profile = new HealthProfile(firstName, lastName, birthYear, birthMonth, birthDay, height, weight);

        //setters

        profile.setFirstName(firstName);
        profile.setLastName(lastName);
        profile.setBirthYear(birthYear);
        profile.setBirthMonth(birthMonth);
        profile.setBirthDay(birthDay);
        profile.setHeight(height);
        profile.setWeight(weight);

        System.out.println();

        System.out.printf("FirstName: %s%n", profile.getFirstName());
        System.out.printf("lastName: %s%n", profile.getLastName());
        System.out.printf(" date of birth: %d/%d/%d%n", profile.getBirthDay(), profile.getBirthMonth(), profile.getBirthYear());
        System.out.printf(" Height: %.2f Inches %n", profile.getHeight());
        System.out.printf(" Weight: %.2f Pounds %n", profile.getWeight());
        System.out.printf(" Age: %d %n", profile.calculateAge());
        System.out.printf("Maximum HeartRate: %d %n",profile.calculateHeartRateMax());

        int[] targetHRange = profile.calculateTargetHeartR();
        System.out.printf("TargetHeartRate Range: %s%n", Arrays.toString(targetHRange));
        System.out.printf("BMI: %.2f", profile.calculateBMI());






    }



}
