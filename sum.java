import java.util.Scanner;
    public class sum{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            //System.out.print("enetr the two number");
            int num1=input.nextInt();
            int num2=input.nextInt();
            int sum =num1+num2;
            System.out.println("the sum of two number is" + sum);
            input.close();
        }
    }
    