![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--3px blue line-->
<!-- Gradle Build Phases -->
<h2><sup>:ballot_box_with_check:&ensp;</sup>
  Gradle Build Phases
</h2>
<blockquote>
<span><!-- leave the next line blank -->

* **Initialization**  
***[Gradle](what-is-gradle.md)*** determines which modules are going to take part in the build,  
and creates a ***[Project](what-is-a-gradle-project.md)*** instance for each of modules.

* **Configuration**  
***[Project](what-is-a-gradle-project.md)*** tasks and objects are created and configured.  
All [module](the-module-level-build-file.md) build scripts  of the build are executed.

* **Execution**  
***[Gradle](what-is-gradle.md)*** determines the subset of tasks to be executed.  
The subset is determined by the task name arguments  
passed to the gradle command and the current directory.  
***[Gradle](what-is-gradle.md)*** then executes each of the selected tasks.
</span>
  <br/><br/>
</blockquote>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<p align="right"><a href="/../../#--------------questionfaq----------"><b>FAQ</b></a></p>
