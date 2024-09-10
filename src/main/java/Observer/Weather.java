package Observer;

import Observer.observers.obs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Weather implements Runnable {
    public List<obs> obsers;
    public int temp;
    private boolean running;
    private final static int min_temp = -40;
    private final static int max_temp = 40;

    public Weather() {
        obsers = new ArrayList<>();
        Random random = new Random();
            this.temp = 15;
            this.running = true;
    }
    public void registerObs(obs obser){
        obsers.add(obser);

    }
    public void removeObs(obs obser){
        obsers.remove(obser);

    }

    private void notifyObs(){
        for(obs obser : obsers) {
            obser.update(temp);
        }
    }

    private void updateTemp(){
        Random random = new Random();
        int new_temp = random.nextBoolean() ? 1 : -1;
        temp = temp + new_temp;
    }

    @Override
    public void run() {
        while (running){
            try {
                Thread.sleep(new Random().nextInt(2000) + 1000);
                updateTemp();
                notifyObs();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stop() {
        running = false;
    }
}
