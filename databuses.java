class TrainData {
    private int men;
    private int women;
    private int children;

    public TrainData(int men, int women, int children) {
        this.men = men;
        this.women = women;
        this.children = children;
    }

    public int getMen() {
        return men;
    }

    public int getWomen() {
        return women;
    }

    public int getChildren() {
        return children;
    }
}

class BusData {
    private int men;
    private int women;
    private int children;

    public BusData(int men, int women, int children) {
        this.men = men;
        this.women = women;
        this.children = children;
    }

    public int getMen() {
        return men;
    }

    public int getWomen() {
        return women;
    }

    public int getChildren() {
        return children;
    }
}

class State {
    private String name;
    private TrainData trainData;
    private BusData busData;

    public State(String name) {
        this.name = name;
    }

    public void setTrainData(int men, int women, int children) {
        trainData = new TrainData(men, women, children);
    }

    public void setBusData(int men, int women, int children) {
        busData = new BusData(men, women, children);
    }

    public String getName() {
        return name;
    }

    public void displayTrainData() {
        System.out.println("Train Data for " + name + ":");
        System.out.println("Destination state Men Women Children");
        System.out.println("-------------------------------------");
        System.out.println(name + " " + trainData.getMen() + " " + trainData.getWomen() + " " + trainData.getChildren());
        System.out.println();
    }

    public void displayBusData() {
        System.out.println("Bus Data for " + name + ":");
        System.out.println("Destination state Men Women Children");
        System.out.println("------------------------------------");
        System.out.println(name + " " + busData.getMen() + " " + busData.getWomen() + " " + busData.getChildren());
        System.out.println();
    }
}

public class databuses {
    public static void main(String[] args) {
        State bihar = new State("Bihar");
        bihar.setTrainData(23500, 17237, 5927);

        State orissa = new State("Orissa");
        orissa.setTrainData(22658, 24555, 2364);

        State uP = new State("U.P");
        uP.setBusData(36517, 22617, 6314);

        State jharkhand = new State("Jharkhand");
        jharkhand.setBusData(23254, 19845, 1336);

        // Displaying the data
        bihar.displayTrainData();
        orissa.displayTrainData();
        uP.displayBusData();
        jharkhand.displayBusData();
    }
}
