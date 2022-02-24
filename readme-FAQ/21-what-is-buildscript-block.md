![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<!-- What is buildscript{} block -->
<h2><sup>:ballot_box_with_check:&ensp;</sup>
  What is <code>buildscript{}</code> block
</h2>
<blockquote>
<span><!-- leave the next line blank -->

The `buildscript{}` block is where you configure  
the repositories and dependencies for ***[Gradle](01-what-is-gradle.md)*** itself.  
It means that you should not include dependencies for your modules here.
<br/>
For example, a block may include  
the ***Android Gradle*** ***[Plugin](09-what-is-a-gradle-plugin.md)*** (***AGP***) as a dependency,  
because it provides the additional instructions  
that ***[Gradle](01-what-is-gradle.md)*** needs to build Android app modules.
<br/>
The `buildscript{}` block is for the `build.gradle` itself.  
So, if buildscript itself needs something to run,  
use `classpath` configuration.
</span>
  <br/><br/>
</blockquote>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<p align="right"><a href="/../../#--------------questionfaq----------"><b>FAQ</b></a></p>
