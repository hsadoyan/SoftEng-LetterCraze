package Builder.Entities;

/**
 * Subclass of the level class, different because it
 * has the time attribute.
 */
public class LightningLevel extends Level {

    int time;


    /**
     * Constructor of the lightning level.
     * @param brd is the board that belonds to this level
     */
    public LightningLevel(Board brd) {
        super(brd);
        this.time = -1;
    }

    /**
     * If lightning level, then returns string affirming that.
     */
    public String getLevelType() {
        return "Lightning";
    }

    /**
     * Setter method that assigns the time attribute the wished value.
     * @param time the value to be assigned.
     * @return true if it was correctly assigned.
     */
    public boolean assignTime(int time) {
        this.time = time;
        return true;
    }
    
    /**
     * Getter method for the time field.
     * @return the time int.
     */
    public int getTime(){
    	return time;
    }

}
