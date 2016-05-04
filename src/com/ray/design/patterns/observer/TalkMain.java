package com.ray.design.patterns.observer;

import com.ray.design.patterns.observer.client.BaseDisplay;
import com.ray.design.patterns.observer.client.DetailsDisplay;
import com.ray.design.patterns.observer.client.MainDisplay;
import com.ray.design.patterns.observer.client.NotifyDisplay;
import com.ray.design.patterns.observer.server.ServerData;

/**
 * 观察者模式 - 在对象之间定义一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象都会收到通知，并做出相应改变。
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
