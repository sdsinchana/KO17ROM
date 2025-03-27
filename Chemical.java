class Chemical {
    int id;
    String chemicalName;
    String formula;
    int toxicityLevel;
    double boilingPoint;
    boolean isFlammable;
    
	// no arguments 
    Chemical() {
        this("Ethanol", "C2H5OH");
    }

//parameterized 
    Chemical(String chemicalName, String formula) {
        this(101);
        this.chemicalName = chemicalName;
        this.formula = formula;
    }
    
    Chemical(int id) {
        this(3, true);
        this.id = id;
    }
    
    Chemical(int toxicityLevel, boolean isFlammable) {
        this(78.37);
        this.toxicityLevel = toxicityLevel;
        this.isFlammable = isFlammable;
    }
    
    Chemical(double boilingPoint) {
        this("Methanol");
        this.boilingPoint = boilingPoint;
    }
    
    Chemical(String chemicalName) {
        this(true);
        this.chemicalName = chemicalName;
    }
    
    Chemical(boolean isFlammable) {
        this.isFlammable = isFlammable;
    }
    
    void displayDetails() {
        System.out.println("Chemical ID: " + id);
        System.out.println("Chemical Name: " + chemicalName);
        System.out.println("Formula: " + formula);
        System.out.println("Toxicity Level: " + toxicityLevel);
        System.out.println("Boiling Point: " + boilingPoint);
        System.out.println("Flammable: " + isFlammable);
    }
}

