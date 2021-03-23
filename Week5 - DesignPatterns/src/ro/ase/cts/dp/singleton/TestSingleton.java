package ro.ase.cts.dp.singleton;

public class TestSingleton {

	public static void main(String[] args) {

		// DbConnection con1 = new DbConnection();
		// DbConnection con2 = new DbConnection();

		DbConnection con1 = DbConnection.getDbConnection();
		DbConnection con2 = DbConnection.getDbConnection();
		DbConnection con3 = DbConnection.getDbConnection();

	}
}
