<!-- "gradle-as" is a png picture of logos AS IDE, Android and Gradle together -->
![gradle-as](https://user-images.githubusercontent.com/26512179/132996456-1d7dd5df-2604-4131-82c0-4af6629ba04b.png)
# Gradle Composite Build Demo Application
The purpose of the project is to extend my Android programming knowledge,  
showing my coding skills for job interview, and share my knowledge  
with other programmers for the benefit of this worldwide android-enthusiastic community.

This is my first published repository.
This app code is written on _Android Studio Arctic Fox IDE (2020.3.1, Patch 2)_.

## Preliminary Work
* start *New empty project* by *Phone & Tablet* template with *No Activity* option.
* create the same name `app-build-demo` for application and its location directory.
* create package name `com.example.appbuild`.
* *Version Control*: make *Initial Commit*: (*GitHub*: `~/app-build-demo`).
* update `gradle.properties` to multi-module project.
* in `~/.gitignore` add lines `/.idea/name` & `/.idea/vcs.xml`, `/gradle`.
* extend `settings.gradle`, `build.gradle`, `:app:build.gradle` files to `*.kts`.
* with those *Gradle* files migrate from *Groovy* to *Kotlin DSL*.
* in `settings.gradle`add Gradle Plugin Portal repository.
* in root `build.gradle` add snippet to enable *Kotlin Source Root* for each module.
* in `app:build.gradle` update *JVM* & `compileOptions` to *Java* version *11*.
* set *compileSdk* & *targetSdk* to level *31*.
* set *Target JVM* (*IDE Kotlin Compiler* option) to version *11*.
* add `app_backup_rules.xml` file to App module resources in `app/src/main/res/xml`.
* update `Manifest` of *App* module adding `android:fullBackupContent="@xml/app_backup_rules`.
* in resource `:app\res\values\themes` refactor app name to camel case (e.g. `Appbuilddemo` to `AppBuildDemo`).
* perform total *IDE* restart as described in [here](#testing-the-build-process-from-the-scratch).
* *Version Control*: first Push.
---
## Testing the Build Process From the Scratch
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
## Android Studio Useful Shortcuts
open *Main Menu* **:** *File* **:** *Settings* **|** *KeyMap*.
1. Android Studio Restart
   * choose *Main Menu* **>** *File* **>** *Invalidate Cashes/Restart…*
   * *Add Keyboard Shortcut*: `[CTRL]`+`[ALT]`+`R`
   * *Add Mouse Shortcut*: `[CTRL]`+`[Middle Click]`
2. Refactor/Rename
   * choose *Main Menu* **>** *Refactor* **>** *Rename*
   * *Add Mouse Shortcut*: `[SHIFT]`+`[Click]` (left click)
3. Show Local History
   * choose *Main Menu* **>** *File* **>** *Local History* **>** *Show History*
   * *Add Keyboard Shortcut*: `[CTRL]`+`[ALT]`+`/`
   * *Add Mouse Shortcut*: `[CTRL]`+`[DoubleClick]`
---
## Key & Mouse Shortcuts
| default | shortkey                  |          action            |
|:-------:|:--------------------------|:--------------------------:|
| yes     | `[CTRL]`+`[ALT]`+`S`      | Settings…                  |
| no      | `[CTRL]`+`[ALT]`+`R`      | Restart                    |
| no      | `[CTRL]`+`[Middle Click]` | Restart                    |
| yes     | `[SHIFT]`+`[ESC]`         | Hide Window                |
| yes     | `[CTRL]`+`[SHIFT]`+`/`    | Comment with Block Comment |
| yes     | `[CTRL]`+`[SHIFT]`+`J`    | Join Lines                 |
| no      | `[SHIFT]`+`[Click]`       | Refactor > Rename          |
| yes     | `[CTRL]`+`[ALT]`+`L`      | Reformat code              |
| yes     | `[CTRL]`+`[SHIFT]`+`U`    | Toggle Case                |
| yes     | `[CTRL]`+`[ALT]`+`O`      | Remove Unused Imports      |
| no      | `[CTRL]`+`[ALT]`+`/`      | Show Local History         |
| no      | `[CTRL]`+`[DoubleClick]`  | Show Local History         |

## Tip: How to have access to commit history with free Github
* go to your repository main page `https://github.com/[USERNAME]/[REPOSITORY_NAME]`
* add `https://github.com/[USERNAME]/[REPOSITORY_NAME]/`**`commits`**
* or `https://github.com/[USERNAME]/[REPOSITORY_NAME]/`**`commit`**
