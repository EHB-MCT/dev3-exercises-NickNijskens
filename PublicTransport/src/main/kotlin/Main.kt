import java.sql.*
import java.util.*

val credentials = Credentials()

fun main() {
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val connectionProps = Properties()
    connectionProps["user"] = credentials.user
    connectionProps["password"] = credentials.password

    val connection = DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" + "dt5.ehb.be" + ":" + "3306" + "/" + credentials.databaseName,
        connectionProps)

    val statement = connection.prepareStatement("SELECT * FROM 'cities'")
    val result = statement.executeQuery()
    while(result.next()){
        println(result.getString("name"))
    }
}