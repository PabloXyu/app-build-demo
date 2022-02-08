<!-- "gradle-as" is a png picture of logos AS IDE, Android and Gradle together -->
![gradle-as](https://user-images.githubusercontent.com/26512179/132996456-1d7dd5df-2604-4131-82c0-4af6629ba04b.png)

# Gradle<sup>🐘</sup> Composite Build Demo Application
The purpose of the project is to extend my Android programming knowledge,  
showing my coding skills for job interview,  
and share my knowledge with other programmers  
for the benefit of this worldwide android-enthusiastic community.
<br></br>
This is my first published repository.

This documentation includes also:
* ***Markdown*** editor plugin installation
* Useful Keyshorts & Mouse mappings
* `NamingStyleConversion` Kotlin utility class based on *RegEx*
* <!--todo: ^ description -->
* Basic *Gradle Build* terms and definitions

This app code is written on [*Android Studio*](https://developer.android.com/studio#downloads) version
[*Arctic Fox IDE (2020.3.1, Patch 4)*](https://redirector.gvt1.com/edgedl/android/studio/install/2020.3.1.26/android-studio-2020.3.1.26-windows.exe).

### <sup>☑ </sup> What is Gradle?
> _Gradle_ is an open-source build automation system  
> that helps you manipulate the build process and its logic.
><br></br>
> When you build an app, it is _Gradle_ that compiles  
> all the code and creates an APK for you.
<br></br>
### <sup>☑ </sup> What is an `APK` file?
> APK stands for ***Android Package Kit***  
> It's the file format that Android uses to distribute and install apps.  
> As a result, `APK`s contain all the elements  
> that an app needs to install correctly on the device.
<br></br>
### <sup>☑ </sup> What is a Gradle Project?
> Every _Gradle_ build is made up of one or more projects.  
> A project does not necessarily represent a thing to be built.  
> It might represent a thing to be done, such as deploying the application  
> to staging or production environments.
<br></br>
### <sup>☑ </sup> Gradle build phases
> * **Initialization**  
> Gradle determines which modules are going to take part in the build,  
> and creates a Project instance for each of modules.
> * **Configuration**  
> Project tasks and objects are created and configured.  
> All module build scripts  of the build are executed.
> * **Execution**  
> Gradle determines the subset of tasks to be executed.  
> The subset is determined by the task name arguments  
> passed to the gradle command and the current directory.  
> Gradle then executes each of the selected tasks.
<br></br>
### <sup>☑ </sup> What is a Gradle Task?
> The work that _Gradle_ can do on a project is defined by one or more tasks.  
> Typically, tasks are provided by applying a plugin  
> so there is no need to define them yourself.  
> A task represents some atomic piece of work which a build performs.
><br></br>
> This might be
> * compiling some classes
> * creating a *JAR*
> * generating *Javadoc*
> * publishing some archives to a repository.
<br></br>
### <sup>☑ </sup> What is a Gradle Plugin?
> _Gradle_ at its core intentionally provides very little for real world automation.  
> All of the useful features, like the ability to compile Java code, are added by plugins.
><br></br>
> Plugins add
> * **new tasks** (e.g. *JavaCompile*)
> * **domain objects** (e.g. *SourceSet*)
> * **conventions** (e.g. Kotlin source is located at `src/main/kotlin`)  
> as well as extending core objects and objects from other plugins.
<br></br>
### <sup>☑ </sup>  What plugins do
> Applying a plugin to a project allows the plugin to extend the project’s capabilities.
><br></br>
> It can do things such as
> * Extend the _Gradle_ model (e.g. add new *DSL* elements that can be configured)
> * Configure the project according to conventions (e.g. add new tasks or configure defaults)
> * Apply specific configuration (e.g. enforce standards or add organizational repositories)
<br></br>
### <sup>☑ </sup>  Packaging a plugin
> There are several places where you can put the source for the plugin:
> * ***Build Script*** `build.gradle`
> You can include the source for the plugin directly in the build script.  
> This has the benefit that the plugin is automatically compiled and included  
> in the *classpath* of the build script without you having to do anything.
> <br></br>
> However, the plugin is not visible outside the build script,  
> and cannot be reused outside the build script where it's defined.
> <br></br>
> * **Build Source `buildSrc` module**  
> You can put the source for the plugin in the `buildSrc/src/main/kotlin`.  
> *Gradle* will take care of compiling, testing and making  
> the plugin available on the *classpath* of the build script.
> <br></br>
> The plugin is visible to every build script used by the build.  
> However, it is not visible outside the build,  
> and cannot be reused outside the build it is defined in.
> <br></br>
> * ***Standalone project***  
> It is possible to create a separate project for your plugin.  
> This project produces and publishes a `JAR`  
> which then can be used in multiple builds and share with others.
> <br></br>
> Generally, this `JAR` might include some plugins,  
> or bundle several related task classes into a single library.
<br></br>
### <sup>☑ </sup>  How Gradle performes plugin build logic
> To use the build logic encapsulated in a plugin,  
> _Gradle_ needs to perform two steps:
> 1. ***resolve* the plugin**  which involves
>    * finding its `jar` plugin file
>    * adding the plugin to the script *classpath*  
> Once a plugin is resolved, its API can be used in a build script.
>      * ***Script plugin*** is self-resolving from the specific file path or URL when it is applied.
>      * ***Core binary plugin*** as part of the _Gradle_ distribution is resolved automatically.
> <br></br>
> 2. `apply` the plugin to the Project  
> by `Plugin.apply(T)` method  
> which actually means executing the plugin
<br></br>
### <sup>☑ </sup> How a plugin is created?
> You need to write a class that implements the plugin interface.  
> When the plugin is applied to a project,  
> _Gradle_ creates an instance of the plugin class  
> and calls the instance’s `Plugin.apply(T)` method.
><br></br>
> The _project object_ is passed as a parameter,  
> which the plugin can use to configure the project however it needs to.
<br></br>
### <sup>☑ </sup> How to make the plugin configurable?
> Most plugins offer some configuration options for build scripts  
> as well as for other plugins. By modifying plugin configuration  
> it is possible to customize how the plugin works.
><br></br>
> Plugins do this using _extension objects_.  
> The Project has an associated `ExtensionContainer` object  
> that contains all the settings and properties for the plugins  
> that have been applied to the project.
><br></br>
> You can provide configuration for your plugin  
> by adding an extension object to this container.
<br></br>
### <sup>☑ </sup> Usage of terms *module* & *project*
> Although Google Android documentation uses term *project* and its *modules*,  
> _Gradle_ documentation uses a term *module* as *project* or *subproject*.

> <br></br>
### <sup>☑ </sup> The Gradle Settings file
> `settings.gradle` file, located in the root project directory,  
> defines project-level repository settings and tells Gradle  
> which modules it should include when building your app.
> <br></br>
> It includes two ***repository*** blocks:
>
> 1. `pluginManagement.repositories` block  
>    which configures the repositories  
>    used by _Gradle_ to search or download its plugins  
>    and their transitive dependencies.
>    <br></br>
>    _Gradle_ pre-configures support for remote repositories in the block.  
>    You can also use local repositories or define your own remote ones.
>    <br></br>
>    In android project repositories
>    * `gradlePluginPortal()`,
>    * `google()` (_Google's Maven_)
>    * `mavenCentral()`<br></br>
>    are those where _Gradle_ should use to look for its dependencies.
>    <br></br>
> 2. `dependencyResolutionManagement.repositories` block  
>    is where you configure the repositories and dependencies  
>    used by all modules in your project, such as libraries  
>    that you are using to create your application.
>    <br></br>
>    However, you should configure module-specific dependencies  
>    in each module-level `build.gradle` file.
>    <br></br>
>    _Android Studio_ for new projects includes
>    * _Google's Maven_
>    * _Maven Central_<br></br>
>    repositories by default, but it does not configure any dependencies.
<br></br>
### <sup>☑ </sup> The Top-level Build File
> The [top-level](https://developer.android.com/studio/build#top-level)  
> [`build.gradle`](https://developer.android.com/studio/build#top-level)
> file, located in the root project directory,  
> defines dependencies that apply to all modules in the project.
> <br></br>
> By default, the top-level build file uses the `plugins{}` block  
> to define the *Gradle* dependencies  
> that are common to all modules in the project.
> <br></br>
> In addition, the top-level build file contains code to clean your build directory.  
> The following code sample describes the default settings  
> and DSL elements you can find in the top-level build.gradle file after creating a new project.
<br></br>
<!--fixme: ^ok, check below -->
> ### <sup>☑ </sup> What is Build Source module
> *Build Source* is a module at the project root directory,  
> which contains build logic. This allows us to use the Kotlin DSL  
> to write custom build code with very little configuration  
> and share this logic across the whole project.
>
> The module directory `buildSrc` is treated as an included build.  
> Upon discovery of the directory, _Gradle_ automatically compiles and tests  
> the code and puts it in the _classpath_ of the build script.
>
> There can be only one `buildSrc` directory for multi-project builds.  
> `buildSrc` should be preferred over script plugins  
> as it is easier to maintain, refactor, and test the code.
>
> The source directory for the plugin should be in root  
> `/buildSrc/src/main/kotlin` directory.  
> _Gradle_ will take care of compiling and testing the plugin  
> and making it available on the `classpath` of the build script.  
> The plugin is visible to every build script used by the build.  
> However, it is not visible outside the build,  
> and it is not possible to reuse the plugin outside the build.
<br></br>
### What is `buildscript{}` block
> The `buildscript{}` block is where you configure  
> the repositories and dependencies for _Gradle_ itself.  
> It means that you should not include dependencies for your modules here.
> <br></br>
> For example, a block may include  
> the *Android Gradle Plugin* (*AGP*) as a dependency,  
> because it provides the additional instructions  
> that _Gradle_ needs to build Android app modules.
> <br></br>
> The `buildscript{}` block is for the `build.gradle` itself.
> So, if buildscript itself needs something to run,  
> use `classpath` configuration.
<br></br>
### What is `repositories{}` block
> `repositories{}` block is for declaring repositories.
> Instead of declaring repositories in every module of your build  
> or via an `allprojects` block in root `~/build.gardle` file,  
> *Gradle* offers a way to declare them in a central place for entire build.
> <br></br>
> Repositories used by convention by every module  
> can be declared in the root `~/settings.gradle` file  
> in `dependencyResolutionManagement` block.
> _Gradle_ uses to search or download the dependencies.  
<br></br>
### What is `classpath()`
<br></br>
### What is `implementation()`
----
### Preliminary Work<sup>🔨</sup>

* start *New empty project* by *Phone & Tablet* template with *No Activity* option.
* use the same name `composite-build-demo` for application name and its location directory.
* create package name `com.example.demo`.
* *Version Control*: make *Initial Commit*: (*GitHub*: [`~/composite-build-demo`](https://github.com/PabloXyu/composite-build-demo)).
* update `gradle.properties` to multi-module project.
* in `~/.gitignore` add lines `/.idea/name` & `/.idea/vcs.xml`, `/gradle`.
* extend `settings.gradle`, `build.gradle`, `:app:build.gradle` files to [`*.kts`](https://docs.gradle.org/current/userguide/kotlin_dsl.html#sec:scripts).
* with those *Gradle* files [migrate from *Groovy* to *Kotlin DSL*](https://developer.android.com/studio/build/migrate-to-kts).
* in `settings.gradle`add _Gradle Plugin Portal_ repository.
* in root `build.gradle` add snippet to enable *Kotlin Source Root* for each module.
* in `app:build.gradle` update *JVM* & `compileOptions` to *Java* version *11*.
* set *compileSdk* & *targetSdk* to level *31*.
* set *Target JVM* (*IDE Kotlin Compiler* option) to version *11*.
* update `app:src\main\AndroidManifest.xml` file adding `android:fullBackupContent="@xml/app_backup_rules`.
* in `AndroidManifest` refactor *theme* to camel case (e.g. `Compositebuilddemo` to `CompositeBuildDemo`).
* add `app_backup_rules.xml` file to *App* module resources in `/src/main/res/xml`.
* <details><!--  LEV1: Markdown editor installation & setup (optional) -->
    <summary>
      <a href="https://vladsch.com/product/markdown-navigator"> <i> Markdown </i> </a>
      editor installation &#38; setup (optional)
    </summary>
    <blockquote>
       <details><!--  LEV2: install Markdown Navigator plugin -->
        <summary>
          install
          <a href="https://vladsch.com/product/markdown-navigator"> <i> Markdown Navigator </i> </a>
          plugin
        </summary>
         <blockquote>

  * download [*Markdown Navigator Enhanced*](https://vladsch.com/product/markdown-navigator) plugin, e.g. version [*3.0.202.112*](https://plugins.jetbrains.com/plugin/download?rel=true&updateId=97563)
  * select _Main Menu_ **|** _File_ **|** [*Settings…*](#useful-keyboard-shortcuts)
  * select ***Plugins***
  * in ***Plugins*** window menu select from <span style="font-size:larger">⚙</span><sup>_Settings_</sup> list: ***Install Plugin from Disk…***
  * restart IDE
        </blockquote>
       </details><!-- LEV2: install Markdown Navigator plugin -->
       <details><!--  LEV2: set up Markdown editor -->
         <summary>
           set up
           <a href="https://vladsch.com/product/markdown-navigator"> <i>Markdown</i> </a>
           editor
         </summary>
         <blockquote>

    * select _Main Menu_ **|** _File_ **|** [*Settings…*](#useful-keyboard-shortcuts)
           <details><!--  LEV3: disable Markdown warnings -->
             <summary>
               disable <i>Markdown</i> warnings
             </summary>
             <ul style=“list-style-type:none”><!--indent-->

      * select ***Editor*** **>** ***Inspections*** window
               <li>
                 <details><!--  LEV4: disable Markdown Non-ASCII characters warnings -->
                   <summary>
                     disable <i>Markdown <b>Non-ASCII characters</b></i> warnings
                   </summary>

        * select ***Internationalization*** **>** ***Non-ASCII characters***
        * ***Severity:*** select from ***In All Scopes*** list ***Project Non-Source Files***
        * in ***Severity by Scope*** select ***Project Non-Source Files***
        * in ***Options, Warn of:*** unselect all warning
        *  ***Apply*** changes-->
                 </details><!-- LEV4: disable Markdown Non-ASCII characters warnings -->
               </li>
               <li>
                 <details><!--  LEV4: disable other Markdown warnings -->
                   <summary>
                     disable other <i>Markdown </i> warnings
                   </summary>

           * select ***Markdown*** **>** ***Reference Issues***
           * uncheck ***Link text does not match heading***
           * uncheck ***Validate emoji shortcuts***
                </details><!-- LEV4: disable other Markdown warnings -->
              </li>
             </ul>
           </details><!-- LEV3: disable Markdown warnings -->
           <details><!--  LEV3: set Markdown document icon -->
             <summary>
               set <i>Markdown</i> document icon
             </summary>

            * select ***Languages & Frameworks*** **>** ***_Markdown_*** window
            * in _Application Settings_ **|** _Project View_ sub-window set ***Document Icon*** to ***Markdown***
            * ***Apply*** changes
           </details><!-- LEV3: set Markdown document icon -->
         </blockquote>
       </details><!-- LEV2: set up Markdown editor -->
    </blockquote>
  </details><!-- LEV1: Markdown editor installation & setup (optional) -->

  * add `README.md` file in root directory.
  * rebuild the project.
  * *Version Control*: make first Push.
<br/><br/>

## Adding Build Source `buildSrc` & Build Plugin `buildPlg` modules<sup>🟦</sup>
* create directory for module `:buildSrc` (Source Build) with file `build.gradle.kts` including repos.
* in `buildSrc:build.gradle` include `kotlin-dsl` plugin and the same repos as in root build file.
* create `src/main/kotlin` directory and mark it  as *Sources Root* (blue color).
* In *Kotlin Sources Root* create `util` package with Kotlin file.
* create directory for module `:buildPlg` (Source Build) with file `build.gradle` including repos.
* in `buildPlg:build.gradle` include `kotlin-dsl` plugin and the same repos as in root build file.
* create `buildPlg:settings.gradle` file with `pluginManagement{}` block including repos.
* add `includeBuild("buildPlg")` in root `:settings.gradle`.
<br/><br/>
* although [`RepositoriesMode`](https://docs.gradle.org/current/userguide/declaring_repositories.html#sub:centralized-repository-declaration) in `:settings.gradle` is marked as unstable and generates warnings, ignore it:
    * _Settings…_ **:** select _Editor_ **>** _Inspections_
    * select _Android_ **>** _Lint_ **>** _Correctness_
    * uncheck _Obsolete Gradle Dependency (available for Analyse|Inspect Code)_
    * _Inspect Code_, exclude warnings in `:settings.gradle`
    * this should insert `@file:Suppress("UnstableApiUsage")` at the top of the file
<br/><br/>
* rebuild the project
---
<!--todo: classpath vs. implementation -->
<!--todo: Composite Build -->
----
## Testing<sup>🧪</sup> the Build Process From the Scratch
1. delete root project directories marked orange:
    * `~/.gradle`
    * `~/build`
2. delete all module directories marked orange, if exist:
    * `~/[MODULE_NAME]/.gradle`
    * `~/[MODULE_NAME]/build`
3. In case of major compilation problems:
    * delete also `~/.idea` directory
4. Restart Android Studio IDE with cache invalidation:
    * open *Main Menu* **:** *File* **|** *Invalidate Cashes/Restart…*
5. In case of critical compilation problems:
    * delete the all directories mentioned in _**1-3**_
    * exit *Android Studio IDE*
    * delete all files in `%USERNAME%\.gradle\caches` directory (*Win10*).
    * run *Android Studio IDE*
---
## Android Gradle Plugin *7.02* release:
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
    * select *Main Menu* **>** *File* **>** *Invalidate Cashes/Restart…*
    * *Add Keyboard Shortcut*: `[CTRL]`+`[ALT]`+`R`
    * *Add Mouse Shortcut*: `[CTRL]`+`[Middle Click]`
2. Refactor/Rename
    * select *Main Menu* **>** *Refactor* **>** *Rename*
    * *Add Mouse Shortcut*: `[SHIFT]`+`[Click]` (left click)
3. Show Local History
    * select *Main Menu* **>** *File* **>** *Local History* **>** *Show History*
    * *Add Keyboard Shortcut*: `[CTRL]`+`[ALT]`+`/`
    * *Add Mouse Shortcut*: `[CTRL]`+`[DoubleClick]`
<!-- todo: add mouse scrolling -->
<!-- todo: add mouse scrolling info -->
##  <a name="Settings…"></a>Useful Keyboard Shortcuts

|DEFAULT    | KEYMAP KEYS          |MOUSEMAP                 |ACTION                    |
|:---------:|:---------------------|:------------------------|:-------------------------|
|yes        |`[CTRL]`+`[SHIFT]`+`/`|                         |Comment with Block Comment|
|yes        |`[SHIFT]`+`[ESC]`     |                         |Hide Window               |
|yes        |`[CTRL]`+`[SHIFT]`+`J`|                         |Join Lines                |
|keymap only|`[SHIFT]`+`[F6]`      |`[SHIFT]`+`[Click]`      |Refactor > Rename         |
|yes        |`[CTRL]`+`[ALT]`+`L`  |                         |Reformat code             |
|yes        |`[CTRL]`+`[ALT]`+`O`  |                         |Remove Unused Imports     |
|no         |`[CTRL]`+`[ALT]`+`R`  |`[CTRL]`+`[Middle-Click]`|Invalidate Caches/Restart |
|yes        |`[CTRL]`+`[ALT]`+`S`  |                         |Settings…                 |
|no         |`[CTRL]`+`[ALT]`+`/`  |`[CTRL]`+`[DoubleClick]` |Show Local History        |
|yes        |`[CTRL]`+`[SHIFT]`+`U`|                         |Toggle Case               |
---
## How to have access to commit history with free Github
> go to your repository main page `https://github.com/[USERNAME]/[REPOSITORY_NAME]`
> add `https://github.com/[USERNAME]/[REPOSITORY_NAME]/`**`commits`**
> or `https://github.com/[USERNAME]/[REPOSITORY_NAME]/`**`commit`**

