package com.example.test.service;

import java.util.Set;

public interface DataService {
    public boolean persist(String problem);
    public Set<String> getRandomData();
}
