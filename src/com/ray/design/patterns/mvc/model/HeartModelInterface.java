package com.ray.design.patterns.mvc.model;

import com.ray.design.patterns.mvc.BPMObserver;
import com.ray.design.patterns.mvc.BeatObserver;

/**
 * Created by dangdang on 7/2/16.
 */
public interface HeartModelInterface {
    int getHeartRate();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
