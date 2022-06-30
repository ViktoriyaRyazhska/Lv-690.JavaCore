package com.company;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class DataBase {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/cars";

    static final String USER = "temskiy";
    static final String PASS = "19617103TEMA";

    public static java.sql.Connection conn = null;
    public static Statement stmt = null;
    public static PreparedStatement pstmt = null;


    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void connectToDB() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        System.out.println("Connecting to DB...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static void addCar(String model, int yearOfProduction) throws SQLException {
        String sql = "INSERT INTO car(model, yearOfProduction) VALUES(?, ?)";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, model);
        pstmt.setInt(2, yearOfProduction);
        pstmt.executeUpdate();
    }

    public static void deleteOldestCar() throws SQLException {

        String sql = "SELECT MIN(yearOfProduction) AS year FROM car";
        stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt("year");
            pstmt = conn.prepareStatement("DELETE FROM car WHERE yearOfProduction = ?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }


    public static void getAllCars() throws SQLException {
        stmt = conn.createStatement();
        String sql = "SELECT idcar, model, yearOfProduction FROM car";
        ResultSet rs = stmt.executeQuery(sql);
        printResult(rs);

    }

    public static void printResult(ResultSet rs) throws SQLException {
        while (rs.next()) {
            int id = rs.getInt("idcar");
            String model = rs.getString("model");
            int year = rs.getInt("yearOfProduction");
            System.out.println("ID: " + id + ", model: " + model + ", year of production: " + year);

        }
    }

//    public static void createTable()throws SQLException{
//        String sql = "CREATE TABLE IF NOT EXISTS cars.client (idclient INTEGER NOT NULL AUTO_INCREMENT, firstname VARCHAR(20)," +
//                "age INTEGER, PRIMARY KEY(idclient))";
//        stmt.executeUpdate(sql);
//
//    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        connectToDB();
//        createTable();
//        addCar("BMW", 1999);
//        addCar("AUDI", 2003);
//        addCar("FORD", 2010);
//        getCar();
        deleteOldestCar();
//        getAllCars();


    }

    public static void getCar() throws IOException, SQLException {
        System.out.println("Enter year of production the car");
        int year = Integer.parseInt(br.readLine());
        stmt = conn.createStatement();
        String sql = "SELECT idcar, model, yearOfProduction FROM car WHERE yearOfProduction = '" + year + "'";
        ResultSet rs = stmt.executeQuery(sql);
        printResult(rs);
    }
}



