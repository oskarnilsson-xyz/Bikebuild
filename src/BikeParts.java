public class BikeParts {
    String partsMake;
    String partsModel;
    String partsMaterial;
    Integer partsWeight;
    Float partsWindResistanceMultiplier;

    public BikeParts(String partsMake, String partsModel, Integer partsWeight) {
        this.partsMake = partsMake;
        this.partsModel = partsModel;
        this.partsWeight = partsWeight;
    }

    public BikeParts(String partsMake, String partsModel, String partsMaterial, Integer partsWeight, Float partsWindResistanceMultiplier) {
        this.partsMake = partsMake;
        this.partsModel = partsModel;
        this.partsMaterial = partsMaterial;
        this.partsWeight = partsWeight;
        this.partsWindResistanceMultiplier = partsWindResistanceMultiplier;
    }

    public String getPartsMake() {
        return partsMake;
    }

    public void setPartsMake(String partsMake) {
        this.partsMake = partsMake;
    }

    public String getPartsModel() {
        return partsModel;
    }

    public void setPartsModel(String partsModel) {
        this.partsModel = partsModel;
    }

    public String getPartsMaterial() {
        return partsMaterial;
    }

    public void setPartsMaterial(String partsMaterial) {
        this.partsMaterial = partsMaterial;
    }

    public Integer getPartsWeight() {
        return partsWeight;
    }

    public void setPartsWeight(Integer partsWeight) {
        this.partsWeight = partsWeight;
    }

    public Float getPartsWindResistanceMultiplier() {
        return partsWindResistanceMultiplier;
    }

    public void setPartsWindResistanceMultiplier(Float partsWindResistanceMultiplier) {
        this.partsWindResistanceMultiplier = partsWindResistanceMultiplier;
    }
}
