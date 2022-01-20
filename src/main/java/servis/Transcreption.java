package servis;

import dao.City;
import dao.Country;
import dao.Mayer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Transcreption {
    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private final static String user = "postgres";
    private final static String password = "405";


    public static Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server\n" +
                    "successfully.");
        } catch (SQLException e) {
            e.getMessage();
        }
        return connection;
    }

    public static int getMayerCount() {
        String SQL = "select count(*) from mayer";

        int count = 0;
        try (
                Connection conn = connection();
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(SQL)) {
            {
                resultSet.next();
                count = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }

    public static void addMayer(String name, int age) {
        String SQL = "insert into mayer (mayer_name,age_mayer) values (?, ?)";
        try (Connection conn = connection();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.executeUpdate();
            System.out.println(name + "succesfully added !!!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static List<Mayer> printMayer() {
        ArrayList<Mayer> mayers = new ArrayList<>();
        String SQL = "SELECT * FROM mayer";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                mayers.add(new Mayer(
                        rs.getInt("id"),
                        rs.getString("mayer_name"),
                        rs.getString("age_mayer")));
            }
            return mayers;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static List<City> printCity() {
        ArrayList<City> cities = new ArrayList<>();
        String SQL = "SELECT * FROM city";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                cities.add(new City(
                        rs.getInt("id"),
                        rs.getString("city_name"),
                        rs.getString("code_city")));
            }
            return cities;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static List<Country> printCountry() {
        ArrayList<Country> countries = new ArrayList<>();
        String SQL = "SELECT * FROM country";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                countries.add(new Country(
                        rs.getInt("id"),
                        rs.getString("country_name"),
                        rs.getString("code_mobil")));
            }
            return countries;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static void printId1(int id) throws SQLException {
        try (PreparedStatement preparedStatement = connection().prepareStatement
                ("select * from city where id=(?)")) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int idID = rs.getInt("id");
                String city_name = rs.getString("city_name");
                String code_city = rs.getString("code_city");
                System.out.println(idID);
                System.out.println(city_name);
                System.out.println(code_city);
            }

        } finally {
            connection().close();
        }
    }

    public static void printId2(int id) throws SQLException {
        try (PreparedStatement preparedStatement = connection().prepareStatement
                ("select * from mayer where id=(?)")) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int id_ID = rs.getInt("id");
                String mayer_name = rs.getString("mayer_name");
                String age_mayer = rs.getString("age_mayer");
                System.out.println(id_ID);
                System.out.println(mayer_name);
                System.out.println(age_mayer);
            }

        } finally {
            connection().close();
        }
    }

    public static void printId3(int id) throws SQLException {
        try (PreparedStatement preparedStatement = connection().prepareStatement
                ("select * from country where id=(?)")) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                int id__ID = rs.getInt("id");
                String country_name = rs.getString("country_name");
                String code_mobil = rs.getString("code_mobil");
                System.out.println(id__ID);
                System.out.println(country_name);
                System.out.println(code_mobil);
            }

        } finally {
            connection().close();
        }
    }
}