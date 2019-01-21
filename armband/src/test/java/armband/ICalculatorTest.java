package armband;

import com.utech.ap.ICalculator;

public class ICalculatorTest {
	
	public void shouldAdd3PositiveNumbers(){
		ICalculator calculator = new Calculator();
		int result = calculator.add(3,4,5);
		assertEquals(12, result ,0);
	}

	
	}

}
