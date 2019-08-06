# Basics

## Contents
Below are a list of methods contained within this repo:

### Pluralize
pluralize is a method that takes in a word and a number.  It returns a string with the word pluralized if the number is greater than 1 or equal to 0.

### FlippingCoins
flipNHeads is a method that takes in an integer ```n``` and flips coins until ```n``` heads are flipped in a row.  Coin flipping is simulated by choosing a number between ```0``` and ```1```.  Numbers below ```0.5``` are considered tails while numbers above ````0.5``` are considered heads.  

### Command Line Clock
clock is a method that uses Java's built-in ```LocalDateTime``` object to constantly print out the current time to the console, second by second.  The program can be stopped with ```CTRL-C```.  The program detects when the second increases and only prints something out when the time stamp changes.


## Acknowledgements
The clock code came from this [tutorial](https://www.youtube.com/watch?v=36jbBSQd3eU).