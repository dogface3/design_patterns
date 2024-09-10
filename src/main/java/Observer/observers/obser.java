package Observer.observers;

public class obser implements obs{
    public String name;

    public obser(String name){
        this.name=name;

    }
    @Override
    public void update(int temp) {
        System.out.println(name + "temperature = " + temp);
    }
}
