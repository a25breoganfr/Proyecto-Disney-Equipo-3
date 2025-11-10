/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import main.UtilidadesDisney;
import static main.UtilidadesDisney.LinkAPI;
import model.CharacterInfo;
import controller.FrontController;
import model.Usuario;
import view.MainJFrame;

/**
 *
 * @author dam2_alu25@inf.ald
 */
public class Disney {

    public static void main(String[] args) throws Exception {
       
        UtilidadesDisney.LinkAPI();
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.setVisible(true);
        Usuario model = new Usuario();
        FrontController fc = new FrontController(mainJFrame, model);
        fc.changeImage();

    }
}
