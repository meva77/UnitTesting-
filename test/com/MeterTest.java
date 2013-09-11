package com;

import org.junit.Test;
import units.CentiMeter;
import units.MeterClass;
import units.MilliMeter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: evah
 * Date: 6/12/13
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 * here was trying out writing test for meter conversion from  meters to centimeters to millimeters
 */
public class MeterTest {
    @Test
    public void Meter_conversion(){

        MeterClass meter = new MeterClass(6);

        assertThat(meter.toString(), is("6m"));


    }

    @Test
    public void cmeter_conversion(){

        CentiMeter cmeter = new CentiMeter(6);
        assertThat(cmeter.toString(), is("6cm"));




    }
    @Test


    public void millimeter_conversion(){

        MilliMeter mmeter = new MilliMeter(6);
        assertThat(mmeter.toString(), is("6mm"));


    }
    @Test
    public void change_meter_to_centimeter(){


        MeterClass meter1 = new MeterClass(1);
        CentiMeter centimeter = new CentiMeter(100);

        assertThat(meter1.toCentimeter(), is(centimeter));


    }



}


