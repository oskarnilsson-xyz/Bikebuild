public class FrameSet extends BikeParts{
    private String partsColour;

    public FrameSet(String partsMake, String partsModel, String partsMaterial, Integer partsWeight, Float partsWindResistanceMultiplier, String partsColour) {
        super(partsMake, partsModel, partsMaterial, partsWeight, partsWindResistanceMultiplier);
        this.partsColour = partsColour;
    }

    public String getPartsColour() {
        return partsColour;
    }

    public void setPartsColour(String partsColour) {
        this.partsColour = partsColour;
    }
}
