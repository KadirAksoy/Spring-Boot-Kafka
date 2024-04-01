package com.kadiraksoy.EarthquakeService.consumer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScriptParams {

    private Double lat;
    private Double lon;
    private Double intensity;
}