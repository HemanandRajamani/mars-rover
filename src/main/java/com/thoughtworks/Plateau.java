package com.thoughtworks;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Plateau {
    private final int lowerBoundXCoOrd;
    private final int lowerBoundYCoOrd;
    private final int upperBoundXCoOrd;
    private final int upperBoundYCoOrd;
}
