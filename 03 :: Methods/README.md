# Variables - Methods/ Functions

In any programming language, we define a function to execute a block of code which will be executed repeatedly and hence we do not need to write the same code multiple times.

```
private static float findTempInCelcius(float tempInFahrenheit) {
   float tempInCelcius = (tempInFahrenheit - 32) * 0.5556f;
   return tempInCelcius;
}
```    
Above is an example of a function definition and the function can be invoked as follows:

```
   System.out.println("30 F is : "+findTempInCelcius(30) +" C");
   System.out.println("40 F is : "+findTempInCelcius(40) +" C");
   System.out.println("50 F is : "+findTempInCelcius(50) +" C");
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