package enyi.kata2;

public class Pokemon {
    private final String N;
    private final String Name;
    private final String Type1;
    private final String Type2;
    private final String Total;
    private final String HP;
    private final String Attack;
    private final String Defense;
    private final String SpAtk;
    private final String SpDef;
    private final String Speed;
    private final String Generation;
    private final String Legendary;

    public Pokemon(String n, String name, String type1, String type2, String total, String HP, String attack, String defense, String spAtk, String spDef, String speed, String generation, String legendary) {
        N = n;
        Name = name;
        Type1 = type1;
        Type2 = type2;
        Total = total;
        this.HP = HP;
        Attack = attack;
        Defense = defense;
        SpAtk = spAtk;
        SpDef = spDef;
        Speed = speed;
        Generation = generation;
        Legendary = legendary;
    }

    public String getN() {
        return N;
    }

    public String getName() {
        return Name;
    }

    public String getType1() {
        return Type1;
    }

    public String getType2() {
        return Type2;
    }

    public String getTotal() {
        return Total;
    }

    public String getHP() {
        return HP;
    }

    public String getAttack() {
        return Attack;
    }

    public String getDefense() {
        return Defense;
    }

    public String getSpAtk() {
        return SpAtk;
    }

    public String getSpDef() {
        return SpDef;
    }

    public String getSpeed() {
        return Speed;
    }

    public String getGeneration() {
        return Generation;
    }

    public String getLegendary() {
        return Legendary;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "N='" + N + '\'' +
                ", Name='" + Name + '\'' +
                ", Type1='" + Type1 + '\'' +
                ", Type2='" + Type2 + '\'' +
                ", Total='" + Total + '\'' +
                ", HP='" + HP + '\'' +
                ", Attack='" + Attack + '\'' +
                ", Defense='" + Defense + '\'' +
                ", SpAtk='" + SpAtk + '\'' +
                ", SpDef='" + SpDef + '\'' +
                ", Speed='" + Speed + '\'' +
                ", Generation='" + Generation + '\'' +
                ", Legendary='" + Legendary + '\'' +
                '}';
    }
}
