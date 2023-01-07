# Operators and Loops


## Operators
   Following are basic main types of operators in Java:
   - Assignment operator (=) - We have already seen this when we assigned a value/ data to a variable
   - Arithmetic operators :
      - Plus (+)               
      - Minus (-)                 
      - Multiplication (*)  
      - Divide (/) 
      - Modulo / Remainder (%)
   - Relational operators:
      - Equal ( == ) and not equal (!= )
      - Greater than (>)
      - Greater than or equal (>=)
      - Lesser than (<)
      - Lesser than (<=)
   - Logical operators:
      - And ( && )
      - Or ( || )


```
// Example of arithmetic operators
 int firstNumber = 40;
 int secondNumber = 10;
 
 int addedNumber = firstNumber + secondNumber;
 int subtractedNumber = firstNumber - secondNumber;
 int multipliedNumber = firstNumber * secondNumber;
 int dividedNumber = firstNumber / secondNumber;

 int reminder = firstNumber % secondNumber;
```


```
// Example of relational operators
        int firstNumber = 40;
        int secondNumber = 10;

        // Output of relational operator is always a boolean (true or false)
        System.out.println("Is first number equal to second number =" + (firstNumber == secondNumber));  false
        System.out.println("Is first number greater than second number =" +(firstNumber > secondNumber)); true 
        System.out.println("Is first number lesser than second number =" +(firstNumber < secondNumber));  false
```


```
// Example of logical operators
 int firstNumber = 40;
 int secondNumber = 10;

// Output of relational operator is always a boolean (true or false)
 System.out.println("Are both numbers greater than 20 =" + ((firstNumber > 20 ) && (secondNumber > 20 ))); false
 System.out.println("Is any one number greater than 20 =" + ((firstNumber > 20 ) || (secondNumber > 20 ))); true
```


## Loops
   Following are major types:
   - Only looping:
      - for
      - while
      - do while   
   - Conditionals:
      - if else
      - switch

