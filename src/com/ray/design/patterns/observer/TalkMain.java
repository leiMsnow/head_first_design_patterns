package com.ray.design.patterns.observer;

import com.ray.design.patterns.observer.client.BaseDisplay;
import com.ray.design.patterns.observer.client.DetailsDisplay;
import com.ray.design.patterns.observer.client.MainDisplay;
import com.ray.design.patterns.observer.client.NotifyDisplay;
import com.ray.design.patterns.observer.server.ServerData;

/**
 *
 * Created by dangdang on 4/26/16.
 */
public class TalkMain {


    public static void main(String args[]) {

        ServerData serverData = new ServerData();

        BaseDisplay notifyDisplay = new NotifyDisplay(serverData);
        BaseDisplay mainDisplay = new MainDisplay(serverData);
        BaseDisplay detailsDisplay = new DetailsDisplay(serverData);

        serverData.receiveMessage("你好");

        notifyDisplay.remove();
        System.out.println("--------------------分割线-------------------------");

        serverData.receiveMessage("很高兴认识你");


    }
}
