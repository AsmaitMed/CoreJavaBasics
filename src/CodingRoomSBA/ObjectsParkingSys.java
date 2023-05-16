package CodingRoomSBA;

public class ObjectsParkingSys {
    public interface ParkingSystem {
        double processTicket();
    }

    static class HospitalParking implements ParkingSystem {
        private static final double NIGHTLY = 30;
        private static final double MORNING = 20;
        private static final double TWENTY_FOUR = 45;

        private final int time;
        private final double surcharge;
        private double price;

        public HospitalParking(int time) {
            this.time = time;
            this.surcharge = 0.2;
            this.price = 0;
        }

        public double processTicket() {
            if (time >= 6 && time < 18) {
                price = MORNING;
            } else if (time >= 18 && time < 24) {
                price = NIGHTLY;
            } else {
                price = TWENTY_FOUR;
            }
            price += price * surcharge;
            return price;
        }

        @Override
        public String toString() {
            return "Price for hospital parking is $" + String.format("%.2f", price);
        }
    }

    static class MallParking implements ParkingSystem {
        private static final double NIGHTLY = 30;
        private static final double MORNING = 20;
        private static final double TWENTY_FOUR = 45;

        private final int time;
        private final double surcharge;
        private double price;

        public MallParking(int time) {
            this.time = time;
            this.surcharge = 0.1;
            this.price = 0;
        }

        public double processTicket() {
            if (time >= 6 && time < 18) {
                price = MORNING;
            } else if (time >= 18 && time < 24) {
                price = NIGHTLY;
            } else {
                price = TWENTY_FOUR;
            }
            price += price * surcharge;
            return price;
        }

        @Override
        public String toString() {
            return "Price for mall parking is $" + String.format("%.2f", price);
        }
    }



        public static void main(String[] args) {
            // create HospitalParking object and call processTicket method
            ParkingSystem hospitalParking = new HospitalParking(14);
            double price = hospitalParking.processTicket();
            System.out.printf("Price for hospital parking is $%.2f\n", price);

            // create MallParking object and call processTicket method
            ParkingSystem mallParking = new MallParking(9);
            price = mallParking.processTicket();
            System.out.printf("Price for mall parking is $%.2f\n", price);
        }
    }

