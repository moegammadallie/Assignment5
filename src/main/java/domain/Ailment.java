package domain;

public class Ailment {

    private String ailmentId, ailmentName;

    private Ailment() {}
    private Ailment(Builder builder) {
        this.ailmentId = builder.ailmentId;
        this.ailmentName = builder.ailmentName;
    }

    public String getAilmentId() {
        return ailmentId;
    }

    public String getAilmentName() {
        return ailmentName;
    }

    public static class Builder{

        private String ailmentId, ailmentName;

        public Builder ailmentId(String ailmentId) {
            this.ailmentId = ailmentId;
            return this;
        }

        public Builder ailmentName(String ailmentName) {
            this.ailmentName = ailmentName;
            return this;
        }

        public Ailment build() {
            return new Ailment(this);
        }

    }

    @Override
    public String toString() {
        return "Ailment{" +
                "ailmentId='" + ailmentId + '\'' +
                ", ailmentName='" + ailmentName + '\'' +
                '}';
    }
}
