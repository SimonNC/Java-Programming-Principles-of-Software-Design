
/**
 * Write a description of MagnitudeFilter here.
 * 
 * @author Simon JORITE
 * @version 0.1
 */
public class MagnitudeFilter implements Filter{
    private double minimumMagnitude;
    private double maximumMagnitude;

    public MagnitudeFilter(double minMag, double maxMag) {
        minimumMagnitude = minMag;
        maximumMagnitude = maxMag;
    }
    
    public boolean satisfies(QuakeEntry qe) { 
        return minimumMagnitude <= qe.getMagnitude()
                && qe.getMagnitude() <= maximumMagnitude; 
    } 
    
    public String getName() {
        return "Magnitude";
    }
}
