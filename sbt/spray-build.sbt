resolvers += "spray repo" at "http://repo.spray.io/"                                                                                                                                                                                                                            

libraryDependencies ++= {
  val sprayVersion = "1.3.2"
  val akkaVersion = "2.3.6"
  Seq(
    "io.spray" %% "spray-json"   % "1.3.1",
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "io.spray" %%  "spray-client" % sprayVersion,
    "ch.qos.logback" % "logback-classic" % "1.0.7"
  )
}

scalaVersion := "2.11.2"
