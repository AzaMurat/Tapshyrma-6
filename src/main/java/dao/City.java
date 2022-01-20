package dao;

public class City {
    private int id;
    private String city_name;
    private String code_city;

    public City(int id, String city_name, String code_city) {
        this.id = id;
        this.city_name = city_name;
        this.code_city = code_city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCode_city() {
        return code_city;
    }

    public void setCode_city(String code_city) {
        this.code_city = code_city;
    }

    @Override
    public String toString() {
        return  "\n" + id +
                " city : " + city_name +
                " city code : " + code_city +
                "\n";
    }
}

