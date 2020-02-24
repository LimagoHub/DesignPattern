package flyweight;

import java.time.Duration;
import java.time.Instant;

public class Main {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder(5_000_000);
		
		
		Instant start = Instant.now();
		for(int i = 0 ; i < 5_000_000; i++) {
			s.append("a");
		}
		String erg = s.toString();
		Instant ende = Instant.now();
		Duration duration = Duration.between(start, ende);
		System.out.println(duration.toMillis());
	}

}
