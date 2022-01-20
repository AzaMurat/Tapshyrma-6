package dao;

public class Country {
    private int id;
    private String country_name;
    private String code_mobil;

    public Country(int id, String country_name, String code_mobil) {
        this.id = id;
        this.country_name = country_name;
        this.code_mobil = code_mobil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCode_mobil() {
        return code_mobil;
    }

    public void setCode_mobil(String code_mobil) {
        this.code_mobil = code_mobil;
    }

    @Override
    public String toString() {
        return "\n"+ id +
                " country:" + country_name + " mobil code:" + code_mobil + "\n";
    }
}
