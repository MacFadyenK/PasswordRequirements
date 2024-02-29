public class App {
    //checks if a password is valid
    //prints affirmative message if it is valid
    //if the password is not valid, it will print the reason it is not valid
    public void isValidPassword(String password){
        //password has an invalid character
        if(!hasValidCharacters(password)){
            System.out.println("Password contains an invalid character type");
            return;
        }
        //password is not long enough or too long
        if(!validPassLength(password)){
            System.out.println("Password must be between 8 and 16 characters");
            return;
        }
        //password does not contain at least 3 of the 4 categories of characters
        if(!isCombination(password)){
            System.out.println("Password is missing an element.\nPassword must contain 3 of the following categories:");
            System.out.println("lowercase letters a-z\nuppercase letters A-Z\nnumbers 0-9\nSymbols ~, !, @, #, $, %, ^, &, *, (, ), -, =, +, or _");
            return;
        }

        //password is valid if it reaches this point
        System.out.println("Your password is valid");
    }

    //returns true if the string is between 8 and 16 characters, inclusive
    //returns false if the string is less than 8 or more than 16 characters
    public boolean validPassLength(String password){
        if(password.length() >= 8 && password.length() <=16){
            return true;
        }else{
            return false;
        }
    }

    //returns true if the string contains only the valid character types
    //valid types: letters both upper and lowercase, numbers, and the following symbols: ~!@#$%^&*()-=+_
    //returns false if the string contains an invalid character
    public boolean hasValidCharacters(String password){
        char[] passArray = password.toCharArray();
        //loops through character array of input string
        for(int i = 0; i<passArray.length; i++){
            char ch = passArray[i];
            //if character is not valid
            if(!isLowerCase(ch) && !isUpperCase(ch) && !isNumber(ch) && !isSymbol(ch)){
                return false;
            }
        }
        //string is valid if this point is reached
        return true;
    }
    
    //returns true if the string is a combination of at least 3 out of 4 categories
    //categories: lowercase letters, uppercase letters, numbers, and symbols
    //returns false if the string contains less than 3 of the categories
    public boolean isCombination(String password){
        //value is 0 when category is not found and 1 when it is found
        int lowercase = 0;
        int uppercase = 0;
        int number = 0;
        int symbol = 0;

        //loop through the character array of the string input
        //if the character is one of the four categories, the corresponding variable will be assigned 1
        //indicating that the string contains that category
        char[] passArray = password.toCharArray();
        for(int i = 0; i < passArray.length; i++){
            char ch = passArray[i];
            if(isLowerCase(ch)){
                lowercase = 1;
            }
            if(isUpperCase(ch)){
                uppercase = 1;
            }
            if(isNumber(ch)){
                number = 1;
            }
            if(isSymbol(ch)){
                symbol = 1;
            }
        }

        //adds together categories
        //if the categories add up to 3 or more, than it contains 3 or more of the categories
        if((lowercase+uppercase+number+symbol) >= 3){
            return true;
        }else{
            return false;
        }
    }

    //returns true if the character is a lower case letter a-z
    //returns false if the character is not a lower case letter
    private static boolean isLowerCase(char a){
        switch (a) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    //returns true if the character is an uppercase letter A-Z
    //returns false if the character is not an uppercase letter
    private static boolean isUpperCase(char a){
        switch (a) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return true;
            default:
                return false;
        }
    }

    //returns true if the character is a number 0-9
    //returns false if the character is not a number
    private static boolean isNumber(char a){
        switch (a){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default:
                return false;
        }
    }

    //returns true if the character is one of the special symbols ~!@#$%^&*()-=+_
    //returns false if the character is not one of the symbols
    private static boolean isSymbol(char a){
        switch (a){
            case '~':
            case '!':
            case'@':
            case '#':
            case'$':
            case '%':
            case '^':
            case '&':
            case '*':
            case '(':
            case ')':
            case '-':
            case '=':
            case '+':
            case '_':
                return true;
            default:
                return false;
        }
    }
    public static void main(String[] args) throws Exception {
        try {
            String pass = args[0];
            App app = new App();
            app.isValidPassword(pass);
        } catch (Exception e) {
            System.out.println("No input has been given");
        }
    }
}
