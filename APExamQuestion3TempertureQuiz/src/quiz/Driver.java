package quiz;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Double> a = new Stack<Double>();
		a.push(2.011);
		a.push(32.001);
		a.push(31.99);
		a.push(10.0);
		a.push(20.24);
		a.push(28.32);
		a.push(21.01);
		a.push(11.11);
		a.push(8.01);
		a.push(4.11);
		
		WeatherData tester = new WeatherData(a);
		
		
		
		
		System.out.println(tester.longestHeatWave(20.00));
		
		tester.cleanData(10.0, 30.0);
		
		tester.print();
	}

}
