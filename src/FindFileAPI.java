import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FindFileAPI {
  
    public static void main(String[] args) {

        /*
        Directory root = new Directory("File1", "txt", new Date(), new Date());
        File f1 = new File("report", 5000, ..., ..., "pdf");
        File f2 = new File("photo", 300000, ..., ..., "jpg");

        root.addFile(f1);
        root.addFile(f1);

        Filter nameFilter = new NameFilter("report");
        FindCommand findCall = new FindCommand(nameFilter);
        List<File> result = findCall.findFiles(root);

        Filter extensionFilter = new extensionFilter("txt");
        FindCommand findCall2 = new FindCommand(extensionFilter);
        List<File> result2  = findCall2.findFiles(root);

        */
        
    }

    class FindCommand {

        private Filter filter;

        FindCommand (Filter filter) {
            this.filter = filter;
        }

        public List<File> findFiles (Directory root) {

            List<File> result = new ArrayList<>();
            dfs (root, result);
            return result;

        }

        private void dfs (FileSystemObject node, List<File> result) {

            if (node instanceof File file) {
                if (filter.matches(file)) {
                    result.add(file);
                }
            }
            else if (node instanceof Directory dir) {
                for (FileSystemObject child : dir.getFile()) {
                    dfs (child, result);
                }
            }
        }
    }

    abstract class FileSystemObject {

        String name;
        String extension;
        Date createdAt;
        Date modifiedAt;

        public String getName() {
            return name;
        }
        public String getExtension() {
            return extension;
        }
        public Date getCreatedAt() {
            return createdAt;
        }
        public Date getModifiedAt() {
            return modifiedAt;
        }

        
    }

    class Directory extends FileSystemObject {

       public Directory (String name, String extension, Date createdAt, Date modifiedAt) {

            this.name = name;
            this.extension = extension;
            this.createdAt = createdAt;
            this.modifiedAt = modifiedAt;
        }

        List<FileSystemObject> files;

        public void addFile(FileSystemObject obj) {
            files.add(obj);
        }

        public List<FileSystemObject> getFile() {
            return files;
        }
        
    }

    class File extends FileSystemObject {

        public File (String name, String extension, Date createdAt, Date modifiedAt) {
            
            this.name = name;
            this.extension = extension;
            this.createdAt = createdAt;
            this.modifiedAt = modifiedAt;
        }

    }

    interface Filter {
        boolean matches (File fileObj);
    }

    class NameFilter implements Filter {

        private String name;

        NameFilter (String name) {
            this.name = name;
        }


        @Override
        public boolean matches(FindFileAPI.File file) {
            return file.getName().equalsIgnoreCase(name);
        }

    }

    class ExtensionFilter implements Filter {

        private String extension;

        ExtensionFilter (String extension) {
            this.extension = extension;
        }

        @Override
        public boolean matches(FindFileAPI.File file) {
            return file.getExtension().equalsIgnoreCase(extension);
        }
        
    }

    /**
     * class DateRangeFiler implements Filter {

        

        @Override
        public boolean matches(FindFileAPI.File file) {
            
        }
        
    }
     */
}

/*
 * Finding a file
 * 
Implement file finding utility considering multiple criteria.

Imagine I am a customer and you are implementing an API for me.
My first requirement is to implement an API (or command line utility) that will give me a list of files in the given directory whose name contain the given string.

Design the API and internal objects, including the file system API, if you want to use your own or you do not remember the one in your programming language.
Once this is done, additional criteria will be introduced and I will see how you can deal with change and how extensible your code is.
List<MyFile> find(MyDirectory directory, String str) { }
Twists
•	matching by file size range, date range, extension and other criteria
•	  matching also directory or files only
•	  recursive flag
 */