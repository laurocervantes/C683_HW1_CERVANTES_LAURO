 
 
 
MET BU CS 683 MOBILE APPLICATION DEVELOPMENT
Lab 1 - Module 1
 
 
Lauro Cervantes Sanchez
Student ID: U79899972 laurocs@bu.edu
 
https://github.com/laurocervantes/C683_HW1_CERVANTES_LAURO
 
 
README

LAB RESULTS AND DISCOVERIES:
After the implementation of this Lab, it was possible to install Android Studio, and to create a new app. This app will be used for my project throughout this course. Other than that, the app has two activities, and the Activity Life Cycle Logs were tested in both while testing different scenarios. The results with their proper tests and screenshots can be seen up next:
A)	App is running for the first time, On Create and On Start callbacks are called on Main Activity.


 
 
 
B)	Screen is rotated on Main Activity; Callbacks did not occur. Still On Create, On Start are still called

C)	Back button is pressed on Main Activity, On Pause, On Stop and On Destroy are being called.
D)	On Main Activity, home button is pressed: On Pause and On Stop callbacks are being called.
E)	On Main Activity overview button is being pressed: On Pause and On stop callbacks are being called
F)	On Main Activity, App is being closed from Overview button: On Pause, On Stop and On destroy callbacks are being called.
G)	From Main Activity, user travels to a different Activity Screen: On Pause and On Stop callbacks are being called for Main Activity.
H)	On Hello World Activity, user travels here from Main Activity: On Create and On Start callbacks are being called.
I)	On Hello World Activity, user rotates screen. No callbacks are being called:
BIBLIOGRAPHY
•	Griffiths, D., & Griffiths, D. (2021). Head First Android Development: A Learner’s Guide to Building Android Apps with Kotlin (3rd ed.). O’Reilly Media.
•	Forrester, A., Boudjnah, E., Dumbravan, A., & Tigcal, J. (2021). How to Build Android Apps with Kotlin: A hands-on guide to developing, testing, and publishing your first apps with Android. Packt Publishing.




