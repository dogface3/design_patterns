package Visitor;

public class File implements FileSystemElement{

    private double size;
    private String name;

    public File(String name, double size){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
