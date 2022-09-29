import java.util.Scanner;

public class Main {
    Integer i = 0;  //variable for going through array

    public static FrameSet frameSet;
    public static GearSet gearSet;
    public static Wheels wheelsFront;
    public static Wheels wheelsBack;

    public static Optionals[] optionalsArray = new Optionals[10];
    Bike bike = new Bike();



    public static void main(String[] args) {
        while (true) {
            Main main = new Main();
            main.welcome();
        }


    }


    public void welcome() {  //Main menu
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome, what would you like to do?\n 1 Build your bike\n 2 See your bikes potential performance\n 3 Print your bike to file\n 4 Quit");
        switch (scn.nextLine()) {
            case "1":
                buildBike();
                break;
            case "2":
                System.out.println(bike.arePartsCompatible());
                break;
            case "3":
                bike.printToFile();

                break;
            case "4":
                System.out.println("Ending program");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input, returning to menu");
                welcome();
        }

    }

    public void buildBike() {  //Bike part input method
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to the bike builder tool. You will be asked to enter parameters for one part at a time,\n if you are unsure and just want to test you can enter the example parameters.");

        System.out.println("Input the make of your frame set: (example: Cube)");
        String frameSetMake = scn.nextLine();
        System.out.println("Input the model of your frame set: (example: Litening C)");
        String frameSetModel = scn.nextLine();
        System.out.println("Input the material of your frame set: (example: Carbon)");
        String frameSetMaterial = scn.nextLine();


        System.out.println("Input the weight, in grams, of your frame set: (example: 1565)");
        Integer frameSetWeight = bike.tryToParseInt();;
        System.out.println("Input the Wind resistance multiplier of your frame set: (example: 0.98)");
        Float frameSetWindResistanceMultiplier = bike.tryToParseFloat();
        System.out.println("Input the colour of your frame set: (example: Red)");
        String frameSetColour = scn.nextLine();

        frameSet = new FrameSet(frameSetMake, frameSetModel, frameSetMaterial, frameSetWeight, frameSetWindResistanceMultiplier, frameSetColour);


        System.out.println("Frame set complete, next up is gear set and wheels!");

        System.out.println("Input the make of your gear set: (example: Shimano)");
        String gearSetMake = scn.nextLine();
        System.out.println("Input the model of your gear set: (example: 105)");
        String gearSetModel = scn.nextLine();
        System.out.println("Input the weight, in grams, of your gear set: (example: 2180)");
        Integer gearSetWeight = bike.tryToParseInt();
        System.out.println("Input the product line of your gear set: (example: 105 R7000)");
        String gearSetProductLine = scn.nextLine();
        System.out.println("Input the size of your large chain wheel of your gear set: (example: 56)");
        Byte gearSetGearRatio = bike.tryToParseByte();
        System.out.println("Input the number of front gears in your gear set: (example: 2)");
        Byte gearSetNumberOfGears = bike.tryToParseByte();
        System.out.println("Input true or false to indicate if your gear set is disc break compatible: (example: true)");
        Boolean gearSetIsDiscBreak = Boolean.parseBoolean(scn.nextLine());

        gearSet = new GearSet(gearSetMake, gearSetModel, gearSetWeight, gearSetProductLine, gearSetGearRatio, gearSetNumberOfGears, gearSetIsDiscBreak);

        System.out.println("Input the make of your wheel set: (example: Shimano)");
        String wheelsMake = scn.nextLine();
        System.out.println("Input the model of your wheel set: (example: R5)");
        String wheelsModel = scn.nextLine();
        System.out.println("Input the weight, in grams, of your wheel set: (example: 1110)");
        Integer wheelsWeight = bike.tryToParseInt();
        System.out.println("Input the product line of your cassette: (example: 105 R7000)");
        String wheelsProductionLine = scn.nextLine();
        System.out.println("Input the size of your smallest chain wheel on your cassette: (example: 14)");
        Byte wheelsRatio = bike.tryToParseByte();
        System.out.println("Input the number of gears on your cassette: (example: 11)");
        Byte wheelsNumberOfGears = bike.tryToParseByte();
        System.out.println("Input true or false to indicate if your wheels are disc break compatible: (example: true)");
        Boolean wheelsIsDiscBreak = Boolean.parseBoolean(scn.nextLine());
        System.out.println("Input the wheel depth in millimeters: (example: 50)");
        Byte wheelsWheelDepth = bike.tryToParseByte();
        System.out.println("Input the wheel width in millimeters: (example: 21)");
        Byte wheelsWheelWidth = bike.tryToParseByte();

        wheelsFront = new Wheels(wheelsMake, wheelsModel, null, null, null, null, wheelsIsDiscBreak, wheelsWheelDepth, wheelsWheelWidth, true);
        wheelsBack = new Wheels(wheelsMake, wheelsModel, wheelsWeight, wheelsProductionLine, wheelsRatio, wheelsNumberOfGears, wheelsIsDiscBreak, wheelsWheelDepth, wheelsWheelWidth, false);

        boolean optionals = true;
        while (optionals) {
            System.out.println("Would you like to add an optional? Y/N");
            String optionalsYesNo = scn.nextLine();
            if (optionalsYesNo.equalsIgnoreCase("Y")) {
                System.out.println("Input the make of your optional: (example: Ass Savers)");
                String optionalsMake = scn.nextLine();
                System.out.println("Input the model of your optional: (example: Mudder)");
                String optionalsModel = scn.nextLine();
                System.out.println("Input the weight, in grams, of your optional: (example: 18)");
                Integer optionalsWeight = bike.tryToParseInt();
                System.out.println("Input type of optional: (example: Saddle mudguard)");
                String optionalsTypeOfOptional = scn.nextLine();
                optionalsArray[i] = new Optionals(optionalsMake, optionalsModel, optionalsWeight, optionalsTypeOfOptional);
                i++;
            } else if (optionalsYesNo.equalsIgnoreCase("N")) {
                optionals = false;
            } else {
                System.out.println("Invalid input.");
            }

        }

    }

}