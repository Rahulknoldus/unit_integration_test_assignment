name := "unit_testing"

version := "0.1"

scalaVersion := "2.13.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % "test"

libraryDependencies += "org.mockito" % "mockito-all" % "1.10.19" % Test

// libraryDependencies += "org.scalatestplus" %% "mockito-1-10" % "3.1.0.0" % Test

// https://mvnrepository.com/artifact/org.scalatestplus/scalatestplus-mockito
libraryDependencies += "org.scalatestplus" %% "scalatestplus-mockito" % "1.0.0-M2" % Test

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test