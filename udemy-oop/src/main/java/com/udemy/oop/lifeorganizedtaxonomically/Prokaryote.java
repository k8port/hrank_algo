package com.udemy.oop.lifeorganizedtaxonomically;

import com.udemy.oop.biologicalstructures.CellSize;
import com.udemy.oop.biologicalstructures.CellType;
import com.udemy.oop.taxonomicalstructuresandcharacteristics.Cellular;
import com.udemy.oop.biologicalstructures.Reproduction;

import static com.udemy.oop.biologicalstructures.CellSize.SMALL;
import static com.udemy.oop.biologicalstructures.CellType.SINGULAR;
import static com.udemy.oop.biologicalstructures.Reproduction.ASEXUAL;

public class Prokaryote extends Cellular {
    CellSize cellSize;
    Reproduction reproduction;
    Boolean organelles;
    CellType cellType;

    public Prokaryote() {
        super();
        this.cellSize = SMALL;
        this.reproduction = ASEXUAL;
        this.organelles = false;
        this.cellType = SINGULAR;
    }
}
