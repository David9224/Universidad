
/**
 *
 * @author David Aristizabal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileSystem fs = new FileSystem("C:");
        fs.printFileSystem();

        fs.addNewFolder("C:", "Archivos de Programa");
        fs.printFileSystem();

        fs.addNewFolder("Archivos de Programa", "Java");
        fs.printFileSystem();

        fs.addNewFolder("Windows", "Carpeta");

        fs.addNewFolder("C:", "Mis Documentos");
        fs.addNewFolder("Mis Documentos", "Imagenes");
        fs.addNewFolder("Mis Documentos", "Videos");
        fs.addNewFolder("Mis Documentos", "Musica");
        fs.addNewFolder("Mis Documentos", "Universidad");
        fs.addNewFolder("Musica", "Vieja");
        fs.printFileSystem();
    }

}
