import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Pasan on 7/21/2016.
 */
public class PhraseFinder {

    private Map<String, Integer> phraseCounterMap;

    /**
     * Find phrases list.
     *
     * @param path the path
     * @return the list
     */
    public List<Map.Entry<String,Integer>> findPhrases(String path) {
        Path file = Paths.get(path);
        try {

            Stream<String> lines = Files.lines( file, StandardCharsets.UTF_8 );
            phraseCounterMap = new HashMap<>();

            for( String line : (Iterable<String>) lines::iterator )
            {
                StringTokenizer tokenizer = new StringTokenizer(line, "|");

                while (tokenizer.hasMoreTokens()) {
                    String phrase = tokenizer.nextToken();
                    String key = phrase.trim();

                    if (phraseCounterMap.containsKey(key)) {
                        int count = phraseCounterMap.get(key);
                        phraseCounterMap.put(key, ++count);
                    } else {
                        phraseCounterMap.put(key, 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> entries = new ArrayList<>(phraseCounterMap.entrySet());
            Collections.sort(entries, (e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));

            return entries
                    .stream()
                    .limit(100000).collect(Collectors.toList());

        } catch (IOException ioe){
            ioe.printStackTrace();
            return null;
        }
    }

}
