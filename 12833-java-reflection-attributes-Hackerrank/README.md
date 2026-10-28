# [Java Reflection - Attributes](https://www.hackerrank.com/challenges/java-reflection-attributes/problem?isFullScreen=true)
## Easy
<div class="challenge-body-html"><div class="challenge_problem_statement"><div class="msB challenge_problem_statement_body"><div class="hackdown-content"><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>JAVA reflection is a very powerful tool to inspect the attributes of a class in runtime. For example, we can retrieve the list of public fields of a class using <em>getDeclaredMethods()</em>.</p>

<p>In this problem, you will be given a class <em>Solution</em> in the editor. You have to fill in the incompleted lines so that it prints all the methods of another class called <em>Student</em> in alphabetical order. We will append your code with the <em>Student</em> class before running it. The <em>Student</em> class looks like this:</p>

<div class="highlight"><pre><span class="kd">class</span> <span class="nc">Student</span><span class="o">{</span>
    <span class="kd">private</span> <span class="n">String</span> <span class="n">name</span><span class="o">;</span>
    <span class="kd">private</span> <span class="n">String</span> <span class="n">id</span><span class="o">;</span>
    <span class="kd">private</span> <span class="n">String</span> <span class="n">email</span><span class="o">;</span>

    <span class="kd">public</span> <span class="n">String</span> <span class="nf">getName</span><span class="o">()</span> <span class="o">{</span>
        <span class="k">return</span> <span class="n">name</span><span class="o">;</span>
    <span class="o">}</span>
    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setId</span><span class="o">(</span><span class="n">String</span> <span class="n">id</span><span class="o">)</span> <span class="o">{</span>
        <span class="k">this</span><span class="o">.</span><span class="na">id</span> <span class="o">=</span> <span class="n">id</span><span class="o">;</span>
    <span class="o">}</span>
    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">setEmail</span><span class="o">(</span><span class="n">String</span> <span class="n">email</span><span class="o">)</span> <span class="o">{</span>
        <span class="k">this</span><span class="o">.</span><span class="na">email</span> <span class="o">=</span> <span class="n">email</span><span class="o">;</span>
    <span class="o">}</span>
    <span class="kd">public</span> <span class="kt">void</span> <span class="nf">anothermethod</span><span class="o">(){</span>  <span class="o">}</span>
    <span class="o">......</span>
    <span class="o">......</span>
    <span class="n">some</span> <span class="n">more</span> <span class="n">methods</span>
    <span class="o">......</span>
<span class="o">}</span>
</pre></div>


<p>You have to print all the methods of the student class in alphabetical order like this:</p>

<pre><code>anothermethod
getName
setEmail
setId
......
......
some more methods
......
</code></pre>

<p>There is no sample input/output for this problem. If you press "Run Code", it will compile it, but it won't show any outputs.</p>

<p><strong>Hint:</strong> See the oracle docs for more details about <a href="https://docs.oracle.com/javase/tutorial/reflect/class/classMembers.html">JAVA Reflection Methods and Fields</a></p></div></div></div></div>