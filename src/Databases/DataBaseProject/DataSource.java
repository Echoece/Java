package Databases.DataBaseProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    // constants for database connections
    public static final String DB_NAME="music.db";
    public static final String PATH="D:\\UIU\\Code\\Java\\MyJavaCodes\\src\\Databases\\DataBaseProject\\";
    public static final String CONNECTION_STRING="jdbc:sqlite:"+PATH+DB_NAME;
    // albums table constants
    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";
    // artists table constants
    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";
    // songs table constants
    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";

    //--------------------------------------------------------
    private Connection connection;
    // open and close connection
    public boolean openConnection(){
        try{
            connection= DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e){
            System.out.println("connection failed "+e.getMessage());
            return false;
        }
    }
    public void closeConnection(){
        try{
            if(connection!=null){
                connection.close();
            }
        }catch (SQLException e){
            System.out.println("couldn't close connection "+e.getMessage());
        }
    }
    //--------------------------------------------------------


    //--------------------------------------------------------
    // getting artists list

    public List<Artist> queryArtists() {
        ResultSet results = null;
        Statement statement=null;

        try{
            statement = connection.createStatement();
            results = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS);

            List<Artist> artists = new ArrayList<>();
            while(results.next()) {
                Artist artist = new Artist();
                artist.setId(results.getInt(COLUMN_ARTIST_ID));
                artist.setName(results.getString(COLUMN_ARTIST_NAME));
                artists.add(artist);
            }
            return artists;

        } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        } finally {
            try{
                if(results!=null){
                    results.close();
                }
            }catch (SQLException e){
                System.out.println("Error closing result-set "+ e.getMessage());
            }
            try{
                if(statement!=null){
                    statement.close();
                }
            }catch (SQLException e){
                System.out.println("Error closing statement "+ e.getMessage());
            }
        }
    }
    //--------------------------------------------------------
    // this is the better implementation, because we are using the try with resources. So in case
    // whether
    public List<Artist> queryArtistsBetterWay() {

        try(Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS)) {
            List<Artist> artists = new ArrayList<>();
            while(results.next()) {
                Artist artist = new Artist();
                artist.setId(results.getInt(COLUMN_ARTIST_ID));
                artist.setName(results.getString(COLUMN_ARTIST_NAME));
                artists.add(artist);
            }
            return artists;
        } catch(SQLException e) {
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }
    //--------------------------------------------------------

}
