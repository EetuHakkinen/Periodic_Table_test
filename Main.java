import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
             
		Random random = new Random();
		ArrayList<Element> substances = new ArrayList<>();

		substances.add(new Element("Hydrogen", "Vety", "H", 1, 1.0079, "diatomic nonmetal")); 
        substances.add(new Element("Helium", "Helium", "He", 2, 4.0026022, "noble gas")); 
        substances.add(new Element("Lithium", "Litium", "Li", 3, 6.94, "alkali metal")); 
        substances.add(new Element("Beryllium", "Beryllium", "Be", 4, 9.01218315, "alkaline earth metal")); 
        substances.add(new Element("Boron", "Boori", "B", 5, 10.81, "metalloid")); 
        substances.add(new Element("Carbon", "Hiili", "C", 6, 12.011, "polyatomic nonmetal")); 
        substances.add(new Element("Nitrogen", "Typpi", "N", 7, 14.007, "diatomic nonmetal")); 
        substances.add(new Element("Oxygen", "Happi", "O", 8, 15.999, "diatomic nonmetal")); 
        substances.add(new Element("Fluorine", "Fluori", "F", 9, 18.9984031636, "diatomic nonmetal")); 
        substances.add(new Element("Neon", "Neon", "Ne", 10, 20.17976, "noble gas")); 
        substances.add(new Element("Sodium", "Natrium", "Na", 11, 22.989769282, "alkali metal")); 
        substances.add(new Element("Magnesium", "Magnesium", "Mg", 12, 24.305, "alkaline earth metal")); 
        substances.add(new Element("Aluminium", "Alumiini", "Al", 13, 26.98153857, "post-transition metal")); 
        substances.add(new Element("Silicon", "Pii", "Si", 14, 28.085, "metalloid")); 
        substances.add(new Element("Phosphorus", "Fosfori", "P", 15, 30.9737619985, "polyatomic nonmetal")); 
        substances.add(new Element("Sulfur", "Rikki", "S", 16, 32.06, "polyatomic nonmetal")); 
        substances.add(new Element("Chlorine", "Kloori", "Cl", 17, 35.45, "diatomic nonmetal")); 
        substances.add(new Element("Argon", "Argon", "Ar", 18, 39.9481, "noble gas")); 
        substances.add(new Element("Potassium", "Kalium", "K", 19, 39.09831, "alkali metal")); 
        substances.add(new Element("Calcium", "Kalsium", "Ca", 20, 40.0784, "alkaline earth metal")); 
        substances.add(new Element("Scandium", "Scandium", "Sc", 21, 44.9559085, "transition metal")); 
        substances.add(new Element("Titanium", "Titaani", "Ti", 22, 47.8671, "transition metal")); 
        substances.add(new Element("Vanadium", "Vanadiini", "V", 23, 50.94151, "transition metal")); 
        substances.add(new Element("Chromium", "Kromi", "Cr", 24, 51.99616, "transition metal")); 
        substances.add(new Element("Manganese", "Mangaani", "Mn", 25, 54.9380443, "transition metal")); 
        substances.add(new Element("Iron", "Rauta", "Fe", 26, 55.8452, "transition metal")); 
        substances.add(new Element("Cobalt", "Koboltti", "Co", 27, 58.9331944, "transition metal")); 
        substances.add(new Element("Nickel", "Nikkeli", "Ni", 28, 58.69344, "transition metal")); 
        substances.add(new Element("Copper", "Kupari", "Cu", 29, 63.5463, "transition metal")); 
        substances.add(new Element("Zinc", "Sinkki", "Zn", 30, 65.382, "transition metal")); 
        substances.add(new Element("Gallium", "Gallium", "Ga", 31, 69.7231, "post-transition metal")); 
        substances.add(new Element("Germanium", "Germanium", "Ge", 32, 72.6308, "metalloid")); 
        substances.add(new Element("Arsenic", "Arseeni", "As", 33, 74.9215956, "metalloid")); 
        substances.add(new Element("Selenium", "Seleeni", "Se", 34, 78.9718, "polyatomic nonmetal")); 
        substances.add(new Element("Bromine", "Bromi", "Br", 35, 79.904, "diatomic nonmetal")); 
        substances.add(new Element("Krypton", "Krypton", "Kr", 36, 83.7982, "noble gas")); 
        substances.add(new Element("Rubidium", "Rubidium", "Rb", 37, 85.46783, "alkali metal")); 
        substances.add(new Element("Strontium", "Strontium", "Sr", 38, 87.621, "alkaline earth metal")); 
        substances.add(new Element("Yttrium", "Yttrium", "Y", 39, 88.905842, "transition metal")); 
        substances.add(new Element("Zirconium", "Zirkonium", "Zr", 40, 91.2242, "transition metal")); 
        substances.add(new Element("Niobium", "Niobium", "Nb", 41, 92.906372, "transition metal")); 
        substances.add(new Element("Molybdenum", "Molybdeeni", "Mo", 42, 95.951, "transition metal")); 
        substances.add(new Element("Technetium", "Teknetium", "Tc", 43, 98, "transition metal")); 
        substances.add(new Element("Ruthenium", "Rutenium", "Ru", 44, 101.072, "transition metal")); 
        substances.add(new Element("Rhodium", "Rodium", "Rh", 45, 102.905502, "transition metal")); 
        substances.add(new Element("Palladium", "Palladium", "Pd", 46, 106.421, "transition metal")); 
        substances.add(new Element("Silver", "Hopea", "Ag", 47, 107.86822, "transition metal")); 
        substances.add(new Element("Cadmium", "Kadmium", "Cd", 48, 112.4144, "transition metal")); 
        substances.add(new Element("Indium", "Indium", "In", 49, 114.8181, "post-transition metal")); 
        substances.add(new Element("Tin", "Tina", "Sn", 50, 118.7107, "post-transition metal")); 
        substances.add(new Element("Antimony", "Antimoni", "Sb", 51, 121.7601, "metalloid")); 
        substances.add(new Element("Tellurium", "Telluuri", "Te", 52, 127.603, "metalloid")); 
        substances.add(new Element("Iodine", "Jodi", "I", 53, 126.904473, "diatomic nonmetal")); 
        substances.add(new Element("Xenon", "Xenon", "Xe", 54, 131.2936, "noble gas")); 
        substances.add(new Element("Cesium", "Cesium", "Cs", 55, 132.905451966, "alkali metal")); 
        substances.add(new Element("Barium", "Barium", "Ba", 56, 137.3277, "alkaline earth metal")); 
        substances.add(new Element("Lanthanum", "Lantaani", "La", 57, 138.905477, "lanthanide")); 
        substances.add(new Element("Cerium", "Cerium", "Ce", 58, 140.1161, "lanthanide")); 
        substances.add(new Element("Praseodymium", "Praseodyymi", "Pr", 59, 140.907662, "lanthanide")); 
        substances.add(new Element("Neodymium", "Neodyymi", "Nd", 60, 144.2423, "lanthanide")); 
        substances.add(new Element("Promethium", "Prometium", "Pm", 61, 145, "lanthanide")); 
        substances.add(new Element("Samarium", "Samarium", "Sm", 62, 150.362, "lanthanide")); 
        substances.add(new Element("Europium", "Europium", "Eu", 63, 151.9641, "lanthanide")); 
        substances.add(new Element("Gadolinium", "Gadolinium", "Gd", 64, 157.253, "lanthanide")); 
        substances.add(new Element("Terbium", "Terbium", "Tb", 65, 158.925352, "lanthanide")); 
        substances.add(new Element("Dysprosium", "Dysprosium", "Dy", 66, 162.5001, "lanthanide")); 
        substances.add(new Element("Holmium", "Holmium", "Ho", 67, 164.930332, "lanthanide")); 
        substances.add(new Element("Erbium", "Erbium", "Er", 68, 167.2593, "lanthanide")); 
        substances.add(new Element("Thulium", "Tulium", "Tm", 69, 168.934222, "lanthanide")); 
        substances.add(new Element("Ytterbium", "Ytterbium", "Yb", 70, 173.0451, "lanthanide")); 
        substances.add(new Element("Lutetium", "Lutenium", "Lu", 71, 174.96681, "lanthanide")); 
        substances.add(new Element("Hafnium", "Hafnium", "Hf", 72, 178.492, "transition metal")); 
        substances.add(new Element("Tantalum", "Tantaali", "Ta", 73, 180.947882, "transition metal")); 
        substances.add(new Element("Tungsten", "Volframi", "W", 74, 183.841, "transition metal")); 
        substances.add(new Element("Rhenium", "Renium", "Re", 75, 186.2071, "transition metal")); 
        substances.add(new Element("Osmium", "Osmium", "Os", 76, 190.233, "transition metal")); 
        substances.add(new Element("Iridium", "Iridium", "Ir", 77, 192.2173, "transition metal")); 
        substances.add(new Element("Platinum", "Platina", "Pt", 78, 195.0849, "transition metal")); 
        substances.add(new Element("Gold", "Kulta", "Au", 79, 196.9665695, "transition metal")); 
        substances.add(new Element("Mercury", "Elohopea", "Hg", 80, 200.5923, "transition metal")); 
        substances.add(new Element("Thallium", "Tallium", "Tl", 81, 204.38, "post-transition metal")); 
        substances.add(new Element("Lead", "Lyijy", "Pb", 82, 207.21, "post-transition metal")); 
        substances.add(new Element("Bismuth", "Vismutti", "Bi", 83, 208.980401, "post-transition metal")); 
        substances.add(new Element("Polonium", "Polonium", "Po", 84, 209, "post-transition metal")); 
        substances.add(new Element("Astatine", "Astatiini", "At", 85, 210, "metalloid")); 
        substances.add(new Element("Radon", "Radon", "Rn", 86, 222, "noble gas")); 
        substances.add(new Element("Francium", "Frankium", "Fr", 87, 223, "alkali metal")); 
        substances.add(new Element("Radium", "Radium", "Ra", 88, 226, "alkaline earth metal")); 
        substances.add(new Element("Actinium", "Aktinium", "Ac", 89, 227, "actinide")); 
        substances.add(new Element("Thorium", "Torium", "Th", 90, 232.03774, "actinide")); 
        substances.add(new Element("Protactinium", "Protaktinium", "Pa", 91, 231.035882, "actinide")); 
        substances.add(new Element("Uranium", "Uraani", "U", 92, 238.028913, "actinide")); 
        substances.add(new Element("Neptunium", "Neptunium", "Np", 93, 237, "actinide")); 
        substances.add(new Element("Plutonium", "Plutonium", "Pu", 94, 244, "actinide")); 
        substances.add(new Element("Americium", "Amerikium", "Am", 95, 243, "actinide")); 
        substances.add(new Element("Curium", "Curium", "Cm", 96, 247, "actinide")); 
        substances.add(new Element("Berkelium", "Berkelium", "Bk", 97, 247, "actinide")); 
        substances.add(new Element("Californium", "Kalifornium", "Cf", 98, 251, "actinide")); 
        substances.add(new Element("Einsteinium", "Einsteinium", "Es", 99, 252, "actinide")); 
        substances.add(new Element("Fermium", "Fermium", "Fm", 100, 257, "actinide")); 
        substances.add(new Element("Mendelevium", "Mendelevium", "Md", 101, 258, "actinide")); 
        substances.add(new Element("Nobelium", "Nobelium", "No", 102, 259, "actinide")); 
        substances.add(new Element("Lawrencium", "Lawrencium", "Lr", 103, 266, "actinide")); 
        substances.add(new Element("Rutherfordium", "Rutherfordium", "Rf", 104, 267, "transition metal")); 
        substances.add(new Element("Dubnium", "Dubnium", "Db", 105, 268, "transition metal")); 
        substances.add(new Element("Seaborgium", "Seaborgium", "Sg", 106, 269, "transition metal")); 
        substances.add(new Element("Bohrium", "Bohrium", "Bh", 107, 270, "transition metal")); 
        substances.add(new Element("Hassium", "Hassium", "Hs", 108, 269, "transition metal")); 
        substances.add(new Element("Meitnerium", "Meitnerium", "Mt", 109, 278, "unknown, probably transition metal")); 
        substances.add(new Element("Darmstadtium", "Darmstadtium", "Ds", 110, 281, "unknown, probably transition metal")); 
        substances.add(new Element("Roentgenium", "Röntgenium", "Rg", 111, 282, "unknown, probably transition metal")); 
        substances.add(new Element("Copernicium", "Kopernikium", "Cn", 112, 285, "transition metal")); 
        substances.add(new Element("Nihonium", "Nihonium", "Nh", 113, 286, "unknown, probably transition metal")); 
        substances.add(new Element("Flerovium", "Flerovium", "Fl", 114, 289, "post-transition metal")); 
        substances.add(new Element("Moscovium", "Moskovium", "Mc", 115, 289, "unknown, probably post-transition metal")); 
        substances.add(new Element("Livermorium", "Livermorium", "Lv", 116, 293, "unknown, probably post-transition metal")); 
        substances.add(new Element("Tennessine", "Tennessiini", "Ts", 117, 294, "unknown, probably metalloid"));
		substances.add(new Element("Oganesson", "Oganession", "Og", 118, 294, "unknown, predicted to be noble gas"));

		System.out.println("***********************");
		System.out.println("* PERIODIC TABLE TEST *");
        System.out.println("***********************");

        System.out.print("Select language / valitse kieli (en / fi): ");
        String language = reader.nextLine();
        while (true){
            if (language.equals("en")){
                first(substances, "en");
                break;
            } else if (language.equals("fi")){
                first(substances, "fi");
                break;
            } else {
                System.out.println("Hey, that's not an option! / Ei ollut vaihtoehto!");
            }
        }
    }
    public static void first(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
		System.out.println(k.translate("Select test options: "));
		while (true){
			System.out.print(k.translate("Show atom name[1], number[2], symbol[3], atomic mass[4]: "));
			String firstAnswer = reader.nextLine();
			if (firstAnswer.equals("1")){
				firstName(substances, language);
				break;
			} else if (firstAnswer.equals("2")){
				firstNumber(substances, language);
				break;
            } else if (firstAnswer.equals("3")){
                firstSymbol(substances, language);
                break;
            } else if (firstAnswer.equals("4")){
                firstAtomicMass(substances, language);
                break;
            } else {
				System.out.println(k.translate("Hey, that's not an option!"));
            }
        }
        System.out.println(k.translate("Goodbye and welcome back later!"));
    }
    public static void firstName(ArrayList<Element> substances, String language){
        Translator Translator = new Translator(language);
        Scanner reader = new Scanner(System.in);
        System.out.print(Translator.translate("What you want to learn? symbol[1], number[2], atomic mass[3] or category[4]: "));
        int answer = Integer.parseInt(reader.nextLine());
        while (true){
            if (answer == 1){
                nameMark(substances, language);
                break;
            } else if (answer == 2){
                nameNumber(substances, language);
                break;
            } else if (answer == 3){
                nameAtomicMass(substances, language);
                break;
            } else if (answer == 4){
                nameCategory(substances, language);
                break;
            } else {
                System.out.println(Translator.translate("Hey, that's not an option!"));
            }
        }
    }
    public static void firstNumber(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        System.out.println(k.translate("What you want to learn? name[1], symbol[2]: "));
        int answer = Integer.parseInt(reader.nextLine());
        if (answer == 1){
            numberName(substances, language);
        } else if (answer == 2){
            numberSymbol(substances, language);
        } else {
            System.out.println(k.translate("Hey, that's not an option!"));
        }
    }

    public static void firstSymbol(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        System.out.println(k.translate("What you want to learn? name[1], number[2], atomic mass[3] or category[4]"));
        int answer = Integer.parseInt(reader.nextLine());
        if (answer == 1){
            symbolName(substances, language);
        } else if (answer == 2){
            symbolNumber(substances, language);
        } else if (answer == 3){
            symbolAtomicMass(substances, language);
        } else if (answer == 4){
            symbolCategory(substances, language);
        } else {
            System.out.println(k.translate("Hey, that's not an option!"));
        }
    }
    public static void firstAtomicMass(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        System.out.println(k.translate("What you want to learn? name[1], symbol[2]: "));
        int answer = Integer.parseInt(reader.nextLine());
        if (answer == 1){
            atomicMassName(substances, language);
        } else if (answer == 2){
            atomicMassSymbol(substances, language);
        } else {
            System.out.println(k.translate("Hey that's not an option!"));
        }
    }
    public static void nameMark(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Element> correct = new ArrayList<>();
        for (Element substance : substances){
            correct.add(substance);
        }
        int points = 0;
        System.out.println(k.translate("What is the chemical symbol of element?"));
        while (true){
            int index = random.nextInt(correct.size());
            System.out.print(correct.get(index).getName(language) + ": ");
            String symbol = reader.nextLine();
            if (symbol.equals("")){
                break;
            } else if (symbol.equals(correct.get(index).getSymbol())){
                points ++;
                correct.remove(index);
                System.out.println(k.translate("Correct!"));
            } else {
                correct.add(correct.get(index));
                System.out.println(k.translate("Not a correct answer! Correct answer is ") + correct.get(index).getSymbol());
            }
        }
        System.out.println();
        System.out.println(k.translate("You get ") + points + k.translate(" points."));
    }
    public static void numberName(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Element> correct = new ArrayList<>();
        for (Element substance : substances){
            correct.add(substance);
        }
        int points = 0;
        System.out.println(k.translate("What is the name of the element? "));
        while (true){
            int index = random.nextInt(correct.size());
            System.out.print(correct.get(index).getNumber() + ": ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            } else if (name.equals(correct.get(index).getName(language))){
                points ++;
                correct.remove(index);
                System.out.println(k.translate("Correct!"));
            } else {
                correct.add(correct.get(index));
                System.out.println(k.translate("Not a correct answer! Correct answer is ") + correct.get(index).getName(language));
            }
        }
        System.out.println();
        System.out.println(k.translate("You get ") + points + k.translate(" points."));
    }
	public static void nameNumber(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Element> correct = new ArrayList<>();
        for (Element substance : substances){
            correct.add(substance);
        }
        int points = 0;
        System.out.println(k.translate("What is the number of the element? "));
        while (true){
            int index = random.nextInt(correct.size());
            System.out.print(correct.get(index).getName(language) + ": ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            }
            int number = Integer.parseInt(name);
            if (number == correct.get(index).getNumber()){
                points ++;
                correct.remove(index);
                System.out.println(k.translate("Correct!"));
            } else {
                correct.add(correct.get(index));
                System.out.println(k.translate("Not a correct answer! Correct answer is ") + correct.get(index).getNumber());
            }
        }
        System.out.println();
        System.out.println(k.translate("You get ") + points + k.translate(" points."));
    }
    public static void nameAtomicMass(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Element> correct = new ArrayList<>();
        for (Element substance : substances){
            correct.add(substance);
        }
        int points = 0;
        System.out.println(k.translate("What is the atomic mass of the element? "));
        while (true){
            int index = random.nextInt(correct.size());
            System.out.print(correct.get(index).getName(language) + ": ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            }
            int number = Integer.parseInt(name);
            if (number == correct.get(index).getAtomicMass()){
                points ++;
                correct.remove(index);
                System.out.println(k.translate("Correct!"));
            } else {
                correct.add(correct.get(index));
                System.out.println(k.translate("Not a correct answer! Correct answer is ") + correct.get(index).getAtomicMass());
            }
        }
        System.out.println();
        System.out.println(k.translate("You get ") + points + k.translate(" points."));
    }
    public static void nameCategory(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Element> correct = new ArrayList<>();
        for (Element substance : substances){
            correct.add(substance);
        }
        int points = 0;
        System.out.println(k.translate("What is the category of the element? "));
        while (true){
            int index = random.nextInt(correct.size());
            System.out.print(correct.get(index).getName(language) + ": ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            } else if (name.equals(correct.get(index).getCategory(language))){
                points ++;
                correct.remove(index);
                System.out.println(k.translate("Correct!"));
            } else {
                correct.add(correct.get(index));
                System.out.println(k.translate("Not a correct answer! Correct answer is ") + correct.get(index).getCategory(language));
            }
        }
        System.out.println();
        System.out.println(k.translate("You get ") + points + k.translate(" points."));
    }
    public static void numberSymbol(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Element> correct = new ArrayList<>();
        for (Element substance : substances){
            correct.add(substance);
        }
        int points = 0;
        System.out.println(k.translate("What is the symbol of the element? "));
        while (true){
            int index = random.nextInt(correct.size());
            System.out.print(correct.get(index).getNumber() + ": ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            } else if (name.equals(correct.get(index).getSymbol())){
                points ++;
                correct.remove(index);
                System.out.println(k.translate("Correct!"));
            } else {
                correct.add(correct.get(index));
                System.out.println(k.translate("Not a correct answer! Correct answer is ") + correct.get(index).getSymbol());
            }
        }
        System.out.println();
        System.out.println(k.translate("You get ") + points + k.translate(" points."));
    }
    public static void symbolName(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Element> correct = new ArrayList<>();
        for (Element substance : substances){
            correct.add(substance);
        }
        int points = 0;
        System.out.println(k.translate("What is the name of the element? "));
        while (true){
            int index = random.nextInt(correct.size());
            System.out.print(correct.get(index).getSymbol() + ": ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            } else if (name.equals(correct.get(index).getName(language))){
                points ++;
                correct.remove(index);
                System.out.println(k.translate("Correct!"));
            } else {
                correct.add(correct.get(index));
                System.out.println(k.translate("Not a correct answer! Correct answer is ") + correct.get(index).getName(language));
            }
        }
        System.out.println();
        System.out.println(k.translate("You get ") + points + k.translate(" points."));
    }
    public static void symbolNumber(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Element> correct = new ArrayList<>();
        for (Element substance : substances){
            correct.add(substance);
        }
        int points = 0;
        System.out.println(k.translate("What is the number of the element? "));
        while (true){
            int index = random.nextInt(correct.size());
            System.out.print(correct.get(index).getSymbol() + ": ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            } else if (name.equals(correct.get(index).getNumber())){
                points ++;
                correct.remove(index);
                System.out.println(k.translate("Correct!"));
            } else {
                correct.add(correct.get(index));
                System.out.println(k.translate("Not a correct answer! Correct answer is ") + correct.get(index).getNumber());
            }
        }
        System.out.println();
        System.out.println(k.translate("You get ") + points + k.translate(" points."));
    }
    public static void symbolAtomicMass(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Element> correct = new ArrayList<>();
        for (Element substance : substances){
            correct.add(substance);
        }
        int points = 0;
        System.out.println(k.translate("What is the atomic mass of the element? "));
        while (true){
            int index = random.nextInt(correct.size());
            System.out.print(correct.get(index).getSymbol() + ": ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            } else if (name.equals(correct.get(index).getAtomicMass())){
                points ++;
                correct.remove(index);
                System.out.println(k.translate("Correct!"));
            } else {
                correct.add(correct.get(index));
                System.out.println(k.translate("Not a correct answer! Correct answer is ") + correct.get(index).getAtomicMass());
            }
        }
        System.out.println();
        System.out.println(k.translate("You get ") + points + k.translate(" points."));
    }
    public static void symbolCategory(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Element> correct = new ArrayList<>();
        for (Element substance : substances){
            correct.add(substance);
        }
        int points = 0;
        System.out.println(k.translate("What is the category of the element? "));
        while (true){
            int index = random.nextInt(correct.size());
            System.out.print(correct.get(index).getSymbol() + ": ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            } else if (name.equals(correct.get(index).getCategory(language))){
                points ++;
                correct.remove(index);
                System.out.println(k.translate("Correct!"));
            } else {
                correct.add(correct.get(index));
                System.out.println(k.translate("Not a correct answer! Correct answer is ") + correct.get(index).getCategory(language));
            }
        }
        System.out.println();
        System.out.println(k.translate("You get ") + points + k.translate(" points."));
    }
    public static void atomicMassName(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Element> correct = new ArrayList<>();
        for (Element substance : substances){
            correct.add(substance);
        }
        int points = 0;
        System.out.println(k.translate("What is the name of the element? "));
        while (true){
            int index = random.nextInt(correct.size());
            System.out.print(correct.get(index).getAtomicMass() + ": ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            } else if (name.equals(correct.get(index).getName(language))){
                points ++;
                correct.remove(index);
                System.out.println(k.translate("Correct!"));
            } else {
                correct.add(correct.get(index));
                System.out.println(k.translate("Not a correct answer! Correct answer is ") + correct.get(index).getName(language));
            }
        }
        System.out.println();
        System.out.println(k.translate("You get ") + points + k.translate(" points."));
    }
    public static void atomicMassSymbol(ArrayList<Element> substances, String language){
        Translator k = new Translator(language);
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Element> correct = new ArrayList<>();
        for (Element substance : substances){
            correct.add(substance);
        }
        int points = 0;
        System.out.println(k.translate("What is the symbol of the element? "));
        while (true){
            int index = random.nextInt(correct.size());
            System.out.print(correct.get(index).getAtomicMass() + ": ");
            String name = reader.nextLine();
            if (name.equals("")){
                break;
            } else if (name.equals(correct.get(index).getSymbol())){
                points ++;
                correct.remove(index);
                System.out.println(k.translate("Correct!"));
            } else {
                correct.add(correct.get(index));
                System.out.println(k.translate("Not a correct answer! Correct answer is ") + correct.get(index).getSymbol());
            }
        }
        System.out.println();
        System.out.println(k.translate("You get ") + points + k.translate(" points."));
    }
}
