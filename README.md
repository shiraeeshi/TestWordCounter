# TestWordCounter

A simple console application that counts words in a given file. 
It determines all the words occuring in the file and for each of them it counts how many times that word does occur in the file.
The application writes the result to the console or to the file. It depends on input arguments.

For example, let's say you have some input file located at /home/user/words.txt.
- If you need the application to print the result to the console, run the application with this command:

`mvn exec:java -Dexec.mainClass=kz.example.WordCounterApplication -Dexec.args="/home/user/words.txt console"`

- If you need the result to be written to a file /home/user/result.txt, then use this command:

`mvn exec:java -Dexec.mainClass=kz.example.WordCounterApplication -Dexec.args="/home/user/words.txt /home/user/result.txt"`
