scala-parser-combinators-practice
=================================

```
./gradlew publish
scala -classpath build/libs/scala-parser-combinators-practice-0.0.1.jar pro.civitaspo.practice.parser_combinators.Main
```

# Help Me...

```
scala -classpath build/libs/scala-parser-combinators-practice-0.0.1.jar pro.civitaspo.practice.parser_combinators.Main
java.lang.NoSuchMethodError: scala.util.parsing.combinator.Parsers.$init$(Lscala/util/parsing/combinator/Parsers;)V
        at pro.civitaspo.practice.parser_combinators.SimpleParser.<init>(Main.scala:11)
        at pro.civitaspo.practice.parser_combinators.Main$.<init>(Main.scala:5)
        at pro.civitaspo.practice.parser_combinators.Main$.<clinit>(Main.scala)
        at pro.civitaspo.practice.parser_combinators.Main.main(Main.scala)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at scala.reflect.internal.util.ScalaClassLoader$$anonfun$run$1.apply(ScalaClassLoader.scala:70)
        at scala.reflect.internal.util.ScalaClassLoader$class.asContext(ScalaClassLoader.scala:31)
        at scala.reflect.internal.util.ScalaClassLoader$URLClassLoader.asContext(ScalaClassLoader.scala:101)
        at scala.reflect.internal.util.ScalaClassLoader$class.run(ScalaClassLoader.scala:70)
        at scala.reflect.internal.util.ScalaClassLoader$URLClassLoader.run(ScalaClassLoader.scala:101)
        at scala.tools.nsc.CommonRunner$class.run(ObjectRunner.scala:22)
        at scala.tools.nsc.ObjectRunner$.run(ObjectRunner.scala:39)
        at scala.tools.nsc.CommonRunner$class.runAndCatch(ObjectRunner.scala:29)
        at scala.tools.nsc.ObjectRunner$.runAndCatch(ObjectRunner.scala:39)
        at scala.tools.nsc.MainGenericRunner.runTarget$1(MainGenericRunner.scala:65)
        at scala.tools.nsc.MainGenericRunner.run$1(MainGenericRunner.scala:87)
        at scala.tools.nsc.MainGenericRunner.process(MainGenericRunner.scala:98)
        at scala.tools.nsc.MainGenericRunner$.main(MainGenericRunner.scala:103)
        at scala.tools.nsc.MainGenericRunner.main(MainGenericRunner.scala)
```
