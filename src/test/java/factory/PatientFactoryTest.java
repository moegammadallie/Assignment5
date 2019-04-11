package factory;

import domain.Ailment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientFactoryTest {

    @Test
    public void getStudent() {
        String name = "ADP 3";
        Ailment c = AilmentFactory.getAilment(name);
        System.out.println(c);
        Assert.assertNotNull(c.getAilmentId());
    }
}