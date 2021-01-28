package dbStepdefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;

public class DbReadStepdefinitions {

    String url = "jdbc:sqlserver://184.168.194.58:1433;databaseName=crystalkeyhotels2; user=Ahmet_User;password=Ahmet123!";
    String username = "Ahmet_User";
    String password = "Ahmet123!";

    Connection connection;//Database baglantisi icin
    Statement statement;//query calistirma icin
    ResultSet resultSet;//sorgu sonucunda gelen sonuc tablosunda istedigimiz dataya ulasmak icin


    @Given("kullanici CK_Hotels veritabanina baglanir")
    public void kullanici_ck_hotels_veritabanina_baglanir() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    @Given("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullanici_tablosundaki_verilerini_alir(String table, String field) throws SQLException {
        String query="SELECT "+field+" FROM dbo. "+table;
        resultSet=statement.executeQuery(query);

    }

    @Given("kullanici {string} sutunundaki verileri okur")
    public void kullanici_sutunundaki_verileri_okur(String field) throws SQLException {
        resultSet.first();// bizi ilk kayda goturur,eger gecerli bir kayds gitmeden data ile ilgili islem yaparsak
        // "The result set has no current row " hatasi aliriz
        Object ilkSatirdakiObje=resultSet.getObject(field);
        System.out.println(ilkSatirdakiObje.toString());


        //2.degeri yazdiralim
        resultSet.next();
        Object ikinciSatirdakiObje=resultSet.getObject(field);
        System.out.println(ikinciSatirdakiObje.toString());

//7. degeri yazdiralim
        resultSet.absolute(7);
        Object yedinciSatirdakiObje=resultSet.getObject(field);
        System.out.println(yedinciSatirdakiObje.toString());
        System.out.println("============================================");


        resultSet.absolute(0);
//Tum Listeyi yazdiralim
        while (resultSet.next()){//while nin icine yazdigimiz kod booleon olarak dondurur
            Object satirdakiObje=resultSet.getObject(field);
            System.out.println(satirdakiObje.toString());

        }



    }




}
