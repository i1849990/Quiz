package quiz;

public class WeatherData {

	Stack<Double> temperatures = new Stack<Double>();
	
	public WeatherData(Stack<Double> param) {
		temperatures = param;
	}
	
	public void cleanData(double lower, double upper) {
		Stack<Double> temp = new Stack<Double>();
		
		while(temperatures.size() > 0) {
			if (temperatures.peek() > upper || temperatures.peek() < lower) {
				double garbage = temperatures.pop();
			}else {
				temp.push(temperatures.pop());
			}
		}
		
		while(temp.size() > 0) {
			temperatures.push(temp.pop());
		}
	}
	
	public int longestHeatWave(double threshold) {
		int streak = 0;
		int longestStreak = 0;
		
		Stack<Double> temperature = temperatures;
		Stack<Double> temp = new Stack<Double>();
		
		while(temperature.size() > 0) {
			if(temperature.peek() > threshold) {
				streak++;
				
			}else {
				if(streak > longestStreak) {
					longestStreak = streak;
				}
				streak = 0;
				
			}
			temp.push(temperature.pop());
		}
		
		return longestStreak;
	}
	
	public void print() {
		Stack<Double> temp = temperatures;
		
		while(temp.size() > 0) {
			System.out.println(temp.pop());
		}
		
		temp = temperatures;
	}
}
