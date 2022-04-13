package com.company.homework;


import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        try{
            Sensor sensor = new Sensor(x, y);
            sensor.sensor(x,y);
        }
            catch(Exception e){
                System.out.println(e);
            }
        }

    static class Sensor
    {
        int B,H;
        Sensor( int B, int H) throws Exception{
            checkNumber(B);
            checkNumber(H);
            this.B = B;
            this.H = H;
        }
        void checkNumber(int x) throws Exception {
            if (x <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
        }

        int sensor(int B, int H){
            if(B >= 0 && H >= 0 ){
                int result;
                result = B * H ;
                System.out.println(result);
            }
            return 0;
        }
    }
}
