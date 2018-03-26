import javax.swing.*;

public class ValidPhoneNumber {
// Written by: Mike Baldwin
// Project 6 - Part 1 - Valid Phone Numbers
// This program reads in a string and checks whether it has the correct format.
// The only format that has to be checked is "###-###-####"

public static void main(String[] args) {
    String phoneNumber = JOptionPane.showInputDialog("Please enter a valid phone number:");

    if (isValid(phoneNumber))
        JOptionPane.showMessageDialog(null, "Valid number.");
    else
        JOptionPane.showMessageDialog(null, "Invalid number.");
}

private static boolean isValid(String phNum) {
    for (int i = 0; i < phNum.length(); i++) {
        if (Character.isDigit(phNum.charAt(i)) || (phNum.charAt(i) == '-' && (i == 3 || i == 7)))
            continue;
        return false;
    }

    return true;
}
}
