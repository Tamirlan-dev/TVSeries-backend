package sample;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.Statement ;
import java.sql.ResultSet ;

import java.util.List ;
import java.util.ArrayList ;

public class TvSeriesDataAccessor {

    // in real life, use a connection pool....
    private Connection connection ;

    public TvSeriesDataAccessor(String driverClassName, String dbURL, String user, String password) throws SQLException, ClassNotFoundException {
        Class.forName(driverClassName);
        connection = DriverManager.getConnection(dbURL, user, password);
    }

    public void shutdown() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public List<tvseries> gettvseriesList() throws SQLException {
        try (
                Statement stmnt = connection.createStatement();
                ResultSet rs = stmnt.executeQuery("select * from tv_series");
        ){
            List<tvseries> tvseriesList = new ArrayList<>();
            while (rs.next()) {
                String POSTER_LINK = rs.getString("POSTER_LINK");
                String SERIES_TITLE = rs.getString("SERIES_TITLE");
                String RUNTIME_OF_SERIES = rs.getString("RUNTIME_OF_SERIES");
                String CERTIFICATE = rs.getString("CERTIFICATE");
                String RUNTIME_OF_EPISODES = rs.getString("RUNTIME_OF_EPISODES");
                String GENRE = rs.getString("GENRE");
                String IMDB_RATING = rs.getString("IMDB_RATING");
                String OVERVIEW = rs.getString("OVERVIEW");
                String STAR1 = rs.getString("STAR1");
                String STAR2 = rs.getString("STAR2");
                String STAR3 = rs.getString("STAR3");
                String STAR4 = rs.getString("STAR4")
                String NO_OF_VOTES = rs.getString("NO_OF_VOTES");
                String S_ID = rs.getString("S_ID");
                tvseries person = new tvseries(POSTER_LINK,SERIES_TITLE, RUNTIME_OF_SERIES, CERTIFICATE,RUNTIME_OF_EPISODES,GENRE,IMDB_RATING,OVERVIEW,STAR1,STAR2,STAR3,STAR4,NO_OF_VOTES,S_ID);
                personList.add(person);
            }
            return personList ;
        }
    }

    // other methods, eg. addPerson(...) etc
}
