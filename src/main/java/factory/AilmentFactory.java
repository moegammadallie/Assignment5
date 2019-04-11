package factory;


import domain.Ailment;
import util.Misc;

public class AilmentFactory {
    public static Ailment getAilment(String ailmentName) {
        return new Ailment.Builder().ailmentId(Misc.generateId())
                .ailmentName(ailmentName)
                .build();
    }
}
