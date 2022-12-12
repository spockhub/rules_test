package com.soonpan.bazeljunit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author spock
 */
public class GreatTest {
    @Test
    @DisplayName("Great测试")
    public void testMain() {
        Great great = new Great();
        great.sayGreat();
        great.sayGreat();
    }
}
