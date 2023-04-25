package tsydeemi;

public class Peli {

	public static void main(String args[]) {
	    // Luodaan kaksi pelaajaa
	    Pelaaja p1 = new Pelaaja();
	    Pelaaja p2 = new Pelaaja();
	    
	    // Alustetaan pelimuuttujat
	    boolean peliLoppui = false;
	    int pelatutPelit = 0;
	    int p1Voitot = 0;
	    int p2Voitot = 0;
	    int tasapelit = 0;
	    String p1Valinta;
	    String p2Valinta;

	    // Pelilooppi, joka jatkuu kunnes jompikumpi pelaajista saavuttaa kolme voittoa
	    do {
	        System.out.println("Erä: " + (pelatutPelit + 1) + " =====================\n");
	        System.out.println("Tasapelien lukumäärä: " + tasapelit + "\n");

	        // Kutsutaan kummankin pelaajan valintafunktiota ja tulostetaan valinnat sekä voittojen lukumäärät
	        p1Valinta = p1.pelaajanValinta();
	        System.out.println("Pelaaja 1: " + p1Valinta + "\n\t Pelaaja 1:llä koossa " + p1Voitot + " voittoa.");

	        p2Valinta = p2.pelaajanValinta();
	        System.out.println("Pelaaja 2: " + p2Valinta + "\n\t Pelaaja 2:lla koossa " + p2Voitot + " voittoa.");

	        // Tarkistetaan kummalla pelaajalla on voitto
	        if ((p1Valinta.equals("kivi") && p2Valinta.equals("sakset"))
	                || (p1Valinta.equals("paperi") && p2Valinta.equals("kivi"))
	                || (p1Valinta.equals("sakset") && p2Valinta.equals("paperi"))) {
	            p1Voitot++;
	            System.out.println("Pelaaja 1 voittaa");
	        } else if ((p1Valinta.equals("sakset") && p2Valinta.equals("kivi"))
	                || (p1Valinta.equals("kivi") && p2Valinta.equals("paperi"))
	                || (p1Valinta.equals("paperi") && p2Valinta.equals("sakset"))) {
	            p2Voitot++;
	            System.out.println("Pelaaja 2 voittaa");
	        } else {
	            tasapelit++;
	            System.out.println("Tasapeli");
	        }

	        pelatutPelit++;
	        
	        // Jos jompikumpi pelaajista saavuttaa kolme voittoa, peli päättyy
	        if (p1Voitot >= 3 || p2Voitot >= 3) {
	            peliLoppui = true;
	            System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
	        }

	        System.out.println();
	    } while (!peliLoppui);
    }
}
