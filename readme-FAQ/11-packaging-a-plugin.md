![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<!-- Packaging a Plugin -->
<h2><sup>:ballot_box_with_check:&ensp;</sup>

  Packaging a [Plugin](09-what-is-a-gradle-plugin.md)
</h2>
<blockquote>
<span><!-- leave the next line blank -->

There are several places where you can put the source for the [plugin](09-what-is-a-gradle-plugin.md):
* ***Build Script*** `build.gradle`
You can include the source for the plugin directly in the build script.  
This has the benefit that the [plugin](09-what-is-a-gradle-plugin.md) is automatically compiled and included  
in the *classpath* of the build script without you having to do anything.<br/>  
However, the [plugin](09-what-is-a-gradle-plugin.md) is not visible outside the build script,  
and cannot be reused outside the build script where it's defined.<br/>

* ***Build Source*** `buildSrc` ***module**
You can put the source for the [plugin](09-what-is-a-gradle-plugin.md) in the `buildSrc/src/main/kotlin`.
*Gradle* will take care of compiling, testing and making
the [plugin](09-what-is-a-gradle-plugin.md) available on the *classpath* of the build script.<br/>  
The [plugin](09-what-is-a-gradle-plugin.md) is visible to every build script used by the build.
However, it is not visible outside the build,
and cannot be reused outside the build it is defined in.<br/>
* ***Standalone project***
It is possible to create a separate project for your [plugin](09-what-is-a-gradle-plugin.md).
This project produces and publishes a `JAR`
which then can be used in multiple builds and share with others.<br/>
Generally, this `JAR` might include some [plugins](09-what-is-a-gradle-plugin.md),
or bundle several related task classes into a single library.
</span>
  <br/><br/>
</blockquote>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<p align="right"><a href="/../../#--------------questionfaq----------"><b>FAQ</b></a></p>

<!--─────────────────────────────────────────────────────────────────-->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "packaging-a-plugin">
        <sup>:ballot_box_with_check:&ensp;</sup>
        Packaging a <a href="#what-is-a-gradle-plugin">Plugin</a>
      </a>
    </h3>
  </summary>
  <blockquote>
<!-- ^END OF Copy&Paste over the line above^─────────────────────────-->
<!--                                                                 -->
<!-- STANDALONE FAQ QUESTION TEMPLATE                                -->
<!-- The reason why there's a separate md file introduced:           -->
<!--                                                                 -->
<!-- FAQ collapsible list in main readme.md is closed by default.    -->
<!-- This implifies the link to anchored question block there        -->
<!-- does not open FAQ list as well as the question block either     -->
<!--─────────────────────────────────────────────────────────────────-->
