# Exceptions

We can think of Exception as an error which is thrown by the Java runtime when an abnormal situation is encountered in the program execution. 
There are 2 main types of exception which can be thrown by the Java runtime:
- Checked Exception
- Runtime Exception


## Checked Exception
These are exceptions which are flagged by the compiler and we will have to be addressed during compile time. We will shortly cover how we can satisfy the compiler for checked exceptions. 
Example of a checked exception is when I am trying to read a file from a certuain location but the file does not exist.

We will not be able to compile the below example without the "throws Exception" clause in the method signature. Hence it is known as a checked exception as the compiler really makes you cautious.
```
    public static void main(String[] args) throws Exception {
        Path filePath = Path.of("C:/help.txt");
        System.out.println("File content = "+ Files.readString(filePath));
    }
```


## Runtime Exception
These are exceptions which are not warned by the compiler but can be thrown at runtime. Basically the concept is that these exceptions can be only caused by bad programming practice and hence should not occur in the first place.

For example, the below code throws ArithmeticException (Division by 0):
```
public static void main(String[] args) {
        int firstNumber = 40;
        int secondNumber = 0;
        System.out.println("Quotient = "+firstNumber/secondNumber);
    }
```

For example, the below code throws ArrayIndexOutOfBoundsException when we are trying to set the value to the 6th element of the arry when the array size if only 5. Remember - array index starts from 0, so the 6th element of tha array will have index 5.
```
public static void main(String[] args) {
        int[] ageOfStudents = new int[5];
        ageOfStudents[5] = 5;
    }
```

## try, catch, throws and throw

Now that we have learnt about exceptions, first we should remember that for Runtime exception, we should be careful while writing programs so that they do not ocur in the first place. For example :
- To avoid Arithmetic exception (Division by 0) - we can check if the divisor is non zero before executing the division. This is known as defensive programming.
- Similarly to avoid ArrayIndexOutofBoundsException - we can check if the array counter is lesser than the length of the array.

Now, how can we take care of checked exceptions :
- Declare in the method signature that the method can potentially throw an exception - like the example above
- Wrap the exception throwing code in a "try catch block"

```
    public static void main(String[] args)  {
        try {
            Path filePath = Path.of("C:/help.txt");
            System.out.println("File content = "+ Files.readString(filePath));
         } catch (IOException ex) {
            System.out.println("Exception encountered = "+ e.getMessage());
         }   
    }
```