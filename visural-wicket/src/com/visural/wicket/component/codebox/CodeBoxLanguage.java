/*
 *  Copyright 2009 Richard Nichols.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package com.visural.wicket.component.codebox;

/**
 * Types of languages supported by the {@link CodeBox} component.
 *
 * In general it is not necessary to specify a language, however you can force
 * one by using one of these enumerated types.
 *
 * @version $Id: CodeBoxLanguage.java 146 2010-03-29 10:53:06Z tibes80@gmail.com $
 * @author Richard Nichols
 */
public enum CodeBoxLanguage {

    COMMON_LISP("lang-cl","lang-lisp.js"),
    EMACS_LISP("lang-el","lang-lisp.js"),
    LISP("lang-lisp","lang-lisp.js"),
    SCHEME("lang-scm","lang-lisp.js"),
    CSS("lang-css","lang-css.js"),
    HASKELL("lang-hs","lang-hs.js"),
    LUA("lang-lua","lang-lua.js"),
    PROTOCOL_BUFFERS("lang-proto","lang-proto.js"),
    SQL("lang-sql","lang-sql.js"),
    VISUAL_BASIC("lang-vb","lang-vb.js"),
    VB_SCRIPT("lang-vbs","lang-vb.js"),
    GOOGLE_WIKI("lang-wiki","lang-wiki.js"), //http://code.google.com/p/support/wiki/WikiSyntax
    APOLLO("lang-apollo","lang-apollo.js"), //http://virtualagc.googlecode.com
    F_SHARP("lang-fs","lang-ml.js"),
    ML("lang-ml","lang-ml.js"),
    HTML("lang-html"),
    BASH("lang-bsh"),
    C("lang-c"),
    CPP("lang-cpp"),
    CSHARP("lang-cs"),
    CYC("lang-cyc"),
    CV("lang-cv"),
    JSON("lang-json"),
    JAVA("lang-java"),
    JAVASCRIPT("lang-js"),
    XML("lang-xml"),
    XSL("lang-xsl"),
    PERL("lang-pl"),
    PYTHON("lang-py"),
    RUBY("lang-rb"),
    SHELL("lang-sh"),
    XHTML("lang-xhtml")
    ;

    
    private final String cssClass;
    private final String extraJSfile;

    CodeBoxLanguage(String cssClass) {
        this.cssClass = cssClass;
        extraJSfile = null;
    }
    CodeBoxLanguage(String cssClass, String extraJSfile) {
        this.cssClass = cssClass;
        this.extraJSfile = extraJSfile;
    }

    public String getCSSClass() {
        return this.cssClass;
    }

    public String getExtraJSfile() {
        return extraJSfile;
}

}
