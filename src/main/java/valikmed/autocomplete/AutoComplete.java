package valikmed.autocomplete;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;


public class AutoComplete {
    public List<String> elements;

    public List<String> complatByContaning(String written) {
        return complateBy(el -> el.toLowerCase().contains(written));
    }

    public List<String>  complateByPrefix(String written) {
        return complateBy(el -> el.toLowerCase().startsWith(written));
    }

    public List<String> complateBy(Predicate<String> predicate){
        return elements.parallelStream()
                .filter(predicate)
                .toList();
    }
}
