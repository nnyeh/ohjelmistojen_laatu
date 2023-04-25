package tsydeemi;

/*
Muutin pääohjelman (main) sisällön yksinkertaiseksi metodikutsuksi.

Loogisesti yhtenäiset muuttujat, kuten voittojen ja tasapelien lukumäärät, alustetaan samalla rivillä.

Poistin boolean-muuttujan peliLoppui, sillä sen arvo on helppo tarkistaa p1Voitot ja p2Voitot -muuttujista.

Korvasin if-lausekkeen joka tarkisti onko jompikumpi pelaajista saavuttanut kolme voittoa aina true-olevalla while-loopin ehdolla.

If-lausekkeen sisällä oleva peliLoppui-muuttujan asettaminen on korvattu break-käskyllä, joka poistuu do-while-loopista.

Poistin turhan rivinvaihdon.
*/

public class Peli {

  public static void main(String args[]) {
    pelaaPeli();
  }

  private static void pelaaPeli() {
    // Luodaan kaksi pelaajaa
    Pelaaja p1 = new Pelaaja();
    Pelaaja p2 = new Pelaaja();

    // Alustetaan pelimuuttujat
    int pelatutPelit = 0, p1Voitot = 0, p2Voitot = 0, tasapelit = 0;
    String p1Valinta, p2Valinta;

    // Pelilooppi, joka jatkuu kunnes jompikumpi pelaajista saavuttaa kolme voittoa
    do {
      System.out.println("Erä: " + (pelatutPelit + 1) + " =====================");
      System.out.println("Tasapelien lukumäärä: " + tasapelit);

      // Kutsutaan kummankin pelaajan valintafunktiota ja tulostetaan valinnat sekä voittojen lukumäärät
      p1Valinta = p1.pelaajanValinta();
      System.out.println("Pelaaja 1: " + p1Valinta + "\n\t Pelaaja 1:llä koossa " + p1Voitot + " voittoa.");

      p2Valinta = p2.pelaajanValinta();
      System.out.println("Pelaaja 2: " + p2Valinta + "\n\t Pelaaja 2:lla koossa " + p2Voitot + " voittoa.");

      // Tarkistetaan kummalla pelaajalla on voitto
      if ((p1Valinta == ("kivi") && p2Valinta == ("sakset")) ||
        (p1Valinta == ("paperi") && p2Valinta == ("kivi")) ||
        (p1Valinta == ("sakset") && p2Valinta == ("paperi"))) {
        p1Voitot++;
        System.out.println("Pelaaja 1 voittaa");
      } else if ((p1Valinta == ("sakset") && p2Valinta == ("kivi")) ||
        (p1Valinta == ("kivi") && p2Valinta == ("paperi")) ||
        (p1Valinta == ("paperi") && p2Valinta == ("sakset"))) {
        p2Voitot++;
        System.out.println("Pelaaja 2 voittaa");
      } else {
        tasapelit++;
        System.out.println("Tasapeli");
      }

      pelatutPelit++;

      // Jos jompikumpi pelaajista saavuttaa kolme voittoa, peli päättyy
      if (p1Voitot >= 3 || p2Voitot >= 3) {
        System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
        break;
      }

      System.out.println();
    } while (true);

    // Tulostetaan lopputulokset
    System.out.println("Peli päättyi!");
    System.out.println("Pelaaja 1: " + p1Voitot + " voittoa");
    System.out.println("Pelaaja 2: " + p2Voitot + " voittoa");
    System.out.println("Tasapelien lukumäärä: " + tasapelit);
  }
}