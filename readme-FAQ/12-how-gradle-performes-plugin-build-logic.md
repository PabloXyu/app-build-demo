![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<!-- How Gradle Performes Plugin Build Logic -->
<h2><sup>:ballot_box_with_check:&ensp;</sup>

  How Gradle Performes [Plugin](10-what-plugins-do.md) Build Logic
</h2>
<blockquote>
<span><!-- leave the next line blank -->

To use the build logic encapsulated in a [plugin](09-what-is-a-gradle-plugin.md),  
***[Gradle](01-what-is-gradle.md)*** needs to perform two steps:
1. ***resolve* the [plugin](09-what-is-a-gradle-plugin.md)**  which involves
   * finding its `jar` [plugin](09-what-is-a-gradle-plugin.md) file
   * adding the [plugin](09-what-is-a-gradle-plugin.md) to the script *classpath*  
Once a [plugin](09-what-is-a-gradle-plugin.md) is resolved, its API can be used in a build script.
     * ***Script [plugin](09-what-is-a-gradle-plugin.md)*** is self-resolving from the specific file path or URL when it is applied.
     * ***Core binary [plugin](09-what-is-a-gradle-plugin.md)*** as part of the ***[Gradle](01-what-is-gradle.md)*** distribution is resolved automatically.<br/>
2. `apply` the [plugin](09-what-is-a-gradle-plugin.md) to the Project
by `Plugin.apply(T)` method
which actually means executing the [plugin](09-what-is-a-gradle-plugin.md)
</span>
  <br/><br/>
</blockquote>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<p align="right"><a href="/../../#--------------questionfaq----------"><b>FAQ</b></a></p>