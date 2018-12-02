public class Player {
    String name;
    int teamCode;
    int timesBat;
    int singles;
    int doubles;
    int triples;
    int homeruns;

    static String[] teams={"New York Yankees","Boston Red Sox","Los Angeles Dodgers","New York Mets","Philadelphia Phillies"};

    //Constructor of the Player class
    public Player(String name, int teamCode, int timesBat, int singles, int doubles, int triples, int homeruns) {
        this.name = name;
        this.teamCode = teamCode;
        this.timesBat = timesBat;
        this.singles = singles;
        this.doubles = doubles;
        this.triples = triples;
        this.homeruns = homeruns;
    }
    //Method to calculate the batting average of the player
    public double calculateBattingAverage(){
        double totalHits=singles+doubles+triples+homeruns;
        return totalHits/timesBat;
    }
    //Method to calculate the slugging percentage of the player
    public double calculateSluggingPercentage(){
        double total=singles*1+doubles*2+triples*3+homeruns*4;
        return total/timesBat;
    }
    //Method to get the team name of the player using the team code of the player
    public String getTeamName(){
        return teams[teamCode-1];
    }
    //Getter method for name
    public String getName() {
        return name;
    }
    //Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    //Getter method for team code
    public int getTeamCode() {
        return teamCode;
    }
    //Setter method for team code
    public void setTeamCode(int teamCode) {
        this.teamCode = teamCode;
    }
    //Getter method for number of times at bat
    public int getTimesBat() {
        return timesBat;
    }
    //Setter method for number of times at bat
    public void setTimesBat(int timesBat) {
        this.timesBat = timesBat;
    }
    //Getter method for number of singles
    public int getSingles() {
        return singles;
    }
    //Setter method for number of singles
    public void setSingles(int singles) {
        this.singles = singles;
    }
    //Getter method for number of doubles
    public int getDoubles() {
        return doubles;
    }
    //Setter method for number of doubles
    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }
    //Getter method for number of triples
    public int getTriples() {
        return triples;
    }
    //Setter method for number of triples
    public void setTriples(int triples) {
        this.triples = triples;
    }
    //Getter method for home runs
    public int getHomeruns() {
        return homeruns;
    }
    //Setter method for home runs
    public void setHomeruns(int homeruns) {
        this.homeruns = homeruns;
    }

}
