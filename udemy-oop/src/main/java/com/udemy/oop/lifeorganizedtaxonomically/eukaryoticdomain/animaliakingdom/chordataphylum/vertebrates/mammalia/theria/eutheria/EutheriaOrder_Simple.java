package com.udemy.oop.lifeorganizedtaxonomically.eukaryoticdomain.animaliakingdom.chordataphylum.vertebrates.mammalia.theria.eutheria;

import com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum;

import java.util.List;

import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.CLADE;
import static com.udemy.oop.taxonomicalstructuresandcharacteristics.typing.OrderSubclassTypeEnum.ORDER;

public enum EutheriaOrder_Simple {
    ARTIODACTYLA(
            ORDER,
            "hoofed, odd number toes",
            "sheep, bison, pig, deer"
    ),
    CARNIVORA(
            ORDER,
            "large and mostly meat-eating",
            "raccoon, dog, wolf, tiger, lion, fox, bear, badger"
    ),
    CETACEA(
            ORDER,
            "aquatic, has blowhole, uses echolocation",
            "dolphin, whale, porpoise"
    ),
    CHIROPTERA(
            ORDER,
            "flying, wings are skin stretched between phalanges, echolocation",
            "vampire bat, fruit bat"
    ),
    HYRACOIDA(
            ORDER,
            "small, thickset, well-furred, rotund, short-tailed",
            "hyrax"
    ),
    INSECTIVORA(
            ORDER,
            "insect-eating, digging",
            "shrew"
    ),
    LAGOMORPHA(
            ORDER,
            "double row of incisors, hind legs adapted for hopping",
            "hare, pika"
    ),
    MACROSCELIDEA(
            ORDER,
            "insect-eating, nocturnal",
            "Elephant Shrew"
    ),
    PERISSODACTYLA(
            ORDER,
            "hoofed, even number of toes",
            "Horse, zebra, rhinoceros"
    ),
    PHOLIDOTA(
            ORDER,
            "mostly ant-eating, backs covered in large, overlapping scales",
            "pangolin"
    ),
    PRIMATES(
            ORDER,
            "opposable thumb, large brain, social groups, tool-using",
            "chimpanzee, human, gorilla, orangutan"
    ),
    PROBOSCIDEA(
            ORDER,
            "has trunk and tusks",
            "elephant"
    ),
    RODENTIA(
            ORDER,
            "gnaws, incisors continue growth throughout lifetime",
            "squirrel, rat, hamster, ferret"
    ),
    SIRENIA(
            ORDER,
            "aquatic, found near shoreline, eat vegetation",
            "manatee, dugong"
    ),
    TUBULIDENTATA(
            ORDER,
            "insect-eating, especially termites, limbs modified for digging, hard nails, thick skin, sparse hair",
            "aardvark"
    ),
    XENARTHRA(
            CLADE,
            "reduced or absent tooth enamel, fewer teeth",
            "sloth, anteater, armadillo"
    );

    private OrderSubclassTypeEnum subclass;
    private String specialTraits;
    private List<String> members;

    EutheriaOrder_Simple(OrderSubclassTypeEnum subclass, String specialTraits, String members) {
        this.subclass = subclass;
        this.specialTraits = specialTraits;

        for (String animal : members.split(",")) {
            this.members.add(animal);
        }
    }
}
