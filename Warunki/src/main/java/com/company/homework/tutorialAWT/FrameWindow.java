package com.company.homework.tutorialAWT;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameWindow extends Frame implements WindowListener {
    //konstruktor
    public FrameWindow(String FrameTitle) {

        //Samlpe 01: Set Layout and Title
        super(FrameTitle);
        setLayout(new FlowLayout());

        //Sample 03: Set Size of the Frame
        setSize(600, 300);
        setLocation(300, 100);

        //Sample 05: Register with the listener
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        //Dispose the Window and Exit the Application
            this.dispose();

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }


//        @Override
//        public void windowClosing(WindowEvent e){
//            //Dispose the Window and Exit the Application
//            this.dispose();
//        }





}
