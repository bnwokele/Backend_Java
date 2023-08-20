package recipes;

import java.sql.Connection;
import recipes.dao.DBConnection;

public class Recipes {

	public static void main(String[] args) {

		DBConnection.getConnection();

	}

}
