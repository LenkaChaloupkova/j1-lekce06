package cz.czechitas.lekce6;

import cz.czechitas.lekce6.kontakty.Osoba;
import cz.czechitas.lekce6.nakupniseznam.NakupniSeznam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Hlaví třída pro lekci 6.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        new NakupniSeznam().run();
        new Osoba("Honza", "Nebojsa").run();

        Map<String, Integer> slovnik = new HashMap<>();
        ArrayList<String> todo = new ArrayList<>();
        todo.add("Dojdi koupit jablka");
        todo.trimToSize();
    }
}
