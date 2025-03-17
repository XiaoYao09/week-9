package main;

class AsphaltCar extends RallyCar {
    private double downforce;

    public AsphaltCar(String make, String model, int horsepower, double downforce) {
        super(make, model, horsepower);
        this.downforce = downforce;
    }

    public double getDownforce() {
        return downforce;
    }

    @Override
    public double calculatePerformance() {
        return horsepower * 0.9 + downforce * 5; // ✅ 计算公式正确吗？
    }

}


