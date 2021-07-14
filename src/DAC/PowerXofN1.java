package DAC;

//! Only positive numbers

class PowerXofN1 {
	/* Function to calculate x raised to the power y */
	static int power(int x, int y)
	{
        int temp;
		if (y == 0)
			return 1;
        temp = power(x,y/2);
        return y % 2 == 0 ? temp * temp : x * temp * temp;
	}

	/* Program to test function power */
	public static void main(String[] args)
	{
		int x = 2;
		int y = 3;

		System.out.printf("%d", power(x, y));
	}
}