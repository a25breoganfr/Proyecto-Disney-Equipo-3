/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import model.Usuario;
import view.JFrameLogin;
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
                JFrameLogin jf = new JFrameLogin(view, true);
            
            }
        };
        return al;
    }
}
