val scalaNativeVersion =
  Option(System.getenv("SCALANATIVE_VERSION")).getOrElse("0.4.0-M2")

addSbtPlugin("org.scala-js" % "sbt-scalajs"  % "1.0.1")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.7.0")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.4.5")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.0.0")
addSbtPlugin("org.scala-native" % "sbt-scala-native" % scalaNativeVersion)

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.6")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")
