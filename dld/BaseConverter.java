import java.lang.System;

public class BaseConverter {
    /** data members */
    private long integerPart;
    private float fractionPart;
    private int sourceRadix;
    private int targetRadix;

    /** caller function */
    public static void main(String[] args) {
        BaseConverter baseConverter = new BaseConverter(args);
    }

    /** constructor */
    public BaseConverter(String[] args) {
        /** ensure that valid arguments are passed */
        if (!this.validArguments(args)) {
            System.out.println("Invalid Arguments");
            System.exit(1);
        }

        System.out.println("Source Int   : " + this.integerPart);
        System.out.println("Source Float : " + this.fractionPart);
        System.out.println("Source Radix : " + this.sourceRadix);
        System.out.println("Target Radix : " + this.targetRadix);

        this.generateAnswers();
    }

    /** function to check if argument is valid */
    private Boolean validArguments(String[] args) {
        try {
            /** ensure all values provided */
            if (args.length < 2) {
                return false;
            }

            if (args[0].contains(".")) {
                this.integerPart = Integer.parseInt(args[0].substring(0, args[0].indexOf(".")));
                this.fractionPart = Float.parseFloat("0." + args[0].substring(args[0].indexOf(".") + 1));
            } else {
                this.integerPart = Integer.parseInt(args[0]);
                this.fractionPart = 0;
            }

            if (args.length == 2) {
                this.sourceRadix = 10;
                this.targetRadix = new Integer(args[1]);
            } else {
                this.sourceRadix = new Integer(args[1]);
                this.targetRadix = new Integer(args[2]);
            }

            return true;
        } catch (Exception e) {
            System.out.println("Error processing arguments" + e.getLocalizedMessage());
            return false;
        }
    }

    /** function to convert numbers from one state to another */
    private void generateAnswers() {
        System.out.println();
        System.out.println("Converting from base " + this.sourceRadix + " to " + this.targetRadix);

        int binaryOfInteger[] = new int[128];
        int binaryOfIntegerCounter = 0;

        int binaryOfFraction[] = new int[128];
        int binaryOfFractionCounter = 0;
        
        
        int 
        /** first convert any base to decimal */
    }

}