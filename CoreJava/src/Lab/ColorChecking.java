package Lab;

import java.awt. *;

public class ColorChecking {

	public static void main(String[] args) {

		{
			Color rgb, hsb;
			rgb = new Color(193, 255, 183);
			int red, green, blue;
			red = rgb.getRed();
			green = rgb.getGreen();
			blue = rgb.getBlue();
			float x[] = { 0.0f, 0.0f, 0.0f };
			
			rgb.RGBtoHSB(red, green, blue, x);
			System.out.println("RGB Combination");
			System.out.println("Red : " + red + " Green : " + green + " Blue : " + blue);
			System.out.println("Hue : " + x[0] + " Saturation : " + x[1] + " Brightness : " + x[2]);
			
			System.out.println("---------------------------------------");
			
			int y = rgb.HSBtoRGB(0.86f, 0.3375f, 0.89f);
			System.out.println("HSB Combination");
			System.out.println("Red, Blue and Green Combination : " + y);
		}
	}

}
