package Builder;

public interface ComputerBuilder {
    void buildProcessor();
    void buildRam_size();
    void buildHard_drive();
    void buildGraphics_card();
    void buildOS();
    Computer getComputer();
}
