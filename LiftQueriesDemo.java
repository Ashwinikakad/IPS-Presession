import java.util.Scanner;

public class LiftQueriesDemo {
    int liftAPosition = 1;
    int liftBPosition = 7;

    public void handleQueries(int numberOfTestCases) {
        Scanner scanner = new Scanner(System.in);
        while (numberOfTestCases > 0) {
            System.out.println("Enter the test case");
            int call = scanner.nextInt();
            
            if (Math.abs(call - liftAPosition) <= Math.abs(call - liftBPosition)) {
                liftAPosition = call;
                System.out.println("A");
            } else {
                liftBPosition = call;
                System.out.println("B");
            }
            numberOfTestCases--; 
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int numberOfTestCases = scanner.nextInt();

        LiftQueriesDemo liftQueriesDemo = new LiftQueriesDemo();
        liftQueriesDemo.handleQueries(numberOfTestCases);

        scanner.close(); // Close the scanner after its use
    }
}

//Output: C:\Users\harsh\OneDrive\Desktop>java LiftQueriesDemo.java
Enter the number of test cases
2
Enter the test case
3
A
Enter the test case
7
B