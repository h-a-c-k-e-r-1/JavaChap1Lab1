
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public int beepers;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void faceNorth() {
        if (!facingNorth()){
            turnLeft();
            if (!facingNorth()){
            turnLeft();
            if (!facingNorth()){
            turnLeft();
        }
        }
        }
            
    }
    public void faceSouth() {
        if (!facingSouth()){
            turnLeft();
            if (!facingSouth()){
            turnLeft();
            if (!facingSouth()){
            turnLeft();
        }
        }
        }
            
    }
    public void faceEast() {
        if (!facingEast()){
            turnLeft();
            if (!facingEast()){
            turnLeft();
            if (!facingEast()){
            turnLeft();
        }
        }
        }
            
    }
    public void faceWest() {
        if (!facingWest()){
            turnLeft();
            if (!facingWest()){
            turnLeft();
            if (!facingWest()){
            turnLeft();
        }
        }
        }
            
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void mover() {
        while (!nextToABeeper()) {
            move();
        }
        pickBeepers();
    }
    public void pickBeepers() {
        while (nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        if (beepers == 1) {
            faceNorth();
        }
        else if (beepers == 2){
            faceEast();
        }
        else if (beepers == 3){
            faceSouth();
        }
        else if (beepers == 4){
            faceWest();
        }
        else if (beepers == 5){
            turnOff();
        }
        beepers = 0;
        mover();
    }
    public void findTreasure() {
        pickBeepers();
    }  
}

