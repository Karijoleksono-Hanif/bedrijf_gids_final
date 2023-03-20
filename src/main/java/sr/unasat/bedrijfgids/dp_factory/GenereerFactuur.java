package sr.unasat.bedrijfgids.dp_factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

  public class GenereerFactuur {

      private String plan;
      private Integer maanden;

      public String getPlan() {
          return plan;
      }

      public void setPlan(String plan) {
          this.plan = plan;
      }

      public Integer getMaanden() {
          return maanden;
      }

      public void setMaanden(Integer maanden) {
          this.maanden = maanden;
      }




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

      public static void main(String[] args) throws IOException {
          GenereerFactuur.factuur();
      }


  }

