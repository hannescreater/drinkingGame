public class dataForGUI{                                                                  //Makes Data easier to access for use in the GUI
  public static double storedAlcs = 0;                                                    //Renames every variable to make it shorter/faster to access
  public static int maxCap = 0;
  public static int peopDrink = 0;
  public dataForGUI(double storedAlcoholics, int maximalCapacity, int peopleDrinking){
    storedAlcs    = storedAlcoholics;
    maxCap        = maximalCapacity;
    peopDrink     = peopleDrinking;
  }
}
