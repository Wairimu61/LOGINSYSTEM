#Login System

## Description
This project is a Java console-based login system designed to demonstrate
secure authentication and input validation techniques.

## Features
- Accepts alphanumeric usernames (letters and numbers only)
- Masks password input during entry
- Allows a maximum of three login attempts
- Temporarily locks the user for 30 seconds after three failed attempts
- Resets login attempts after the lockout period

## How to Run
1. Compile the program:
   javac LoginSystem.java
2. Run the program:
   java LoginSystem

## Demo Credentials
Username: Ann001
Password: admin1

## Important Note
Password masking is implemented using System.console().readPassword().
This feature works when the program is executed from a local terminal
or command prompt. Some online IDEs may not support this functionality.

## Author
Ann Doreen Wairimu Gitari
