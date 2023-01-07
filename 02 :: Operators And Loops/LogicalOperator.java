public class LogicalOperator {
    public static void main(String[] args) {
        int firstNumber = 40;
        int secondNumber = 10;

// Output of relational operator is always a boolean (true or false)
        System.out.println("Are both numbers greater than 20 =" + ((firstNumber > 20 ) && (secondNumber > 20 )));
        System.out.println("Is any one number greater than 20 =" + ((firstNumber > 20 ) || (secondNumber > 20 )));
    }
}
