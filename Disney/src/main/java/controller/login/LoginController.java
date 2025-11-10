/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.login;

import controller.FrontController;
import model.Usuario;
import view.JFrameLogin;

/**
 *
 * @author nerea
 */
public class LoginController {
    private JFrameLogin view;
    private Usuario model;
    private FrontController parentController;

    public LoginController(JFrameLogin view, Usuario model, FrontController parentController) {
        this.view = view;
        this.model = model;
        this.parentController = parentController;
    }
    
}
