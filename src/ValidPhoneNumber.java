import javax.swing.*;

public class ValidPhoneNumber {
public static void main(String[] args) {
    String phoneNumber = JOptionPane.showInputDialog("Please enter a valid phone number:");

    for (char c : phoneNumber.toCharArray()) {
        if (Character.isDigit(c) || c == '-')
            continue;
        JOptionPane.showMessageDialog(null, "Invalid number.");
        return;
    }

    JOptionPane.showMessageDialog(null, "Valid number. Thank you.");
}
}
