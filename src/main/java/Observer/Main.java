package Observer;

import Observer.observers.obs;
import Observer.observers.obser;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Weather station = new Weather();

        obs obs1 = new obser("obs1");
        obs obs2 = new obser("obs2");
        obs obs3 = new obser("obs3");

        station.registerObs(obs1);
        station.registerObs(obs2);
        station.registerObs(obs3);

        Thread thread = new Thread(station);
        thread.start();

        Thread.sleep(10000);

        station.removeObs(obs2);

        station.stop();
        thread.join();
    }
}
