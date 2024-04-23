package model;

public class Currency {
    String conversion_rate;
    String conversion_result;

    public String getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(String conversion_result) {
        this.conversion_result = conversion_result;
    }

    public String getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(String conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    @Override
    public String toString() {
        return "Conversion Rate: "+ conversion_rate+" Result: "+conversion_result;
    }
}
