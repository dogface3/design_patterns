package Builder;

public class Main {

    public static void main(String[] args){
        ComputerBuilder computerBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(computerBuilder);
        director.constructComputer();
        Computer computer = computerBuilder.getComputer();
        System.out.println(computer);

        ComputerBuilder computerBuilder2 = new OfficeComputerBuilder();
        ComputerDirector director2 = new ComputerDirector(computerBuilder2);
        director2.constructComputer();
        Computer computer2 = computerBuilder2.getComputer();
        System.out.println(computer2);
}}
