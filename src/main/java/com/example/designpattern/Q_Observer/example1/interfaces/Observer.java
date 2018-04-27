package com.example.designpattern.Q_Observer.example1.interfaces;

import com.example.designpattern.Q_Observer.example1.clazz.NumberGenerator;

public interface Observer {
    void update(NumberGenerator numberGenerator);
}
