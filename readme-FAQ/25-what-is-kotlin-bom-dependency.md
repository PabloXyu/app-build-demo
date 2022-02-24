![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<!-- What is kotlin-bom "dependency"? -->
<h2><sup>:ballot_box_with_check:&ensp;</sup>
  What is <code>kotlin-bom</code> "dependency"?
</h2>
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

![](https://via.placeholder.com/1024x1.png/0078D7/0078D7/text=+)<!--1px blue line-->
<p align="right"><a href="/../../#--------------questionfaq----------"><b>FAQ</b></a></p>

<!--─────────────────────────────────────────────────────────────────-->
<details >
  <summary>
    <h3>
      <a class="anchor" id= "25-what-is-kotlin-bom-dependency">
        <sup>:ballot_box_with_check:&ensp;</sup>
      </a>
    </h3>
  </summary>
  <blockquote>
<!-- ^END OF Copy&Paste over the line above^─────────────────────────-->
<!--                                                                 -->
<!-- STANDALONE FAQ QUESTION TEMPLATE                                -->
<!-- The reason why there's a separate md file introduced:           -->
<!--                                                                 -->
<!-- FAQ collapsible list in main readme.md is closed by default.    -->
<!-- This implifies the link to anchored question block there        -->
<!-- does not open FAQ list as well as the question block either     -->
<!--─────────────────────────────────────────────────────────────────-->
