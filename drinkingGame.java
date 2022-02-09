import java.util.random;

public class drinkingGame{

  int           rounds;                                           //Defined to store number of conducted rounds.
  int           peopleDrinking;                                   //Defined to store number of people participating.
  float         glassSize;                                        //Defined to store size of the beer glasses. May be altered from round to round.
  int           amountDrunkenInRound;                             //Defined to store the amount of alcohol that will be drunken in the round.
  int           amountDrunken;                                    //Defined to store the amount of alcohol that has already been drunken.
  int           maximalCapacity;                                  //Defined to store the amount of alcohol that can maximally be stored.
  int           storedAlcoholics;                                 //Defined to store the amount of alcohol that is available.

  dataForGUI    GUIData     = new dataForGUI(storedAlcoholics);
  Players       dataForThem = new Players(peopleDrinking);

  public int amountDrunkenInRound(){

  }

  public void exceptions(){

  }

  public static void main(String[] args){

  }
}
