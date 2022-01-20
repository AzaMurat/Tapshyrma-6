package dao;

public class Mayer {
    private int id;
    private String mayer_name;
    private String age_mayer;

    public Mayer(int id, String mayer_name, String age_mayer) {
        this.id = id;
        this.mayer_name = mayer_name;
        this.age_mayer = age_mayer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMayer_name() {
        return mayer_name;
    }

    public void setMayer_name(String mayer_name) {
        this.mayer_name = mayer_name;
    }

    public String getAge_mayer() {
        return age_mayer;
    }

    public void setAge_mayer(String age_mayer) {
        this.age_mayer = age_mayer;
    }

    @Override
    public String toString() {
        return  "\n" + id +
                " name : " + mayer_name +
                " age : " + age_mayer +
                "\n";
    }
}
