package week2programming.Reflection2Erika;

    public class Letter {

        private String address;
        private Boolean stamped = false;

        public Letter(String address) {
            this.address = address;
        }

        public void stamp() {
            stamped = true;
        }

        public String getAddress() {
            return address;
        }

        public Boolean isStamped() {
            return stamped;
        }
    }

