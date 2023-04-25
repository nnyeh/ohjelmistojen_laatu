package tsydeemi;

public class Pelaaja {

    int voitot;          // Pelajan voittolukumäärä yhdessä erässä
    int voitotYhteensa;  // Pelaajan voittolukumäärä kaikissa peleissä yhteensä

    // Metodi, joka arpoo pelaajan valinnan satunnaisesti ja palauttaa sen merkkijonona
    public String pelaajanValinta() {
        String valinta = "";
        int c = (int) (Math.random() * 3);
        switch (c) {
            case 0:
                valinta = ("kivi");
                break;
            case 1:
                valinta = ("paperi");
                break;
            case 2:
                valinta = ("sakset");
                break;
        }
        return valinta;
    }

    // Metodi, joka lisää pelaajalle yhden voiton sekä yhden voiton kaikkiin peleihin yhteensä
    public void lisaaVoitto() {
        voitot++;               // Kasvata voittolukumäärää yhdellä
        voitotYhteensa++;       // Kasvata voittojen kokonaislukumäärää yhdellä
    }

    // Metodi, joka palauttaa pelaajan voittolukumäärän yhdessä erässä
    public int getVoitot() {
        return voitot;
    }
    
    // Metodi, joka palauttaa pelaajan voittolukumäärän kaikissa peleissä yhteensä
    public int getVoitotYhteensa() {
        return voitotYhteensa;
    }
}
