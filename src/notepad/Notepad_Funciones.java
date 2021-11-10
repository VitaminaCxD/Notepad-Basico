package notepad;

import notepad_frame.Notepad_Frame;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author VitaminaC
 */
public class Notepad_Funciones {

    //FileWriter
    private FileWriter fw;

    //Funcionalidad del JMenuItem 'jmi_nuevo'
    public void nuevo(String texto) {

        /*
         Si el texto obtenido a traves de la sobrecarga del metodo no esta vacio, entonces generamos un
         JOptionPane para decidir si guardar o no el texto.
         */
        if (!texto.equals("")) {
            int decision = JOptionPane.showConfirmDialog(null, "¿Desea guardar lo escrito?",
                    "Nuevo", JOptionPane.YES_NO_OPTION);

            /*
             Si la decision es 0 (si), el programa guardara lo escrito y borrara lo que tiene el JTextArea para una nueva escritura.
             Si la decision es 1 (no), el JTextArea borrara lo que tiene.
             */
            switch (decision) {
                //Si
                case 0:
                    try {
                    fw = new FileWriter(Notepad_Directorios.archivo);
                    fw.write(Notepad_Frame.jta_texto.getText());
                    fw.close();

                    Notepad_Frame.jta_texto.setText("");
                } catch (IOException e) {
                    System.out.println("Escritura archivo (NUEVO): " + e);
                }
                break;
                //No
                case 1:
                    Notepad_Frame.jta_texto.setText("");
                    break;
            }
        } else {

        }
    }

    //Funcionalidad del JMenuItem 'jmi_abrir'
    public void abrir() {
        String texto;

        Notepad_Frame.jta_texto.setText("");

        try {
            FileReader fr = new FileReader(Notepad_Directorios.archivo);
            BufferedReader br = new BufferedReader(fr);

            while ((texto = br.readLine()) != null) {
                Notepad_Frame.jta_texto.append(texto + "\n");
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Escritura (ABRIR): " + e);
        }

    }

    //Funcionalidad del JMenuItem 'jmi_guardar'
    public void guardar() {
        try {
            fw = new FileWriter(Notepad_Directorios.archivo);
            fw.write(Notepad_Frame.jta_texto.getText());
            fw.close();

            JOptionPane.showMessageDialog(null, "Guardado correctamente.", "Guardado", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            System.out.println("Escritura archivo (GUARDAR): " + e);
        }
    }

}
