lazy val akkaHttpVersion = "10.1.3"
lazy val akkaVersion    = "2.5.14"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "com.example",
      scalaVersion    := "2.12.6"
    )),
    name := "hello-world",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml"        % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream"          % akkaVersion,

      "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion % Test,
      "com.typesafe.akka" %% "akka-testkit"         % akkaVersion     % Test,
      "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion     % Test,
      "org.scalatest"     %% "scalatest"            % "3.0.5"         % Test
    )
  )

enablePlugins(JavaAppPackaging)
enablePlugins(DockerPlugin)

mainClass in Compile := Some("com.example.QuickstartServer")

dockerBaseImage := "openjdk:jre-alpine"

enablePlugins(AshScriptPlugin)