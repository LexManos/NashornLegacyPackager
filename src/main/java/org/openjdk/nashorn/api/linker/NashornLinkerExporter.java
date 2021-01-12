package org.openjdk.nashorn.api.linker;

import java.util.Collections;
import java.util.List;

import jdk.dynalink.linker.GuardingDynamicLinker;
import jdk.dynalink.linker.GuardingDynamicLinkerExporter;

// NOOP implementation as JRE < 15 has this built in.
public class NashornLinkerExporter extends GuardingDynamicLinkerExporter {
    @Override
    public List<GuardingDynamicLinker> get() {
        return Collections.emptyList();
    }
}
