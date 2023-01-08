# Methods/ Functions

In any programming language, we define a function (also known as method) to execute a block of code which will be executed repeatedly and hence we do not need to write the same code multiple times. 

Note that any Java method has the following characteristics:
- Expects or Accepts a single or multiple parameters.
- Returns a single response back or in some case does not return anything. In case the method does not return anything, it's returned type is marked void.

Below is an example of a method which has the following characteristics:
- Name of the method is 'findTempInCelcius'. 
- It accepts a single argument of type 'float'
- It also returns a value of type 'float'. Return value from the method is indicated/ preceeded by the 'return' keyword.

```
private static float findTempInCelcius(float tempInFahrenheit) {
   float tempInCelcius = (tempInFahrenheit - 32) * 0.5556f;
   return tempInCelcius;
}
```    

The above method can be invoked as below:
```
   System.out.println("30 F is : "+findTempInCelcius(30) +" C");
   System.out.println("40 F is : "+findTempInCelcius(40) +" C");
   System.out.println("50 F is : "+findTempInCelcius(50) +" C");
```


The above method definition can be slightly modified to not return anything or in other words to return 'void'. So you will notice the following differences:
- Now the method definition has return type 'void' instead of float
- Since there is no return type, there is also no return statement

```
private static void findTempInCelcius(float tempInFahrenheit) {
   float tempInCelcius = (tempInFahrenheit - 32) * 0.5556f;
   System.out.println("Temp in Celsius = "+tempInCelcius);
}
```    


## Overloaded Methods

Java allows multiple methods top be declared with the same name but with different parameters. All these methods which share the same name but parameter list is different are known as overloaded methods.

Below are some popular / most common ways of method overloading:
- Same type of parameters but count of parameters different
- Parameters are different


```
// Below are 2 overloaded methods which share the same name and same type of parameters but count is different.
   private void method1(char c1);
   private void method1(char c1, char c2);
```

```
// Below are 2 overloaded methods which share the same name but parameters are different 
   private void method2(char c1);
   private void method2(int num1);
```

## Java Methods - Pass by Value