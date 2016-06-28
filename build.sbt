
name := "Test1"

version := "1.0"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies ++= Seq(


)
libraryDependencies += "org.springframework" % "spring-context" % "4.1.6.RELEASE"
libraryDependencies += "org.springframework" % "spring-core" % "4.1.6.RELEASE"
libraryDependencies += "org.springframework" % "spring-beans" % "4.1.6.RELEASE"
libraryDependencies += "org.springframework" % "spring-aop" % "4.1.6.RELEASE"
libraryDependencies += "org.springframework" % "spring-aop" % "4.1.6.RELEASE"
libraryDependencies += "org.springframework" % "spring-orm" % "4.1.6.RELEASE"
libraryDependencies += "javax.persistence" % "persistence-api" % "1.0"

fork in run := true
