## Password Requirements
This command line program takes in a potential password as an argument to the main method and will evaluate whether it is a valid password.

### Criteria
The password is valid when it passes three different tests:  
#### Valid Elements
If a password only contains valid characters, it will pass the test. If the password contains an invalid character, it will not pass the test and is not a valid password.  
The valid characters are upper and lowercase letters a-z, numbers 0-9, and the characters ~ ! @ # $ % ^ & * ( ) - = + _
#### Length
The password must have a length between 8 and 16 characters, inclusive. If the password length is outside this range, it will not pass the test.
#### Contains Character Types
The password must contain at least three of the four types of characters listed below:  
Type 1: lowercase letters a-z  
Type 2: uppercase letters A-Z  
Type 3: numbers 0-9  
Type 4: special characters ~ ! @ # $ % ^ & * ( ) - = + or _  
If the password contains less than 3 of these types, the password will not be valid.