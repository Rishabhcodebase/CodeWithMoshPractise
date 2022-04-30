import java.util.Scanner;

public class First_Mortgage_Calculator {

        public static void main(String[] args) {
            final int Months_In_Year = 12;
            final int percentage = 100;
            Scanner sc = new Scanner(System.in);
            //principal Amount *********
            System.out.println("Principal Amount : ");
            int principal = sc.nextInt();

//        Rate of Intrest *************
            System.out.println("Rate of Interest : ");
            float annual_interest = sc.nextFloat();
            float monthly_interest = (annual_interest/percentage/Months_In_Year);

//        Periods / Duration *************
            System.out.println("Period (In Years) : ");
            byte years;
            years = sc.nextByte();
            int number_Of_Payments = years * Months_In_Year;

//        Equation ***************************
//        double Mortgage = (((principal * annual_interest * Math.pow(1 + annual_interest, number_Of_Payments))) / Math.pow(1 + annual_interest, number_Of_Payments) - 1);

            double Mortgage = principal * (monthly_interest *( Math.pow(1+monthly_interest,number_Of_Payments)))/(Math.pow(1+monthly_interest,number_Of_Payments)-1);

//        String mortgageFormatted = NumberFormat.getCurrencyInstance().;
            System.out.println("Monthy Payment :" + Mortgage);




        }
}
