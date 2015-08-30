package example;
 
/**
 * @author Grady
 */
public class Criterion {
 
    public Criterion() {
    }
 
    private Integer areaId;
    private Double minBudget;
    private Double maxBudget;
    private Double minSize;
    private Double maxSize;
 
    public Integer getAreaId() {
        return areaId;
    }
 
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }
 
    public Double getMaxBudget() {
        return maxBudget;
    }
 
    public void setMaxBudget(Double maxBudget) {
        this.maxBudget = maxBudget;
    }
 
    public Double getMaxSize() {
        return maxSize;
    }
 
    public void setMaxSize(Double maxSize) {
        this.maxSize = maxSize;
    }
 
    public Double getMinBudget() {
        return minBudget;
    }
 
    public void setMinBudget(Double minBudget) {
        this.minBudget = minBudget;
    }
 
    public Double getMinSize() {
        return minSize;
    }
 
    public void setMinSize(Double minSize) {
        this.minSize = minSize;
    }
}