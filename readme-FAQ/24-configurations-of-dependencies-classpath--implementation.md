![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<!-- Configurations of dependencies{}: classpath() & implementation() -->
<h2><sup>:ballot_box_with_check:&ensp;</sup>
  <span>
    Configurations of <code>dependencies{}</code>:
    <div>&emsp;&emsp;<code>classpath()</code> &#38;
      <code>implementation()</code><div>
  </span>
</h2>
<blockquote>
<span><!-- leave the next line blank -->

A `Configuration` represents a group of artifacts and their dependencies.  
<br/>
When you’re building and running a *Java* project there are two *classpaths* involved:
* ***Compile classpath*** – this is a list of dependencies that are required for the [***JDK***](03-what-is-jdk.md) to be able to compile Java code into .class files
* ***Runtime classpath*** – this list of dependencies is required to actually run the compiled Java code
<br/>

When we’re configuring Gradle dependencies all we’re really doing  
is configuring which ***dependencies*** should appear on which ***classpath***.  
Given there are only two classpaths, so it makes sense  
that we have three options to declare our dependencies:

* `compileOnly()` – put the dependency on the  compile `classpath()` only
* `runtimeOnly()` – put the dependency on the runtime `classpath()` only
* `implementation()` – put the dependency **on both classpaths**
<br/>
<span><!-- leave the next line blank -->

><sup>:bangbang:</sup>Use the `implementation` *dependency configuration*  
>if you need the dependency to be on both the *compile* and *runtime* classpaths.
</span>

&emsp;If not, consider `compileOnly()` or `runtimeOnly()`.  
<br/>
The `classpath()` configuration is commonly seen in the [***Build Source***](19-what-is-build-sourcebuildsrc-module.md) `buildSrc` module  
where one needs to declare dependencies for the top-level `build.gradle` itself.  
<br/>
This configuration includes:
* AGP plugin
* Kotlin plugin<br/>
</span>
  <br/><br/>
</blockquote>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<p align="right"><a href="/../../#--------------questionfaq----------"><b>FAQ</b></a></p>
