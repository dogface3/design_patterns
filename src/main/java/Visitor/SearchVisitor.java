package Visitor;


import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor{

    private String searchArg;
    private List<File> files;


    public SearchVisitor(String searchArg){
        this.searchArg = searchArg;
        this.files = new ArrayList<>();
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchArg)){
            this.files.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        for (File file : directory.getFiles()){
            visit(file);
        }
        for (Directory subDirectory : directory.getDirectories()){
            visit(subDirectory);
        }
    }

    public List<File> getFiles() {
        return files;
    }
}
