package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by androiddevelopment on 20.4.17..
 */
@DatabaseTable(tableName = "knjiga")
public class Knjiga {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = POLJE_NASLOV , canBeNull = false )
    private String naslov;

    @DatabaseField(columnName = POLJE_BROJ_STRANA , canBeNull = false)
    private int brojStrana;

    @DatabaseField(columnName = POLJE_DATUM_IZDAVANJA , canBeNull = false)
    private Date datumIzdanja;

    private boolean prisutna;


    @ForeignCollectionField(foreignFieldName = "oblast")
    private ForeignCollection<Oblast> oblast;


    public  Knjiga() {

    }

    public Knjiga(int id,String naslov , int brojStrana , Date datumIzdanja , boolean prisutna){

        this.id = id;
        this.naslov = naslov;
        this.brojStrana = brojStrana;
        this.datumIzdanja = datumIzdanja;
        this.prisutna = prisutna;
    }


    public int getId() {return id;}
    public String getNaslov() {return naslov;}
    public int getBrojStrana() {return brojStrana;}
    public Date getDatumIzdanja() {return datumIzdanja;}
    public boolean getPrisutna() {return prisutna;}


    public void setId(int id) {this.id = id;}
    public void setNaslov(String naslov) {this.naslov = naslov;}
    public void setBrojStrana(int brojStrana) {this.brojStrana = brojStrana;}
    public void setDatumIzdanja(Date datumIzdanja) {this.datumIzdanja = datumIzdanja;}
    public void setPrisutna(boolean prisutna) {this.prisutna = prisutna;}



    public static final String POLJE_NASLOV = "naslov";
    public static final String POLJE_BROJ_STRANA = "broj_strana";
    public static final String POLJE_DATUM_IZDAVANJA = "datum_izdavanja";


    @Override
    public String toString() {
        return "Knjiga{" +
                "id=" + id +
                ", naslov='" + naslov + '\'' +
                ", brojStrana=" + brojStrana +
                ", datumIzdanja=" + datumIzdanja +
                '}';
    }
}
