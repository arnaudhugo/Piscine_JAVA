public class DatabaseLogger {
    private MongoDB mongodb;
    private PostgresDB postgresdb;
    private SqlDB sqldb;

    public DatabaseLogger() {
	mongodb = new MongoDB();
	postgresdb = new PostgresDB();
	sqldb = new SqlDB();
    }

    public void logMongoDB() {
	mongodb.showLogs();
    }

    public void logPostgresDb() {
	postgresdb.showLogs();
    }

    public void logSqlDB() {
	sqldb.showLogs();
    }
}