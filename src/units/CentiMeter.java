package units;

/**
 * Created with IntelliJ IDEA.
 * User: evah
 * Date: 6/12/13
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class CentiMeter {

    private int length;

    public CentiMeter(int length) {

        //update  to  avoid  getting  default value
        this.length = length;


        //To change body of created methods use File | Settings | File Templates.
    }


    @Override
    public String toString(){

        return length + "cm";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CentiMeter that = (CentiMeter) o;

        if (length != that.length) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return length;
    }
}
