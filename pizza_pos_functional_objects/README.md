# Functional object version of the pizza POS System

This project contains the source code for the “Functional Objects” version of the “Domain Modeling” lessons in my book, Learning Functional Programming in Scala.

Please see the “Demonstrating the ‘Functional Objects’ Approach” lesson in the book for more information.

## How to run the program

We have two options to run the pizza POS functional objects program. The first one is via the IntelliJ editor and the second one is using your Terminal.

### Via IntelliJ

For run the program with IntelliJ you should run the next steps:

1. Open the `Main.scala` file.
2. In the line number 4, you will see a green right arrow next to the line.
   number; click on it.
3. Select the option "Run 'Main'".
4. The run panel will be open and after some seconds. You will see the next
   text:

```
Pizza 3 composition:: Pizza(LargeCrustSize,ThinCrustType,List(Cheese, Pepperoni, Olives))
Pizza 3 price:: 14.0
Pizza 4 composition:: Pizza(SmallCrustSize,ThickCrustType,List(Cheese, Pepperoni, Sausage))
```

5. The POS system is recorded in the console.

### Via Terminal

For run the program in a Terminal you should run the next steps:

1. Navigate to the folder project.

``` 
cd scala-fp-simplified/pizza_pos_functional_objects`
```

2. Run the next command:

```
sbt run
```

3. After some seconds you will see the next text in the terminal:

```
Pizza 3 composition:: Pizza(LargeCrustSize,ThinCrustType,List(Cheese, Pepperoni, Olives))
Pizza 3 price:: 14.0
Pizza 4 composition:: Pizza(SmallCrustSize,ThickCrustType,List(Cheese, Pepperoni, Sausage))
```
