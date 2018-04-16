import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdjectiveDecorator extends VerbDecorator {
	public AdjectiveDecorator(String file) throws FileNotFoundException {
		super(file);
	}
	
	public String readLine() throws IOException {
		FileReader fileReader = new FileReader(readLine());
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		List<String> adjectiveList = new ArrayList<String>();
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            adjectiveList.add("<<ADJECTIVE>>");
            adjectiveList.set(0, "defeated");
            adjectiveList.set(0, "hungry");
            adjectiveList.set(0, "perplexed");
            adjectiveList.set(0, "stale");
            adjectiveList.set(0, "clumsy");
            adjectiveList.set(0, "mysterious");
            adjectiveList.set(0, "petty");
            adjectiveList.set(0, "gritty");
            adjectiveList.set(0, "average");
            adjectiveList.set(0, "tricky");
            
        }
        System.out.println(adjectiveList);
        bufferedReader.close();
        return line;
	}
}
