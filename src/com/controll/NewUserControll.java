package com.controll;

import com.modell.AccesoAleatorio;
import com.modell.User;
import com.views.NewUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Eddy
 */
public class NewUserControll implements ActionListener {

    private NewUser user;

    public NewUserControll(NewUser user) {
        this.user = user;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Guardar Usuario":
                String nombre = user.txtnombre.getText().trim();
                if (nombre.isEmpty()) {
                    user.txtnombre.setHelperText("Ingrese un Usuario");

                }
                String password = ecnode(user.txtpassword.getText().trim());
                if (password.isEmpty()) {
                    user.txtpassword.setHelperText("Ingrese una Contrasena");
                    return;
                }
                try {
                    AccesoAleatorio.crearFileUser(new File("personas.Dat"));
                    AccesoAleatorio.CrearUser(new User(nombre, password));
                    AccesoAleatorio.cerrar();
                    user.txtnombre.setHelperText("El Nombre se Guardo Correctamente");
                    user.txtpassword.setHelperText("La Contrasena se Guardo Correctamente");
                } catch (IOException ex) {

                }
                break;

        }
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
