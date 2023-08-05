package com.arpitrathore.swagger.controllers;

import java.util.ArrayList;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arpitrathore
 */
@RequestMapping("uuid")
@RestController
public class UuidController {

  @GetMapping
  public ResponseEntity getUuid(@RequestParam(value = "count", defaultValue = "1") int count) {
    final var uuids = new ArrayList<String>();

    for (int i = 0; i < count; i++) {
      uuids.add(UUID.randomUUID().toString());
    }
    return ResponseEntity.ok(uuids);
  }

}
