import javax.swing.*;

public class ValidPhoneNumber {
public static void main(String[] args) {
    String phoneNumber = JOptionPane.showInputDialog("Please enter a valid phone number:");

    if (isValid(phoneNumber))
        JOptionPane.showMessageDialog(null, "Valid number. Thank you.");
}

private static boolean isValid(String phNum) {
    int count;

    if (phNum.length() != 12)
        return false;

        count = 0;
    for (char c : phNum.toCharArray()) {
        count++;
        if (Character.isDigit(c) || (c == '-' && (count == 4 || count == 8)))
            continue;
        JOptionPane.showMessageDialog(null, "Invalid number.");
        return false;
    }

    return true;
}
}
