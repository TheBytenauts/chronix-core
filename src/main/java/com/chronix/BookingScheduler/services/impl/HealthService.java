package com.chronix.BookingScheduler.services.impl;
import com.chronix.BookingScheduler.dao.HealthDao;
import com.chronix.BookingScheduler.services.IHealthInterface;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class HealthService implements IHealthInterface {

    @Autowired
    HealthDao dao;

    public String getHealthStatus() {
        return dao.getHealth();
    }

}
