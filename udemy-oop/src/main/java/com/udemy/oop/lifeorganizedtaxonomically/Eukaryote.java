package com.udemy.oop.lifeorganizedtaxonomically;

import com.udemy.oop.biologicalstructures.CellSize;
import com.udemy.oop.biologicalstructures.CellType;
import com.udemy.oop.biologicalstructures.Reproduction;
import com.udemy.oop.taxonomicalstructuresandcharacteristics.*;

import java.util.List;

import static com.udemy.oop.biologicalstructures.CellSize.LARGE;
import static com.udemy.oop.biologicalstructures.CellType.MULTI_CELLULAR;
import static com.udemy.oop.biologicalstructures.Reproduction.SEXUAL;

public class Eukaryote extends Cellular {
    CellSize cellSize;
    Reproduction reproduction;
    Boolean organelles;
    CellType cellType;
    List<Domain> domainList;

    public Eukaryote() {
        super();
        this.cellSize = LARGE;
        this.reproduction = SEXUAL;
        this.organelles = true;
        this.cellType = MULTI_CELLULAR;
    }

    public Eukaryote(boolean hasMembrane, boolean hasDna, int chromosomes) {
        super(hasMembrane, hasDna, chromosomes);
        this.cellSize = LARGE;
        this.reproduction = SEXUAL;
        this.organelles = true;
        this.cellType = MULTI_CELLULAR;
    }
}
