package notepad;

import java.io.File;

/**
 *
 * @author VitaminaC
 */
public class Notepad_Directorios {

    //File
    protected static File carpeta, archivo;

    //Directorio por defecto de la carpeta
    private static final String PATH_CARPETA = "C:\\Notepad\\";

    //Directorio por defecto de el .txt
    private static final String PATH_ARCHIVO = "C:\\Notepad\\Texto.txt";

    //Constructor
    public Notepad_Directorios() {
        directoriosPorDefecto(PATH_CARPETA, PATH_ARCHIVO);
    }

    //Generacion del directorio por defecto
    private void directoriosPorDefecto(String path_carpeta, String path_archivo) {
        carpeta = new File(path_carpeta);
        carpeta.mkdir();
        archivo = new File(path_archivo);
    }

}
