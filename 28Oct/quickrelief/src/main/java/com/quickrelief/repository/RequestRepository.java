//repository folder	Reads and writes database data
package com.quickrelief.repository;

import com.quickrelief.model.SupplyRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;

@Repository
public class RequestRepository {

    private final JdbcTemplate jdbcTemplate;

    public RequestRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public SupplyRequest save(SupplyRequest request) {

        String sql = """
                INSERT INTO requests
                    (item_name, quantity, status, requested_by)
                VALUES (?, ?, ?, ?)
                """;

        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(
                    sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, request.getItemName());
            ps.setInt(2, request.getQuantity());
            ps.setString(3, request.getStatus());
            ps.setString(4, request.getRequestedBy());

            return ps;
        }, keyHolder);

        Number key = keyHolder.getKey();

        if (key != null) {
            request.setId(key.longValue());
        }

        return request;
    }
}
