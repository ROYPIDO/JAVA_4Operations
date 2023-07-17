import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************************");
        String operations = "Addition 1.operation\n"
                            +"Substraction 2.operation\n"
                            +"Multiplication 3.operation\n"
                            +"Division 4.operation";
        System.out.println(operations);
        System.out.println("**************************************");
        System.out.println("choose operation");
        String operation = scanner.nextLine();

        int a ;
        int b ;

        switch (operation) {
            case "1":
                System.out.print("First number : ");
                a = scanner.nextInt();
                System.out.print("Second number : ");
                b = scanner.nextInt();
                System.out.println("Result :" + (a+b));

                break;

            case "2":
                System.out.print("First number : ");
                a = scanner.nextInt();
                System.out.print("Second number : ");
                b = scanner.nextInt();
                System.out.println("Result :" + (a-b));

                break;

            case "3":
                System.out.print("First number : ");
                a = scanner.nextInt();
                System.out.print("Second number : ");
                b = scanner.nextInt();
                System.out.println("Result :" + (a*b));

                break;
                
            case "4":
                System.out.print("First number : ");
                a = scanner.nextInt();
                System.out.print("Second number : ");
                b = scanner.nextInt();
                System.out.println("Result :" + ((double)a/b));
                
                break;
        
            default:
            System.out.println("please choose an operation correct");
                break;
        }

    }
}
