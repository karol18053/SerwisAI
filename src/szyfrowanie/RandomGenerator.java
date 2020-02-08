package szyfrowanie;

/**
 * Simplified interface for random number generation
 *
 * @author Nick Galbreath -- nickg [at] modp [dot] com
 * @version 1 -- 06-Jul-2005
 */
public interface RandomGenerator {

    /**
     * Returns N random bits
     *
     * See also java.util.Random#next
     * @param numBits
     * @return and int with the LSB being random
     */
    public int next(int numBits);

}
