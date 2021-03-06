package org.cts.service;

import org.cts.model.StoredValue;

import java.util.List;

/**
 * Created by dharma on 8/14/17.
 */
public interface StoreRetreiveService  {
    List<StoredValue> listAllVarValue();
    StoredValue 		retreiveByVarName(String varname);
    boolean		varExits(StoredValue user);
    void		saveVarValue(StoredValue user);

    void deleteAll();

    boolean updateVarValue(StoredValue storedValue);
}
