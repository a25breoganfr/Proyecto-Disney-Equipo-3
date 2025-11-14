/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.loginRegister;

import controller.FrontController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.User;
import view.JFrameLoginRegister;

/**
 *
 * @author nerea
 */
public class LoginRegisterController {
    private JFrameLoginRegister view;
    private User model;
    private FrontController parentController;

    public LoginRegisterController(JFrameLoginRegister view, User model, FrontController parentController) {
        this.view = view;
        this.model = model;
        this.parentController = parentController;
        this.view.loginJButtonActionListener(this.getLoginActionListener());
        this.view.cancelJButtonActionListener(this.getCancelActionListener());
    }
    public void initComponets(){
    }
    public ActionListener getLoginActionListener(){
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("LOGIN");
            }
        };
        return al;     
    }
    public ActionListener getCancelActionListener(){
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                view.dispose();
            }
        };
        return al;
    }
    public ActionListener getRegisterActionListener(){
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("REGISTER");
            }
        };
        return al;
    }
}
