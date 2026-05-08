package com.warpedlands.wlcommands;

import com.warpedlands.wlcommands.meta.CommandMeta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.)

public @interface Command {
    String value();
}
