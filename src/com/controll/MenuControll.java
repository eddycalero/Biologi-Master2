package com.controll;

import com.views.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Eddy
 */
public class MenuControll implements ActionListener {

    private Menu menu;

    public MenuControll(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Las Celulas":
                JOptionPane.showMessageDialog(null, "Hola" );
                break;
            case "Las Rocas":
                 JOptionPane.showMessageDialog(null, "Holkskksksa" );
                break;
                case "Los Atomos":
                 JOptionPane.showMessageDialog(null, "Hkkskks" );
                break;
                case "Moleculas":
                 JOptionPane.showMessageDialog(null, "asssss" );
                break;
                case "Prueba tus Conocimientos":
                 JOptionPane.showMessageDialog(null, "Holkskskska" );
                break;
        }
    }

}
