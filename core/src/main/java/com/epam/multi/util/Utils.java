package com.epam.multi.util;

import static com.epam.task1.entity.StringUtils.isPositiveNumber;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        for(String element : str) {
            if (!isPositiveNumber(element)) {
                return false;
            }
        }
        return true;
    }
}
