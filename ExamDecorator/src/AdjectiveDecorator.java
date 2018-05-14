import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdjectiveDecorator extends VerbDecorator {
	public AdjectiveDecorator(String file) throws FileNotFoundException {
		super(file);
	}
	
	public String readLine() throws IOException {
		List<String> adjectiveList = new ArrayList<String>();
	    adjectiveList.add("defeated");
	    adjectiveList.add("hungry");
	    adjectiveList.add("perplexed");
	    adjectiveList.add("stale");
	    adjectiveList.add("clumsy");
	    adjectiveList.add("mysterious");
	    adjectiveList.add("petty");
	    adjectiveList.add("gritty");
	    adjectiveList.add("average");
	    adjectiveList.add("tricky");
        
        String line = super.readLine();
        
        int i = 0;
        while (line != null && line.contains("<<ADJECTIVE>>")) {
        	String replacement = adjectiveList.get(i % adjectiveList.size());
        	line = line.replaceFirst("\\<\\<ADJECTIVE\\>\\>", replacement);
        	i++;
        }
        
        return line;
	}   
    
}
