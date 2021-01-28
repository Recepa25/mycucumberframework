package dbStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.sql.SQLException;

public class DbWithDBUtils {
    @Given("kullanici DBUtils ile CK_Hotels veritabanina baglanir")
    public void kullanici_db_utils_ile_ck_hotels_veritabanina_baglanir() {
        DBUtils.getConnection();
    }

    @Given("kullanici DBUtils ile {string} tablosundaki {string} verilerini alir")
    public void kullanici_db_utils_ile_tablosundaki_verilerini_alir(String table, String field) {
        String query = "SELECT " + field + " FROM dbo. " + table;
        DBUtils.executeQuery(query);
    }

    @Given("kullanici DBUtils ile {string} sutunundaki verileri okur")
    public void kullanici_db_utils_ile_sutunundaki_verileri_okur(String field) throws SQLException {
        DBUtils.getResultset().first();
        Object ilkSatirdakiObje = DBUtils.getResultset().getObject(field);
        System.out.println(ilkSatirdakiObje.toString());
    }

    @Given("kullanici DBUtils ile {string} tablosundan {string} verilerini okur")
    public void kullanici_db_utils_ile_tablosundan_verilerini_okur(String tablo, String field) {
        String readQuery = "SELECT" + field + "FROM dbo." + tablo;
        DBUtils.executeQuery(readQuery);
    }

    @Then("IDHotel degeri {int} olan kaydin Email bilgisinin {string} oldugunu test eder")
    public void id_hotel_degeri_olan_kaydin_email_bilgisinin_oldugunu_test_eder(Integer int1, String string) {

    }

}
