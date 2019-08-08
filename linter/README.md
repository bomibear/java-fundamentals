# Maps, File I/O, and Testing

## Contents

### Linter
This application reads in a file and checks for linter errors.  A linter error consists of a missiing semicolon as long as the line is not empty, doesn't end with an opening curly brace, end with a closing curly brace, and doesn't contain an ```if``` or an ```else```. 

### Weather
This class determines the highest and lowest temperature given a month's worth of temperatures.  It then finds out which temperatures, between the highest and the lowest, were never seen that month.

### Election
This class tallies votes for a given list of candidates and determines who received the most votes.  

## Resources
The test suggestions for weather were referenced [here](https://stackoverflow.com/questions/1201927/is-javas-assertequals-method-reliable).

The code to iterate through the HashMap and determine the winner was referenced [here](https://www.leveluplunch.com/java/examples/find-max-value-in-map/).

Linter was able to read in files with this code referenced [here](https://www.journaldev.com/709/java-read-file-line-by-line).

Properties of Java strings (e.g. startsWith, endsWith, contains) were refenced [here](https://beginnersbook.com/2013/12/java-strings/).

Testing an empty file was referenced here [here](https://stackoverflow.com/questions/7190618/most-efficient-way-to-check-if-a-file-is-empty-in-java-on-windows);