# Functional programming version of the pizza POS system

This project contains the code for FP "modular programming" version of the *
*Domain Modeling** lessons in the
book [Functional programming simplified](https://alvinalexander.gumroad.com/l/lfpis)
by Alvin Alexander

## How to run the program

We have two options to run the pizza POS modular functional programming program.
The first one is via the IntelliJ editor and the second one is using your
Terminal.

### Via IntelliJ

For run the program with IntelliJ you should run the next steps:

1. Open the `Main.scala` file
2. In the line number 7, you will see a green right arrow next to the line
   number; click on it
3. Select the option "Run 'Main'"
4. The run panel will be open and after some seconds. You will see the next
   text:

```
Customer (Customer(Sergio Benitez,907-555-2121,Address(1 Main Street,None,Talkeetna,AK,99676)))
Pizzas (List(
Pizza (MediumCrustSize, RegularCrustType), toppings = List(Cheese), 
Pizza (LargeCrustSize, ThickCrustType), toppings = List(Cheese, Pepperoni, Mushrooms)))
```

5. The POS system is recorded in the console

### Via Terminal

For run the program in a Terminal you should run the next steps:

1. Navigate to the folder project.

``` 
cd scala-fp-simplified/pizza_pos_fp_modular
```

2. Run the next command:

```
sbt run
```

3. After some seconds you will see the next text in the terminal:

```
Customer (Customer(Sergio Benitez,907-555-2121,Address(1 Main Street,None,Talkeetna,AK,99676)))
Pizzas (List(
Pizza (MediumCrustSize, RegularCrustType), toppings = List(Cheese), 
Pizza (LargeCrustSize, ThickCrustType), toppings = List(Cheese, Pepperoni, Mushrooms)))
```
