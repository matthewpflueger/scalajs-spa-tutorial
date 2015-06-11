// repository for Typesafe plugins
resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

// explicitly add Maven Central in order to resolve workbench plugin below
resolvers += "Maven central" at "https://repo1.maven.org/maven2/"

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.1")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.3")

addSbtPlugin("com.lihaoyi" % "workbench" % "0.2.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.0.6")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.0.0-RC1")
