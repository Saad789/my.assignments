package JavaTutorial;

public class DistanceProgram {

	public static void main(String[] args) {
		int distanceinmeters = 20000;
		double km = distanceinmeters/1000.0;
		double mile = distanceinmeters/1609.0;
		int timeinhours = 2;
		int timeinminutes = 30;
		int timeinseconds = 20;
		double totaltimeinhours = timeinhours + (timeinminutes/60.0) + (timeinseconds/3600.0);
		double totaltimeinsec = (2*3600) + (30*60) + 20;
		double speedinmts = distanceinmeters/totaltimeinsec;
		double speedinkms = km/timeinhours;
		double speedinmiles = mile/totaltimeinhours;
		System.out.println("speedinmts= "+speedinmts);
		System.out.println("speedinkms= "+speedinkms);
		System.out.println("speedinmiles= "+speedinmiles);	
				
		

	}

}
