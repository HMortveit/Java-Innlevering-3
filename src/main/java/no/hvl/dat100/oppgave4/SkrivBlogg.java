package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
			File fil = new File(mappe, filnavn);
			PrintWriter skriver = new PrintWriter(fil);

			
			skriver.print(samling.toString());

			
			skriver.close();
			return true;
		} catch (FileNotFoundException e) {
			System.out.println("Feil: Filen ble ikke funnet eller kunne ikke opprettes.");
			e.printStackTrace();
			return false;
		}
	}
}
