public class Calculator {
    public double calculate(double d1 , char c , double d2) {
	double result = 0;
	if (c == '+')
	    result = d1 + d2;
	else if (c == '-')
	    result = d1 - d2;
	else if (c == '*')
	    result = d1 * d2;
	else if (c == '/') {
	    if (d1 == 0 || d2 == 0) {
		System.out.println("ERROR");
		return(-1);
	    }
	    result = d1 / d2;
	}
	return result;
    }
}