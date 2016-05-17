// Initializing interface fields with
// non-constant initializers

package interfaces;

import java.util.Random;

public interface RandVals {

	Random rand = new Random(47);
	static int RAND_INT = rand.nextInt();
	static double RAND_DOUBLE = rand.nextDouble();
	static float RAND_FLAOT = rand.nextFloat();

}
