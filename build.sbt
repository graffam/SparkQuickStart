name := "SparkDemo"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.1.1"


// Configures Sbt Assembly
lazy val root = (project in file(".")).
  settings(
    name := "spark-demo",
    version := "1.0",
    scalaVersion := "2.11.8",
    mainClass in Compile := Some("com.spark.Application")
  )