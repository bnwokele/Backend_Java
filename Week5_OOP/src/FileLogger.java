import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileLogger implements logger {
	
	private  BufferedWriter writer;
	
	public FileLogger() {
		try {
			writer = new BufferedWriter(new FileWriter("logs.txt"));
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void info(String info) {
		Date date = new Date();
		try {
			writer.append(date.toString() + ": " + info);
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void warning(String warning) {
		Date date = new Date();
		try {
			writer.append(date.toString() + ": Warning! - " + warning);
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void error(String error) {
		Date date = new Date();
		try {
			writer.append(date.toString() + ": Error! - " + error);
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void fatal(String fatal) {
		Date date = new Date();
		try {
			writer.append(date.toString() + ": FATAL!!! - " + fatal);
			writer.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void close() {
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
