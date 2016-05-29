/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package implementation;

/**
 *
 * @author aa27927
 */
public class Main {

    public FirstPage firstPage;
    public SecondPage secondPage;
    //scores are added in here in main. Global variable, so that it can be modify from other classes
    public int score;
    public FirstQuestion firstquestion;
    public SecondQuestion secondquestion;
    public ThirdQuestion thirdquestion;
    public FourthQuestion fourthquestion;
    public ScorePage scorepage;




    public Main() {
        score = 0;
        secondPage = new SecondPage(this);
        secondPage.setVisible(true);
        secondPage.setEnabled(false);
        firstPage = new FirstPage(this);
        firstPage.setVisible(true);
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main();
    }

}
