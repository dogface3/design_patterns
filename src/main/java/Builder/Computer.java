package Builder;

import java.util.List;

public class Computer {
    public String Processor;
    public String  Ram_size;
    public String Hard_drive;
    public String Graphics_card;
    public String OS;
    private List<String> parts;

    public void Computer(String processor,String Ram_size,String Hard_drive,String Graphics_card,String OS){
        this.Graphics_card=Graphics_card;
        this.OS=OS;
        this.Hard_drive=Hard_drive;
        this.Ram_size=Ram_size;
        this.Processor=processor;
    }
    public String toString() {
        return "Computer Specifications:\n" +
                "Processor: " + this.Processor + "\n" +
                "RAM: " + this.Ram_size + " GB\n" +
                "Hard Drive: " + this.Hard_drive + "\n" +
                "Graphics Card: " + this.Graphics_card + "\n" +
                "Operating System: " + this.OS;
    }
}
