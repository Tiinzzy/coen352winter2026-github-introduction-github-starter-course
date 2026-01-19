package ca.concordia.calculator.model;

public class Calculator {
    private double currentValue = 0;

    //getter
    public double getCurrentValue() {
        return currentValue;
    }

    //setter
    public void set(double newCurrentValue) {
        currentValue = newCurrentValue;
    }

    //methods
    public void add(double value) {
        currentValue += value;
    }

    public void subtract(double value) {
        currentValue -= value;
    }

    public void multiply(double value) {
        currentValue *= value;
    }

    public void divide(double value) {
        if(value == 0){
            throw new ArithmeticException("Divide by zero can't be done!");
        }
            currentValue /= value;
    }

    public void clear(){
        currentValue = 0.0;
    }


}

