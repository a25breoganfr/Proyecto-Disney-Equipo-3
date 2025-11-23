/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import main.UtilitiesDisney;
import static main.UtilitiesDisney.LinkAPI;
import model.CharacterInfo;
import controller.FrontController;
import java.awt.Color;
import model.User;
import model.Users;
import org.w3c.dom.css.RGBColor;
import view.MainJFrame;

/**
 *
 * @author dam2_alu25@inf.ald
 */
public class Disney {

    public static void main(String[] args) throws Exception {

        UtilitiesDisney.LinkAPI();
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.getContentPane().setBackground(new Color(121, 205, 247));
        mainJFrame.setVisible(true);
        Users usersModel = new Users();
        CharacterInfo info = UtilitiesDisney.personajes[0];
        FrontController fc = new FrontController(mainJFrame, usersModel, info);
        fc.changeImage();

    }
}
