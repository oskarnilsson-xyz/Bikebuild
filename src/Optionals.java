public class Optionals extends BikeParts {


    private String partsTypeOfOptional;


    public Optionals(String partsMake, String partsModel, Integer partsWeight, String partsTypeOfOptional) {
        super(partsMake, partsModel, partsWeight);
        this.partsTypeOfOptional = partsTypeOfOptional;

    }

    public String getPartsTypeOfOptional() {
        return partsTypeOfOptional;
    }

    public void setPartsTypeOfOptional(String partsTypeOfOptional) {
        this.partsTypeOfOptional = partsTypeOfOptional;
    }


}
