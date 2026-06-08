package com.warpedlands.wlcommands.parsers;

import com.warpedlands.wlcommands.managers.ArgManager;
import com.warpedlands.wlcommands.meta.ArgMeta;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Collection;

public class ArgParser {
    private ArgManager argManager;

    public ArgParser(ArgManager argManager) {
        this.argManager = argManager;
    }

    public ArgMeta[] getArgsMetaFromMethod(Method method) {
        Collection<ArgMeta> nearResult = new ArrayList<>();

        for(Parameter parameter : method.getParameters()) {
            if(argManager.isClassValid(parameter.getType())) {
               nearResult.add(getArgMetaFromParam(parameter));
            }
        }
        return nearResult.toArray(new ArgMeta[0]);
    }

    private ArgMeta getArgMetaFromParam(Parameter parameter) {

        return new ArgMeta(parameter.getClass(),)
    }
}
