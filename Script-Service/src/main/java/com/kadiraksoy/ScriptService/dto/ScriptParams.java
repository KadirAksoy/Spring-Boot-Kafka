package com.kadiraksoy.ScriptService.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScriptParams {

    private Double lat;
    private Double lon;
    private Double intensity;
}