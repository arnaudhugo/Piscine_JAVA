public class Main {
    public static void main(String[] args) {
	MongoDB mongoDB = new MongoDB();
	mongoDB.showLogs();

	DatabaseLogger databaseLogger = new DatabaseLogger();

	databaseLogger.logMongoDB();
	databaseLogger.logPostgresDb();
	databaseLogger.logSqlDB();
    }
}