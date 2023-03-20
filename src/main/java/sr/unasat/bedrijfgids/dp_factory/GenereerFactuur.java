package sr.unasat.bedrijfgids.dp_factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

  public class GenereerFactuur {

      public static void factuur() throws IOException {
          GetPlan planFactory = new GetPlan();

          System.out.print("Voer een van de volgende plan namen in 'standardplan' of 'commercieelplan': ");
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          String planNaam = br.readLine();
          System.out.print("voer aantal maanden in: ");

          int aantal = Integer.parseInt(br.readLine());
          Plan p = planFactory.getPlan(planNaam);

          System.out.print("Totaal bedrag voor " + planNaam + " voor  " + aantal + " maanden is: SRD ");
          p.getPrijs();
          p.calculeerRekening(aantal);
      }
  }

