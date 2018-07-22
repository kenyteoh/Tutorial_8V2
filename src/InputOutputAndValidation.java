import javax.swing.*;

public class InputOutputAndValidation {

    // Method for showing message dialogs to the user
    public static void showMessage (String message){
        JOptionPane.showMessageDialog(null,message);
    }

    // Method for getting string input from the user and returning the input
    public static String getInput (String message){
        String input = JOptionPane.showInputDialog(message);
        return input;
    }

    //Method to validate user input is a number
    public static boolean isInputValidNumber(String input){
        try {
            int testOutput = Integer.parseInt(input);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    // Method for getting Int input from the user and returning the Int input after validating it is a number
    public static Integer getIntInputAndValidate (String message){

        // Create a string input from the user
        String intRequestAsString = getInput(message);

        // Check the string input is a number, if not request again
        while(!isInputValidNumber(intRequestAsString)){
            intRequestAsString = getInput("Not a valid number!\n"+message);
        }

        //Parse the string to a Int and return it
        int output = Integer.parseInt(intRequestAsString);
        return output;
    }
}
