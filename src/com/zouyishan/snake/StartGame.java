package com.zouyishan.snake;

import javax.swing.*;
import java.net.MalformedURLException;

public class StartGame {

    public static void main(String[] args) throws MalformedURLException {

        JFrame frame = new JFrame("吃掉雷姆");
        frame.setBounds(10,10,900,850);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new GamePanel());

        frame.setVisible(true);

    }


}
