![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<!-- How a Plugin is Created -->
<h2><sup>:ballot_box_with_check:&ensp;</sup>

  How a [Plugin](09-what-is-a-gradle-plugin.md) is Created
</h2>
<blockquote>
<span><!-- leave the next line blank -->

You need to write a class that implements the [plugin](09-what-is-a-gradle-plugin.md) interface.  
When the [plugin](09-what-is-a-gradle-plugin.md) is applied to a project,  
***[Gradle](01-what-is-gradle.md)*** creates an instance of the [plugin](09-what-is-a-gradle-plugin.md) class  
and calls the instance’s `Plugin.apply(T)` method.
<br/>
The project object is passed as a parameter,  
which the [plugin](09-what-is-a-gradle-plugin.md) can use to configure the project however it needs to.
</span>
  <br/><br/>
</blockquote>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<p align="right"><a href="/../../#--------------questionfaq----------"><b>FAQ</b></a></p>
