package org.kooguy.work.model.spi.search;

import java.util.List;

public interface ISearchResults<T> {
    /**
     * Get the total number of results.
     *
     * @return
     */
    public long getNumResults();

    /**
     * Get the results.
     *
     * @return
     */
    public List<T> getResults();
}
