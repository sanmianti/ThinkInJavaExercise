package unit9;

import java.util.Random;

public interface RandVals {

	Random RAND = new Random(47);
	int RANDOM_INT = RAND.nextInt(10);
	long RANDOM_LONG = RAND.nextLong();
	float RANDOM_FLOAT = RAND.nextFloat();
	double RANDOM_DOUBLE = RAND.nextDouble();
}
