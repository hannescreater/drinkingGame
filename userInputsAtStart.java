import javax.swing.JOptionPane;

public class userInputsAtStart{
  pulic int userInputs(int maximalCapacity, int storedAlcoholics, int peopleDrinking){
    JOptionPane.showMessageDialog(null, "Hello there, this game is basically about drinking alcohol until you're dead! Do you want to play a round? Let's go!");
    maximalCapacity   = JOptionPane.showInputDialog("How much beer do you want to be maximally storable?");
    peopleDrinking    = JOptionPane.showInputDialog("How many people do you want do be drinking?");
    storedAlcoholics  = JOptionPane.showInputDialog("How much beer do you want to be available at start?");
    return maximalCapacity;
    return peopleDrinking;
    return storedAlcoholics;
  }
}
