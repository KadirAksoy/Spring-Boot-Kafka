package com.kadiraksoy.ScriptService.controller;

import com.kadiraksoy.ScriptService.dto.ScriptParams;
import com.kadiraksoy.ScriptService.service.ScriptService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/script")
@RequiredArgsConstructor
public class ScriptController {

    private final ScriptService scriptService;

    @PostMapping("/sent")
    public ResponseEntity<ScriptParams> sentScript(@RequestBody ScriptParams scriptParams){
        scriptService.sentScript(scriptParams);
        return ResponseEntity.ok(scriptParams);
    }
}