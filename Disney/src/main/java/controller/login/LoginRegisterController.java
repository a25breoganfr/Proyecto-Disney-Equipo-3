/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.login;

import controller.FrontController;
import model.Usuario;
import view.JFrameLoginRegister;

/**
 *
 * @author nerea
 */
public class LoginRegisterController {
    private JFrameLoginRegister view;
    private Usuario model;
    private FrontController parentController;

    public LoginRegisterController(JFrameLoginRegister view, Usuario model, FrontController parentController) {
        this.view = view;
        this.model = model;
        this.parentController = parentController;
    }
    
}
