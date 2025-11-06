import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);
       System.out.println("1. Even or Odd, 2. Find the largest three numbers, 3. Grade calculator, 4. Simple calculator, 5.Exit");
       String choice = userInput.nextLine();

       switch (choice){
           case ("1"):
               int val1;
               System.out.println("You've chosen Even or Odd");
               System.out.println("Choose one number");
               val1 = userInput.nextInt();
               if(val1 % 2 ==0){
                   System.out.println("This number is Even");
               }else{
                   System.out.println("This number is Odd");
               }
               break;
           case ("2"): System.out.println("You've chosen find the largest number");
               System.out.println("Choose three numbers");
               int a = userInput.nextInt();
               int b = userInput.nextInt();
               int c = userInput.nextInt();
               if ((a > c)&&(a > b)){
                   System.out.println(a + " is the largest number");
               } else if ((b > c)&&(b > a)){
                   System.out.println(b + " is the largest number");
               } else if ((c > a) && (c > b)){
                   System.out.println(c + " is the largest number");
               }
               break;
           case ("3"): System.out.println("You've chosen Grade Calculator");
               System.out.println("Whats your grade?");
               int grade = userInput.nextInt();
               if ((grade >= 90)&&(grade <= 100)){
                   System.out.println("You have a A");
               } else if ((grade >= 80)&&(grade <= 89)){
                   System.out.println("You have a B");
               } else if ((grade >= 70)&&(grade <= 79)){
                   System.out.println("You have a C");
               } else if ((grade >= 60)&&(grade <= 69)){
                   System.out.println("You have a D");
               } else if (grade < 60){
                   System.out.println("You have a f");
               }
               break;
           case ("4"): System.out.println("You've chosen Simple Calculator");
               System.out.println("Choose two numbers");
               int num1 = userInput.nextInt();
               int num2 = userInput.nextInt();
               userInput.nextLine();
               System.out.println("Choose equation symbol");
               String equation = userInput.nextLine();
               switch(equation){
                   case ("+"): System.out.println(num1 + num2);break;
                   case ("-"): System.out.println(num1 - num2);break;
                   case ("*"): System.out.println(num1 * num2);break;
                   case ("/"): System.out.println(num1 / num2);break;
               }
               break;
           case ("5"): System.out.println("You've chosen Exit");
                System.out.println("Goodbye");
                break;
           default: System.out.println("Invalid option");break;
       }
       userInput.close();
    }
}