package spec;


import java.util.List;

public abstract class StorageSpecification {


        //SUPERKORISNIK
        /**
         * Creates an empty folder that will be the root directory of the storage.
         * @param path The absolute path to the directory being created.
         */
        abstract public boolean initializeStorage(String path); //++++++

        /**
         * Creates a user by super-user.
         * Only the super user has the privilege to use this function.
         * @param username Username of the user you want to create.
         * @param password Password of the user you want to create.
         * @param privilege Privilage that we want to set to the user.
         */
        public abstract void addUser(String username, String password, String  privilege);

        /**
         * Sets user privilege.
         * Only the super user has the privilege to use this function.
         * @param username The username of the user for whom the privilege is being changed.
         * @param password The password of the user for whom the privilege is being changed.
         * @param privilege The username of the user for whom the privilege is being changed.
         */
        abstract public void setPrivilege(String username,String password, String privilege);

        /**
         * Deletes a user by super-user.
         * Only the super user has the privilege to use this function.
         * @param username Username of the user you want to delete.
         */
        public abstract void deleteUserBySuperUser(String username);

        /**
         * Deletes a user by himself.
         * @param username Your username.
         * @param password Your password.
         */
        public abstract void deleteUserByHimself(String username, String password);

        /**
         * Connects the user to the storage.
         * @param username Username of the user who wants to connect to the storage.
         * @param password Password of the user who wants to connect to the storage.
         */
        abstract public void connectUser(String username, String password);

        /**
         * Disconnects the user from the storage.
         */
        abstract public void disconnectUser();

        /**
         * Checks user privilege.
         * @param username Username of the user for whom the privilege is being checked.
         * @param privilage Privilage which we want to check.
         */
        abstract public int checkPrivilege(String username,String privilage);





        //DIREKTORIJUMI

        /**
         * Saves a directory.
         * @param path The path to the directory you want to create.
         *  @param name The name that we want to set to this directory.
         */
        public abstract void createDirectory(String name,String path);


        /**
         * View directories in a exact directory.
         * @param path The path of the directory you are viewing.
         */
        public abstract List<String> listDirectories(String path);

        /**
         * View directories in a exact directory filter by creation time.
         * @param path The name of the directory in which you are searching.
         */
        public abstract List<String> listDirectoriesByCreationTime(String path);

        /**
         * View directories in a exact directory filter by modification time.
         * @param path The name of the directory in which you are searching.
         */
        public abstract List<String> listDirectoriesByModificationTime(String path);


        /**
         * View directories in a exact directory filter sorted by name.
         * @param path The name of the directory in which you are searching.
         */
        public abstract List<String> listDirectoriesSortedByName(String path);

        //FAJLOVI

        /**
         * Saves a file.
         * @param path The path to the file you want to save.
         */
        public abstract void saveFile(String path);

        /**
         * Deletes a file.
         * @param path The path to the file you want to delete.
         */
        public abstract void deleteFile(String path);

        /**
         * Downloads a file.
         * @param path The path to the file you want to download.
         */
        public abstract void downloadsFile(String path);

        /**
         * View files in a exact directory.
         * @param path The name of the directory in which you are searching.
         */
        public abstract List<String> listFiles(String path);

        /**
         * View files in a exact directory filter by extension.
         ** @param path The name of the directory in which you are searching.
         * @param extension The name of extension that we want to get.
         */
        public abstract List<String> listFilesByExtension(String extension,String path);

        /**
         * View files in a exact directory filter by creation time.
         * @param path The name of the directory in which you are searching.
         */
        public abstract List<String> listFilesByCreationTime(String path);

        /**
         * View files in a exact directory filter by modification time.
         * @param path The name of the directory in which you are searching.
         */
        public abstract List<String> listFilesByModificationTime(String path);

        /**
         * Sort files in a exact directory filter by name.
         * @param path The name of the directory in which you are searching.
         */
        public abstract List<String> sortFilesByName(String path);

        /**
         * Sort files in a exact directory filter by creation time.
         * @param path The name of the directory in which you are searching.
         */
        public abstract List<String> sortFilesByCreationTime(String path);

        /**
         * Sort files in a exact directory filter by modification time.
         * @param path The name of the directory in which you are searching.
         */
        public abstract List<String> sortFilesByModificationTime(String path);

        /**
         * View all files from storage.
         */
        public abstract List<String> listAllFiles();



        /**
         * View all files sorted by name from storage.
         *
         */
        public abstract List<String> listAllFilesSortedByName();


        /**
         * View all files by exact name from storage.
         * @param name The name of files that we want to list.
         */
        public abstract List<String> listAllFilesByName(String name);

        /**
         * View all files by exact extension from storage.
         * @param name The name of file extension that we want file to list.
         */
        public abstract List<String> listAllFilesByExt(String name);


        /**
         * Moves files from one path to another.
         * @param filesName The names of the files you want to move.
         * @param path The path of the directory to which you want to move the files.
         */
        public abstract void moveFiles(String filesName, String path);







        /**
         * View files in a exact directory.
         * @param path The path of the directory where you want to put all created directories.
         * @param name The names of the directories you want to create.
         */
        public abstract void createDirectoryByPattern(String name,String path);

        /**
         * View files in a exact directory.
         * @param path The path of the directory where you want to put all created files.
         * @param name The name of files you want to create.
         */
        public abstract void createFileByPattern(String name,String path);



        /**
         * Create numbers of folders with default name Folder1,Folder2... .
         * @param name The name of the directory where you want to put all created directories.
         * @param number The number of the directories you want to create.
         */
        public abstract void createMoreFoldersDrive(int number,String name);

        /**
         * Create numbers of files with default name File1,File2... .
         * @param name The path of the directory where you want to put all created directories.
         * @param number The number of the files you want to create.
         */
        public abstract void createMoreFilesDrive(int number,String name);



        //KONFIGURACIJA SKLADISTA

        /**
         * Sets storage size.
         * Only the super user has the privilege to use this function.
         * @param size The size of storage represent in bytes.
         */
        public void setStorageSize(int size) {

        }

        /**
         * Adds restriction to some extension.
         * Only the super user has the privilege to use this function.
         * @param extension A file extension that is not supported by the repository.
         */
        public void addRestrictionToFileExtension(String extension) {

        }
        /**
         * Sets max number of files for exact directory.
         * @param number The number of files the directory can support.
         * @param path The path of the directory for which you set the values.
         */
        public void setMaxFilesNumber(int number, String path) {

        }

        /**
         * Checks configuration rules for exact directory.
         * @param path The path of the directory for which you set the values.
         */
        public boolean checkStorageRules(String path) {
            return true;
        }


    }

