package org.dsa;

public class ArrayTest2 {
    public static void main(String[] args) {

        int empSalary[] = new int []{
                2450, 3890, 1760, 4520, 3180,
                4975, 2640, 1210, 3580, 4100,
                2995, 1870, 4650, 3420, 2280,
                5090, 2760, 1340, 3950, 4605,
                2150, 3700, 1485, 4250, 2890,
                4780, 3350, 1920, 4500, 3100,
                2600, 4990, 1725, 3880, 4400,
                2250, 3650, 1400, 4150, 2950,
                4700, 3300, 1850, 4550, 3050,
                2550, 4900, 1650, 3800, 4350};

        for (int i =0; i< empSalary.length; i++){
            if(empSalary[i] >= 2500 && empSalary[i] <= 3500){
                System.out.println(
                        i +" : " +  empSalary[i]
                );
            }
        }

    }
}
