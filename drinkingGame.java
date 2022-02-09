import java.util.random;
import java.util.concurrent.TimeUnit;

public class drinkingGame{

  int           rounds = 0;                                       //Defined to store number of conducted rounds.
  int           peopleDrinking;                                   //Defined to store number of people participating.
  float         glassSize;                                        //Defined to store size of the beer glasses. May be altered from round to round.
  double        amountDrunkenInRound;                             //Defined to store the amount of alcohol that will be drunken in the round.
  double        amountDrunken;                                    //Defined to store the amount of alcohol that has already been drunken.
  int           maximalCapacity;                                  //Defined to store the amount of alcohol that can maximally be stored.
  double        storedAlcoholics;                                 //Defined to store the amount of alcohol that is available.

  Random random = new Random();

  dataForGUI    GUIData     = new dataForGUI(storedAlcoholics);   //Defined as an object to make it easier to access
  Players       dataForThem = new Players(peopleDrinking);        //Defined as an object to make it easier to access

  public int amountDrunkenInRound(){
    glassSize             =   random.nextInt(5)/10;
    amountDrunkenInRound  *=  peopleDrinking;
    amountDrunken         +=  amountDrunkenInRound;
    return glassSize;
    return amountDrunkenInRound;
    return amountDrunken;
  }

  public void exceptions(){

  }

  public static void main(String[] args, int peopleDrinking, double storedAlcoholics, double amountDrunkenInRound, int rounds){

    for(int i=0; i<peopleDrinking; i++){
      Players.setalcoholTolerance[i](random.nextInt(15));
    }

    userInputsAtStart.userInputs(maximalCapacity, storedAlcoholics, peopleDrinking);
    amountDrunkenInRound();

    for(int j=0; j<peopleDrinking; j++){
      Players.setalcoholLevel[j](Players.getalcoholLevel[j]()+glassSize);
    }
    storedAlcoholics      -=  amountDrunkenInRound;
    rounds++;
    TimeUnit.SECONDS.sleep(10);
  }
}
