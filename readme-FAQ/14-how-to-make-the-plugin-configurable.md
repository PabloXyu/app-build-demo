![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<!-- How to Make the Plugin Configurable -->
<h2><sup>:ballot_box_with_check:&ensp;</sup>

  How to Make the [Plugin](09-what-is-a-gradle-plugin.md) Configurable
</h2>
<blockquote>
<span><!-- leave the next line blank -->

Most [plugins](09-what-is-a-gradle-plugin.md) offer some configuration options for build scripts  
as well as for other [plugins](09-what-is-a-gradle-plugin.md). By modifying [plugin](09-what-is-a-gradle-plugin.md) configuration  
it is possible to customize how the [plugin](09-what-is-a-gradle-plugin.md) works.
<br/>
[Plugins](09-what-is-a-gradle-plugin.md) do this using ***extension objects***.  
The Project has an associated `ExtensionContainer` object  
that contains all the settings and properties for the [plugins](09-what-is-a-gradle-plugin.md)  
that have been applied to the project.
<br/>
You can provide configuration for your [plugin](09-what-is-a-gradle-plugin.md)  
by adding an extension object to this container.
</span>
  <br/><br/>
</blockquote>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<p align="right"><a href="/../../#--------------questionfaq----------"><b>FAQ</b></a></p>