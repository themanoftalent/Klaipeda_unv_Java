Java is an Object-Oriented Language. As a language that has the Object-Oriented feature, 
Java supports the following fundamental concepts −
<br/>
Polymorphism <br/>
Inheritance <br/>
Encapsulation <br/>
Abstraction <br/>
Classes <br/>
Objects <br/>
Instance <br/>
Method <br/>
Message Passing <br/>


In this chapter, we will look into the concepts - Classes and Objects.
Object − Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behaviors – wagging the tail, barking, eating. <br/> An object is an instance of a class.
<br/> Class − A class can be defined as a template/blueprint that describes the behavior/state that the object of its type support.

<br>

public class Dog {

String breed;
int age;
String color;

void barking() { }

void hungry() { }

void sleeping() { }
}


A class can contain any of the following variable types.

Local variables − Variables defined inside methods, constructors or blocks are called local variables. The variable will be declared and initialized within the method and the variable will be destroyed when the method has completed.

Instance variables − Instance variables are variables within a class but outside any method. These variables are initialized when the class is instantiated. Instance variables can be accessed from inside any met
hod, constructor or blocks of that particular class.

Class variables − Class variables are variables declared within a class, outside any method, with the static keyword.
<br>

Constructors
Every class has a constructor. If we do not explicitly write a constructor for a class, 
the Java compiler builds a default constructor for that class.

Each time a new object is created, at least one constructor will be invoked. 
The main rule of constructors is that they should have the same name as the class. 
A class can have more than one constructor.

example
public class Dog {
public Dog() { }

public Dog(String name) {
// This constructor has one parameter, name.

}
}




Creating an Object
As mentioned previously, a class provides the blueprints for objects. So basically, an object is created from a class. 
In Java, the new keyword is used to create new objects.

There are three steps when creating an object from a class −

Declaration − A variable declaration with a variable name with an object type.

Instantiation − The 'new' keyword is used to create the object.

Initialization − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.


public class Puppy {
public Puppy(String name) {
// This constructor has one parameter, name.
System.out.println("Passed Name is :" + name );
}

public static void main(String []args) {
// Following statement would create an object myPuppy
Puppy dog = new Puppy( "tommy" );
}
}

/* First create an object */
ObjectReference = new Constructor();

/* Now call a variable as follows */
ObjectReference.variableName;

/* Now you can call a class method as follows */
ObjectReference.MethodName();




Creating Method
Considering the following example to explain the syntax of a method −

Syntax

public static int methodName(int a, int b) {
// body
}
Here,

public static − modifier

int − return type

methodName − name of the method

a, b − formal parameters

int a, int b − list of parameters

Method definition consists of a method header and a method body. The same is shown in the following syntax −

Syntax

modifier returnType nameOfMethod (Parameter List) {
// method body
}
The syntax shown above includes −

modifier − It defines the access type of the method and it is optional to use.

returnType − Method may return a value.

nameOfMethod − This is the method name. The method signature consists of the method name and the parameter list.

Parameter List − The list of parameters, it is the type, order, and number of parameters of a method. These are optional, method may contain zero parameters.

method body − The method body defines what the method does with the statements.

Example

Here is the source code of the above defined method called min(). This method takes two parameters num1 and num2 and returns the maximum between the two −

/** the snippet returns the minimum between two numbers */

public static int minFunction(int n1, int n2) {
int min;
if (n1 > n2)
min = n2;
else
min = n1;

return min;
}
Method Calling
For using a method, it should be called. There are two ways in which a method is called i.e., method returns a value or returning nothing (no return value).

The process of method calling is simple. When a program invokes a method, the program control gets transferred to the called method. This called method then returns control to the caller in two conditions, when −

the return statement is executed.
it reaches the method ending closing brace.
The methods returning void is considered as call to a statement. Lets consider an example −

System.out.println("This is tutorialspoint.com!");
The method returning value can be understood by the following example −

int result = sum(6, 9);
Following is the example to demonstrate how to define a method and how to call it −

Example

Live Demo
public class ExampleMinNumber {

public static void main(String[] args) {
int a = 11;
int b = 6;
int c = minFunction(a, b);
System.out.println("Minimum Value = " + c);
}

/** returns the minimum of two numbers */
public static int minFunction(int n1, int n2) {
int min;
if (n1 > n2)
min = n2;
else
min = n1;

      return min; 
}
}
This will produce the following result −

Output

Minimum value = 6



































