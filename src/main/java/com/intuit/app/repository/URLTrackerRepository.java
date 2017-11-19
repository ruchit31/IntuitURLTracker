package com.intuit.app.repository;

import com.intuit.app.model.URLTracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Class used for connecting to the database and making database queries
 */
@Repository
public class URLTrackerRepository {

    @Autowired
    private JdbcOperations jdbcOperations;

    public String postAllUrls(String url) {
        String sql = "select id FROM URL_TRACKER WHERE url = ?";
        List<Integer> id1 = jdbcOperations.queryForList(sql, new Object[]{url}, Integer.class);
        if (id1.size() == 0) {
            String query = "insert into  URL_TRACKER ("
                    + "ID,"
                    + "URL,"
                    +"COUNTER ) VALUES ("
                    + "null, ?,?)";
            jdbcOperations.update(query, url,0);
            id1 = jdbcOperations.queryForList(sql, new Object[]{url}, Integer.class);
        }
        String sql1 = "update URL_TRACKER set counter=counter+1  WHERE url = ? ";
        int temp=id1.get(0);
        jdbcOperations.update("update URL_TRACKER set counter=counter+1  WHERE id = ? ",temp);

        String sql2 = "select counter FROM URL_TRACKER WHERE id = ?";
        List<Integer> id2 = jdbcOperations.queryForList(sql2, new Object[]{temp}, Integer.class);
         return url+ " "+ id2.get(0);
    }


    public List<URLTracker> top3Urls() {

        String sql = "select * FROM URL_TRACKER order by counter DESC Limit 3 ";
        List<URLTracker> id1 = jdbcOperations.query(sql, new BeanPropertyRowMapper<URLTracker>(URLTracker.class));
        return id1;
    }


}
