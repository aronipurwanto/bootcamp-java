package com.aronsoft.webmvc.service;

import java.util.List;
import java.util.Optional;

public interface LookupService {
    List<LookupService> getByGroup(String group);
    Optional<LookupService> getByCode(String code);
    Optional<LookupService> getById(String id);
    Optional<LookupService> save(String id);
}
