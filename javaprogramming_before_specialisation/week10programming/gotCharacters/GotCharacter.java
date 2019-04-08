package week10programming.gotCharacters;

import java.util.Optional;
import java.util.OptionalInt;

public class GotCharacter {
//    Name;Allegiances;Death Year;Book of Death;Death Chapter;Book Intro Chapter;Gender;Nobility;GoT;CoK;SoS;FfC;DwD
//    Addam Marbrand;Lannister;;;;56;1;1;1;1;1;1;0
    private String name;
    private String allegiances;
    private String deathYear;
    private String bookOfDeath;
    private String deathChapter;
    private String bookIntroChapter;
    private Integer gender;
    private Integer nobility;
    private Integer got;
    private Integer cok;
    private Integer sos;
    private Integer ffc;
    private Integer dwd;

    public GotCharacter(String name, String allegiances, String deathYear,
                        String bookOfDeath, String deathChapter, String bookIntroChapter,
                        Integer gender, Integer nobility, Integer got, Integer cok, Integer sos,
                        Integer ffc, Integer dwd) {
        this.name = name;
        this.allegiances = allegiances;
        this.deathYear = deathYear;
        this.bookOfDeath = bookOfDeath;
        this.deathChapter = deathChapter;
        this.bookIntroChapter = bookIntroChapter;
        this.gender = gender;
        this.nobility = nobility;
        this.got = got;
        this.cok = cok;
        this.sos = sos;
        this.ffc = ffc;
        this.dwd = dwd;
    }

    public String getName() {
        return name;
    }

    public String getAllegiances() {
        return allegiances;
    }

    public String getDeathYear() {
        return deathYear;
    }

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    public String getDeathChapter() {
        return deathChapter;
    }

    public String getBookIntroChapter() {
        return bookIntroChapter;
    }

    public Integer getGender() {
        return gender;
    }

    public Integer getNobility() {
        return nobility;
    }

    public Integer getGot() {
        return got;
    }

    public Integer getCok() {
        return cok;
    }

    public Integer getSos() {
        return sos;
    }

    public Integer getFfc() {
        return ffc;
    }

    public Integer getDwd() {
        return dwd;
    }

    @Override
    public String toString() {
        return "name='" + name +
                ", allegiances='" + allegiances +
                ", deathYear='" + deathYear +
                ", bookOfDeath='" + bookOfDeath +
                ", deathChapter='" + deathChapter +
                ", bookIntroChapter='" + bookIntroChapter +
                ", gender=" + gender +
                ", nobility=" + nobility;
    }
}
