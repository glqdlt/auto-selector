package com.glqdlt.example.autoselectquery;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SimpleMapQueryResult implements QueryResult<Map> {
    @Override
    public Set<String> getContentsFields() {
        return null;
    }

    @Override
    public List<Map> getContents() {
        return null;
    }

    @Override
    public Class<Map> getContentsType() {
        return null;
    }
}
