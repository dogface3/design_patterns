package Builder;

public class OfficeComputerBuilder implements  ComputerBuilder{

    private Computer computer;

    public OfficeComputerBuilder(){
        this.computer = new Computer();
    }
    @Override
    public void buildProcessor() {
        computer.Processor = "office processor";
    }

    @Override
    public void buildRam_size() {
        computer.Ram_size = "4";
    }

    @Override
    public void buildHard_drive() {
        computer.Hard_drive="office hard drive";
    }

    @Override
    public void buildGraphics_card() {
        computer.Graphics_card="office";
    }

    @Override
    public void buildOS() {
        computer.OS="windows";
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
