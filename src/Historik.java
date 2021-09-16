import java.util.ArrayList;

public class Historik {


    private ArrayList<String> ChoiceArrayList = new ArrayList<>();  // array där förlora/vann/oavgjort lagras.



    public void setList(String Add){
                                                    // Metod som lagrar alla resultat om du förlora/vann/oavgjort

            this.ChoiceArrayList.add(Add);

    }


    public void getList() {
        System.out.println("--------------------");
        System.out.println("Showing History:");          //skriver ut ArrayListan genom en for-each loop
        for (String s : ChoiceArrayList) {

            System.out.println(s);
        }
        System.out.println("--------------------");
        System.out.println("1.Ny Match\n2.Historik\n3.Avsluta ");


    }

}