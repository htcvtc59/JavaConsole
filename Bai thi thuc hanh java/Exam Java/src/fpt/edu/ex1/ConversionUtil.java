package fpt.edu.ex1;

import java.util.Scanner;

/**
 * Created by Monkey.TNT on 11/2/2016.
 */
public class ConversionUtil {
       private  double cDegree;
    private double fDegree;

    public double getcDegree() {
        return cDegree;
    }

    public void setcDegree(double cDegree) {
        this.cDegree = cDegree;
    }

    public double getfDegree() {
        return fDegree;
    }

    public void setfDegree(double fDegree) {
        this.fDegree = fDegree;
    }

        public double fahrenheitToCelsius(double fDegree) {
             return (5*(fDegree-32))/9;
        }
        public double celciusToFahrenheit( double cDegree) {
                    return (9*cDegree+32)/5;
        }

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            double fDegree,cDegree;
            ConversionUtil conversionUtil = new ConversionUtil();
            System.out.println("Nhap fahrenheit: ");
            fDegree=sc.nextDouble();
            System.out.printf("celsius = %f",conversionUtil.fahrenheitToCelsius(fDegree));

            System.out.printf("fahrenheit = %f",conversionUtil.celciusToFahrenheit(conversionUtil.fahrenheitToCelsius(fDegree)));
        }
    }


