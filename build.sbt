enablePlugins(ScalaNativePlugin)

scalaVersion := "2.11.12"

// Set to false or remove if you want to show stubs as linking errors
nativeLinkStubs := false

libraryDependencies += "tech.sparse" %%% "cmark-scala" % "0.1.0-SNAPSHOT"
