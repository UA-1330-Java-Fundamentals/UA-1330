package homework16;


class Refrigerator {
    private String brand;
    private String model;
    private int capacity;

    public Refrigerator(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    public void displayInfo() {
            System.out.println("Refrigerator - Brand: " + getBrand() + ", Model: " + getModel() + ", Capacity: " + getCapacity() + " liters");
        }

        public int getCapacity() {
            return capacity;
        }
        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }
}

