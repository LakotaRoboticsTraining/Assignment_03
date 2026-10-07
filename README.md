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

A method is a named block of code that does a job. You already know main, main is a method.  Now you'll write more.

- Define the method (write the recipe)
- Call the method (use the recipe)
## Calling a method

You call (use) a method by writing its name and parentheses. Put those calls **inside** `main`, because that is where your program starts (Lesson 1).

A call looks like this:

```java
greet("Michael");
```

That runs `greet` and passes the String `"Michael"` as the argument.

Here is a complete `Main` showing calls **inside** `main`. The method definitions stay **outside** `main` (but still inside the class):

```java
public class Main {
    public static void main(String[] args) {
        // Calls go HERE, inside main
        greet("Michael");

        int intSum = add(5, 20);
        System.out.println("intSum = " + intSum);

        double doubleSum = add(2.0, 22.8);
        System.out.println("doubleSum = " + doubleSum);
    }

    // Method definitions go HERE, outside main
    public static void greet(String value) {
        System.out.println("Hello " + value + ", nice to meet you.");
    }

    public static int add(int value1, int value2) {
        return value1 + value2;
    }

    public static double add(double value1, double value2) {
        return value1 + value2;
    }
}
```

How to read the calls in `main`:

1. `greet("Michael");` - run `greet`; it prints something (void, so no value comes back)
2. `int intSum = add(5, 20);` - run the int `add`, store the returned sum in `intSum`, then print it
3. `double doubleSum = add(2.0, 22.8);` - run the double `add`, store the returned sum, then print it

Notice both calls use the name `add`, but the variables are different types (`int` vs `double`). Java picks which `add` to use based on the types you pass. That is overloading (more below).

**Remember:** write the call inside `main`. Write the method itself outside `main`.

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

> **Find your starter file:** In the file explorer, open the `src` folder, then `main`, then `java`. Edit the existing `Main.java` there.
> Do **not** create a new `Main.java` at the top of the repo.

Edit `src/main/java/Main.java`. Implement the methods there, then call them from `main`.

Do **not** edit `src/test/java/MainTest.java` - that file checks your work automatically when you open a pull request. You only need to change `src/main/java/Main.java`.

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

1. <details>
     <summary>What is the difference between defining and calling a method?</summary>
     Define writes it; call runs it.
   </details>
2. <details>
     <summary>What does `void` mean?</summary>
     No value is returned.
   </details>
3. <details>
     <summary>What does `return value1 + value2;` do?</summary>
     Sends the sum back to the caller.
   </details>
4. <details>
     <summary>Why can two methods both be named `add`?</summary>
     Overloading - different parameter types.
   </details>
5. <details>
     <summary>In `greet("Michael")`, what is the argument and what is the parameter?</summary>
     Argument `"Michael"`; parameter `value`.
   </details>

## Looking ahead

Next: decisions with if / else so programs can choose behavior based on values.
