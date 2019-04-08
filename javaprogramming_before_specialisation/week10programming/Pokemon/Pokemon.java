package week10programming.Pokemon;

public class Pokemon {

    private String name;
    private String type1;
    private String type2;
    private Integer total;
    private Integer hp;
    private Integer attack;
    private Integer defense;
    private Integer spAtk;
    private Integer spDef;
    private Integer speed;
    private Integer generation;
    private Boolean legendary;

    public Pokemon(String name, String type1, String type2, Integer total, Integer hp,
                   Integer attack, Integer defense, Integer spAtk, Integer spDef, Integer speed,
                   Integer generation, Boolean legendary) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getHP() {
        return hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getSpAtk() {
        return spAtk;
    }

    public Integer getSpDef() {
        return spDef;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    public Boolean getLegendary() {
        return legendary;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
