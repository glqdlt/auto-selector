package com.glqdlt.example.autoselectquery;

public abstract class QueryMetaDataBase implements QueryMetaData {
    private String schemaName;
    private String tableName;

    @Override
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Override
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
