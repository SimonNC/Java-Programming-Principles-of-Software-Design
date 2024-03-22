
/**
 * Write a description of DepthFilter here.
 * 
 * @author Simon JORITE
 * @version 0.1
 */
public class DepthFilter implements Filter{
    private double minimumDepth;
    private double maximumDepth;

    public DepthFilter(double minDepth, double maxDepth) {
        minimumDepth = minDepth;
        maximumDepth = maxDepth;
    }
    
    public boolean satisfies(QuakeEntry qe) { 
        return minimumDepth <= qe.getDepth()
                && qe.getDepth() <= maximumDepth; 
    } 
    
    public String getName() {
        return "Depth";
    }
}
