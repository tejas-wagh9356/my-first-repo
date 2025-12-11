ATM INTERFACE

🧑‍💻 Objective

The objective of this project is to develop a console-based ATM Interface using Java that simulates basic banking operations.
The system allows users to log in securely and perform various ATM operations such as Withdraw, Deposit, Transfer, Transaction History, and Exit.

This project demonstrates Object-Oriented Programming (OOP) concepts, user input handling, conditional decision-making, loops, and class–object implementation.

Tools & Technologies Used

Category	Tools / Tech
Programming Language/ Java IDE / Editor	VS Code

Features of the ATM System

✔ 1. User Login System

User ID and PIN authentication

Prevents unauthorized access

✔ 2. Transaction History

Stores and displays all past transactions:

Withdraw

Deposit

Transfer

✔ 3. Withdraw Money

Checks for sufficient balance

Updates account balance after successful withdrawal

✔ 4. Deposit Money

Allows user to add money

Stores deposit records

✔ 5. Transfer Money

Sends money to another user

Stores transfer details

✔ 6. Exit

Safely terminates the ATM session

Project Structure
ATM_Project/

├── ATM.java        
├── Main.java       
└── README.md 

How to Run the Project
Step 1: Open Terminal / CMD

Go to project folder:

cd ATM_Project

Step 2: Compile the Java files
javac Main.java ATM.java

Step 3: Run the program
java Main

🔐 Default Login Credentials
Field	Value
User ID	admin
PIN	1234
🖥 Sample Output
WELCOME TO ATM INTERFACE
Enter User ID: admin
Enter PIN: 1234

===== ATM MENU =====
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Enter your choice:

📝 Conclusion

This ATM Interface project successfully demonstrates the use of Java programming to build a fully functional,
console-based banking simulation. It incorporates core programming concepts such as OOP, control statements, user input handling, and modular coding.
