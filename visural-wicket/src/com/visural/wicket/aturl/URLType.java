/*
 *  Copyright 2010 Richard Nichols.
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
package com.visural.wicket.aturl;

/**
 * URL encoding strategies understood by the {@link At} annotation.
 * 
 * @version $Id: URLType.java 256 2011-02-05 12:06:02Z tibes80@gmail.com $
 * @author Richard Nichols
 */
public enum URLType {
      Standard
    , Indexed
    , StateInURL
    , IndexedStateInURL
    , MountedMapper /* Encoder for mounted URL. The mount path can contain 
                     * parameter placeholders, i.e. /mount/${foo}/path. In that 
     * case the appropriate segment from the URL will be accessible as named 
     * parameter "foo" in the PageParameters. Similarly when the URL is constructed, 
     * the second segment will contain the value of the "foo" named page parameter. 
     * Optional parameters are denoted by using a # instead of $: /mount/#{foo}/path/${bar} 
     * has an optional foo parameter, a fixed /path/ part and a required bar parameter. 
     * When in doubt, parameters are matched from left to right, where required parameters
     * are matched before optional parameters, and optional parameters eager (from left to right). */
    ;
}
