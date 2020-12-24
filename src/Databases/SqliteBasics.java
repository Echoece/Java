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
    // creating a table      : create table contacts(name text,phone integer,email text);
    // inserting data        : insert into contacts(name,phone,email) values('Echo','01913569023','Echoecce@gmail.com');
    // getting all data      : select * from contacts;
    // getting specific data : select phone,email from contacts where name = 'Echo';
    // order data            : select * from contacts order by name,albumName;
    // update data           : update contacts set email="updatedemail@gmail.com" where name = 'Rafi';
    // delete data           : delete from contacts where name='Rafi';
    // backup database       : /backup databaseNameHere
    // restore database      : /.restore databaseNameHere

    // join : for full examples, check w3schools.
    // Inner join example    : select songs.track, songs.title, albums.name from
    //                                      songs INNER JOIN albums ON
    //                                      songs.album = album._id.
    //----------------------------------------------------------

    // key is an index, which increases the searching and joins.
    // Primary key : can be only one in a table, and it must be unique. It is by default not null. If unique number
    // Foreign key : primary key of other tables,






}
