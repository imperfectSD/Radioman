package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentStation;
    private int maxStation;
    private int minStation;
    private int currentVolume;
    private int minVolume;
    private int maxVolume;

}