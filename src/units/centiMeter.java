package units;

/**
 * Created with IntelliJ IDEA.
 * User: evah
 * Date: 6/12/13
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class centiMeter {

    private int length;

    public centiMeter(int length) {

        //update  to  avoid  getting  default value
        this.length = length;


        //To change body of created methods use File | Settings | File Templates.
    }




    @Override
    public String toString(){

        return length + "cm";

    }
}
