package factory;

import domain.Patient;
import util.Misc;

public class PatientFactory {
    public static Patient getStudent(String firstName, String lastName, int age) {
        return new Patient.Builder().age(age)
                .patientFirstName(firstName)
                .patientLastName(lastName)
                .patientId(Misc.generateId())
                .build();
    }
}
