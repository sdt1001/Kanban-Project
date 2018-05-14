import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		AdverbDecorator reader = new AdverbDecorator("file.txt");
		String line = null;
		while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
		reader.close();
	}

}
