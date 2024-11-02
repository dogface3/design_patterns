package Visitor;

public class SizeCalculatorVisitor implements FileSystemVisitor{

    private double total;

    public SizeCalculatorVisitor(){
        total = 0.0;
    }

    @Override
    public void visit(File file) {
        total += file.getSize();
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

    public double getTotal() {
        return total;
    }
}
