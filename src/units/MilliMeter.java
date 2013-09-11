package units;

/**
 * Created with IntelliJ IDEA.
 * User: evah
 * Date: 6/14/13
 * Time: 1:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class MilliMeter {

    private int mmeter;

    public MilliMeter(int mmeter) {
        this.mmeter = mmeter;

    }
    @Override
    public String toString(){

        return mmeter + "mm";

    }
}
