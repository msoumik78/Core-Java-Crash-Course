# Object Oriented Programming - Classes and Interfaces, Encapsulation and Inheritance

Till now , we were mostly dealing with primitive data types. But let us remember that our programs basically solve some real life problems which revolve around real life entities which may be vehicles, persons, games and what not!  So one thing which we realise is that we can't just have primitives to respresent these real life entities because these real life entities have multiple properties or attributes and primitives has only one value.

So for example a person entity can have properties like - name , age, gender, nationality etc.
A vehicle entity can have properties like - type, yearOfPurchase, manufacturer, model etc.
A game entity can have properties like - type, noOfPlayers, duration etc.

## Class

Welcome to Class which we can think of as a custom data type and it can be a bucket or a collection of such multiple primitives.

Say for example we want to represent a person class, we can do it as follows:

```
class Person {
    String name;
    String gender;
    int age;
    String nationality;
}
```

So as we can see above - a class basically is a colection of multiple primitive data types and generally represents a real life entity.
Now this 'Person' class is a blueprint or a template based on which we can create multiple "objects" to represent various persons like you and I. So below is how we will create instances of person data type:

```
Person john = new Person();
john.name = "John";
john.gender = "male";
john.age= 50;
john.nationality = "America";

Person soumik = new Person();
soumik.name = "Soumik";
soumik.gender = "male";
soumik.age= 40;
soumik.nationality = "India";
```

Now let us get the below concepts absolutely clear:
- With a class, we create a new custom data type. So just like int, char, boolean, float , String are Java's built-in data types, we can create new data types using a class keyword.
- With the "new" operator , we create various instances of the data type represented by the class.
- So just like we can create many many instances of int or String data types, likewise we can create many many instances of 'Person' data type.
- In the above example, we created 2 objects from person class - where each object has its own set or copy of the properties and their corresponding values.


## Encapsulation

Now apart from properties/ attributes, a class normally also contains methods.
The basic types of methods that a class can (and should) contain are the getter and setter methods which are used for fetching and setting the properties respectivelyas below:
```
class Person {
    String name;
    String gender;
    int age;
    String nationality;

    // Setters for setting the properties
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Getters for getting or fetching  the properties
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public String getNationality() {
        return nationality;
    }

}
``` 

In Java, as a rule of thumb, we never access the properties of the objects directly, rather use the setters method to set/change the value of the properties and getters to fetch and view the value of the proeprties. This concept is called "encapsulation" because we are encapsulating or hiding the properties or attributes of the class. In other words, we do not recoomend direct access to the properties.


## Inheritance

Inheritance is the concept when we can have a base or a parent class and some child or subclasses which extend from the parent class.
The main motivation of inheritance is code reuse or prevent duplicate code as that is bad and error prone.

So if we can think of a parent child relationship amongst entities, we can design a parent class -subclass relationship:


Below are 2 classes - a Vehicle class and a Car class where Vehicle is the parent and Car is the subclass.
```
public class Vehicle {
    String type = "Vehicle";
    int yearOfPurchase = 2010;
    void display() {
        System.out.println("Type is "+type+" and year of purchase is : "+yearOfPurchase);
    }
}
```

```
public class Car extends Vehicle{
    String type = "Car";
    @Override
    void display() {
        System.out.println("Vehicle type is : "+type +" and year of purchase = "+yearOfPurchase);
    }
}
```

if you execute the below code from a main function from another class:
```
        Car car = new Car();
        car.display();
```
output will be : Vehicle type is : Car and year of purchase = 2010

## Interface

Interfaces and Abstract classes are at the upper end of class hierarchy where most or all methods were declared but not defined.
Now one important and interesting thing is that we can neither instantiate an interface nor an abstract class. 

Example of an interface definition is as below :
```
public interface LivingBeing {
    void walk();
    void talk();
}
```

And below is one concrete implementation of the above interface :
```
public class Human implements LivingBeing {
    @Override
    public void walk() {
        System.out.println("Walk on 2 legs");
    }
    @Override
    public void talk() {
        System.out.println("Talks in structured language");
    }
}
```

And below is another concrete implementation of the above interface :
```
public class Tiger  implements LivingBeing{
    @Override
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
    @Override
    public void talk() {
        System.out.println("Roars");
    }
}
```

Notice that we use the word "implement" to extend the interface - conceptually it is also about creating the subclass / child of the interface. But Java uses the word "implement" to subclass an interface and the word "extend" to extend a normal or an abstract class.


## Abstract Class

Welcome to Abstract class. Now in between the LivingBeing interface and the Tiger class, we can have an abstract class Animal which defines one behaviour but does not define the other. This is exactly when we need an abstract class.

So below is an example of an abstract class:
```
public abstract class Animal implements LivingBeing{
    @Override
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}
```

An abstract class has the following characteristics:
- It may or may not implement any interface
- If it implements an interface but does not implement all its methods, then we will have to declare it as abstract.
- If it does not implements an interface - then it becomes abstract when we do not provide implementation of at least any method. See the example below :
```
public abstract class Creature {
    void walk(){
        System.out.println("Walks with 2 legs");
    }
    abstract void talk();
}
```

Since this is a beginner's course , for most practical purposes we can consider interfaces and abstract classes as almost functionally equivalent and at the uppermost end of class hierarchy. So when we design or model a class hierarchy from the requirements - if we do not know the behaviour at all, we leave it at the level of interfaces. 

We can only extend the interfaces and abstract classes to create our "real" classes which we can then instantiate to create objects.

## Final Class

At the opposite end of the class hierarchy is the concept of "final" class. Whenever we declare a class final, we indicate that it is at the bottom of the hierarchy tree and it can't be extended further. As an example, JDK has marked the class String as final.