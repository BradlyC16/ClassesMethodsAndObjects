public class Reptile {

    int legs;
    boolean eyeLips;
    String skinPattern;
    double length;
    int age;
    int eggs;
    char whatKind;
    String name;
    boolean selfHealing;

    public Reptile(int legs, String skinPattern, double length, int age, int eggs, char whatKind, String name) {
        this.legs = legs;
        this.skinPattern = skinPattern;
        this.length = length;
        this.age = age;
        this.eggs = eggs;
        this.whatKind = whatKind;
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isEyeLips() {
        return eyeLips;
    }

    public void setEyeLips(boolean eyeLips) {
        this.eyeLips = eyeLips;
    }

    public String getSkinPattern() {
        return skinPattern;
    }

    public void setSkinPattern(String skinPattern) {
        this.skinPattern = skinPattern;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public char getWhatKind() {
        return whatKind;
    }

    public void setWhatKind(char whatKind) {
        this.whatKind = whatKind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelfHealing() {
        return selfHealing;
    }

    public void setSelfHealing(boolean selfHealing) {
        this.selfHealing = selfHealing;
    }
}
