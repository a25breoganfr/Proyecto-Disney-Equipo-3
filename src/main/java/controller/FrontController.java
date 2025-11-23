/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controller.loginRegister.LoginRegisterController;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import main.UtilitiesDisney;
import static main.UtilitiesDisney.personajes;
import model.CharacterInfo;
import model.User;
import model.Users;
import view.LoginRegisterJDialog;
import view.MainJFrame;

/**
 *
 * @author nerea
 */
public class FrontController {

    private MainJFrame view;
    private Users usersModel;
    private CharacterInfo modelInfo;
    private boolean usuarioLogin = false;
    private String nombreUsuario = "";
    private CharacterInfo personajeActual;

    public FrontController(MainJFrame view, Users usersModel, CharacterInfo modelInfo) {
        this.view = view;
        this.usersModel = usersModel;
        this.modelInfo = modelInfo;
        initComponents();
        this.view.addJButtonActionListener(this.getAddJButtonActionListener());
        this.view.addCancelJButtonActionListener(this.getCancelJButtonActionListener());
        this.view.addLoginJButtonActionListener(this.getLoginJButtonActionListener());
        this.view.addRegisterJButtonActionListener(this.getRegisterJButtonActionListener());
        this.view.addSearchJButtonActionListener(this.getSearchJButtonActionListener());

    }

    public void actualizarLogin() {
        if (usuarioLogin) {
            view.setEnableAddJButton(Boolean.TRUE);
            view.setEnableMoviesJTextField(Boolean.TRUE);
        } else {
            view.setEnableAddJButton(Boolean.FALSE);
            view.setEnableMoviesJTextField(Boolean.FALSE);
        }
    }

    public void notificarLogin(boolean loguin, String username) {
        this.usuarioLogin = loguin;
        this.nombreUsuario = username;
        actualizarLogin();

    }

    public void initComponents() {
        view.setVisibleLabelImage(Boolean.FALSE);
        view.setVisibleTextAreal(Boolean.FALSE);
    }

    public void changeImage() {
        ImageIcon image = new ImageIcon(getClass().getResource("/imagenes/logo1.png"));
        view.getImagetoLabel(image);
    }

    public void imageCharacter(String ruta) {
        ImageIcon image = new ImageIcon(getClass().getResource(ruta));
        view.getImageCharacterLabel(image);
    }

    public ActionListener getAddJButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!usuarioLogin) {
                    JOptionPane.showMessageDialog(view, "Necesitar estar registrado para poder añadir películas", "Login requerido", JOptionPane.WARNING_MESSAGE);
                } else if (personajeActual == null) {
                    JOptionPane.showMessageDialog(view, "Escribe un personaje antes de añadir películas", "Personaje no seleccionando", JOptionPane.WARNING_MESSAGE);
                } else {
                    String nuevaPelicula = view.getFilmsTextField();
                    if (nuevaPelicula.isEmpty()) {
                        JOptionPane.showMessageDialog(view, "Escribe una película", "Campo vacío", JOptionPane.ERROR_MESSAGE);
                    } else {
                        personajeActual.getFilms().add(nuevaPelicula);
                        view.setListFilmsTextArea(personajeActual.getFilms());
                        JOptionPane.showMessageDialog(view, "Película " + nuevaPelicula + " añadida correctamente a " + personajeActual.getName(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        view.setFilmsTextField("");
                        guardarCambiosEnArchivo();
                    }
                }
            }
        };
        return al;
    }

    private void guardarCambiosEnArchivo() {
        try {
            if (personajeActual == null) {
                return;
            }

            CharacterInfo[] todosPersonajes = UtilitiesDisney.personajes;

            for (int i = 0; i < todosPersonajes.length; i++) {
                if (todosPersonajes[i].getId().equals(personajeActual.getId())) {
                    todosPersonajes[i] = personajeActual;
                    break;
                }
            }

            // Guardar en el archivo JSON
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileWriter fw = new FileWriter("personajesDisney.json");
            gson.toJson(todosPersonajes, fw);
            fw.close();

            System.out.println("Cambios guardados en el archivo para: " + personajeActual.getName());

        } catch (Exception e) {
            System.out.println("Error al guardar en archivo: " + e.getMessage());
        }
    }

    public ActionListener getCancelJButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                view.setCharacterJTextField(" ");
                view.setVisibleLabelImage(Boolean.FALSE);
                view.setVisibleTextAreal(Boolean.FALSE);
                view.setVisibleNameLabel(Boolean.FALSE);

            }
        };
        return al;
    }

    public ActionListener getLoginJButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LoginRegisterJDialog jfl = new LoginRegisterJDialog(view, true);
                jfl.setVisibleRegisterJButton(Boolean.FALSE);
                jfl.setVisibleLableRegister(Boolean.FALSE);
                jfl.setVisibleLabelConfirmedPassword(Boolean.FALSE);
                jfl.setVisilePasswordJTextField(Boolean.FALSE);
                jfl.getContentPane().setBackground(new Color(121, 205, 247));
                LoginRegisterController lg = new LoginRegisterController(jfl, usersModel, FrontController.this);
                jfl.setVisible(true);

            }
        };
        return al;
    }

    public ActionListener getRegisterJButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LoginRegisterJDialog jfr = new LoginRegisterJDialog(view, true);
                jfr.setVisibleLoginJButton(Boolean.FALSE);
                jfr.setVisibleLabelLogin(Boolean.FALSE);
                jfr.getContentPane().setBackground(new Color(121, 205, 247));
                LoginRegisterController lg = new LoginRegisterController(jfr, usersModel, FrontController.this);
                jfr.setVisible(true);
            }
        };
        return al;
    }

    public ActionListener getSearchJButtonActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                view.setVisibleLabelImage(Boolean.TRUE);
                view.setVisibleTextAreal(Boolean.TRUE);
                view.setVisibleNameLabel(Boolean.TRUE);
                String textoPersonaje = view.getCharacterJTextField();
                CharacterInfo esEncontrado = UtilitiesDisney.getCharacterByName(textoPersonaje);
                if (esEncontrado != null) {
                    personajeActual = esEncontrado;
                    view.setNameLabel(esEncontrado.getName());
                    view.setListFilmsTextArea(esEncontrado.getFilms());
                    System.out.println(esEncontrado.getFilms());
                    String ruta = "/imagenes/";
                    imageCharacter(ruta + textoPersonaje + ".png");

                } else {
                    view.setNameLabel("PERSONAJE NO EXISTE");
                    view.setVisibleTextAreal(Boolean.FALSE);
                    personajeActual = null;
                }

            }
        };
        return al;
    }
}
