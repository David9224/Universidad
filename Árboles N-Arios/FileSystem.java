/**
 * Class representing the file system.
 * 
 * 
 * 
 */
public class FileSystem {

  /** File system (tree) root */
  private Folder root;

  /**
   * Constructor.
   */
  public FileSystem() {
    /* Contructor code */
  }// end constructor

  /**
   * Constructor.
   * 
   * @param rootFolderName
   *          Name of the root folder
   */
  public FileSystem(String rootFolderName) {
    /* Constructor code */
  }// end constructor

  /**
   * Search the folder specified as parameter in the file system, and return a
   * reference to the folder if it exists or null otherwise.
   * 
   * @param folderName
   *          Name of the folder to search.
   * @return a reference to the folder if it is in the file system, or null
   *         otherwise.
   */
  public Folder searchFolder(String folderName) {
    /* Searching code */
  }// end searchFolder

  /**
   * Add a new folder of the specified name, as a subdirectory of the folder
   * specified in the first parameter. If there exists a folder with name
   * newFolderName in the file system, or if parentFolderName does not exist,
   * the method does nothing and returns null. Otherwise it returns a reference
   * to the new folder.
   * 
   * @param parentFolderName
   *          Name of the parent folder.
   * @param newFolderName
   *          Name of the new folder.
   * @return a reference to the new folder, or null if there exists a folder
   *         with newFolderName in the file system of if the parent folder does
   *         not exist.
   */
  public Folder addNewFolder(String parentFolderName, String newFolderName) {
    /* Code to add a new folder */
  }// end addNewFolder

  /**
   * Print the file system structure in screen with the format: rootFolder
   * |_Folder1 |_Folder2 |_Folder3 |_Folder4 |_Folder5 |_Folder6 |_Folder7
   * |_Folder8
   */
  public void printFileSystem() {
    /* Code to print the file system */
  }// end printFileSystem
}
