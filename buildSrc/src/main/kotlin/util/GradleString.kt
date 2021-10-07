package util

/**
 * © *Paweł Zygmunciak*, **RED PIG**, 2021
 *
 * <br></br>
 * ## ASCII Gradle Elephant Logo & Image Text
 * # [GradleString] utility class #
 *
 * [GRADLE_LOGO] is *»Gradle«* official logo as an elephant *ASCII* image.
 *
 * [GRADLE_NAME] is text with name »Gradle« as *ASCII* image made of *Block* char# 219 (`0xdb`).
 *
 * <br></br>
 * ### [GRADLE_LOGO] dimensions
 *
 *    ╭───────────────┬────────────────╮
 *    │               │ char dimension │
 *    ┝━━━━━━━━━━━━━━━┿━━━━━━━━━━━━━━━━┥
 *    │ picture       │    80 x 25     │
 *    ├───────────────┼────────────────┤
 *    │ figure        │    68 x 21     │
 *    ├───────────────┼────────────────┤
 *    │ left margin   │       6        │
 *    ├───────────────┼────────────────┤
 *    │ right margin  │       6        │
 *    ├───────────────┼────────────────┤
 *    │ top margin    │       2        │
 *    ├───────────────┼────────────────┤
 *    │ bottom margin │       1        │
 *    ╰───────────────┴────────────────╯
 * <br></br>
 * ### [GRADLE_NAME] dimensions
 *
 *    ╭───────────────┬────────────────╮
 *    │               │ char dimension │
 *    ┝━━━━━━━━━━━━━━━┿━━━━━━━━━━━━━━━━┥
 *    │ picture       │    80 x 7      │
 *    ├───────────────┼────────────────┤
 *    │ figure        │    58 x 5      │
 *    ├───────────────┼────────────────┤
 *    │ left margin   │      11        │
 *    ├───────────────┼────────────────┤
 *    │ right margin  │      11        │
 *    ├───────────────┼────────────────┤
 *    │ top margin    │       0        │
 *    ├───────────────┼────────────────┤
 *    │ bottom margin │       0        │
 *    ╰───────────────┴────────────────╯
 *
 * <br></br>
 * @see <p align="right"><a href="https://twitter.com/gradle/status/1106550430572732422">
 * Twitter</a></p>
 * <p align="right"><i>14th of September, 2021</i></p><br>
 * @see <p align="right"><a href="https://gradle.com/brand/">
 * *Gradle* Brand Website</a></p>
 * <p align="right"><i>15th of October, 2021</i></p><br>
 * @see <p align="right"><a href="https://manytools.org/hacker-tools/convert-images-to-ascii-art/">
 * Many Tools: <i>Convert Images to Ascii Art file converter</i></a></p>
 * <p align="right"><i>15th of October, 2021</i></p><br>
 * @see <p align="right"><a href="http://patorjk.com/software/taag/#p=display&h=0&f=ANSI%20Regular&t=GRADLE">
 * ASCII Text Generator</a></p>
 * <p align="right"><i>15th of October, 2021</i></p><br>
 */
class GradleString {

//       1         2         3         4         5         6         7         8
//345678901234567890123456789012345678901234567890123456789012345678901234567890
//3456  <- margin                                              margin ->  123456
    companion object {
        const val GRADLE_LOGO = """


                                                          ,+:^```^*:,
                                                        _+`          ^*.
                            ._..._                      \\   _+^*:.    `+
                       ._*;^``  ``^;*._                  `*+`     ^+    `^
                     _+:^`            `':.                        `\     +'
                   .%                   `+:.                       +;    `:
                  `:^                       `':._                 *:     `*
                 .;^`+                          `^:._          .+/'     `+
               .;+`  *+             _               ``:^::+-:+~/^      *`
             .**+     *+          .*`           ,:+_                 .*` 
            **+        *+       .^`             `".^               ,*^ 
           *+           ^:=.:*+^`                                 +*` 
         ,*+                                                   +**` 
         *+                                                 +**` 
        *+                                                +** 
       .*:                                               ** 
       **                                               *+ 
      *+         _.+*%+._            _.+*%+._         +*` 
      pz       .*:^    `^*.        .*:^    `^*.       +* 
      ^+      .*         `#_      .*         `#_      +* 
      \******++`          `+*****++'          `+******+'

"""
//=== End of Image^ =============================================================



//       1         2         3         4         5         6         7         8
//345678901234567890123456789012345678901234567890123456789012345678901234567890
//345678901  <- margin                                    margin ->  12345678901
        const val GRADLE_NAME = """
            ######    ######     #####    ######    ##        #######                              
           ##         ##   ##   ##   ##   ##   ##   ##        ##       
           ##   ###   ######    #######   ##   ##   ##        #####    
           ##    ##   ##   ##   ##   ##   ##   ##   ##        ##       
            ######    ##   ##   ##   ##   ######    #######   #######                
"""
//=== End of Image^ ============================================================
    }
}


//    About the Elephant Image:
//    =========================
//
//    The source image for ASCII picture generation was taken
//    from file available on https://gradle.com/brand/
//    (html class "elephant-icon-container white").
//
//    The picture has been downloaded from Twitter Gradle Usser message:
//    https://twitter.com/gradle/status/1106550430572732422.
//
//    ASCII picture was generated from by web tool on:
//    https://manytools.org/hacker-tools/convert-images-to-ascii-art/.
//    ===============================================================
//
//--------------------------------------------------------------------------------
//                                                       &&&&&&&&&&&&&
//                                                      &&    .#.      &&#
//                                                       /&&&,   /&&&    &&
//                           %&&&&&&&&&&&&&&&(                      &&    &&
//                    %&&&&#                   &&&&&                &&,   &&
//                  &&(                             /&&&&          (&&    &&
//                  &&                                   /&&&&&&&&&%      &&
//                &&&&&&                             .                   &&
//             &&&     &@          (&&%             &&&/               %&&
//           &&&        &&&     &&&(                                 ,&&
//          &&            &&&&&#                                   &&&
//        ,&&                                                   &&&*
//        &&                                                 &&&,
//       &&                                                &&&
//      (&&                                               &&
//      &&                                               &&
//      &&            (%*                 (%/           &&*
//      &&       .&&&    (&&&         &&&    ,&&&       &&
//      (&&     &&          %&&     &&          #&&     &&
//       &&&&&&&&.           @&&&&&&&*           &&&&&&&&#
//--------------------------------------------------------------------------------
