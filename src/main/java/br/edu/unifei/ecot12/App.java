package br.edu.unifei.ecot12;

import java.util.*;

import br.edu.unifei.ecot12.Spirit.enumSide;

public class App {
    public static void main(String[] args) {

        // characters
        Human ozai = new Human();
        ozai.setAlive(true);
        ozai.setSpiritual_lvl(0);
        ozai.setName("Lord Ozai");
        ozai.setBending(new FireHumanBending());
        ozai.getBending().setElementMastery(50);
        ozai.getBending().setSpecialBending(true);

        Avatar roku = Avatar.createAvatar();
        roku.setAlive(false);
        roku.setName("Avatar Roku");

        Avatar aang = Avatar.createAvatar();
        aang.setAlive(true);
        aang.setSpiritual_lvl(100);
        aang.setName("Aang");
        aang.setBending(new AvatarBending(aang));
        int aangMastery[] = { 400, 80, 55, 150 };
        aang.getBending().setElementsMastery(aangMastery);
        Weapon glider = new Weapon();
        glider.setDescription(
                "A staff or a glider? both! Aang's Glider Staff make him able to fly and canalize his air bending.");
        glider.setUserMastery(101);
        aang.getWeapons().add(glider);
        aang.setAvatarState(true);

        Human katara = new Human();
        katara.setAlive(true);
        katara.setSpiritual_lvl(40);
        katara.setName("Katara");
        katara.setBending(new WaterHumanBending());
        katara.getBending().setElementMastery(200);
        katara.getBending().setSpecialBending(true);

        Human sokka = new Human();
        sokka.setAlive(true);
        sokka.setSpiritual_lvl(10);
        sokka.setName("Sokka");
        Weapon boomerang = new Weapon();
        boomerang.setDescription("Sokka's boomerang, made by his own father.");
        boomerang.setUserMastery(120);
        sokka.getWeapons().add(boomerang);
        Weapon sword = new Weapon();
        sword.setDescription("Sokka's sword, made from a meteorite, by a legendary swordsman from the Fire Nation.");
        sword.setUserMastery(80);
        sokka.getWeapons().add(sword);

        Human toph = new Human();
        toph.setAlive(true);
        toph.setSpiritual_lvl(20);
        toph.setName("Toph Beifong");
        toph.setBending(new EarthHumanBending());
        toph.getBending().setElementMastery(230);
        toph.getBending().setSpecialBending(true);

        Human zuko = new Human();
        zuko.setAlive(true);
        zuko.setSpiritual_lvl(50);
        zuko.setName("Zuko");
        zuko.setBending(new FireHumanBending());
        zuko.getBending().setElementMastery(350);
        zuko.getBending().setSpecialBending(true);

        Animal<Air> momo = new Animal<Air>(Air.getInstance());
        momo.setAlive(true);
        momo.setSpiritual_lvl(60);
        momo.setName("Momo");
        momo.setBending(new AirAnimalBending());
        momo.getBending().setSpecialBending(true);
        momo.setSpecies("Lemori");
        momo.addBonds(aang);

        Animal<Fire> dragon = new Animal<Fire>(Fire.getInstance());
        dragon.setAlive(true);
        dragon.setSpiritual_lvl(1000);
        dragon.setName("Fire Dragon");
        dragon.setBending(new FireAnimalBending());
        dragon.setSpecies("dragon");

        Animal<Water> unagi = new Animal<Water>(Water.getInstance());
        unagi.setAlive(false);
        unagi.setName("Great Serpent Unagi");
        unagi.setSpecies("Giant Serpent");
        unagi.setBending(new WaterAnimalBending());

        Animal<Earth> badgermole = new Animal<Earth>(Earth.getInstance());
        badgermole.setAlive(true);
        badgermole.setName("badgermole");
        badgermole.setSpecies("Badgermole");
        badgermole.setBending(new EarthAnimalBending());

        PoliticalStructure fireNationPolitics = new PoliticalStructure();
        fireNationPolitics.setType("Autocracy");
        fireNationPolitics.setDescription("A totalitary regime ruled by a Lord.");
        fireNationPolitics.getGovernants().add(ozai);

        Nation fireNation = new Nation(fireNationPolitics);
        fireNation.setName("Fire Nation");
        fireNation.setEmblem(
                "A flame with three main, upward-curving tendrils, evoking the form of a dancing fire. The central flame is the tallest, with two shorter flames on either side, symbolizing control and balance within strength. This emblem is often depicted in red, black, and gold, emphasizing the Fire Nation's fierce and ambitious spirit. The flame icon is frequently seen on flags, armor, and buildings across the Fire Nation, serving as a unifying and powerful symbol of its culture and authority.");
        Locality capitalCity = new Locality();
        capitalCity.setName("Capital City");
        capitalCity.setGeography("Volcanic Island");
        fireNation.setCapital(capitalCity);

        Locality baSingSe = new Locality();
        baSingSe.setName("Ba Sing Se");
        baSingSe.setGeography("Massive fortified capital, surrounded by the Outer Wall.");

        SozinComet comet = SozinComet.getInstance();
        MoonSpirit moon = MoonSpirit.getInstance();
        Raava raava = Raava.getInstance();
        Vaatu vaatu = Vaatu.getInstance();
        raava.setStrength(70);
        System.out.println("Raava's strength: " + raava.getStrength());
        System.out.println("Vaatu's strength: " + vaatu.getStrength());

        Spirit ko = new Spirit();
        ko.setAlive(true);
        ko.setName("Ko");
        ko.setSide(enumSide.BAD);

        aang.bend();
        katara.bend();
        toph.bend();
        zuko.bend();

        momo.bend();
        dragon.bend();
        badgermole.bend();
        unagi.bend();

        System.out.println(ko.getName() + " side: " + ko.getSide());
        aang.bendSpirit(ko);
        System.out.println(ko.getName() + " side: " + ko.getSide());

        Event ozaiFall = new Event();
        ozaiFall.setName("Ozai's Fall");
        ozaiFall.setDate(Calendar.getInstance());
        moon.fullmoon(ozaiFall.getDate());
        comet.appearance(ozaiFall.getDate());
        ozaiFall.setDescription(
                "During Sozin's Comet, Fire Lord Ozai’s firebending is greatly enhanced, and he attempts to destroy Bah Sing Se. Aang confronts him in an intense battle, eventually entering the Avatar State. Instead of killing Ozai, Aang uses spiritual bending to strip him of his firebending, ending the war and staying true to his beliefs of non-violence.\n");
        ozaiFall.setLocal(baSingSe);
        ozaiFall.getBeings().add(ozai);
        ozaiFall.getBeings().add(aang);
        System.out.println(ozaiFall.getName() + "\n\n" + ozaiFall.getDescription());
        ozai.bend();
        aang.bendSpirit(ozai);
        ozai.bend();

        Avatar korra = Avatar.createAvatar();
        System.out.println("\nNew Avatar's name: " + korra.getName());
    }
}
