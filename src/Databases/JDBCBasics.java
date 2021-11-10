package Databases;

public class JDBCBasics {
    // By using the JDBC API we can work with data source. It acts as a middleman between a java application and data
    // source. To use any sort of database , we need that jdbc driver. For example, sqlite needs sqlite jdbc driver.

    // The drivers are simply java library which implements the JDBC API. Because all drivers implements the same interface,
    // we can change our data source.
    // for example, lets say an application uses sqlite database, and later we decide to migrate it to mysql. In that
    // case we only need to use the mysql JDBC driver instead of the sqlite one. Of course we have to migrate database
    // too in that case. (But in reality its not that simple, often it can create unexpected bugs)

    // JDBC consist of two package : java.sql(core JDBC) and jabax.sql(optional JDBC, required for database servers)

    // for sqlite , we can use the DB browser for sqlite GUI.


}
