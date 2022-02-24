![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<!-- What is Build Source Module -->
<h2><sup>:ballot_box_with_check:&ensp;</sup>
  What is <b><i>Build Source</i></b>
  <sup><code>buildSrc</code></sup> Module
</h2>
<blockquote>
<span><!-- leave the next line blank -->

***Build Source*** is a module at the project root directory,  
which contains build logic. This allows us to use the [Kotlin DSL](04-what-is-kotlin-dsl.md)  
to write custom build code with very little configuration  
and share this logic across the whole project.<br/>

The module directory `buildSrc` is treated as an included build.  
Upon discovery of the directory, ***[Gradle](01-what-is-gradle.md)*** automatically compiles and tests  
the code and puts it in the ***classpath*** of the build script.<br/>

There can be only one `buildSrc` directory for multi-project builds.  
`buildSrc` should be preferred over script [plugins](09-what-is-a-gradle-plugin.md)  
as it is easier to maintain, refactor, and test the code.<br/>

The source directory for the [plugin](09-what-is-a-gradle-plugin.md) should be in root  
`/buildSrc/src/main/kotlin` directory.  
***[Gradle](01-what-is-gradle.md)*** will take care of compiling and testing the plugin  
and making it available on the `classpath` of the build script.  
The [plugin](09-what-is-a-gradle-plugin.md) is visible to every build script used by the build.<br/>  
However, it is not visible outside the build,  
and it is not possible to reuse the plugin outside the build.
<span>
  <br/><br/>
</blockquote>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<p align="right"><a href="/../../#--------------questionfaq----------"><b>FAQ</b></a></p>
