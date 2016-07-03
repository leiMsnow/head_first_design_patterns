package com.ray.design.patterns.mvc.model;

import com.ray.design.patterns.mvc.BPMObserver;
import com.ray.design.patterns.mvc.BeatObserver;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dangdang on 7/2/16.
 */
public class HeartModel implements HeartModelInterface, Runnable {

    ArrayList<BeatObserver> beatObservers = new ArrayList<>();
    ArrayList<BPMObserver> bpmObservers = new ArrayList<>();
    int time = 1000;
    int bpm = 90;
    Random random = new Random(System.currentTimeMillis());
    Thread thread;

    public HeartModel() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public int getHeartRate() {
        return 60000 / time;
    }

    @Override
    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    @Override
    public void removeObserver(BeatObserver o) {
        beatObservers.remove(o);
    }

    @Override
    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {
        bpmObservers.remove(o);
    }

    @Override
    public void run() {
        int lastRate = -1;

        for (; ; ) {
            int change = random.nextInt(10);
            if (random.nextInt(2) == 0) {
                change = 0 - change;
            }
            int rate = 60000 / (time + change);
            if (rate < 120 && rate > 50) {
                time += change;
                notifyBeatObservers();
                if (rate != lastRate) {
                    lastRate = rate;
                    notifyBPMObservers();
                }
            }
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void notifyBPMObservers() {
        bpmObservers.forEach(BPMObserver::updateBPM);
    }

    private void notifyBeatObservers() {
        beatObservers.forEach(BeatObserver::updateBeat);
    }


}
