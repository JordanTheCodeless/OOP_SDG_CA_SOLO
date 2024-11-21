/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carbonfootprintcalc;

/**
 *
 * @author jordancarthy
 */

    public class CarbonTransport extends CarbonFootPrint {
   private double flightLessFour;
   private double flightMoreFour;
   private double carYearlyMileage;
   private double transports[];
   
     public CarbonTransport(String type, double value, double flightLessFour, double flightMoreFour, double carYearlyMileage) {
        super(type, value);
        this.flightLessFour = flightLessFour;
        this.flightMoreFour = flightMoreFour;
        this.carYearlyMileage = carYearlyMileage;
        transports = new double[]{carYearlyMileage,flightLessFour,flightMoreFour};
    }
     



    public double getFlightLessFour() {
        return flightLessFour;
    }

    public void setFlightLessFour(int flightLessFour) {
        this.flightLessFour = flightLessFour;
    }

    public double getFlightMoreFour() {
        return flightMoreFour;
    }

    public void setFlightMoreFour(int flightMoreFour) {
        this.flightMoreFour = flightMoreFour;
    }

    public double getCarYearlyMileage() {
        return carYearlyMileage;
    }

    public void setCarYearlyMileage(int carYearlyMileage) {
        this.carYearlyMileage = carYearlyMileage;
    }

    public double computeCarbonFoot(){
        return value = ((transports[0] * 0.79) + (transports[1] * 1100) + (transports[2] * 4400));
    }
    public String toString(){
        return super.toString();
    }
    }
