import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class VerbDecorator extends java.io.BufferedReader {
	public VerbDecorator(String file) throws FileNotFoundException {
		super(new FileReader(file));
	}
	
	public String readLine() throws IOException {
		List<String> verbList = new ArrayList<String>();
		verbList.add("run");
		verbList.add("jump");
		verbList.add("fly");
		verbList.add("trip");
		verbList.add("fall");
		verbList.add("walk");
		verbList.add("talk");
		verbList.add("sleep");
		verbList.add("shake");
		verbList.add("swim");
        
        String line = super.readLine();
        
        int i = 0;
        while (line != null && line.contains("<<VERB>>")) {
        	String replacement = verbList.get(i % verbList.size());
        	line = line.replaceFirst("\\<\\<VERB\\>\\>", replacement);
        	i++;
        }
        
        return line;
	}	
}

