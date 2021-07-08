package com.codelover254.JavaEE8Recipes;

import java.time.LocalDateTime;

public class DateBean {
    private LocalDateTime current = LocalDateTime.now();

    public LocalDateTime getCurrent() {
        return current;
    }

    public void setCurrent(LocalDateTime current) {
        this.current = current;
    }
}
