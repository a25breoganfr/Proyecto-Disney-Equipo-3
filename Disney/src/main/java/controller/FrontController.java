/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Image;
import javax.swing.ImageIcon;
import view.MainJFrame;

/**
 *
 * @author nerea
 */
public class FrontController {

    private MainJFrame view;

    public FrontController(MainJFrame view) {
        this.view = view;
    }

    public void changeImage() {
        ImageIcon image = new ImageIcon(getClass().getResource("/imagenes/logo1.png"));
        view.getImagetoLabel(image);
    }
}
