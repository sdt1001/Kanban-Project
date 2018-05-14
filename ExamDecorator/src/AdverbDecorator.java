import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdverbDecorator extends AdjectiveDecorator {
	public AdverbDecorator(String file) throws FileNotFoundException {
		super(file);
	}
	
	public String readLine() throws IOException {
		List<String> adverbList = new ArrayList<String>();
        adverbList.add("sedately");
        adverbList.add("joyously");
        adverbList.add("fondly");
        adverbList.add("softly");
        adverbList.add("fairly");
        adverbList.add("gently");
        adverbList.add("upbeat");
        adverbList.add("vaguely");
        adverbList.add("more");
        adverbList.add("recklessly");
        
        String line = super.readLine();
        
        int i = 0;
        while (line != null && line.contains("<<ADVERB>>")) {
        	String replacement = adverbList.get(i % adverbList.size());
        	line = line.replaceFirst("\\<\\<ADVERB\\>\\>", replacement);
        	i++;
        }
        
        return line;
	}
}
