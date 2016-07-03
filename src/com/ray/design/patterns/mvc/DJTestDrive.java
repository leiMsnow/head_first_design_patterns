package com.ray.design.patterns.mvc;

import com.ray.design.patterns.mvc.controller.ControllerInterface;
import com.ray.design.patterns.mvc.controller.HeartController;
import com.ray.design.patterns.mvc.model.HeartModel;

/**
 * Created by dangdang on 7/2/16.
 */
public class DJTestDrive {

    public static void main(String[] args) {
//        BeatModelInterface beatModel = new BeatModel();
//        ControllerInterface beatController = new BeatController(beatModel);

        HeartModel heartModel = new HeartModel();
        ControllerInterface heartController = new HeartController(heartModel);

    }
}
