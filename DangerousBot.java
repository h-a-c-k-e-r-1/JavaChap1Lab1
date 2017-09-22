
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public int beepers;
    
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void pickBeepers() {
        while(nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        for (int i=0; i<beepers; i++){
            putBeeper();
        }
    }
    public void choose() {
        if (beepers%2==0){
           turnRight();
           move();
           while (nextToABeeper()){
               pickBeeper();
            }
           turnLeft();
           turnLeft();
           move();
        }
        else {
           turnLeft();
           move();
           while (nextToABeeper()){
               pickBeeper();
            }
           turnLeft();
           turnLeft();
           move();
        }
    }
    public void choosePile() {
        pickBeepers();
        choose();
    }
   
}

