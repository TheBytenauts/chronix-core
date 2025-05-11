package com.chronix.BookingScheduler.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HealthDao {
    public String getHealth() {
        return "OK";
    }
}

