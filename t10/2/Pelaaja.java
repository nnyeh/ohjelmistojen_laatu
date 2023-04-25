package tsydeemi;

/*
Poistin turhat sulkeet case-lauseiden ympäriltä.

Vaihdoin Math.random() * 3:sta Math.random() * 3+1:een, jotta voidaan välttyä arvojen nollalta.

Muutin muuttujien nimiä kommentien kera, jotka selittävät paremmin näiden tarkoituksen.

Poistin muuttujan "valinta" alustamisen tyhjäksi stringiksi, sillä sitä ei tarvita.

Poistin tarpeettoman this-komennon lisääVoitto-metodissa.
*/

public class Pelaaja {

  private int voitot; // Pelaajan voittolukumäärä yhdessä erässä
  private int voitotYht; // Pelaajan voittolukumäärä kaikissa peleissä yhteensä

  // Konstruktori, joka alustaa pelaajan voittolukumäärät nollaksi.
  public Pelaaja() {
    voitot = 0;
    voitotYht = 0;
  }
  
  // Arpoo pelaajan valinnan kivi, paperi tai sakset.
  public String pelaajanValinta() {
    int valinta = (int)(Math.random() * 3 + 1);
    switch (valinta) {
    case 1:
      return "kivi";
    case 2:
      return "paperi";
    case 3:
      return "sakset";
    default:
      return "";
    }
  }
  
  // Lisää pelaajalle yhden voiton ja kasvattaa voittolukumäärää kaikissa peleissä yhteensä.
  public void lisaaVoitto() {
    voitot++;
    voitotYht++;
  }
  
  // Palauttaa pelaajan voittolukumäärän yhdessä erässä.
  public int getVoitot() {
    return voitot;
  }
  
  // Palauttaa pelaajan voittolukumäärän kaikissa peleissä yhteensä.
  public int getVoitotYht() {
    return voitotYht;
  }
}