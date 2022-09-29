public class GearSet extends BikeParts{

    private String partsProductLine;
    private Byte partsGearRatio;
    private Byte partsNumberOfGears;
    private Boolean partsIsDiscBreak;

    public GearSet(String partsMake, String partsModel, Integer partsWeight, String partsProductLine, Byte partsGearRatio, Byte partsNumberOfGears, Boolean partsIsDiscBreak) {
        super(partsMake, partsModel, partsWeight);
        this.partsProductLine = partsProductLine;
        this.partsGearRatio = partsGearRatio;
        this.partsNumberOfGears = partsNumberOfGears;
        this.partsIsDiscBreak = partsIsDiscBreak;
    }




    public String getPartsProductLine() {
        return partsProductLine;
    }

    public void setPartsProductLine(String partsProductLine) {
        this.partsProductLine = partsProductLine;
    }

    public Byte getPartsGearRatio() {
        return partsGearRatio;
    }

    public void setPartsGearRatio(Byte partsGearRatio) {
        this.partsGearRatio = partsGearRatio;
    }

    public Byte getPartsNumberOfGears() {
        return partsNumberOfGears;
    }

    public void setPartsNumberOfGears(Byte partsNumberOfGears) {
        this.partsNumberOfGears = partsNumberOfGears;
    }

    public Boolean getPartsIsDiscBreak() {
        return partsIsDiscBreak;
    }

    public void setPartsIsDiscBreak(Boolean partsIsDiscBreak) {
        this.partsIsDiscBreak = partsIsDiscBreak;
    }
}
