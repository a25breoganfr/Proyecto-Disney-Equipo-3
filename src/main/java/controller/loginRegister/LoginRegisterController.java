/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.loginRegister;

import controller.FrontController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.User;
import model.Users;
import view.LoginRegisterJDialog;

/**
 *
 * @author nerea
 */
public class LoginRegisterController {

    private LoginRegisterJDialog view;
    private Users model;
    private FrontController parentController;
    private boolean isLogged = false;
    private String usuarioLoguin = "";

    public LoginRegisterController(LoginRegisterJDialog view, Users model, FrontController parentController) {
        this.view = view;
        this.model = model;
        this.parentController = parentController;
        this.view.loginJButtonActionListener(this.getLoginActionListener());
        this.view.cancelJButtonActionListener(this.getCancelActionListener());
        this.view.registerJButtonActionListener(this.getRegisterActionListener());
    }

    public void initComponets() {

    }

    public ActionListener getLoginActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String username = view.getUserNameTextFiel();
                String password = view.getPasswordTextField();

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(view, "Completa los campos", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
                }else if (model.login(username, password)) {
                    JOptionPane.showMessageDialog(view, "Usuario logueado", "Login realizado", JOptionPane.INFORMATION_MESSAGE);

                    // Notificar al FrontController
                    parentController.notificarLogin(true, username);
                    view.dispose();
                } else {
                    JOptionPane.showMessageDialog(view, "Usuario o contraseña incorrectos", "Error usuario", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        return al;
    }

    public ActionListener getCancelActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                view.dispose();
            }
        };
        return al;
    }

    public ActionListener getRegisterActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String username = view.getUserNameTextFiel();
                String password = view.getPasswordTextField();
                String confirmPassword = view.getConfirmedPasswordTextField();

                if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(view, "Completa los campos", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
                }else if (model.registerUser(username, password, confirmPassword)) {
                    JOptionPane.showMessageDialog(view, "Usuario registrado", "Usuario registrado", JOptionPane.INFORMATION_MESSAGE);

                    // Notificar al FrontController
                    parentController.notificarLogin(true, username);
                    view.dispose();
                } else {
                    if (model.exists(username)) {
                        JOptionPane.showMessageDialog(view, "El usuario ya existe", "Error usuario", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(view, "Las contraseñas no coinciden", "Error contraseña", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        };
        return al;
    }
}
