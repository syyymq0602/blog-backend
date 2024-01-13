package org.kooguy.work.model.rest.search;

import lombok.NoArgsConstructor;
import org.kooguy.work.model.spi.search.ISearchResults;

import java.util.List;

@NoArgsConstructor
public class SearchResults<T> implements ISearchResults<T> {

    /** Number of total results */
    private long numResults;

    /** List of results */
    private List<T> results;

    public SearchResults(List<T> all) {
        setNumResults(all.size());
        setResults(all);
    }

    public SearchResults(List<T> page, long total) {
        setNumResults(total);
        setResults(page);
    }

    public long getNumResults() {
        return numResults;
    }

    public void setNumResults(long numResults) {
        this.numResults = numResults;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }
}
