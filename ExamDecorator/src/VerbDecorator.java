import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class VerbDecorator extends java.io.BufferedReader {
	public VerbDecorator(String file) throws FileNotFoundException {
		super(new FileReader(file));
	}
	
	public String readLine() throws IOException {
		FileReader fileReader = new FileReader(readLine());
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		List<String> verbList = new ArrayList<String>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            verbList.add("<<VERB>>");
            verbList.set(0, "run");
            verbList.set(0, "jump");
            verbList.set(0, "fly");
            verbList.set(0, "trip");
            verbList.set(0, "fall");
            verbList.set(0, "walk");
            verbList.set(0, "talk");
            verbList.set(0, "sleep");
            verbList.set(0, "shake");
            verbList.set(0, "swim");
            
        }
              
        System.out.println(verbList);
        bufferedReader.close();
        return line;
		
	}
	
	
	
}

