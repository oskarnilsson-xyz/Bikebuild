import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bike {
    private Scanner scn = new Scanner(System.in);


    private Integer bikeWeight() {
        Integer weightOptionals = 0;
        for (Optionals n : Main.optionalsArray) {

            if (n != null) {
                weightOptionals += n.getPartsWeight();
            }
        }
        Integer weight = weightOptionals + Main.frameSet.getPartsWeight() + Main.gearSet.getPartsWeight() + Main.wheelsBack.getPartsWeight();

        return weight;
    }

    public Integer tryToParseInt() {
        Boolean parseIntSuccess = false;
        String parseInt;
        do {
            parseInt = scn.nextLine();
            try {
                Integer.parseInt(parseInt);
                parseIntSuccess = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid entry, try again.");
            }
        }
        while (!parseIntSuccess);
        return Integer.parseInt(parseInt);
    }

    public Float tryToParseFloat() {
        Boolean parseFloatSuccess = false;
        String parseFloat;
        do {
            parseFloat = scn.nextLine();
            try {
                Float.parseFloat(parseFloat);
                parseFloatSuccess = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid entry, try again.");
            }
        }
        while (!parseFloatSuccess);
        return Float.parseFloat(parseFloat);
    }

    public Byte tryToParseByte() {
        Boolean parseByteSuccess = false;
        String parseByte;
        do {
            parseByte = scn.nextLine();
            try {
                Byte.parseByte(parseByte);
                parseByteSuccess = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid entry, try again.");
            }
        }
        while (!parseByteSuccess);
        return Byte.parseByte(parseByte);

    }

    public Boolean tryToParseBoolean() {
        Boolean parseBooleanSuccess = false;
        String parseBoolean;
        do {
            parseBoolean = scn.nextLine();
            try {
                Byte.parseByte(parseBoolean);
                parseBooleanSuccess = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid entry, try again.");
            }
        }
        while (!parseBooleanSuccess);
        return Boolean.parseBoolean(parseBoolean);
    }

    private Float windResistance() {
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

    public String printToFile() {
        try {
            File file = new File("BikeBuildBike.txt");
            if (file.createNewFile()) {
            } else {
                System.out.println("BikeBuildBike.txt already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error during file creation.");
            e.printStackTrace();
        }
        try {
            FileWriter fileWriter = new FileWriter("BikeBuildBike.txt");
            fileWriter.write("Bike Build\n");
            fileWriter.write("Frame set \nMake: " + Main.frameSet.getPartsMake() + " Model: " + Main.frameSet.getPartsModel() + " Material: " + Main.frameSet.getPartsWeight().toString() + " Colour: " + Main.frameSet.getPartsColour());
            fileWriter.write("Gear set \nMake: " + Main.gearSet.getPartsMake() + " Model: " + Main.gearSet.getPartsModel() + " Material: " + Main.gearSet.getPartsWeight().toString());
            fileWriter.write("Wheels \nMake: " + Main.wheelsBack.getPartsMake() + " Model: " + Main.wheelsBack.getPartsModel() + " Material: " + Main.wheelsBack.getPartsWeight().toString());
            for (Optionals m : Main.optionalsArray) {
                if (m != null)
                    fileWriter.write("Optional \nType: " + m.getPartsTypeOfOptional() + "Make: " + m.getPartsMake() + " Model: " + m.getPartsModel() + " Material: " + m.getPartsWeight().toString());
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
