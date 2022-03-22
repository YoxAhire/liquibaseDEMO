import liquibase.database.jvm.JdbcConnection;
import liquibase.Liquibase;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.resource.FileSystemResourceAccessor;

public class Conn {

    public void getConn(){

        try{
            System.out.println("inside call");

            String url = "jdbc:mysql://localhost:3306/yox";
            String username = "root";
            String password = "root";
            String changeLog = "src/main/resources/changelog/changelog-master.xml";

            Connection con = DriverManager.getConnection(url, username,password);

            /*String c = DriverManager.getConnection(liquibase.property.get("url"),
                   liquibase.PROPERTIES.getProperty("username"),
                   liquibase.PROPERTIES.getProperty("password"));
            String changeLog = "src/main/resources/changelog/changelog-master.xml";*/

                //DatabaseMetaData databaseMetaData = con.getMetaData();
                //System.out.println("--->"+databaseMetaData);
                //String databaseName = databaseMetaData.getDatabaseProductName();

                Database database = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new JdbcConnection(con));
                Liquibase liquibase = new Liquibase(changeLog, new FileSystemResourceAccessor(), database);
                liquibase.update("!main");
                con.commit();


        }catch(Exception e){

            e.printStackTrace();
        }


    }




    }
