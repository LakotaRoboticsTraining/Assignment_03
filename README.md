# Lesson 3: Methods

Java to Robot Code - Student Training

Goal: Write and call your own methods - including void methods, methods that return a value, and two methods with the same name but different parameter types (overloading).

Time: About 35-45 minutes

Before this lesson: Lessons 1-2 (package, Main, main, printing, variables, int/double/String, +, concatenation).

## You will learn

- What a method is and why programmers use them
- How to call a method from main
- How to define a method with public static
- Parameters (inputs) vs arguments (values you pass in)
- void methods vs methods that return a value
- Method overloading (same name, different parameter types)
## Why this matters for robots

Methods let you name a chunk of work - greet, add, isRunning - and reuse it from main instead of one giant block of code.

## File setup

```java
package intro.module1.assignment3;
```

```java
public class Main {
    public static void main(String[] args) {
        // calls go here
    }
    // other methods go here (inside the class, outside main)
}
```

Keep the package line. Methods sit outside of main, not inside of main.

## The big idea

A method is a named block of code that does a job. You already know main, main is a method.  Now you’ll write more.

- Define the method (write the recipe)
- Call the method (use the recipe)
## Calling a method

greet("Michael");

That calls greet and passes the String "Michael".

```java
int intSum = add(5, 20);
System.out.println("intSum = " + intSum);
```

```java
double doubleSum = add(2.0, 22.8);
System.out.println("doubleSum = " + doubleSum);
```

Notice how both methods call add, but the variables they assign to are of different types (int versus double).  Java picks which add to use based on the types you pass (int vs double).

## Anatomy of a method

void method - does something, returns nothing

public static void greet(String value) {

System.out.println("Hello " + value + ", nice to meet you.");

}

void means no value is sent back. value is a parameter (input).

Method that returns an int

public static int add(int value1, int value2) {

return value1 + value2;

}

return sends the sum back to the caller. add(5, 20) evaluates to 25.

Method that returns a double

public static double add(double value1, double value2) {

return value1 + value2;

}

add(2.0, 22.8) evaluates to 24.8.

Parameters vs arguments

Parameter = variable in the definition (String value). Argument = actual value in the call ("Michael").

void vs return

void methods do a job (like printing). Non-void methods calculate a value and must use return.

Method overloading

You can have more than one method with the same name if the parameter types are different. Both can be named add: one takes ints, one takes doubles.

add(5, 20) runs the int version. add(2.0, 22.8) runs the double version.

Where methods go

Inside the class braces. Outside main. Call them from main.

Expected output

Hello Michael, nice to meet you.

intSum = 25

doubleSum = 24.8

## Common mistakes

```java
Putting a new method inside main
```

- Forgetting return on a non-void method
- Wrong return type
- Call/definition name mismatch
- Wrong number or types of arguments
- Missing parentheses on a call
- Changing the package line

## Try it yourself

Edit `Main.java`. Implement the methods, then call them from `main`.

### Challenge 1 - greet

Write `public static void greet(String value)` that prints:

`Hello <value>, nice to meet you.`

Call it from `main` (for example `greet("Michael");`).

### Challenge 2 - add for int

Write `public static int add(int value1, int value2)` that **returns** the sum.

In `main`: `int intSum = add(5, 20);` and print it.

### Challenge 3 - overloaded add for double

Write `public static double add(double value1, double value2)` that returns the sum.

In `main`: `double doubleSum = add(2.0, 22.8);` and print it.

## Check your understanding

1. What is the difference between defining and calling a method?

2. What does void mean?

3. What does return value1 + value2; do?

4. Why can two methods both be named add?

5. In greet("Michael"), what is the argument and what is the parameter?

Answers on next page

Looking ahead

Next: decisions with if / else so programs can choose behavior based on values.

---

Answers

(1) Define writes it; call runs it.

(2) No value returned.

(3) Sends the sum back.

(4) Overloading - different parameter types.

(5) Argument "Michael"; parameter value.
