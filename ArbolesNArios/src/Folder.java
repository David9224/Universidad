
import java.util.Vector;

/**
 *
 * @author David Aristizabal
 *
 */
public class Folder {

    private String name;
    private Vector<Folder> subdirectories;

    public Folder() {
        this("default folder");
    }

    public Folder(String name) {
        this.name = name;
        this.subdirectories = new Vector<Folder>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Folder> getSubdirectories() {
        return this.subdirectories;
    }

    public Folder addSubdirectory(String folderName) {
        Folder newFolder = new Folder(folderName);
        subdirectories.add(newFolder);
        return newFolder;
    }

    public void printSubdirectories() {
        for (int i = 0; i < subdirectories.size(); i++) {
            System.out.print(subdirectories.get(i).getName() + " ");
        }
        System.out.println();
    }
}
