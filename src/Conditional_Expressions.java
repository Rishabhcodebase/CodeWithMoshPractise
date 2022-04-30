import java.util.Scanner;

public class Conditional_Expressions {
    public static void main(String[] args){

        byte temperature;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature (in Celcius");
        temperature = sc.nextByte();

        if(temperature > 30){
            System.out.println("Its a hot day\nDrink a plenty of water!");
        }
        else if(temperature > 20){
            System.out.println("Its a nice Day!");
        }
        else
            System.out.println("Its Cold day");



    }
}
