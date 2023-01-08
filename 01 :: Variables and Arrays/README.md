# Variables - Primitives , Object References and Arrays

We can think of variables in 2 ways :
- A container or a bucket which occupies a certain portion of the meory of a running program and can hold a piece of data.
- The same variable can be reassigned different types of data from time to time and hence the name variable.
- We need a variable whenever we want to have a bucket / container which can contain different data at different time depending on the requirement


Below is an example of how  variable is defined in Java:
- In the first line, a variable of "type" Integer is defined and assigned a value/ data of 40
- In the second line, it is re-assigned a value of 44 

```
 int myAge = 40;
 myAge = 44;
```


## Primitive Variables
   Primitive variables are the ones which contain a "single value" - a single number or a single character or a single boolean value (either true or false).  Note the importance of "single" here. We will come back to this "single" again later.
   Below are the most commonly used primitive variables :
   - Integer  -> Used to hold any integer data (like 10, 20 , -5, 60 etc.)
   - Float    -> Used to hold any decimal data (like 10.2, 1.44, -5.6 etc.)
   - Boolean  -> Used to hold either true or false 
   - Char     -> Used to hold a single character (like 'a' or 'b')

 There are a few other types but the above are the most frequently used types.   


## Object reference Variables
   These are another types of variables which are used to store references of objects. These variables actually store the memory location of the corresponding object. We will go in detail about them in one of the subsequent chapters but as of now we will introduce only one and that is 'String'.

   Below is an example of String variable declaration and assignment :

```
 String myName = "Soumik";
 myName = "John";
```   
   String is the simplest object reference variable and it is different from the Char primitive variable (that you have seen above) in the following ways :
   - A Char variable can contain only 1 character but String can contain as many characters (and any combinations) as you want
   - So the string variable is much more flexible but it also consumes a lot of memory.

## Arrays
   Arrays are a third type which contain or hold a series of specific type of variables. So we can have primitive array (Integer or Float or Char or Boolean array) or array of object references.  

   Suppose we want to represent the age of 5 students of a class. We can either declare 5 integer variables seperately to hold the age of 5 students. A more structured approach is to create an array variable of integer type. 
   
   Note that the array declaration does not consume less memory or more performant but it makes the code look a lot more structured which is very important for professional programs.

   ```
   // This is a comment 
   // Without arrays, we'll have to declare 5 integer variables seperately as below

   int ageOfStudent1 = 10;
   int ageOfStudent2 = 12;
   int ageOfStudent3 = 15;
   int ageOfStudent4 = 11;
   int ageOfStudent5 = 9;

   // With arrays, we can declare them as below
   // First the array is declared - note the use of square brackets and also the second one which specifies the length/size of the array as 5.
   int[] ageOfStudents = new int[5];
   ageOfStudent[0] = 10;
   ageOfStudent[1] = 12;
   ageOfStudent[2] = 15;
   ageOfStudent[3] = 11;
   ageOfStudent[4] = 9;
```  

Very important :: Array index starts with 0. This means that if there is an array of size 5, we can access the members of the array starting with index 0 and ending with index 4.