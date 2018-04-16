import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdverbDecorator extends AdjectiveDecorator {
	public AdverbDecorator(String file) throws FileNotFoundException {
		super(file);
	}
	
	public String readLine() throws IOException {
		FileReader fileReader = new FileReader(readLine());
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		List<String> adverbList = new ArrayList<String>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            adverbList.add("<<ADVERB>>");
            adverbList.set(0, "sedately");
            adverbList.set(0, "joyously");
            adverbList.set(0, "fondly");
            adverbList.set(0, "softly");
            adverbList.set(0, "fairly");
            adverbList.set(0, "gently");
            adverbList.set(0, "upbeat");
            adverbList.set(0, "vaguely");
            adverbList.set(0, "more");
            adverbList.set(0, "recklessly");
            
        }
        System.out.println(adverbList);
        bufferedReader.close();
        return line;
	}
}
