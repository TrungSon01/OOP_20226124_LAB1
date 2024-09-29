import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        // Custom button options
        String[] options = {"YES", "NO"};

        // Show the option dialog
        int option = JOptionPane.showOptionDialog(
            null, 
            "Do you want to change to the first class ticket?", 
            "Choose an Option", 
            JOptionPane.DEFAULT_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0] // Default selection
        );

        // Display the result based on the user's choice
        if (option == 0) {
            JOptionPane.showMessageDialog(null, "You've chosen: YES");
        } else if (option == 1) {
            JOptionPane.showMessageDialog(null, "You've chosen: NO");
        } else {
            JOptionPane.showMessageDialog(null, "No option selected.");
        }

        System.exit(0);
    }
}
