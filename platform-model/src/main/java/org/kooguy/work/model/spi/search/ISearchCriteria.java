package org.kooguy.work.model.spi.search;

public interface ISearchCriteria {
    /**
     * Get offset from beginning of dataset.
     *
     * @return
     */
    public Integer getPageNumber();

    /**
     * Get number of records per page of data.
     *
     * @return
     */
    public Integer getPageSize();
}
