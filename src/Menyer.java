import java.util.Scanner;

public class Menyer {


    private String menuChoice;
    Scanner scan = new Scanner(System.in);


    public Menyer(){
        System.out.println("Välkommen till Sten,Sax,Påse");    //Constructorn
    }


    Logic playerChoice = new Logic();  // Skapar ett object av klassen Logic



   public void MainMenu(){
        System.out.println("1.Ny Match\n2.Historik\n3.Avsluta ");

       menuChoice = scan.nextLine();      // Hämtar användarens inmatning

       while(true) {                    // while loopen körs till du väljer mellan 1-3
                if (menuChoice.equals("1") ) {
                    PlayerChoiceMenu();        // om du väljer 1 så skickas du till PlayerChoice menyn
                } else if (menuChoice.equals("2")) {
                    playerChoice.getLista();           // om du väljer 2 så skickas du till getList och visar Historik menyn
                } else if (menuChoice.equals("3")) {
                    System.out.println("Avslutar...");
                    System.exit(3);               // om du väljer 3 så avslutas programmet
                }

                else{
                    System.out.println("Fel! välj mellan 1,2,3 i menyn");
                }

           menuChoice = scan.nextLine();

            }


   }






    public void PlayerChoiceMenu(){

        System.out.println("Vad väljer du");
        System.out.println("1.Sten\n2.Sax\n3.Påse ");

        menuChoice = scan.nextLine();                        // Hämtar användarens inmatning


        while(true) {                                        // while loopen körs till du väljer mellan 1-3
            if (menuChoice.equals("1")) {
                playerChoice.checkChoice("Sten");
                AfterMatchMenu();                           // om användaren väljer 1 så skickas värdet "Sten" till checkChoice där den jämförs med slumpordet
            } else if (menuChoice.equals("2")) {
                playerChoice.checkChoice("Sax");
                AfterMatchMenu();                           // om användaren väljer 1 så skickas värdet "Sax" till checkChoice
            } else if (menuChoice.equals("3")) {
                playerChoice.checkChoice("Påse");
                AfterMatchMenu();                           // om användaren väljer 1 så skickas värdet "Påse" till checkChoice
            }
            else {
                System.out.println("Fel! välj mellan 1,2,3 i menyn");   // om användaren väljer ett tal högre än 3 så blir det ett fel meddelande och loopen körs om tills du väljer 1-3
            }

            menuChoice = scan.nextLine();

        }



   }




    public void AfterMatchMenu(){
        System.out.println("Vad väljer du");
        System.out.println("1.Meny\n2.Kör igen\n3.Avsluta ");

        menuChoice = scan.nextLine();               // Hämtar användarens inmatning


        while (true) {                                    // while loopen körs till du väljer mellan 1-3
            if (menuChoice.equals("1")) {
                MainMenu();                                // om du väljer 1 så skickas du till main menyn
            } else if (menuChoice.equals("2")) {
                PlayerChoiceMenu();                     // om du väljer 2 så skickas du till playerchoice menyn
            } else if (menuChoice.equals("3")) {
                System.out.println("Avslutar...");   // om du väljer 3 så avslutas programmet
                System.exit(3);
            } else {
                System.out.println("Fel! välj mellan 1,2,3 i menyn");
            }

            menuChoice = scan.nextLine();



        }



        }




}
