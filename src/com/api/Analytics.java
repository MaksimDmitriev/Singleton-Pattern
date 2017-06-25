package com.api;

import com.sun.istack.internal.NotNull;

public interface Analytics {

    void trackEvent(@NotNull String event);

    void trackScreen(@NotNull String screen);
}
