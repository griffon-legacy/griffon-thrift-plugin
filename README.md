
Apache Thrift integration
-------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/thrift](http://artifacts.griffon-framework.org/plugin/thrift)


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

