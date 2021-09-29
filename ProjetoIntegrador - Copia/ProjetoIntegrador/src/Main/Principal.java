/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import view.jfPesquisaMedicamentos;
import view.jfPesquisaUsuarios;
import controler.CMedicamento;
import controler.CUsuario;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.ListaUsuarios;

/**
 *
 * @author Yuri e Igor
 */
public class Principal extends JFrame implements ActionListener {

    public static CUsuario cadUsuarios = new CUsuario();

    public static CMedicamento cadMedicamentos = new CMedicamento();

    JTextArea output;
    JScrollPane scrollPane;

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("Aba de Opções: ");
        menu.setMnemonic(KeyEvent.VK_C);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        /*Usuario*/
        menuItem = new JMenuItem("Menu dos Usuarios",
                KeyEvent.VK_U);

        menuItem.setActionCommand("menuUsuario");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        /*Medicamento*/
        menuItem = new JMenuItem("Lista de Medicamentos",
                KeyEvent.VK_M);

        menuItem.setActionCommand("menuMed");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        return menuBar;

    }

    public void actionPerformed(ActionEvent e) {
        if ("menuUsuario".equals(e.getActionCommand())) {
            try {
                jfPesquisaUsuarios pu = new jfPesquisaUsuarios();
                pu.setVisible(true);
                pu.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("menuMed".equals(e.getActionCommand())) {
            try {
                jfPesquisaMedicamentos pm = new jfPesquisaMedicamentos();
                pm.setVisible(true);
                pm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Container createContentPane() {
        //Create the content-pane-to-be.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);

        //Create a scrolled text area.
        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);

        //Add the text area to the content pane.
        contentPane.add(scrollPane, BorderLayout.CENTER);

        return contentPane;
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Página Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        Principal demo = new Principal();
        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());

        //Display the window.
        frame.setSize(450, 260);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        cadUsuarios.UsuarioMok();
        cadMedicamentos.MedicamentoMok();

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }

}
