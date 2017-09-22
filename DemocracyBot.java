
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public int beepers;
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void withBeeper() {
           if (nextToABeeper()){
           while (nextToABeeper()){
               pickBeeper();
            }
           putBeeper();
           turnLeft();
           turnLeft();
           move();
           move();
        }
           else {
           putBeeper();
           turnLeft();
           turnLeft();
           move();
           move();
        }
           if (nextToABeeper()){
           while (nextToABeeper()){
               pickBeeper();
            }
           putBeeper();
           turnLeft();
           turnLeft();
           move();
           turnRight();

        }
        else {
           putBeeper();
           turnLeft();
           turnLeft();
           move();
           turnRight();
        }
    }
    public void checkBeeper() {
        move();
    if (nextToABeeper()){
           turnLeft();
           move();
           withBeeper();
    }
       
    else{
        turnLeft();
        move();
        if (nextToABeeper()){
           while (nextToABeeper()){
               pickBeeper();
            }
        }
        turnLeft();
        turnLeft();
        move();
        move();
        if (nextToABeeper()){
           while (nextToABeeper()){
               pickBeeper();
            }
        }
        turnLeft();
        turnLeft();
        move();
        turnRight();
    }

}

    public void fixBallots() {
        checkBeeper();
        move();
        checkBeeper();
        move();
        checkBeeper();
        move();
        checkBeeper();
        move();
        checkBeeper();
    }
   
}

