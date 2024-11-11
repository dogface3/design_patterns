package Builder;

public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector (ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
    public void constructComputer(){
        computerBuilder.buildGraphics_card();
        computerBuilder.buildHard_drive();
        computerBuilder.buildOS();
        computerBuilder.buildRam_size();
        computerBuilder.buildProcessor();
    }
}
