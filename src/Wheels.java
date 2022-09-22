public class Wheels extends GearSet{

    Byte partsWheelDepth;
    Byte partsWheelWidth;
    Boolean partsIsFrontWheel;

    public Wheels(String partsMake, String partsModel, Integer partsWeight, String partsProductLine, Byte partsGearRatio, Byte partsNumberOfGears, Boolean partsIsDiscBreak, Byte partsWheelDepth, Byte partsWheelWidth, Boolean partsIsFrontWheel) {
        super(partsMake, partsModel, partsWeight, partsProductLine, partsGearRatio, partsNumberOfGears, partsIsDiscBreak);
        this.partsWheelDepth = partsWheelDepth;
        this.partsWheelWidth = partsWheelWidth;
        this.partsIsFrontWheel = partsIsFrontWheel;
    }

    public Byte getPartsWheelDepth() {
        return partsWheelDepth;
    }

    public void setPartsWheelDepth(Byte partsWheelDepth) {
        this.partsWheelDepth = partsWheelDepth;
    }

    public Byte getPartsWheelWidth() {
        return partsWheelWidth;
    }

    public void setPartsWheelWidth(Byte partsWheelWidth) {
        this.partsWheelWidth = partsWheelWidth;
    }

    public Boolean getPartsIsFrontWheel() {
        return partsIsFrontWheel;
    }

    public void setPartsIsFrontWheel(Boolean partsIsFrontWheel) {
        this.partsIsFrontWheel = partsIsFrontWheel;
    }
}
