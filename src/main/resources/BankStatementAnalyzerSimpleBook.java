package main.resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankStatementAnalyzerSimpleBook {

	private static final String RESOURCES = "src/main/resources/";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		final Path patch = Paths.get(RESOURCES + "bank-data-simple.csv");
		
		final List<String> lines = Files.readAllLines(patch);
		
		double total = 0d;
		
		for (final String line:lines) {
			final String[] columns = line.split(",");
			final double amount = Double.parseDouble(columns[1]);
			total+= amount;
		}
		System.out.println("The total for all transactions is "+ total);
		
	}

}
