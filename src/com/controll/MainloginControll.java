package com.controll;

import com.modell.AccesoAleatorio;
import com.views.MainLogin;
import com.views.Menu;
import com.views.NewUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Eddy
 */
public class MainloginControll implements ActionListener {

    private MainLogin login;

    public MainloginControll(MainLogin login) {
        this.login = login;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Acceso": {
                try {
                    checkUser();
                } catch (IOException ex) {
                }
            }
            break;

            case "Nuevo Usuario": {
                NewUser o = new NewUser();
                o.setVisible(true);
                login.setVisible(false);
            }
            break;
        }
    }

    protected boolean checkUser() throws IOException {
        String nombre = login.txtUser.getText().trim();
        String password = ecnode(login.txtPassword.getText().trim());
        boolean action = true;
        if (nombre.isEmpty() && password.isEmpty()) {
            login.txtUser.setHelperText("Ingrese un Usuario");
            login.txtPassword.setHelperText("Ingrese una contrasena");
            action = false;

        } else {
            AccesoAleatorio.crearFileUser(new File("personas.Dat"));
            int i = AccesoAleatorio.buscarRegistro(nombre, password);

            if (i == -1) {
                login.txtUser.setHelperText("El Usuario no existe");
                login.txtPassword.setHelperText("La contrasena no existe");
                action = false;
            }
            if (i == 1) {
                Menu l = new Menu();
                l.setVisible(true);
                action = true;
            }
            /* if (password.isEmpty()) {
                login.txtPassword.setHelperText("Ingrese una contrasena");
                action = false;
            }*/
 /*    } else {
                Menu l = new Menu();
                l.setVisible(true);
            }*/
        }

        return action;
    }

    String secretKey = "eddycalero";

    public String ecnode(String cadena) {
        String encriptacion = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = cadena.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encriptacion = new String(base64Bytes);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }
        return encriptacion;
    }
}
