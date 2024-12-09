import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        final float cubicWater = 7.48F; //Volume to gallons of water constant
        float wellRadius;
        float wellDepth;
        float waterVolume;
        float wellVolume;
        Scanner newScanner = new Scanner(System.in);

        System.out.println("Please enter the diameter of your well in feet:");
        wellRadius = newScanner.nextFloat() / 2; //Halving diameter to get radius. Easier to measure diameter.

        System.out.println("Please enter the depth of your well in feet:");
        wellDepth = newScanner.nextFloat();

        wellVolume = (float) (Math.PI * (wellRadius * wellRadius) * wellDepth);
        waterVolume = wellVolume * cubicWater;

        System.out.println("The volume of your well is " + String.format("%.2f", waterVolume) + " gallons of water.");
    }
}