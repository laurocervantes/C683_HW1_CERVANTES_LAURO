<div align="center">

Image of BU

<p> </p> <p> </p>

MET BU CS 665 SOFTWARE DESIGN AND PATTERNS
Assignment 3 - Module 3
<p> </p> <p> </p>

Lauro Cervantes Sanchez

<b>Student ID:</b> U79899972 laurocs@bu.edu <p> </p> https://github.com/metcs/met-cs665-assignment-3-laurocervantes

<p> </p> <p> </p>

<h1>README</h1> </div>

<p> </p> <p> </p> <p> </p> <p> </p>

SOFTWARE DESCRIPTION
<div align="justify"> The main purpose of this project is to provide a solution for a changing Email template according to the type of customer a company might need to reach. In order to code this program, the Singleton design pattern was selected for implementation with a modified version of a Facade pattern. A unique instance of EmailGenerator class was implemented to provide consistency to the program and to restrict its access of instantiation intrinsically. This class, contains a private constructor and a method called createEmail() which represents the regular getInstance() method for the Singleton pattern. Also, it contains the method setEmail() with a string variable as a parameter, and this method is the most important part of this program; because with one single call all the algorithms are being executed and the email gets generated. This method was planned that way, in order to provide reliability to the program and most important, to hide the complexity of the project, becoming that way into a spin-off version of a Facade pattern. Also, there is an association between the class EmailGenerator and Emails, by the time of calling the method setEmail() and passing the corresponding name of the customer as a String parameter. Then, different objects of the customer classes will be instantiated because Emails is an abstract class and it cannot be instantiated by itself. This provides flexibility and understandability to the code, due to more customers can be added or removed in the future as depending the company requires to do so, this customers are extending the abstract class Emails and overriding most of its methods. It is important to know all customer classes are very similar, but not identical and they might have or might have not the same methods inside their codes, they have different email tasks on them also. For instance, the class diagram should be verified because of this reason (Lavieri, 2019). <p> </p>

Furthermore, the abstract class Emails is implementing four interfaces who represent the email tasks this program is able to run. All methods and variables are being inherited and used by the customer classes also in a somewhat wrapped algorithm system which is going to be hidden by the EmailGenerator Singleton class. This process, provides the program with more flexibility by the time of adding or removing future email tasks into the code (Freeman & Robson, 2020).

<p> </p> <p> </p> <p> </p>

ASSUMPTIONS
It is imperative to clarify some assumptions have been made by the time of planning and designing this project. First of all, it was assumed the company wanted to have a general template for an email. Just in case they needed to redact a message which could change any time they had to reach one certain type of their customers. With that said, no email body was provided in this code, but a legend to insert a message to be sent to the customer. However, the Header and the Footer are personalized and they change whenever a certain customer type is being selected respectively.

Secondly, to keep simplicity and understandability, it was assumed this project did not need the complexity of the encryption and grammar check Java API’s algorithms classes have and could have been implemented intrinsically. But, the intention of the email tasks was represented by interfaces and they are being executed by the customer classes accordingly, turning this program into a cluster system of classes that work altogether in harmony.

Lastly, this project in particular is represented to send over the email templates to two email addresses in specific, and they get repeated by the time the email template is being printed out. This happened because only one instance of EmailGenerator is being used by all the customer classes, and the List<String> receiver variable was not working if it was not declared as Static. For purposes of simplicity, and to not diving into concurrency algorithm waters and not to provide even more complexity into the code, this process was left like this on purpose. Due to this process is not graded in the Assignment 3 required implementations and it was going to be very difficult to understand and to accomplish without bugs in the code.

<p> </p> <p> </p> <p> </p>

HOW TO COMPILE, TEST AND RUN THE PROGRAM
In order to compile the program, it is necesarry to have installed Maven and then execute the next command in the terminal:

bash - mvn clean compile <p> </p> To succesfully run the tests (no Main method this time):

bash - mvn clean compile test checkstyle:check spotbugs:check

<p> </p>

Just in case the run of the bugs wants to be performed: bash - mvn spotbugs:spotbugs <p> </p>

Also, to be able to verify the Checkstyle: bash mvn checkstyle:check

</div> <p> </p> <p> </p> <p> </p>

BIBLIOGRAPHY
Freeman, E., & Robson, E. (2020). Head First Design Patterns: Building Extensible and Maintainable Object-Oriented Software 2nd Edition (2nd ed.). O’Reilly Media.
Gamma, E. (2021). “Design Patterns: Elements of Reusable Object-Oriented Software” (1st ed.). Pearson Education India.
Lavieri, E. (2019). Hands-On Design Patterns with Java: Learn design patterns that enable the building of large-scale software architectures. Packt Publishing.
Shalloway, A., & Trott, J. (2004). Design Patterns Explained: A New Perspective on Object Oriented Design, 2nd Edition (Software Patterns) (2nd ed.). Addison-Wesley.
