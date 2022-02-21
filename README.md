<!-- "gradle-as" is a png picture of logos AS IDE, Android and Gradle together -->
![gradle-as](https://user-images.githubusercontent.com/26512179/132996456-1d7dd5df-2604-4131-82c0-4af6629ba04b.png)

# Gradle<sup>:elephant:</sup> Composite Build Demo Application
The purpose of the project is to extend my Android programming knowledge,  
showing my coding skills for job interview,  
and share my knowledge with other programmers  
for the benefit of this worldwide android-enthusiastic community.
<br/>
This is my first published repository.

This documentation includes also:
* ***Markdown*** editor plugin installation
* Useful Keyshorts & Mouse mappings
* `NamingStyleConversion` Kotlin utility class based on *RegEx*
<!-- fixme^ rather code not a doc ??? Wtf have I written about???-->
* <!--todo: ^ Kdoc description and this documentation in Markdown -->
* <!--todo: ^ Github Markdown extendended, tricks-->
* <!-- todo: Collapsible Paragraph Template: -->
* <!-- todo: FAQ Template: -->
* <!--todo: ^ implicit free Github commit access-->
* Basic *Gradle Build* terms and definitions
<!-- todo: add mouse scrolling -->
<!-- todo: add mouse scrolling info ???-->
<!-- todo : Toggle rendered view as default -->

This app code is written on [*Android Studio*](https://developer.android.com/studio#downloads) version
[*Arctic Fox IDE (2020.3.1, Patch 4)*](https://redirector.gvt1.com/edgedl/android/studio/install/2020.3.1.26/android-studio-2020.3.1.26-windows.exe).

<!-- TOP OF FAQ -->
![](https://via.placeholder.com/1024x3.png/0078D7/0078D7/text=+)<!--3px blue line-->
<!--details><!-- TOP OF FAQ -->
<details><!-- TOP OF FAQ -->
  <summary>
    <h2>
      <a class="anchor" id="faq">
        <sup>:question:&ensp;</sup>FAQ
      </a>
    </h2>
  </summary>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What is Gradle? -->
<details>
  <summary>
    <h3>
      <a class="anchor" id="gradle">
        <sup>:ballot_box_with_check:&ensp;</sup>What is Gradle?
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

***Gradle*** is an open-source build automation system  
that helps you manipulate the build process and its logic.
<br/>
When you build an app, it is ***Gradle*** that compiles  
all the code and creates an [***APK***](#apk) for you.
</span>
    <br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What is an APK file? -->
<details>
  <summary>
    <h3>
      <a class="anchor" id="apk">
        <sup>:ballot_box_with_check:&ensp;</sup>What is an <i>APK</i> file?
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

***APK*** stands for [***Android Package Kit***](https://whatis.techtarget.com/definition/APK-file-Android-Package-Kit-file-format)  
It's the file format that Android uses to distribute and install apps.  
As a result, `APK`s contain all the elements  
that an app needs to install correctly on the device.
</span>
    <br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What is JDK? -->
<details>
  <summary>
    <h3>
      <a class="anchor" id= "jdk">
        <sup>:ballot_box_with_check:&ensp;</sup>What is <b><i>JDK</i></b>
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

The [*Java Development Kit*](https://www.infoworld.com/article/3296360/what-is-the-jdk-introduction-to-the-java-development-kit.html)
 (***JDK***)
 is one of three core technology packages used in Java programming,  
along with the [***JVM*** - *Java Virtual Machine*](https://www.infoworld.com/article/3272244/what-is-the-jvm-introducing-the-java-virtual-machine.html)
 and the  
 [***JRE*** - *Java Runtime Environment*](https://www.infoworld.com/article/3304858/what-is-the-jre-introduction-to-the-java-runtime-environment.html)

* The [***JVM***](https://www.infoworld.com/article/3272244/what-is-the-jvm-introducing-the-java-virtual-machine.html)
is the Java platform component that executes programs.
* The [***JRE***](https://www.infoworld.com/article/3304858/what-is-the-jre-introduction-to-the-java-runtime-environment.html)
is the on-disk part of Java that creates the JVM.
* The [***JDK***](https://www.infoworld.com/article/3296360/what-is-the-jdk-introduction-to-the-java-development-kit.html)
allows developers to create Java programs that can be executed and run by the ***JVM*** and ***JRE***.
</span>
    <br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What is Kotlin DSL? -->
<details>
  <summary>
    <h3>
      <a class="anchor" id= "kotlin-dsl">
        <sup>:ballot_box_with_check:&ensp;</sup>What is Kotlin DSL?
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

Domain-specific languages, or DSLs, are languages specialized for a specific part of an app.  
It is used to extract a part of the code to make it reusable and more understandable.  
<br/>
As opposed to a function or a method, DSLs also change the way you use and write code.  
Usually, DSLs make the code more readable, almost like a spoken language.  
<br/>
This means that even people  
who don’t understand the architecture behind the code  
will be able to grasp the meaning of it.  
<br/>
***Kotlin DSL*** is used in [***Gradle***](gradle), alternatively to *Groovy*.  
Just like the *Groovy*-based equivalent,  ***Kotlin DSL*** is implemented on top of Gradle’s Java API.  
Everything you can read in a Kotlin DSL script is Kotlin code compiled and executed by Gradle.  
<br/>
Many of the objects, functions and properties you use in your build scripts  
come from the Gradle API and the APIs of the applied plugins.  
<br/>
To make a DSL means to change the syntax of that specific part of the code.  
In ***Kotlin***, this is achieved by using lambda, extension functions and expressions  
to remove a lot of boilerplate code and hide the internal implementation from the user.
</span>
    <br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!--  Kotlin DSL Pros -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "kotlin-dsl-pros">
        <sup>:ballot_box_with_check:&ensp;</sup><a href="#kotlin-dsl">Kotlin DSL</a>
      </a>
      Pros
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

 * Simplified plugins syntax
 * Default lazy task configuration
 * Compile time checks
 * Better IDE experience
 * It’s [Kotlin](#kotlin-dsl)!
</span>  
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What is a Gradle Project? -->
<details>
  <summary>
    <h3>
      <a class="anchor" id="project">
        <sup>:ballot_box_with_check:&ensp;</sup>What is a Gradle Project?
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

Every ***[Gradle](#gradle)*** [build](#build) is made up of one or more projects.  
A project does not necessarily represent a thing to be built.  
It might represent a thing to be done, such as deploying the application  
to staging or production environments.
</span>
    <br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- Gradle Build Phases -->
<details>
  <summary>
    <h3>
      <a class="anchor" id="build-phases">
         <sup>:ballot_box_with_check:&ensp;</sup>Gradle Build Phases
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

* **Initialization**  
***[Gradle](#gradle)*** determines which modules are going to take part in the build,  
and creates a ***[Project](#project)*** instance for each of modules.

* **Configuration**  
***[Project](#project)*** tasks and objects are created and configured.  
All module build scripts  of the build are executed.

* **Execution**  
***[Gradle](#gradle)*** determines the subset of tasks to be executed.  
The subset is determined by the task name arguments  
passed to the gradle command and the current directory.  
***[Gradle](#gradle)*** then executes each of the selected tasks.
</span>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What is a Gradle Task? -->
<details >
  <summary>
    <h3>
      <a class="anchor" id="task">
        <sup>:ballot_box_with_check:&ensp;</sup>What is a Gradle Task?
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

The work that ***[Gradle](#gradle)*** can do on a ***[Project](#project)***
is defined by one or more tasks.  
Typically, tasks are provided by applying a plugin  
so there is no need to define them yourself.  
A task represents some atomic piece of work which a ***[build](#build)*** performs.  
<br/>
This might be
* compiling some classes
* creating a *JAR*
* generating *Javadoc*
* publishing some archives to a repository.
</span>
    <br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What is a Gradle Plugin? -->
<details>
  <summary>
    <h3>
      <a class="anchor" id= "plugin">
        <sup>:ballot_box_with_check:&ensp;</sup>What is a Gradle Plugin?
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

***[Gradle](#gradle)*** at its core intentionally provides very little for real world automation.  
All of the useful features, like the ability to compile Java code, are added by plugins.  
<br/>
***Plugins*** add
* **new tasks** (e.g. *JavaCompile*)
* **domain objects** (e.g. *SourceSet*)
* **conventions** (e.g. Kotlin source is located at `src/main/kotlin`)  
as well as extending core objects and objects from other plugins.
</span>
    <br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What Plugins do -->
<details >
  <summary>
    <h3>
      <sup>:ballot_box_with_check:&ensp;</sup> What <a href="#plugin">Plugins</a> do
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

Applying a [plugin](#plugin) to a [project](#project) allows the [plugin](#plugin) to extend the [project](#project)’s capabilities.
<br/>
It can do things such as
* Extend the ***[Gradle](#gradle)*** model (e.g. add new *DSL* elements that can be configured)
* Configure the [project](#project) according to conventions (e.g. add new tasks or configure defaults)
* Apply specific configuration (e.g. enforce standards or add organizational repositories)
</span>
    <br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- Packaging a Plugin -->
<details >
  <summary>
    <h3>
        <sup>:ballot_box_with_check:&ensp;</sup> Packaging a <a href="#plugin">Plugin</a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

There are several places where you can put the source for the [plugin](#plugin):
* ***Build Script*** `build.gradle`
You can include the source for the plugin directly in the build script.  
This has the benefit that the [plugin](#plugin) is automatically compiled and included  
in the *classpath* of the build script without you having to do anything.<br/>  
However, the [plugin](#plugin) is not visible outside the build script,  
and cannot be reused outside the build script where it's defined.<br/>

* ***Build Source*** `buildSrc` ***module**
You can put the source for the [plugin](#plugin) in the `buildSrc/src/main/kotlin`.
*Gradle* will take care of compiling, testing and making
the [plugin](#plugin) available on the *classpath* of the build script.<br/>  
The [plugin](#plugin) is visible to every build script used by the build.
However, it is not visible outside the build,
and cannot be reused outside the build it is defined in.<br/>
* ***Standalone project***
It is possible to create a separate project for your [plugin](#plugin).
This project produces and publishes a `JAR`
which then can be used in multiple builds and share with others.<br/>
Generally, this `JAR` might include some [plugins](#plugin),
or bundle several related task classes into a single library.
</span>
    <br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- How Gradle Performes Plugin Build Logic -->
<details >
  <summary>
    <h3>
      <sup>:ballot_box_with_check:&ensp;</sup>
      How Gradle Performes Plugin <a href="#build">Build</a> Logic
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

To use the build logic encapsulated in a [plugin](#plugin),  
***[Gradle](#gradle)*** needs to perform two steps:
1. ***resolve* the [plugin](#plugin)**  which involves
   * finding its `jar` [plugin](#plugin) file
   * adding the [plugin](#plugin) to the script *classpath*  
Once a [plugin](#plugin) is resolved, its API can be used in a build script.
     * ***Script [plugin](#plugin)*** is self-resolving from the specific file path or URL when it is applied.
     * ***Core binary [plugin](#plugin)*** as part of the ***[Gradle](#gradle)*** distribution is resolved automatically.<br/>
2. `apply` the [plugin](#plugin) to the Project
by `Plugin.apply(T)` method
which actually means executing the [plugin](#plugin)
<br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- How a Plugin is Created -->
<details >
  <summary>
    <h3>
         <sup>:ballot_box_with_check:&ensp;</sup> How a <a href="#plugin">Plugin</a> is Created
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

You need to write a class that implements the [plugin](#plugin) interface.  
When the [plugin](#plugin) is applied to a project,  
***[Gradle](#gradle)*** creates an instance of the [plugin](#plugin) class  
and calls the instance’s `Plugin.apply(T)` method.
<br/>
The project object is passed as a parameter,  
which the [plugin](#plugin) can use to configure the project however it needs to.
</span>
<br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- How to Make the Plugin Configurable -->
<details >
  <summary>
    <h3>
      <sup>:ballot_box_with_check:&ensp;</sup>How to Make the <a href="#plugin">Plugin</a> Configurable
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

Most [plugins](#plugin) offer some configuration options for build scripts  
as well as for other [plugins](#plugin). By modifying [plugin](#plugin) configuration  
it is possible to customize how the [plugin](#plugin) works.
<br/>
[Plugins](#plugin) do this using ***extension objects***.  
The Project has an associated `ExtensionContainer` object  
that contains all the settings and properties for the [plugins](#plugin)  
that have been applied to the project.
<br/>
You can provide configuration for your [plugin](#plugin)  
by adding an extension object to this container.
</span>
<br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- Usage of Terms module & project -->
<details >
  <summary>
    <h3>
        <sup>:ballot_box_with_check:&ensp;</sup>
          <span>
            Usage of Terms <b><i>module</i></b> & <b><i>project</i></b>
          </span>
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

Although Google Android documentation uses term ***project*** and its ***modules***,  
***[Gradle](#gradle)*** documentation uses a term ***module***<sup>:blue_square:</sup> as ***project*** or ***subproject***.
<br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- The Gradle Settings File -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "settings-file">
        <sup>:ballot_box_with_check:&ensp;</sup> The Gradle <i>Settings</i> File
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

`settings.gradle` file, located in the root project directory,
defines project-level repository settings and tells ***[Gradle](#gradle)***  
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
used by ***[Gradle](#gradle)*** to search or download its [plugins](#plugin)  
and their transitive dependencies.<br/>
***[Gradle](#gradle)*** pre-configures support for remote repositories in the block.  
You can also use local repositories or define your own remote ones.<br/>
In android project repositories
 * `gradlePluginPortal()`,
 * `google()` (***Google's Maven***)
 * `mavenCentral()`
are those where ***[Gradle](#gradle)*** should use to look for its dependencies.
</span>
      <br/><br/>
    </blockquote>
    </details>
    <details >
      <summary>
        <code>dependencyResolutionManagement.repositories</code>
      </summary>
      <blockquote>
<span><!-- leave the next line blank -->

is where you configure the repositories and dependencies  
used by all modules in your project, such as libraries  
that you are using to create your application.
<br/>
However, you should configure module-specific dependencies  
in each module-level `build.gradle` file.
<br/>
***Android Studio*** for new projects includes
* ***Google's Maven***
* ***Maven Central***
repositories by default, but it does not configure any dependencies.
</span>
       <br/><br/>
     </blockquote>
   </details>
  <br/>
</blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- The Top-level Build File -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "top-level-build">
        <sup>:ballot_box_with_check:&ensp;</sup>The Top-level <b><i>Build File</i></b>
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

The [***top-level*** `build.gradle`](https://developer.android.com/studio/build#top-level)
file, located in the root project directory,  
defines dependencies that apply to all modules in the project.
<br/>
By default, the top-level build file uses the [`plugins{}`](#plugin) block  
to define the *[Gradle](#gradle)* dependencies  
that are common to all modules in the project.
<br/>
In addition, the top-level build file contains code to clean your build directory.  
The following code sample describes the default settings  
and *DSL* elements you can find in the top-level `build.gradle` file after creating a new project.
<span>
<br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- The module-level build file -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "module-level-build">
        <sup>:ballot_box_with_check:&ensp;</sup>The Module-level <b><i>Build File</i></b>
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

[TODO: REPLACE THE CONTENT!](https://www.google.com/search?q=what+is+the+meaning+of+life%3F)<!--TODO: REPLACE THE CONTENT!-->
</span>  
    <br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What is Build Source Module -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "build-source-module">
        <sup>:ballot_box_with_check:&ensp;</sup>What is <b><i>Build Source</i></b>
        <sup><code>buildSrc</code></sup> Module
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

***Build Source*** is a module at the project root directory,  
which contains build logic. This allows us to use the [Kotlin DSL](#kotlin-dsl)  
to write custom build code with very little configuration  
and share this logic across the whole project.<br/>

The module directory `buildSrc` is treated as an included build.  
Upon discovery of the directory, ***[Gradle](#gradle)*** automatically compiles and tests  
the code and puts it in the ***classpath*** of the build script.<br/>

There can be only one `buildSrc` directory for multi-project builds.  
`buildSrc` should be preferred over script [plugins](#plugin)  
as it is easier to maintain, refactor, and test the code.<br/>

The source directory for the [plugin](#plugin) should be in root  
`/buildSrc/src/main/kotlin` directory.  
***[Gradle](#gradle)*** will take care of compiling and testing the plugin  
and making it available on the `classpath` of the build script.  
The [plugin](#plugin) is visible to every build script used by the build.<br/>  
However, it is not visible outside the build,  
and it is not possible to reuse the plugin outside the build.
<span>
    <br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What is an Artifact Repository? -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "artifact-repository">
        <sup>:ballot_box_with_check:&ensp;</sup>What is an Artifact Repository?
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

An artifact repository stores build artifacts  
produced by continuous integration and makes them available  
for automated deployment to testing, staging, and production environments.  
<br/>
Build artifacts are the files created by the build process, such as distribution packages.  
</span>
    <br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What is buildscript{} block -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "buildscript-block">
        <sup>:ballot_box_with_check:&ensp;</sup>What is <code>buildscript{}</code> block
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

The `buildscript{}` block is where you configure  
the repositories and dependencies for ***[Gradle](#gradle)*** itself.  
It means that you should not include dependencies for your modules here.
<br/>
For example, a block may include  
the ***Android Gradle*** ***[Plugin](#plugin)*** (***AGP***) as a dependency,  
because it provides the additional instructions  
that ***[Gradle](#gradle)*** needs to build Android app modules.
<br/>
The `buildscript{}` block is for the `build.gradle` itself.  
So, if buildscript itself needs something to run,  
use `classpath` configuration.
</span>
    <br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What is repositories{} block -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "repositories-block">
        <sup>:ballot_box_with_check:&ensp;</sup>What is <code>repositories{}</code> block
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

`repositories{}` block is for declaring repositories.  
Instead of declaring repositories in every module of your build  
or via an `allprojects` block in root `~/build.gardle` file,  
*Gradle* offers a way to declare them in a central place for entire build.
<br/>
Repositories used by convention by every module  
can be declared in the root `~/settings.gradle` file  
in `dependencyResolutionManagement` block  
which ***[Gradle](#gradle)*** uses to search or download the dependencies.
</span>
    <br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- Management of Dependencies -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "dependency-management">
        <sup>:ballot_box_with_check:&ensp;</sup>Management of <code>dependencies{}</code>
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

Gradle build script defines a process to build projects.  
Each project contains some dependencies.  
Dependencies refer to the things that supports in building your project,  
such as required JAR file from other projects and external JARs.  
<br/>
All the projects are not self-contained.  
They need files which are built by the other projects  
to compile and test the source files.  
<br/>
Gradle uses build scripts to define the dependencies, which needs to be downloaded.  
<br/>
Gradle also can handle building and publishing the outcomes.  
Publishing is based on the task that you define.  
<br/>  
It might want to copy the files to local directory,  
or upload them to a remote repository  
or you might use the files from another project  
in the same multi-project build.  
<br/>
We can call the process of publishing a task as *publication*.  
Dependency configuration defines a set of dependencies.  
You can use this feature to declare external dependencies,  
which you want to download from the web.
</span>
    <br/><br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- Configurations of dependencies{}: classpath() & implementation() -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "dependency-configuration">
        <sup>:ballot_box_with_check:&ensp;</sup>
          <span>
            Configurations of <code>dependencies{}</code>:
            <div>&emsp;&emsp;<code>classpath()</code> &#38;
              <code>implementation()</code><div>
          </span>
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

A `Configuration` represents a group of artifacts and their dependencies.  
<br/>
When you’re building and running a *Java* project there are two *classpaths* involved:
* ***Compile classpath*** – this is a list of dependencies that are required for the [***JDK***](#jdk) to be able to compile Java code into .class files
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

The `classpath()` configuration is commonly seen in the [***Build Source***](#build-source-module) `buildSrc` module  
where one needs to declare dependencies for the top-level `build.gradle` itself.  
<br/>
This configuration includes:
* AGP plugin
* Kotlin plugin<br/>
</span>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- What is kotlin-bom "dependency"? -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "kotlin-bom">
        <sup>:ballot_box_with_check:&ensp;</sup>What is <code>kotlin-bom</code> "dependency"?
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

Software bill of materials (BOMs) **DO NOT** specify a dependency on a module or file,  
but instead are a list of version constraints for other components.  
They define what is called a platform, which is basically a list of components  
with specific versions that are known to play well together.  
<br/>
It’s worth mentioning that not all of the dependencies listed in the BOM  
actually have to be included in your projects — it’s basically a way of saying:  
***If you use any of these modules, use this version***.  
<br/>
Including a specific version of the ***Kotlin BOM*** prescribes the same version  
for “built-in” Kotlin libraries such as `stdlib`, `reflection`, `annotations` and the like.  
<br/>
It saves us from having to type out the version for every such Kotlin dependency,  
and makes sure we don’t accidentally import different versions of components.
</span>
    <br/><br/>
  </blockquote>
</details>

<!--todo: Composite Build -->

<!--TOP OF FAQ QUESTION TEMPLATE-->

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!-- Template: What is the meaning of life? -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "faq-template">
        <sup>:ballot_box_with_check:&ensp;</sup>What is the meaning of <code>life</code>?
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

[TODO: REPLACE THE CONTENT!](https://www.google.com/search?q=what+is+the+meaning+of+life%3F)<!--TODO: REPLACE THE CONTENT!-->
</span>  
    <br/>
  </blockquote>
</details>

</details><!-- ^BOTTOM OF FAQ -->
<!-- ^BOTTOM OF FAQ QUESTION TEMPLATE-->

<!-- TOP OF PRELIMINARY WORK -->
![](https://via.placeholder.com/1024x3.png/0078D7/0078D7/text=+)<!--3px blue line-->
<!-- TOP OF PRELIMINARY WORK -->
<details>
  <summary>
    <h2> <a class="anchor" id="preliminary-work"> Preliminary Work<sup>:hammer:</sup> </a> </h2>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

* start *New empty project* by *Phone & Tablet* template with *No Activity* option.
* use the same name `composite-build-demo` for application name and its location directory.
* create package name `com.example.demo`.
* *Version Control*: make *Initial Commit*: (*GitHub*: [`~/composite-build-demo`](https://github.com/PabloXyu/composite-build-demo)).
* update `gradle.properties` to [multi-module](#multi-module-build) project.
* in `~/.gitignore` add lines `/.idea/name` & `/.idea/vcs.xml`, `/gradle`.
* extend `settings.gradle`, `build.gradle`, `:app:build.gradle` files to [`*.kts`](https://docs.gradle.org/current/userguide/kotlin***dsl.html#sec:scripts).
* with those *Gradle* files [migrate from *Groovy* to *Kotlin DSL*](https://developer.android.com/studio/build/migrate-to-kts).
* in `settings.gradle`add ***Gradle [Plugin](#plugin) Portal*** repository.
* in root `build.gradle` add snippet to enable *Kotlin Source Root* for each module.
* in `app:build.gradle` update *JVM* & `compileOptions` to *Java* version *11*.
* set *compileSdk* & *targetSdk* to level *31*.
* set *Target JVM* (*IDE Kotlin Compiler* option) to version *11*.
* update `app:src\main\AndroidManifest.xml` file adding `android:fullBackupContent="@xml/app_backup_rules`.
* in `AndroidManifest` refactor *theme* to camel case (e.g. `Compositebuilddemo` to `CompositeBuildDemo`).
* add `app_backup_rules.xml` file to *App* module resources in `/src/main/res/xml`.
* [Markdown editor installation & setup](#markdown-editor)<sup>:bangbang:</sup> (optional)
* add `README.md` file in root directory.
* [rebuild](#rebuild) the project.
* Version Control: generate a personal [***Github access token***](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token).
* Version Control: make first [***Push Request***](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests).
</span>
</details><!-- ^BOTTOM OF PRELIMINARY WORK -->
<!-- ^BOTTOM OF PRELIMINARY WORK -->

---
## Adding ***Build Source*** `buildSrc` & ***Build*** ***Plugin*** `buildPlg` modules<sup>:blue_square:</sup>
* create directory for module `:buildSrc` (***Build Source***) with file `build.gradle.kts` including repos.
* in `buildSrc:build.gradle` include `kotlin-dsl` plugin and the same repos as in root build file.
* create `src/main/kotlin` directory and mark it  as *Sources Root* (blue color).
* In *Kotlin Sources Root* create `util` package with Kotlin file.
* create directory for module `:buildPlg` (Source ***Build***) with file `build.gradle` including repos.
* in `buildPlg:build.gradle` include `kotlin-dsl` plugin and the same repos as in root build file.
* create `buildPlg:settings.gradle` file with `pluginManagement{}` block including repos.
* add `includeBuild("buildPlg")` in root `:settings.gradle`.
<br/><br/>
* although [`RepositoriesMode`](https://docs.gradle.org/current/userguide/declaring_repositories.html#sub:centralized-repository-declaration) in `:settings.gradle` is marked as unstable and generates warnings, ignore it:
    * ***Settings…*** **:** select ***Editor*** **>** ***Inspections***
    * select ***Android*** **>** ***Lint*** **>** ***Correctness***
    * uncheck ***Obsolete Gradle Dependency*** (available for ***Analyse***|***Inspect Code***)
    * ***Inspect Code***, exclude warnings in `:settings.gradle`
    * this should insert `@file:Suppress("UnstableApiUsage")` at the top of the file
<br/><br/>
* [rebuild](#rebuild) the project.
<span><!-- leave the next line blank -->

![](https://via.placeholder.com/1024x3.png/0078D7/0078D7/text=+)<!--3px blue line-->
<!-- BOTTOM OF ADDING MODULES -->
</span><!-- BOTTOM OF OF ADDING MODULES -->

## <a name="rebuild"></a>Testing<sup>:test_tube:</sup> the ***Build*** Process From the Scratch
<!-- TODO: write: uncheck/unhide build tasks show in experimental options-->
1. delete root project directories marked orange:
    * `~/.gradle`
    * `~/build`
2. delete all module directories marked orange, if exist:
    * `~/[MODULE_NAME]/.gradle`
    * `~/[MODULE_NAME]/build`
3. In case of major compilation problems:
    * delete also `~/.idea` directory
4. Restart Android Studio IDE with cache invalidation:
    * open *Main Menu* **:** *File* **|** [*Invalidate Cashes/Restart…*](#useful-keyboard-shortcuts)
5. In case of critical compilation problems:
    * delete the all directories mentioned in ***1-3***
    * exit *Android Studio IDE*
    * delete all files in `%USERNAME%\.gradle\caches` directory (*Win10*).
    * run *Android Studio IDE*
6. Be careful not to delete wrong dirs & files!
---
## ***Android Gradle Plugin*** *7.02* release:
* build cache is removed
    * no `cleanBuildCache` task
    * no `android.enableBuildCache`  property
    * no `android.buildCacheDir`  property
* dependency configuration removed:
    * no `compile` & `…Compile` variants
    * no `provided` & `…Provided` variants
    * no `apk`
    * no `publish`
---
## Android Studio Useful Shortcut Keys
open *Main Menu* **:** *File* **:** *Settings* **|** *KeyMap*.
1. Android Studio Restart
    * select *Main Menu* **>** *File* **>** [*Invalidate Cashes/Restart…*](#useful-keyboard-shortcuts)
    * *Add Keyboard Shortcut*: `[CTRL]`+`[ALT]`+`R`
    * *Add Mouse Shortcut*: `[CTRL]`+`[Middle Click]`
2. Refactor/Rename
    * select *Main Menu* **>** *Refactor* **>** *Rename*
    * *Add Mouse Shortcut*: `[SHIFT]`+`[Click]` (left click)
3. Show Local History
    * select *Main Menu* **>** *File* **>** *Local History* **>** *Show History*
    * *Add Keyboard Shortcut*: `[CTRL]`+`[ALT]`+`/`
    * *Add Mouse Shortcut*: `[CTRL]`+`[DoubleClick]`
----
##  <a name="Settings…"></a>Useful Keyboard Shortcuts

|DEFAULT    | KEYMAP KEYS          |MOUSEMAP                 |ACTION                    |
|:---------:|:---------------------|:------------------------|:-------------------------|
|yes        |`[CTRL]`+`[SHIFT]`+`/`|                         |Comment with Block Comment|
|yes        |`[SHIFT]`+`[ESC]`     |                         |Hide Window               |
|yes        |`[CTRL]`+`[SHIFT]`+`J`|                         |Join Lines                |
|keymap only|`[SHIFT]`+`[F6]`      |`[SHIFT]`+`[Click]`      |Refactor > Rename         |
|yes        |`[CTRL]`+`[ALT]`+`L`  |                         |Reformat code             |
|yes        |`[CTRL]`+`[ALT]`+`O`  |                         |Remove Unused Imports     |
|no         |`[CTRL]`+`[ALT]`+`R`  |`[CTRL]`+`[Middle-Click]`|Invalidate Caches/Restart…|
|yes        |`[CTRL]`+`[ALT]`+`S`  |                         |Settings…                 |
|no         |`[CTRL]`+`[ALT]`+`/`  |`[CTRL]`+`[DoubleClick]` |Show Local History        |
|yes        |`[CTRL]`+`[SHIFT]`+`U`|                         |Toggle Case               |

<!-- TOP OF MARKDOWN INSTALLATION -->
<span><!-- leave the next line blank -->

![](https://via.placeholder.com/1024x3.png/0078D7/0078D7/text=+)<!--3px blue line-->
</span>
<details><!--  LEV1: Markdown editor installation & setup -->
  <summary>
    <h2>
      <a class="anchor" id= "markdown-install">
      <i>Markdown </i>editor installation &#38; setup<sup>&ensp;:bangbang:</sup>
      </a>
    </h2>
  </summary>
  <blockquote>
    <ul>
      <li><!--  LEV2: install Markdown Navigator plugin -->
        <details>
          <summary>
            install <b><i>Markdown Navigator</i></b> plugin
          </summary>
          <ul><!-- LEV2 LIST ITEMS: #1-5 -->
<span><!-- leave the next line blank -->

* download [*Markdown Navigator Enhanced*](https://vladsch.com/product/markdown-navigator) plugin, e.g. version [*3.0.202.112*](https://plugins.jetbrains.com/plugin/download?rel=true&updateId=97563)
* select ***Main Menu*** **|** ***File*** **|** [***Settings…***](#useful-keyboard-shortcuts)
* select ***Plugins***
* in ***Plugins*** window menu select from :gear:<sup>***Settings***</sup> list: ***Install Plugin from Disk…***
* restart IDE
</span>
          </ul><!--^LEV2 LIST ITEMS: #1-5 -->
        </details>
      </li><!--^LEV2: install Markdown Navigator plugin -->
      <li><!--  LEV2: set up Markdown editor -->
        <details>
          <summary>
            set up <b><i>Markdown</i></b> editor
          </summary>
          <ul><!-- LEV2 LIST ITEM: #1 -->
<span><!-- leave the next line blank -->

* select ***Main Menu*** | ***File*** | [***Settings…***](#useful-keyboard-shortcuts)
<br/>
</span>
          </ul><!--^LEV2 LIST ITEM: #1 -->
          <ul><ul>
            <li><!--  LEV3: disable Markdown warnings -->
              <details>
                <summary>
                  disable <i>Markdown</i> warnings
                </summary>
                <ul><!--  LEV3 LIST ITEM: #1 -->
<span><!-- leave the next line blank -->

* select ***Editor*** **>** ***Inspections*** window
<br/>
</span>
                </ul><!--^LEV3 LIST ITEM: #1 -->
                <ul><ul>
                  <li>
                    <details><!--  LEV4: disable Markdown Non-ASCII characters warnings -->
                      <summary>
                        disable <i>Markdown</i> <b><i>Non-ASCII characters</b></i> warnings
                      </summary>
                      <ul><!--  LEV4 LIST ITEMS: #1-5 -->
<span><!-- leave the next line blank -->

* select ***Internationalization*** **>** ***Non-ASCII characters***
* ***Severity:*** select from ***In All Scopes*** list ***Project Non-Source Files***
* in ***Severity by Scope*** select ***Project Non-Source Files***
* in ***Options, Warn of:*** unselect all warning
*  ***Apply*** changes->
</span>
                      <ul><!--  LEV4 LIST ITEMS: #1-5 -->
                    </details><!--^LEV4: disable Markdown Non-ASCII characters warnings -->
                  </li>
                  <li>
                    <details><!--  LEV4: disable other Markdown warnings -->
                      <summary>
                        disable other <i>Markdown </i> warnings
                      </summary>
                      <ul><!--  LEV4 LIST ITEMS: #1-3 -->
<span><!-- leave the next line blank -->

* select ***Markdown*** **>** ***Reference Issues***
* uncheck ***Link text does not match heading***
* uncheck ***Validate emoji shortcuts***
</span>
                      <ul><!--  LEV4 LIST ITEMS: #1-3 -->
                    </details><!--^LEV4: disable other Markdown warnings -->
                  </li>
                </ul></ul>
              </details>
            </li><!--^LEV3: disable Markdown warnings -->
            <li><!--  LEV3: set Markdown document icon -->
              <details>
                <summary>
                  set <i>Markdown</i> document icon
                </summary>
                <ul><!--  LEV3 LIST ITEMS: #1-3 -->
<span><!-- leave the next line blank -->

* select ***Languages & Frameworks*** **>** ***Markdown*** window
* in ***Application Settings*** **|** ***Project View*** sub-window set ***Document Icon*** to ***Markdown***
* ***Apply*** changes
</span>
                <ul><!--  LEV3 LIST ITEMS: #1-3 -->
              </details>
            </li><!--^LEV3: set Markdown document icon -->
            <li><!--  LEV3: disable Link Anchor error messages -->
              <details>
                <summary>
                  disable <b><i>Link Anchor</i></b> error messages
                </summary>
                <ul><!--  LEV3 LIST ITEMS: #1-4 -->
<span><!-- leave the next line blank -->

* select ***Languages & Frameworks*** **>** ***Markdown*** **>** ***Annotator***
* select ***Link Anchors*** tab
* uncheck ***Anchor reference id is not resolved***
* ***Apply*** changes
</span>
                <ul><!--  LEV3 LIST ITEMS: #1-4 -->
              </details>
            </li><!--^LEV3: disable Link Anchor error messages -->
          </ul></ul>
        </details>
      </li><!--^LEV2: set up Markdown editor -->
    </ul>
  <br/>
  </blockquote>
</details><!--^LEV1: Markdown editor installation & setup -->
<span>

<!-- BOTTOM OF MARKDOWN INSTALLATION -->
![](https://via.placeholder.com/1024x3.png/0078D7/0078D7/text=+)<!--3px blue line-->
<!-- BOTTOM OF MARKDOWN INSTALLATION -->
</span>

## How to have access to commit history with free Github?
There is no explicit option in free version of Github to find commit history.
>
Here is an implicit way how to achieve that:
* go to your repository main page `https://github.com/[USERNAME]/[REPOSITORY_NAME]`
* add `https://github.com/[USERNAME]/[REPOSITORY_NAME]/commits`
* or `https://github.com/[USERNAME]/[REPOSITORY_NAME]/commit`
>
<!-- TOP OF TEMPLATE PARAGRAPH & CODE-->
---
## Collapsible Paragraph Template:
#### Github Markdown generated code, template includes 3px blue line on top:
<span><!-- leave the next line blank -->

![](https://via.placeholder.com/1024x3.png/0078D7/0078D7/text=+)<!--3px blue line-->
</span>
<details>
  <summary>
    <h3>
      <a class="anchor" id= "collapsible-paragraph-template">
        <sup>:ballot_box_with_check:&ensp;</sup>
          <span>
            REPLACE
              <div>&emsp;&emsp;this entire<div>
              <a href="#collapsible-paragraph-template">
                <div>&emsp;&emsp;html code line</div>
              </a>&emsp;&emsp;starting from <code>&#x276C;span&#x276D;</code> tag!!!
          </span>
      </a>
    </h3>
  </summary>
<span><!-- leave the next line blank -->

> OVERRITE ENTIRE LINE BY MARKDOWN BLOCKQUOTED `>`[CONTENT](#header-link) !!!
><br/><!--KEEP BLOCKQUOTE IN THE CONTENT ^ABOVE-->
<span>
</details>
<!-- BOTTOM -->

#### [***Github Markdown***](#markdown-install) Code:
```html
<span><!-- leave the next line blank -->

![](https://via.placeholder.com/1024x3.png/0078D7/0078D7/text=+)<!--3px blue line-->
</span>
<details>
  <summary>
    <h3>
      <a class="anchor" id= "collapsible-paragraph-template">
        <sup>:ballot_box_with_check:&ensp;</sup>
          <span>
            REPLACE
              <div>&emsp;&emsp;this entire<div>
              <a href="#collapsible-paragraph-template">
                <div>&emsp;&emsp;html code line</div>
              </a>&emsp;&emsp;starting from <code>&#x276C;span&#x276D;</code> tag!!!
          </span>
      </a>
    </h3>
  </summary>
<span><!-- leave the next line blank -->

> OVERRITE ENTIRE LINE BY MARKDOWN BLOCKQUOTED `>`[CONTENT](#header-link) !!!
><br/><!--KEEP BLOCKQUOTE IN THE CONTENT ^ABOVE-->
<span>
</details>
```
<!-- ^BOTTOM OF TEMPLATE CODE PARAGRAPH & CODE-->

---
### Collapsible Question Template
#### Github Markdown generated code, template includes 1px blue line @the bottom:
<!--TOP OF FAQ QUESTION TEMPLATE-->
<!-- Template: What is the meaning of life? -->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "faq-template">
        <sup>:ballot_box_with_check:&ensp;</sup>What is the meaning of <code>life</code>?
      </a>
    </h3>
  </summary>
  <blockquote>

[TODO: REPLACE THE CONTENT!](https://www.google.com/search?q=what+is+the+meaning+of+life%3F)<!--TODO: REPLACE THE CONTENT!-->
    <br/>
  </blockquote>
</details>

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
<!--END OF FAQ QUESTION TEMPLATE-->
<!-- BOTTOM -->

#### [***Github Markdown***](#markdown-install) Code:
```html
<details >
  <summary>
    <h3>
      <a class="anchor" id= "faq-template">
        <sup>:ballot_box_with_check:&ensp;</sup>What is the meaning of <code>life</code>?
      </a>
    </h3>
  </summary>
  <blockquote>
<span><!-- leave the next line blank -->

[TODO: REPLACE THE CONTENT!](https://www.google.com/search?q=what+is+the+meaning+of+life%3F)<!--TODO: REPLACE THE CONTENT!-->
</span>  
    <br/>
  </blockquote>
</details>
<span><-- leave the next line blank -->

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--blue line-->
</span>
```
<!-- ^BOTTOM OF FAQ QUESTION TEMPLATE AND CODE-->
