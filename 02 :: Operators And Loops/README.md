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

```
// Example of for loop - the same average calculation example will now be done using a loop
        int[] ageOfStudents = new int[5];
        ageOfStudents[0] = 10;
        ageOfStudents[1] = 12;
        ageOfStudents[2] = 15;
        ageOfStudents[3] = 11;
        ageOfStudents[4] = 9;
        int totalAge = 0;
        for (int loopCount=0; loopCount < ageOfStudents.length; loopCount++) {
            totalAge = totalAge +ageOfStudents[loopCount];
        }
        System.out.println("Average age = "+totalAge/5);
```      

```
// Example of if
        int firstNumber = 40;
        int secondNumber = 10;
        if (firstNumber > secondNumber) {
            System.out.println("First number is greater than second number");
        } else {
            System.out.println("First number is lesser than second number");
        }
```   

```
// Example of switch
        String today = "Sunday";
        switch(today) {
            case "Monday" :
                System.out.println("Today is Monday");
                break;
            case "Tuesday" :
                System.out.println("Today is Tuesday");
                break;
            case "Wednesday" :
                System.out.println("Today is Wednesday");
                break;
            case "Thursday" :
                System.out.println("Today is Thursday");
                break;
            case "Friday" :
                System.out.println("Today is Friday");
                break;
            case "Saturday" :
                System.out.println("Today is Saturday");
                break;
            case "Sunday" :
                System.out.println("Today is Sunday");
                break;
            default :
                System.out.println("Invalid day !!");
                break;
        }
```  

A few points about the switch statements:
- It makes code more readable and maintainable than if-else blocks, so always think if you can convert an if else to switch
- Without the break statements, next case statement will be evaluated, so break is really important
