package com.example.repository;

import com.example.model.Expedition;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

@Repository
public class ExpeditionRepository {

    private final Map<Integer, Expedition> expeditions = new HashMap<>();
    private int nextId = 1;

    public ExpeditionRepository() {
        save(new Expedition(null, "Amazon Basin Survey", "AMZ001", "Amazonía",
                "Camp Iguana", "Maria Torres", "2026-01-10", "2026-02-10", "Active"));
        save(new Expedition(null, "Sierra Nevada Trek", "SNV002", "Sierra Nevada",
                "Camp Condor", "Carlos Ruiz", "2026-02-01", "2026-03-01", "Active"));
    }

    public Expedition save(Expedition expedition) {
        if (expedition.getId() == null) {
            expedition.setId(nextId++);
        }
        expeditions.put(expedition.getId(), expedition);
        return expedition;
    }

    public List<Expedition> findAll() {
        return new ArrayList<>(expeditions.values());
    }

    public Expedition findById(Integer id) {
        return expeditions.get(id);
    }

    public boolean existsByCode(String code) {
        return expeditions.values().stream()
                .anyMatch(e -> e.getCode().equalsIgnoreCase(code));
    }

    public void deleteById(Integer id) {
        expeditions.remove(id);
    }
}