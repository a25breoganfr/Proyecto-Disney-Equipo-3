/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import controller.login.LoginController;
import controller.register.RegisterController;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import model.Usuario;
import view.JFrameLogin;
import view.JFrameRegistro;
import view.MainJFrame;

/**
 *
 * @author nerea
 */
public class FrontController {

    private MainJFrame view;
    private Usuario model;

    public FrontController(MainJFrame view, Usuario model) {
        this.view = view;
        this.model = model;
        this.view.addSaveJButtonActionListener(this.getSaveJButtonActionListener());
        this.view.addCancelJButtonActionListener(this.getCancelJButtonActionListener());
        this.view.addLoginJButtonActionListener(this.getLoginJButtonActionListener());   
        this.view.addRegisterJButtonActionListener(this.getRegisterJButtonActionListener());
    }


    public void changeImage() {
        ImageIcon image = new ImageIcon(getClass().getResource("/imagenes/logo1.png"));
        view.getImagetoLabel(image);
    }
    
    public ActionListener getSaveJButtonActionListener(){
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("SAVE");
            }
        };
        return al;
    }
    
    public ActionListener getCancelJButtonActionListener(){
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("CANCEL");
            }
        };
        return al;
    }
    public ActionListener getLoginJButtonActionListener(){
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFrameLogin jfl = new JFrameLogin(view, true);
                LoginController lg = new LoginController(jfl, model, FrontController.this);
                jfl.setVisible(true);
            }
        };
        return al;
    }
    public ActionListener getRegisterJButtonActionListener(){
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFrameRegistro jfr = new JFrameRegistro(view, true);
                RegisterController rg = new RegisterController(jfr, model, FrontController.this);
                jfr.setVisible(true);
            
            }
        };
        return al;
    }
}
