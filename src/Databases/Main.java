package Databases;

import java.sql.*;

public class Main {
    // constants for database connections
    public static final String DB_NAME="sample.db";
    public static final String PATH="D:\\UIU\\Code\\Java\\MyJavaCodes\\src\\Databases\\";
    public static final String CONNECTION_STRING="jdbc:sqlite:"+PATH+DB_NAME;
    // constants for table
    public static final String CONTACT_TABLE="contacts";
    public static final String COLUMN_NAME="name";
    public static final String COLUMN_EMAIL="email";
    public static final String COLUMN_PHONE="phone";

    public static void main(String[] args) {
        try{
            //creating connection
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            // note: use prepared statement for non secure language/framerword instead of
            // statement, in this case its fine since mysql jdbc wont let more than one
            // statement execute at once time.
            Statement statement =connection.createStatement();
            //creating table
            statement.execute("CREATE table IF NOT EXISTS "+ CONTACT_TABLE+
                    " ("+ COLUMN_NAME +" Text, "+
                    COLUMN_PHONE+" INTEGER ,"+
                    COLUMN_EMAIL+" text)"
            );
            //insert
            statement.execute("INSERT INTO "+ CONTACT_TABLE + "("+COLUMN_NAME+","
                    +COLUMN_PHONE+","+COLUMN_EMAIL+") " +
                  "VALUES('Jane', 4829484, 'jane@somewhere.com')");
            //Delete
            statement.execute("DELETE FROM "+CONTACT_TABLE+" WHERE "+COLUMN_NAME+"='Jane'");
            //update
            statement.execute("UPDATE "+CONTACT_TABLE+" SET "+COLUMN_PHONE+"=554472 " +
                    "where "+COLUMN_NAME+" ='Jane'");

            //result set: when a result-set is created its cursor is positioned before the
            // first row. when we call the result.next() it point to the first record.
            ResultSet resultSet= statement.executeQuery("select * from "+ CONTACT_TABLE);

            // we should use the column index cause whenever possible cause its faster, only used
            // the index name here for reference
            while (resultSet.next()){
                System.out.println(resultSet.getString(COLUMN_NAME)+" " +
                        resultSet.getString(COLUMN_PHONE)+" " +
                        resultSet.getString(COLUMN_EMAIL));
            }
            // important to close the connection to save resources. order is important
            // , otherwise it will catch an exception.
            resultSet.close();
            statement.close();
            connection.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
