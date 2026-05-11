package com.warpedlands.wlcommands.annotations;

import java.util.UUID;
import java.util.function.Predicate;

public @interface PlayerUUIDArgument {
    String def();
    boolean other();
}
