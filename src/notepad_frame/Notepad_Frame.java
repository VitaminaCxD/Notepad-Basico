package notepad_frame;

import notepad.Notepad_Directorios;
import notepad.Notepad_Funciones;
import javax.swing.JOptionPane;

/**
 *
 * @author VitaminaC
 */
public class Notepad_Frame extends javax.swing.JFrame {

    //Funciones
    Notepad_Funciones notepad_funciones = new Notepad_Funciones();

    //TITULO
    private static final String TITULO = "Notepad";

    //VERSION
    private static final String VERSION = "[1.0]";

    public Notepad_Frame() {
        Notepad_Directorios notepad_directorios = new Notepad_Directorios();
        initComponents();
        setVisible(true);
        setTitle(TITULO + " " + VERSION);
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpl_texto = new javax.swing.JPanel();
        jsp_texto = new javax.swing.JScrollPane();
        jta_texto = new javax.swing.JTextArea();
        barra = new javax.swing.JMenuBar();
        jm_archivo = new javax.swing.JMenu();
        jmi_nuevo = new javax.swing.JMenuItem();
        jmi_abrir = new javax.swing.JMenuItem();
        jmi_guardar = new javax.swing.JMenuItem();
        jmi_salir = new javax.swing.JMenuItem();
        jm_info = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpl_texto.setBackground(new java.awt.Color(255, 255, 255));
        jpl_texto.setLayout(new java.awt.BorderLayout());

        jta_texto.setBackground(new java.awt.Color(255, 255, 255));
        jta_texto.setColumns(20);
        jta_texto.setLineWrap(true);
        jta_texto.setRows(5);
        jta_texto.setWrapStyleWord(true);
        jsp_texto.setViewportView(jta_texto);

        jpl_texto.add(jsp_texto, java.awt.BorderLayout.CENTER);

        getContentPane().add(jpl_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 800, 580));

        barra.setToolTipText("");

        jm_archivo.setText("Archivo");

        jmi_nuevo.setText("Nuevo");
        jmi_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo(evt);
            }
        });
        jm_archivo.add(jmi_nuevo);

        jmi_abrir.setText("Abrir");
        jmi_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir(evt);
            }
        });
        jm_archivo.add(jmi_abrir);

        jmi_guardar.setText("Guardar");
        jmi_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar(evt);
            }
        });
        jm_archivo.add(jmi_guardar);

        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir(evt);
            }
        });
        jm_archivo.add(jmi_salir);

        barra.add(jm_archivo);

        jm_info.setText("Info");
        jm_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                info(evt);
            }
        });
        barra.add(jm_info);

        setJMenuBar(barra);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo de salir
    private void salir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir
        System.exit(0);
    }//GEN-LAST:event_salir

    //Metodo de nuevo
    private void nuevo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo
        notepad_funciones.nuevo(jta_texto.getText());
    }//GEN-LAST:event_nuevo

    //Metodo de guardar
    private void guardar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar
        notepad_funciones.guardar();
    }//GEN-LAST:event_guardar

    //Metodo de abrir
    private void abrir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir
        notepad_funciones.abrir();
    }//GEN-LAST:event_abrir

    private void info(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_info
        JOptionPane.showMessageDialog(null, "Creador: VitaminaC\nVersion: " + VERSION, " Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_info

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra;
    private javax.swing.JMenu jm_archivo;
    private javax.swing.JMenu jm_info;
    private javax.swing.JMenuItem jmi_abrir;
    private javax.swing.JMenuItem jmi_guardar;
    private javax.swing.JMenuItem jmi_nuevo;
    private javax.swing.JMenuItem jmi_salir;
    private javax.swing.JPanel jpl_texto;
    private javax.swing.JScrollPane jsp_texto;
    public static javax.swing.JTextArea jta_texto;
    // End of variables declaration//GEN-END:variables
}
