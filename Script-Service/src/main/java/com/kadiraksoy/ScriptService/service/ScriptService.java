package com.kadiraksoy.ScriptService.service;

import com.kadiraksoy.ScriptService.dto.ScriptParams;
import com.kadiraksoy.ScriptService.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ScriptService {

    private final KafkaProducer kafkaProducer;

    public ScriptParams sentScript(ScriptParams scriptParams){
        kafkaProducer.produceScriptData(scriptParams);
        log.info("lat, lon ve şiddet bilgisi gönderildi.");
        return scriptParams;
    }
}