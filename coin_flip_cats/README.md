# Coin Flip Game Using the Cats `IO` Monad

This is a version of the "Coin Flip" game that uses the Cats `IO` monad. The
idea is show how you can write the game in a `for` expression that uses
recursion.

The `IO` monad helps us to use all the I/O function in the `for` expression.

## How to run the program

We have two options to run the coin flip with cats program. The first one is 
via the IntelliJ editor and the second one is using your Terminal.

### Via IntelliJ

For run the program with IntelliJ you should run the next steps:

1. Open the `CoinFlipCats.scala` file
2. In the line number 10, you will see a green right arrow next to the line 
   number; click on it
3. Select the option "Run 'CoinFlipCats'"
4. The run panel will be open and after some seconds. You will see the next 
   text:

```
(h)eads, (t)ails, or (q)uit:
```
5. Let's guess :).

### Via Terminal

For run the program in a Terminal you should run the next steps:

1. Navigate to the folder project.

``` 
cd scala-fp-simplified/coin_flip_cats`
```

2. Run the next command:

```
sbt run
```

3. After some seconds you will see the next text in the terminal:

```
(h)eads, (t)ails, or (q)uit:
```
4. Let's guess :).
