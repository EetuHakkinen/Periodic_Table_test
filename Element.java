public class Element{
    private String name;
    private String nimi;
    private String symbol;
    private int number;
    private double atomicMass;
    private String category;
    private String kategoria;

    public Element(String name, String nimi, String symbol, int number, double atomicMass, String category){
        this.name = name;
        this.nimi = nimi;
        this.symbol = symbol;
        this.number = number;
        this.atomicMass = atomicMass;
        this.category = category;
    }
    public String getName(String language){
        if (language.equals("fi")){
            return this.nimi;
        }
        return this.name;
    }
    public String getSymbol(){
        return this.symbol;
    }
    public int getNumber(){
        return this.number;
    }
    public double getAtomicMass(){
        return this.atomicMass;
    }
    public String getCategory(String language){
        /*if (language.equals("fi")){
            return this.kategoria;
        }*/
        return this.category;
    }
    
}