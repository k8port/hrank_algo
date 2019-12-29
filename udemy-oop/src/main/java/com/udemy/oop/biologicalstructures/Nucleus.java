package com.udemy.oop.biologicalstructures;

import com.udemy.oop.biologicalstructures.Membrane;

public class Nucleus {
    Membrane membrane;
    Boolean containsDNA;

    public Nucleus() {
        this.membrane = Membrane.UNBOUNDED;
        this.containsDNA = false;
    }

    public Nucleus(boolean membrane, boolean dna) {
        if (membrane) {
            this.membrane = Membrane.BOUNDED;
        }
        this.containsDNA = true;
    }
}
