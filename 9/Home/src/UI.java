import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

public class UI {
    public UI(int i) {
        initComponents();
        switch (i) {
            case 1:
                inputDialog.setVisible(true);
                break;
            case 2:
                int i2 = 0;
                try {
                    i2 = Service.getInstance().report().size();
                } catch (Exception ex) {
                    System.out.println("failed to report " + ex.getMessage());
                }
                try {
                    String s = "";
                    for (int i3=0 ; i3<i2 ; i3++) {
                        s = nameLabel.getText();
                        nameLabel.setText(s + "<br/>" + Service.getInstance().report().get(i3).getName());
                        s = melliLabel.getText();
                        melliLabel.setText(s + "<br/>" + Service.getInstance().report().get(i3).getMelli());
                    }
                    s = nameLabel.getText();
                    nameLabel.setText("<html>" + s + "</html>");
                    s = melliLabel.getText();
                    melliLabel.setText("<html>" + s + "</html>");
                } catch (Exception ex) {
                    System.out.println("failed to report " + ex.getMessage());
                }
                outputDialog.setVisible(true);
                break;
        }
    }
    private void nameFieldMouseClicked(MouseEvent e) {
        nameField.setText("");
    }
    private void melliFieldMouseClicked(MouseEvent e) {
        melliField.setText("");
    }
    private void ButtonMouseClicked(MouseEvent e) {
        if (nameField.getText().equals("") || nameField.getText().equals("Enter Full Name")) {
            errorLabel.setText("Name can't be empty");
            errorDialog.setVisible(true);
        }
        else if (melliField.getText().equals("") || melliField.getText().equals("Enter Melli ID")) {
            errorLabel.setText("Melli ID can't be empty");
            errorDialog.setVisible(true);
        }
        else {
            try {
                Service.getInstance().save(new Entity().setName(nameField.getText()).setMelli(melliField.getText()));
            } catch (Exception ex) {
                System.out.println("failed to save " + ex.getMessage());
            }
            errorLabel.setText("Successful");
            errorDialog.setVisible(true);
            inputDialog.setVisible(false);
        }
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Mahdyar Mousavi
        inputDialog = new JFrame();
        nameField = new JTextField();
        melliField = new JTextField();
        Button = new JButton();
        errorDialog = new JDialog();
        errorLabel = new JLabel();
        outputDialog = new JFrame();
        nameLabel = new JLabel();
        melliLabel = new JLabel();

        //======== inputDialog ========
        {
            inputDialog.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Container inputDialogContentPane = inputDialog.getContentPane();
            inputDialogContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]"));

            //---- nameField ----
            nameField.setText("Enter Full Name");
            nameField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    nameFieldMouseClicked(e);
                }
            });
            inputDialogContentPane.add(nameField, "cell 0 0");

            //---- melliField ----
            melliField.setText("Enter Melli ID");
            melliField.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    melliFieldMouseClicked(e);
                }
            });
            inputDialogContentPane.add(melliField, "cell 0 1");

            //---- Button ----
            Button.setText("Done");
            Button.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    ButtonMouseClicked(e);
                }
            });
            inputDialogContentPane.add(Button, "cell 0 2");
            inputDialog.setSize(200, 200);
            inputDialog.setLocationRelativeTo(null);
        }

        //======== errorDialog ========
        {
            Container errorDialogContentPane = errorDialog.getContentPane();
            errorDialogContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]",
                // rows
                "[]"));

            //---- errorLabel ----
            errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
            errorDialogContentPane.add(errorLabel, "cell 0 0");
            errorDialog.setSize(200, 100);
            errorDialog.setLocationRelativeTo(null);
        }

        //======== outputDialog ========
        {
            outputDialog.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Container outputDialogContentPane = outputDialog.getContentPane();
            outputDialogContentPane.setLayout(new MigLayout(
                "fill,hidemode 3,align center center",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "[]"));

            //---- nameLabel ----
            nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
            outputDialogContentPane.add(nameLabel, "cell 0 0");

            //---- melliLabel ----
            melliLabel.setHorizontalAlignment(SwingConstants.CENTER);
            outputDialogContentPane.add(melliLabel, "cell 1 0");
            outputDialog.setSize(200, 175);
            outputDialog.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Mahdyar Mousavi
    private JFrame inputDialog;
    private JTextField nameField;
    private JTextField melliField;
    private JButton Button;
    private JDialog errorDialog;
    private JLabel errorLabel;
    private JFrame outputDialog;
    private JLabel nameLabel;
    private JLabel melliLabel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
