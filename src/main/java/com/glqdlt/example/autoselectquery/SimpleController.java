package com.glqdlt.example.autoselectquery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RequestMapping("/api/log")
@RestController
public class SimpleController {
    private final static Logger LOGGER = LoggerFactory.getLogger(SimpleController.class);
    @Autowired
    private HashMapRepository hashMapRepository;

    @GetMapping()
    public ResponseEntity getSomeLog() {
        Set<HashMapRepository.ColumnMetaData> a = hashMapRepository.getColumns();
        return ResponseEntity.ok(hashMapRepository.getContents());
    }
}
