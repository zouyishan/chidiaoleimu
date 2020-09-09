package com.zouyishan.snake;

import javax.swing.*;
import java.net.URL;

public class Data {
    public static URL headerUrl = Data.class.getResource("/statics/new.png");
    public static ImageIcon header = new ImageIcon(headerUrl);
    public static URL upUrl = Data.class.getResource("/statics/me.png");
    public static URL downUrl = Data.class.getResource("/statics/down.png");
    public static URL leftUrl = Data.class.getResource("/statics/left.png");
    public static URL rightUrl = Data.class.getResource("/statics/right.png");
    public static ImageIcon up = new ImageIcon(upUrl);
    public static ImageIcon down = new ImageIcon(downUrl);
    public static ImageIcon left = new ImageIcon(leftUrl);
    public static ImageIcon right = new ImageIcon(rightUrl);
    public static URL bodyUrl = Data.class.getResource("/statics/body.png");
    public static ImageIcon body = new ImageIcon(bodyUrl);
    public static URL foodUrl = Data.class.getResource("/statics/food.png");
    public static ImageIcon food = new ImageIcon(foodUrl);
}
