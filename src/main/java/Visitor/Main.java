package Visitor;

import java.util.List;

public class Main {
    public static void main(String[] args){
        File file0 = new File("file0",1.0);
        File file1 = new File("file1",1.1);
        File file2 = new File("file2",1.2);
        File file3 = new File("should pop up",1.1);
        File file4 = new File("should pop up2", 1.2);

        Directory directory0 = new Directory("dir0");
        Directory directory1 = new Directory("dir1");
        Directory directory2 = new Directory("dir2");


        directory0.setFiles(file2);
        directory0.setDirectories(directory1);
        directory1.setFiles(file1);
        directory1.setDirectories(directory2);
        directory2.setFiles(file0);
        directory1.setFiles(file3);
        directory0.setFiles(file4);

        SizeCalculatorVisitor sizeCalculatorVisitor = new SizeCalculatorVisitor();
        directory0.accept(sizeCalculatorVisitor);
        System.out.println(sizeCalculatorVisitor.getTotal());


        SearchVisitor searchVisitor = new SearchVisitor("pop");
        directory0.accept(searchVisitor);
        List<File> files2 = searchVisitor.getFiles();
        for (File file : files2){
            System.out.println(file.getName());
        }
    }

}
