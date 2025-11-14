/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import main.UtilitiesDisney;
import static main.UtilitiesDisney.LinkAPI;
import model.CharacterInfo;
import controller.FrontController;
import model.User;
import view.MainJFrame;

/**
 *
 * @author dam2_alu25@inf.ald
 */
public class Disney {

    public static void main(String[] args) throws Exception {
       
        UtilitiesDisney.LinkAPI();
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.setVisible(true);
        User model = new User);
        FrontController fc = new FrontController(mainJFrame, model);
        fc.changeImage();

    }
}
