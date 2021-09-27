package com.javarush.task.task37.task3702;

import com.javarush.task.task37.task3702.female.FemaleFactory;
import com.javarush.task.task37.task3702.male.MaleFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(HumanFactoryType male) {
        if (male == HumanFactoryType.MALE) return new MaleFactory();
        else if (male == HumanFactoryType.FEMALE) return new FemaleFactory();
        else return null;
    }

    public static enum HumanFactoryType {MALE, FEMALE};
}
