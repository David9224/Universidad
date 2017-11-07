
/**
 *
 * @author David Aristizabal
 *
 */
public class FileSystem {

    private Folder root;

    public FileSystem() {
        this("default");
    }

    public FileSystem(String rootFolderName) {
        root = new Folder(rootFolderName);
    }

    public Folder searchFolder(String folderName) {
        return searchFolder(root, folderName);
    }

    private Folder searchFolder(Folder rootFolder, String folderName) {
        Folder searchedFolder = null;
        boolean found = false;

        if (rootFolder != null) {
            if (rootFolder.getName().equals(folderName)) {
                searchedFolder = rootFolder;
            } else {
                for (int i = 0; i < rootFolder.getSubdirectories().size() && !found; i++) {
                    searchedFolder = searchFolder(rootFolder.getSubdirectories().get(i),
                            folderName);
                    if (searchedFolder != null) {
                        found = true;
                    }
                }
            }
        }
        return searchedFolder;
    }

    public Folder addNewFolder(String parentFolderName, String newFolderName) {
        Folder parentFolder = searchFolder(parentFolderName);
        Folder newFolder = searchFolder(newFolderName);

        if (parentFolder != null && newFolder == null) {
            newFolder = parentFolder.addSubdirectory(newFolderName);
        } else {
            newFolder = null;
            if (parentFolder == null) {
                System.out.println("The folder cannot be added because "
                        + "the parent folder \"" + parentFolderName + "\" does not exist.");
            } else {
                System.out.println("The folder cannot be added because "
                        + "there is already another folder with the same name");
            }
        }
        return newFolder;
    }

    public void printFileSystem() {
        printFileSystem(0, root);
    }

    private void printFileSystem(int level, Folder root) {
        if (root != null) {
            if (level > 0) {
                for (int i = 0; i < level; i++) {
                    System.out.print(" ");
                }
                System.out.print("|_");
            }
            System.out.println(root.getName());
            for (int j = 0; j < root.getSubdirectories().size(); j++) {
                printFileSystem(level + 1, root.getSubdirectories().get(j));
            }
        }
    }
}
