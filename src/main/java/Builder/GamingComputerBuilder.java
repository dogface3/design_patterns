package Builder;

public class GamingComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }
    @Override
    public void buildProcessor() {
        computer.Processor = "gaming processor";
    }

    @Override
    public void buildRam_size() {
        computer.Ram_size = "100";
    }

    @Override
    public void buildHard_drive() {
        computer.Hard_drive="gaming hard drive";
    }

    @Override
    public void buildGraphics_card() {
        computer.Graphics_card = "gaming graphics card";
    }

    @Override
    public void buildOS() {
        computer.OS = "linux";
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
