package com;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: evah
 * Date: 6/12/13
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class MeterTest {
    @Test
    public void Meter_conversion(){

        MeterClass meter = new MeterClass(6);

        assertThat(meter.toString(), is("6m"));




    }
}
