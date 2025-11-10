/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.disney;

import controller.FrontController;
import utilities.Utilities;
import view.MainJFrame;

/**
 *
 * @author dam2_alu10@inf.ald
 */
public class Disney {

    public static void main(String[] args) throws Exception {
       //Utilities.LinkAPI();
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.setVisible(true);
        FrontController fc = new FrontController(mainJFrame);
        fc.changeImage();
    }
}
