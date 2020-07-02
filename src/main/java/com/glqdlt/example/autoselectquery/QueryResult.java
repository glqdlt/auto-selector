package com.glqdlt.example.autoselectquery;

import java.util.List;
import java.util.Set;

public interface QueryResult<T> {

    Set<String> getContentsFields();

    List<T> getContents();

    Class<T> getContentsType();

}
