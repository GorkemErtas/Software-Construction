package org.example;

/**
 * Hello world!
 *
 */
public class App
{

    /**
     * Main method.
     */
    public static void main(String[] args) {
        Character frodo = new Character("Frodo", "Hobbit", 60);
        frodo.printDetails();

        Character aragorn = new Character("Aragorn", "Human", 32);
        aragorn.printDetails();

        Character legolas = new Character("Legolas", "Elf", 530);
        legolas.printDetails();

        Character gimli = new Character("Gimli", "Dwarf", 160);
        gimli.printDetails();

        MiddleEarthMap map = new MiddleEarthMap();
        map.navigate('M', true);
        map.navigate('S', false);
        map.navigate('G', false);


        Quest quest = new Quest();
        quest.completeQuest(100, true);

        quest.completeQuest(50, false);
        quest.protectCastle(true, 2500);
    }
}
