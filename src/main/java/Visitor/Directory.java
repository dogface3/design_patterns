package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement{

    private String name;
    private List<File> files;
    private List<Directory> directories;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.directories = new ArrayList<>();
    }

    public void setFiles(File file) {
        this.files.add(file);
    }

    public void setDirectories(Directory directory) {
        this.directories.add(directory);
    }

    public List<File> getFiles() {
        return files;
    }

    public List<Directory> getDirectories() {
        return directories;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
