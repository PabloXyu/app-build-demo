![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<!-- The Gradle Settings File -->
<h2><sup>:ballot_box_with_check:&ensp;</sup>
  The Gradle <i>Settings</i> File
</h2>
<blockquote>
<span><!-- leave the next line blank -->

`settings.gradle` file, located in the root project directory,
defines project-level repository settings and tells ***[Gradle](01-what-is-gradle.md)***  
which modules it should include when building your app.<br/>
It includes two ***repository*** blocks:
</span>
  <details >
    <summary>
      <code>pluginManagement.repositories</code>
    </summary>
    <blockquote>
<span><!-- leave the next line blank -->

which configures the repositories
used by ***[Gradle](01-what-is-gradle.md)*** to search or download its [plugins](09-what-is-a-gradle-plugin.md)  
and their transitive dependencies.<br/>
***[Gradle](01-what-is-gradle.md)*** pre-configures support for remote repositories in the block.  
You can also use local repositories or define your own remote ones.<br/>
In android project repositories
 * `gradlePluginPortal()`,
 * `google()` (***Google's Maven***)
 * `mavenCentral()`
are those where ***[Gradle](01-what-is-gradle.md)*** should use to look for its dependencies.
</span>
  <br/><br/>
</blockquote>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<p align="right"><a href="/../../#--------------questionfaq----------"><b>FAQ</b></a></p>
