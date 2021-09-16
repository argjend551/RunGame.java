import java.util.ArrayList;


public class Logic {
    private String computerChoice;
    Historik history = new Historik();  //Skapar ett object av klassen Historik



    public String getRandomWord(){
        ArrayList<String> ord = new ArrayList<>();
        ord.add("Sten");
        ord.add("Sax");
        ord.add("Påse");                               // Slumpar ett ord från Sten, Sax, Påse

        int a = (int) (Math.random() * ord.size());

        return ord.get(a);
    }

    public void checkChoice(String userChoice){
        this.computerChoice = getRandomWord();                      //kallar slumpord

        if(userChoice == computerChoice){                                  // kollar om slumpordet är exakt samma som användaren valt.
            System.out.println("Oavgjort datorn valde " + computerChoice);
            history.setList("Oavgjort");

        }
       if(userChoice == "Sten" && computerChoice == "Påse") {                // om användaren valt "Sten" och om Datorn slumpat fram Påse så förlorar du och ordet förlorade läggs till i Arraylistan genom setList
           System.out.println("du förlora. datorn valde " + computerChoice);
           history.setList("Förlorade");
       }
        if(userChoice == "Sten" && computerChoice == "Sax") {              // om användaren valt "Sten" och om Datorn slumpat fram Sax så Vinner du och ordet Vann läggs till i Arraylistan genom setList
            System.out.println("du vann. datorn valde " + computerChoice);
            history.setList("Vann");
        }
        if(userChoice == "Sax" && computerChoice == "Påse") {               // om användaren valt "Sax" och om Datorn slumpat fram Påse så Vinner du och ordet Vann läggs till i Arraylistan genom setList
            System.out.println("du vann. datorn valde " + computerChoice);
            history.setList("Vann");
        }
        if(userChoice == "Sax" && computerChoice == "Sten") {               // om användaren valt "Sax" och om Datorn slumpat fram Sten så förlorar du och ordet Förlorade läggs till i Arraylistan genom setList
            System.out.println("du förlora. datorn valde " + computerChoice);
            history.setList("Förlorade");
        }
        if(userChoice == "Påse" && computerChoice == "Sten") {              // om användaren valt "Påse" och om Datorn slumpat fram Sten så Vinner du och ordet Vann läggs till i Arraylistan genom setList
            System.out.println("du vann. datorn valde " + computerChoice);
            history.setList("Vann");
        }
        if(userChoice == "Påsen" && computerChoice == "Sax") {              // om användaren valt "Påsen" och om Datorn slumpat fram Sax så förlorar du och ordet Förlorade läggs till i Arraylistan genom setList
            System.out.println("du förlora. datorn valde " + computerChoice);
            history.setList("Förlorade");
        }

    }

    public void getLista(){
        history.getList();
    }       // Hämtar listan från klassen historik



}
