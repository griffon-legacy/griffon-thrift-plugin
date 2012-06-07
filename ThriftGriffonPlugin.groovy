/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class ThriftGriffonPlugin {
    // the plugin version
    String version = '0.5'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.0.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = []
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-thrift-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Apache Thrift integration'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Provides integration with [Apache Thrift][1] – a software framework for scalable cross-language services development.
It combines a software stack with a code generation engine to build services that work efficiently and seamlessly
between C++, Java, Python, PHP, Ruby, Erlang, Perl, Haskell, C#, Cocoa, Smalltalk, and OCaml.

Usage
-----
This plugin requires you to have a valid thrift compiler installed. Follow the installation instructions laid out
in the [Thrift Wiki][2]. Once installed you must instruct the build where to locate the `thrift` executable.
Edit `griffon-app/conf/BuildConfig.groovy` with the following content

    apache.thrift.executable = "/usr/local/bin/thrift" // change this path to your own path

Place your `.thrift` sources at `$basedir/src/thrift`. They will be automatically compiled to java sources
(and classes) whenever the application is compiled. Alternatively you may call the `thrift` command to compile thrift
sources at any time.

Configuration
-------------

Thrift version currently supported is **0.8.0**.

Scripts
-------

 * **thrift** - compiles thrift sources (.thrift) then compiles the generated java sources.

[1]: http://thrift.apache.org
[2]: http://wiki.apache.org/thrift
'''
}
