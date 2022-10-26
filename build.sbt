scalaVersion := "2.13.8"

name := "renovate-sbt-test"
organization := "com.fernandomora"
version := "1.0"
libraryDependencies ++= Seq(
  "com.intenthq" %% "scala-secret" %   "1.1.0"
)

resolvers += "GitHub Package Registry (intenthq)" at "https://maven.pkg.github.com/intenthq/_"
credentials ++= scala.util.Properties
  .envOrNone("GITHUB_TOKEN")
  .map(githubToken =>
    Credentials(
      "GitHub Package Registry",
      "maven.pkg.github.com",
      "_",
      githubToken
    )
  )
