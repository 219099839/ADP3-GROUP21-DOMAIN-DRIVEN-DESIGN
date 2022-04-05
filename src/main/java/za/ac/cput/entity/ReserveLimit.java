package za.ac.cput.entity;

public class ReserveLimit {

    public int totalLimit;
    public boolean availability;

    private ReserveLimit (Builder builder) {
        this.totalLimit = builder.totalLimit;
        this.availability = builder.availability;
    }

    public int getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(int totalLimit) {
        this.totalLimit = totalLimit;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "ReserveLimit{" +
                "totalLimit=" + totalLimit +
                ", availability=" + availability +
                '}';
    }

    public static class Builder {

        public int totalLimit;
        public boolean availability;

        public Builder totalLimit(int totalLimit) {
            this.totalLimit = totalLimit;
            return this;
        }

        public Builder availability(boolean availability) {
            this.availability = availability;
            return this;
        }

        public Builder copy (ReserveLimit reservelimit){

            this.totalLimit = totalLimit;
            this.availability = availability;

            return this;
        }
        public ReserveLimit build(){

            return new ReserveLimit(this);
        }
    }
}

