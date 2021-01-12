package org.openjdk.nashorn.api.scripting;

import java.util.Collections;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;

/*
 * This can't be a NOOP as it needs to know a few things, but we return some non-sense values to not collide with the real nashorn.
 */
public class NashornScriptEngineFactory implements ScriptEngineFactory {
    @Override
    public String getEngineName() {
        return "NoopNashornWrapper";
    }

    @Override
    public String getEngineVersion() {
        return "0.0";
    }

    @Override
    public List<String> getExtensions() {
        return Collections.emptyList();
    }

    @Override
    public List<String> getMimeTypes() {
        return Collections.emptyList();
    }

    @Override
    public List<String> getNames() {
        return Collections.emptyList();
    }

    @Override
    public String getLanguageName() {
        return "noop-language-of-noopness";
    }

    @Override
    public String getLanguageVersion() {
        return "0.0";
    }

    @Override
    public Object getParameter(String key) {
        switch (key) {
            case ScriptEngine.ENGINE: return getEngineName();
            case ScriptEngine.ENGINE_VERSION: return getEngineVersion();
            case ScriptEngine.LANGUAGE: return getLanguageName();
            case ScriptEngine.LANGUAGE_VERSION: return getLanguageVersion();
            case ScriptEngine.NAME: return "NoopFactory";
            default: return null;
        }
    }

    @Override
    public String getMethodCallSyntax(String obj, String m, String... args) {
        return "noop";
    }

    @Override
    public String getOutputStatement(String toDisplay) {
        return "noop";
    }

    @Override
    public String getProgram(String... statements) {
        return "noop";
    }

    @Override
    public ScriptEngine getScriptEngine() {
        return null;
    }

}
