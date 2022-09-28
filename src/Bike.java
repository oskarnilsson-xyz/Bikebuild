import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Bike {


    public Integer bikeWeight() {
        Integer weightOptionals = 0;
        for (Optionals n : Main.optionalsArray) {

            if (n != null) {
                weightOptionals += n.getPartsWeight();
            }
        }
        Integer weight = weightOptionals + Main.frameSet.getPartsWeight() + Main.gearSet.getPartsWeight() + Main.wheelsBack.getPartsWeight();

        return weight;
    }

    public Float windResistance() {
        Float resistance = 1.00f;
        resistance *= Main.frameSet.getPartsWindResistanceMultiplier();

        return resistance;
    }

    public String arePartsCompatible() {
        if (Main.gearSet.getPartsProductLine().equalsIgnoreCase(Main.wheelsBack.getPartsProductLine()) && (Main.gearSet.getPartsIsDiscBreak() == Main.wheelsBack.getPartsIsDiscBreak())) {
            return "Gearset is compatible.";
        } else {
            return "Gearset might not be compatible. Consult mechanic before committing to this build.";
        }
    }
    public String printToFile(){
        try{
            File file = new File("BikeBuildBike.txt");
            if(file.createNewFile()){
            } else {
                System.out.println("BikeBuildBike.txt already exists.");
            }
        } catch (IOException e){
            System.out.println("Error during file creation.");
            e.printStackTrace();
        }
        try{
            FileWriter fileWriter = new FileWriter("BikeBuildBike.txt");
            fileWriter.write("Bike Build\n");
            fileWriter.write("Frame set \nMake: " + Main.frameSet.getPartsMake() + " Model: " + Main.frameSet.getPartsModel() + " Material: " + Main.frameSet.getPartsWeight().toString() + " Colour: " + Main.frameSet.getPartsColour());
            fileWriter.write("Gear set \nMake: " + Main.gearSet.getPartsMake() + " Model: " + Main.gearSet.getPartsModel() + " Material: " + Main.gearSet.getPartsWeight().toString());
            fileWriter.write("Wheels \nMake: " + Main.wheelsBack.getPartsMake() + " Model: " + Main.wheelsBack.getPartsModel() + " Material: " + Main.wheelsBack.getPartsWeight().toString() );
            for(Optionals m : Main.optionalsArray){
                if(m != null)
                    fileWriter.write("Optional \nType: " + m.getPartsTypeOfOptional() + "Make: " + m.getPartsMake() + " Model: " + m.getPartsModel() + " Material: " + m.getPartsWeight().toString() );
            }
            fileWriter.close();
            System.out.println("Bike written to file");
        } catch (IOException e) {
            System.out.println("Error while printing to file");
            e.printStackTrace();
        }


        return "Print to file method Complete.";
    }


}
