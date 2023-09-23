package controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Hash;
import model.SQL_Users;
import model.Users;

import javax.swing.JOptionPane;

public class Register_Controller {

    @FXML
    private PasswordField pwf_pass, pwf_confirmPass;

    @FXML
    private TextField txt_user, txt_name, txt_email;

    @FXML
    void register() {

        SQL_Users modSql = new SQL_Users();
        Users mod = new Users();

        String pass = pwf_pass.getText();
        String passCon = pwf_confirmPass.getText();

        if (pass.equals(passCon)) {

            String newPass = Hash.sha1(pass);

            mod.setUser(txt_user.getText());
            mod.setPassword(newPass);
            mod.setName(txt_name.getText());
            mod.setEmail(txt_email.getText());
            mod.setId_type(1);

            if (modSql.register(mod)) {

                JOptionPane.showMessageDialog(null, "Register has been saved", "Info", JOptionPane.INFORMATION_MESSAGE);
                clear();

            } else {

                JOptionPane.showMessageDialog(null, "Register has not been saved", "Error", JOptionPane.ERROR_MESSAGE);

            }

        } else {

            JOptionPane.showMessageDialog(null, "Passwords did not match", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }

    private void clear() {

        txt_user.setText("");
        pwf_pass.setText("");
        pwf_confirmPass.setText("");
        txt_name.setText("");
        txt_email.setText("");
        txt_user.requestFocus();

    }

    @FXML
    public void close_Request() {

        int confirm = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Closing",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.OK_OPTION) {

            JOptionPane.showMessageDialog(null, "Thanks for use the Users Register System App",
                    "Closing", JOptionPane.INFORMATION_MESSAGE);

            Platform.exit();

        }
    }

}