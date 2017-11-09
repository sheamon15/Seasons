import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Seasons {
   public enum AccountType{ January, February , March , April , May , June , July , August , September , October , November, December}

    public static void main(String[] args){
        AccountType[] choices = { AccountType.January, AccountType.February, AccountType.March, AccountType.April, AccountType.May , AccountType.June , AccountType.July, AccountType.August, AccountType.September, AccountType.October, AccountType.November, AccountType.December};
        AccountType input = (AccountType) JOptionPane.showInputDialog(null, "Select your account Type", "AccountType", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);

        while (input != null){
            switch (input){
                case December:
                case January:
                case February:
                    showMessageDialog(null, "Do you want to build a snow man?");
                    System.exit(0);
                    break;


                case March:
                case April:
                case May:
                    showMessageDialog(null, "Happy Spring Days!");
                    System.exit(0);
                    break;

                case June:
                case July:
                case August:
                    showMessageDialog(null, "It's Summer Time!");
                    System.exit(0);
                    break;

                case September:
                case October:
                case November:
                    showMessageDialog(null, "Welcome to the foilage season!");
                    System.exit(0);
                    break;

            }

            input = (AccountType) JOptionPane.showInputDialog(null,"Select your account type.", "AccountType", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
        }
    }
}

