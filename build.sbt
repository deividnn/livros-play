name := """livros"""
organization := "net.deividnn"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += javaJpa
libraryDependencies += "org.postgresql" % "postgresql" % "9.4.1212"
libraryDependencies += "org.hibernate" % "hibernate-entitymanager" % "5.2.16.Final"

PlayKeys.externalizeResources := false