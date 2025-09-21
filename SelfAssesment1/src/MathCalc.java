
public class MathCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sunDiameterMiles = 865000.0;
		double earthDiameterMiles = 7600.0;
		
		double sunRadiusMiles = sunDiameterMiles / 2.0;
		double earthRadiusMiles = earthDiameterMiles / 2.0;
		
		double earthVolume = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusMiles, 3);
		double sunVolume = (4.0 / 3.0) * Math.PI * Math.pow(sunRadiusMiles, 3);
		
		double volumeRatio = sunVolume / earthVolume;
		
		System.out.println("The volume of the Earth is " + earthVolume + " cubic miles");
		System.out.println("The volume of the Sun is " + sunVolume + " cubic miles");
		System.out.println("The ratio of the volume of the Sun to the volume of the Earth is " + volumeRatio);
	}

}
