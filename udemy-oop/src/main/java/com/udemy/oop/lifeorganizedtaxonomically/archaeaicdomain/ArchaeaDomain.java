package com.udemy.oop.lifeorganizedtaxonomically.archaeaicdomain;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.Domain;

public class ArchaeaDomain implements Domain {

    public ArchaeaDomain() {
        this.kingdoms.add(new ArchaeaKingdom());
    }
}
