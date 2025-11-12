import java.util.Scanner; 

public class MathOperation { 
    public native int add(int a, int b); 
    public native int subtract(int a, int b); 
    public native int multiply(int a, int b); 
    public native double divide(int a, int b); 

    static { 
        System.loadLibrary("MathLib"); 
    } 

    public static void main(String[] args) { 
        MathOperation obj = new MathOperation(); 
        Scanner sc = new Scanner(System.in); 
        int choice; 

        do { 
            System.out.println("\n=== Mathematical Operations ==="); 
            System.out.println("1. Addition"); 
            System.out.println("2. Subtraction"); 
            System.out.println("3. Multiplication"); 
            System.out.println("4. Division"); 
            System.out.println("5. Exit"); 
            System.out.print("Enter your choice: "); 
            choice = sc.nextInt(); 

            if (choice == 5) { 
                System.out.println("Exiting..."); 
                break; 
            } 

            System.out.print("Enter first number: "); 
            int a = sc.nextInt(); 
            System.out.print("Enter second number: "); 
            int b = sc.nextInt(); 

            switch (choice) { 
                case 1: 
                    System.out.println("Result = " + obj.add(a, b)); 
                    break; 
                case 2: 
                    System.out.println("Result = " + obj.subtract(a, b)); 
                    break; 
                case 3: 
                    System.out.println("Result = " + obj.multiply(a, b)); 
                    break; 
                case 4: 
                    if (b != 0) 
                        System.out.println("Result = " + obj.divide(a, b)); 
                    else 
                        System.out.println("Cannot divide by zero!"); 
                    break; 
                default: 
                    System.out.println("Invalid choice!"); 
            } 
        } while (true); 
        sc.close(); 
    } 
}
