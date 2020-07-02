package com.glqdlt.example.autoselectquery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Repository
public class HashMapRepository {

    enum ColumnType {
        STRING,
        TIME,
        NUMBER,
        BOOL
    }

    public static class ColumnMetaData {
        private String columnName;
        private String columnType;

        public String getColumnName() {
            return columnName;
        }

        public void setColumnName(String columnName) {
            this.columnName = columnName;
        }

        public String getColumnType() {
            return columnType;
        }

        public void setColumnType(String columnType) {
            this.columnType = columnType;
        }
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Set<ColumnMetaData> getColumns() {
        List<ColumnMetaData> aa = jdbcTemplate
                .queryForList("" +
                        "SELECT s.COLUMN_NAME AS columnName, s.DATA_TYPE AS columnType FROM information_schema.COLUMNS AS s" +
                        "    WHERE s.TABLE_SCHEMA = 'db' AND s.TABLE_NAME ='tb';", ColumnMetaData.class);
        return new HashSet<>(aa);
    }

    public List<Map<String, Object>> getContents() {
        return jdbcTemplate.queryForList(
                "select * from db.tb as a" +
                        "   where a.reg_date between '2020-06-30 00:00:00' and '2020-07-01 09:00:00'" +
                        "   limit 0,1000");
    }
}
