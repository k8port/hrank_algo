package com.udemy.oop.taxonomicalstructuresandcharacteristics;

import com.udemy.oop.biologicalstructures.Genome;
import com.udemy.oop.biologicalstructures.Nucleus;

public abstract class Cellular {
    Nucleus nucleus;
    Genome genome;

    public Cellular() {
        this.nucleus = new Nucleus();
        this.genome = new Genome();
    }

    public Cellular(boolean hasMembrane, boolean hasDna, int chromosomes) {
        this.nucleus = new Nucleus(hasMembrane, hasDna);
        this.genome = new Genome(chromosomes);
    }
}
