package Databases;

public class SqliteBasics {
    // sqlite is a small C language library, it is serverless have ACID property of the transaction in case of system crash
    // or power failure.

    // installing : 1. download the sqlite-tools zip file and unzip in a folder.
    //              2. add the folder path to windows path variable.
    //              3. test in cmd with command - sqlite3

    // we can go to the folder with cmd where our file is, and open it. for example, sqlite3 database.db
    // for help with all command we can write .help and it will show all available command.
    // turning on table column name : .header on
    // getting list of tables       : .table
    // getting table structure      : .schema
    // getting list of transaction  : .dump
    // exit the sqlite application  : .exit

    //----------------------------------------------------------
    // key is an index, which increases the searching and joins.
    // Primary key : can be only one in a table, and it must be unique. It is by default not null. If unique number
    // Foreign key : primary key of other tables,

    // creating a table      : create table IF NOT EXISTS contacts(name text,phone integer,email text);
    // inserting data        : insert into contacts(name,phone,email) values('Echo','01913569023','Echoecce@gmail.com');
    // getting all data      : select * from contacts;
    // getting specific data : select phone,email from contacts where name = 'Echo';
    // order data            : select * from contacts order by name,albumName;
    // update data           : update contacts set email="updatedemail@gmail.com" where name = 'Rafi';
    // delete data           : delete from contacts where name='Rafi';
    // backup database       : /backup databaseNameHere
    // restore database      : /.restore databaseNameHere

    // join : for full examples, check w3schools.
    // Inner join example    : select songs.track, songs.title, albums.name, artists.name from songs
    //                                      INNER JOIN albums ON songs.album = albums._id
    //                                      INNER JOIN artists ON artists._id = albums.artist
    //                                      order by artists.name,albums.name, songs.track;

    // wildcards : reference w3schools.
    // example : select * from albums where title LIKE '%doctor%;

    // View : it is a virtual table based on a result set. It's used to simply complex joins, allow us to encapsulate
    //        sensitive data from a table etc.
    // example: CREATE VIEW [Brazil Customers] AS
    //          SELECT CustomerName as Customer, ContactName as Contact
    //          FROM Customers
    //          WHERE Country = 'Brazil';
    //----------------------------------------------------------

    // some basic exercise:

    // the schema of the database :
    //      CREATE TABLE songs (_id INTEGER PRIMARY KEY, track INTEGER, title TEXT NOT NULL, album INTEGER);
    //      CREATE TABLE albums (_id INTEGER PRIMARY KEY, name TEXT NOT NULL, artist INTEGER);
    //      CREATE TABLE artists (_id INTEGER PRIMARY KEY, name TEXT NOT NULL);

    /*
    2. Select title of all songs on the album "forbidden" ordered by the track order
    #solution:
        select songs.title,songs.track from songs
        inner join albums on songs.album=albums._id
        where albums.name = 'Forbidden'
        order by songs.track;


    3 display all songs for the band deep purple
    #solution:
        select songs.title from songs
        inner join albums on songs.album=albums._id
        inner join artists on artists._id = albums.artist
        where artists.name = "Deep Purple";


    6. select titles of all songs by Aerosmith in alphabetical order.
    #solution:
        select songs.title from songs
        inner join albums on songs.album=albums._id
        inner join artists on artists._id = albums.artist
        where artists.name = 'Aerosmith'
        order by songs.title;


    7. find the count of the number of songs by Aerosmith.
    #solution:
        select count(title) from songs
        inner join albums on songs.album=albums._id
        inner join artists on artists._id = albums.artist
        where artists.name = 'Aerosmith'

    8. Same as 8 but without duplicate;
    #solution:
        select count(distinct title) from songs
        inner join albums on songs.album=albums._id
        inner join artists on artists._id = albums.artist
        where artists.name = 'Aerosmith'
    */

}
