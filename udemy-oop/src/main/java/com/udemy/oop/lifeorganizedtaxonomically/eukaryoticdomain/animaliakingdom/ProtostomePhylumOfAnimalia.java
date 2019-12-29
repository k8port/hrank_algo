package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom;

public enum ProtostomePhylumOfAnimalia {
    ACANTHOCEPHALA(
            "Thorny head",
            "Spiny-Headed,Worms",
            "Reversible spiny proboscis bearing many rows of hooked spines",
            1420,
            0),
    ANNELIDA(
            "Little ring",
            "Segmented Worms",
            "Multiple circular segment",
            17000,
            0),
    ANTHROPODA(
            "Jointed foot",
            "Crustaceans",
            "Segmented bodies and jointed limbs",
            1250000,
            20000),
    BRACHIOPODA(
            "Arm foot",
            "Lampshells",
            "Lophophore and pedicle",
            500,
            12000),
    BRYOZOA(
            "Moss animals",
            "Bryozoans, Moss Animals, Sea Mats, Ectoprocts",
            "Lophophore, no pedicle, ciliated tentacles, anus outside ring of cilia",
            6000,
            0),
    CHAETOGNATHA(
            "Longhair jaw",
            "Arrow Worms",
            "Chitinous spines either side of head, fins",
            100,
            0),
    CYCLIOPHORA(
            "Wheel carrying",
            "Symbion",
            "Circular mouth surrounded by small cilia, sac-like bodies",
            3,
            0),
    ENTROPROCTA(
            "Inside anus",
            "Goblet worms",
            "Anus inside ring of cilia",
            150,
            0),
    GASTROTRICHA(
            "Hairy stomach",
            "Gastrotrich worms",
            "Two terminal adhesive tubes",
            690,
            0),
    GNATHOSTOMULIDA(
            "Jaw orifice",
            "Jaw worms",
            "",
            100,
            0),
    KINORHYNCHA(
            "Motion snout",
            "Mud dragons",
            "Eleven segments, each with a dorsal plate",
            150,
            0),
    LORICIFERA(
            "Corset bearer",
            "Brush heads",
            "Umbrella-like scales at each end",
            122,
            0),
    MICROGNATHOZOA(
            "Tiny jaw animals",
            "Limnognathia",
            "Accordion-like extensible thorax",
            1,
            0),
    MOLLUSCA(
            "Soft",
            "Mollusks",
            "Muscular foot and mantle round shell",
            85000,
            80000),
    NEMATODA(
            "Thread like",
            "Nematodes",
            "Round cross section, keratin cuticle",
            25000,
            0),
    NEMATOMORPHA(
            "Thread form",
            "Horsehair Worm, Gordian worm",
            "",
            320,
            0),
    NEMERTEA(
            "A sea nymph",
            "Ribbon Worms, Rynchocoela",
            "",
            1200,
            0),
    ONYCHOPHORA(
            "Claw bearer",
            "Velvet Worms",
            "Legs tipped by chitinous claws",
            200,
            0),
    ORTHONECTIDA(
            "Straight swimming",
            "Orthonectids",
            "Single layer of ciliated cells surrounding a mass of sex cells",
            26,
            0),
    PHORONIDA(
            "Zeus' mistress",
            "Horseshoe worms",
            "U-shaped gut",
            11,
            0),
    PLATYHELMINTHES(
            "Flat worm",
            "Flatworms",
            "",
            29500,
            0),
    PRIAPULIDA(
            "Little Priapus",
            "Penis worms",
            "",
            20,
            0),
    RHOMBOZOA(
            "Lozenge animal",
            "Rhombozoans",
            "Single anteroposterior axial cell surrounded by ciliated cells",
            100,
            0),
    ROTIFERA(
            "Wheel bearers",
            "Rotifers",
            "Anterior crown of cilia",
            2000,
            0),
    SIPUNCULOIDEA(
            "Small tube",
            "Peanut Worms",
            "Mouth surrounded by invertible tentacles",
            320,
            0),
    TARDIGRADA(
            "Slow step",
            "Tardigrades or Water Bearers",
            "Four segmented body and head",
            1000,
            0);

    private String meaning;
    private String commonName;
    private String distinguishing_characteristic;
    private int speciesDescribed;
    private int speciesExtinct;

    ProtostomePhylumOfAnimalia(String meaning, String commonName, String characteristic, int speciesDescribed, int extinct) {
        this.meaning = meaning;
        this.commonName = commonName;
        this.distinguishing_characteristic = characteristic;
        this.speciesDescribed = speciesDescribed;
        this.speciesExtinct = extinct;
    }

    public String getCommonName() {
        return commonName;
    }
}
