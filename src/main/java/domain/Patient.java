package domain;

import java.util.Set;

public class Patient {
    private String patientId, patientFirstName, patientLastName;
    private int age;
    private Set<Ailment> ailments;

    private Patient(){}

    private Patient(Builder builder) {
        this.patientId = builder.patientId;
        this.age = builder.age;
        this.patientFirstName = builder.patientFirstName;
        this.patientLastName = builder.patientLastName;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public String getPatientLastName() {

        return patientLastName;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {

        private String patientId, patientFirstName, patientLastName;
        private int age;
        private Set<Ailment> ailments;


        public Builder patientId( String patientId) {
            this.patientId = patientId;
            return this;
        }

        public Builder patientFirstName( String patientFirstName) {
            this.patientFirstName = patientFirstName;
            return this;
        }

        public Builder patientLastName( String patientLastName) {
            this.patientLastName = patientLastName;
            return this;
        }

        public Builder age( int age) {
            this.age = age;
            return this;
        }

        public Patient build() {
            return new Patient(this);
        }

    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", patientFirstName='" + patientFirstName + '\'' +
                ", patientLastName='" + patientLastName + '\'' +
                ", age=" + age +
                '}';
    }
}
