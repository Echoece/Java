package Databases.DataBaseProject;

public class ProjectMain {
    public static void main(String[] args) {
        DataSource dataSource= new DataSource();
        dataSource.openConnection();
        dataSource.closeConnection();
    }
}
